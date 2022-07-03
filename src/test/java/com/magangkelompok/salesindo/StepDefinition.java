package com.magangkelompok.salesindo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.magangkelompok.salesindo.config.AutomationFrameworkConfig;
import com.magangkelompok.salesindo.datapelamar.DataPelamarPage;
import com.magangkelompok.salesindo.login.LoginPage;
import com.magangkelompok.salesindo.uploadFile.UploadFilePage;
import com.magangkelompok.salesindo.utils.ConfigurationProperties;
import com.magangkelompok.salesindo.utils.Constants;
import com.magankelompok.salesindo.driver.DriverSingleton;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private static WebDriver driver;
	private LoginPage loginPage;
	private DataPelamarPage dataPelamarPage;
	private UploadFilePage uploadFilePage;
	//tambahan di package pages
	static ExtentTest extentTest;
	static ExtentReports reports = new ExtentReports("src/main/resources/ReportTest.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void setUp() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		dataPelamarPage = new DataPelamarPage();
		uploadFilePage = new UploadFilePage();
		TestCases[] tests = TestCases.values();
		extentTest = reports.startTest(tests[Utils.testCount].getTestname());
		Utils.testCount++;
	}
	
	@AfterStep
	public void getResultScreenshot(Scenario scenario) throws Exception {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ","_"));
			extentTest.log(LogStatus.FAIL, "Screenshot:\n"+
					extentTest.addScreenCapture(screenshotPath));
		}
	}
	
	@After
	public static void endTestStep() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	@AfterAll
	public static void quitDriver() {
		tunggu(5);
		driver.quit();
	}
	
	
	// Modul Login
	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Customer mengakses url "+Constants.URL);
	}
	
	@When("Customer login dengan username dan password salah")
	public void customer_login_dengan_username_password_Salah() {
		loginPage.loginForm(configurationProperties.getUsername(), configurationProperties.getWrongPassword());
		extentTest.log(LogStatus.PASS, "Customer login dengan username dan password salah");
	}
	
	@Then("Customer gagal login")
	public void customer_gagal_login() {
		tunggu(3);
		String actualString = loginPage.getMessageErrorLogin();
		assertTrue(actualString.contains(configurationProperties.getMessageErrorLogin()));
		extentTest.log(LogStatus.PASS, "Customer gagal login");
	}
	
	@When("Customer login dengan username dan password")
	public void customer_login_dengan_username_password() {
		loginPage.loginForm(configurationProperties.getUsername(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "Customer gagal login");
	}
	
	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
		driver.navigate().refresh();
		tunggu(2);
		String actualString = loginPage.getTxtWelcome();
		assertTrue(actualString.contains(configurationProperties.getTxtWelcome()));
		extentTest.log(LogStatus.PASS, "Customer berhasil login");
	}
	
	
	//Modul Data Pelamar
	@When("Customer klik button klik disini")
	public void customer_klik_button_klik_disini() {
		dataPelamarPage.buttonDisisi();
		dataPelamarPage.dataPelamarForm(configurationProperties.getInfo(), configurationProperties.getRecuit());
		extentTest.log(LogStatus.PASS, "Customer klik button klik disini");
	}
	
	
	@Then("Customer berhasil masuk ke form input pelamar")
	public void customer_berhasil_masuk_ke_form_input_pelamar() {
		tunggu(2);
		String actualString = dataPelamarPage.getTxtDataPelamar();
		assertTrue(actualString.contains(configurationProperties.getTxtDataPelamar()));
		extentTest.log(LogStatus.PASS, "Customer berhasil masuk ke form input pelamar");
	}
	
	//Modul Biodata Pelamar
	@When ("Customer input biodata pelamar")
	public void customer_input_biodata_pelamar() {
		dataPelamarPage.biodataPelamar(configurationProperties.getSelectIdent(), configurationProperties.getNoIdent(), configurationProperties.getNama(), configurationProperties.getEmail(), configurationProperties.getTanggal(),
			configurationProperties.getBulan(), configurationProperties.getTahun(), configurationProperties.getKota(), configurationProperties.getIbu(), configurationProperties.getJk(),
			configurationProperties.getAgama(), configurationProperties.getNikah(), configurationProperties.getAnak(), configurationProperties.getTinggi(), configurationProperties.getBerat(),
			configurationProperties.getHp(), configurationProperties.getKodArea(), configurationProperties.getNoRumah());
	}
	
	@Then ("Customer berhasil input biodata pelamar")
	public void customer_berhasil_input_biodata_pelamar() {
//		driver.navigate().refresh();
		tunggu(2);
		assertEquals(configurationProperties.getTxtBerhasilBiodata(), dataPelamarPage.getTxtBerhasilBiodata());
		extentTest.log(LogStatus.PASS, "Customer berhasil input biodata pelamar");
	}
	
//	@When ("Customer isi mandatory field")
//	public void customer_isi_mandatory_field() {
//		tunggu(2);
//		dataPelamarPage.mandatoryBiodataPelamar(configurationProperties.getSelectIdent(), configurationProperties.getNoIdent(), configurationProperties.getNama(), configurationProperties.getEmail(), configurationProperties.getTanggal(),
//				configurationProperties.getBulan(), configurationProperties.getTahun(), configurationProperties.getKota(), configurationProperties.getIbu(), configurationProperties.getJk(),
//				configurationProperties.getAgama(), configurationProperties.getNikah(), configurationProperties.getTinggi(), configurationProperties.getBerat(),
//				configurationProperties.getHp());
//	}
//	
//	@Then ("Customer berhasil input hanya mandatory field di biodata pelamar")
//	public void customer_berhasil_input_hanya_mandatory_field_di_biodata_pelamar() {
//		tunggu(2);
//		assertEquals(configurationProperties.getTxtBerhasilBiodata(), dataPelamarPage.getTxtBerhasilBiodata());
//		extentTest.log(LogStatus.PASS, "Customer berhasil input hanya mandatory field di biodata pelamar");
//	}
	
	//Modul Alamat tinggal pelamar sesuai KTP
	@When ("Customer input alamat tinggal pelamar sesuai KTP")
	public void customer_input_alamat_tinggal_pelamar_sesuai_KTP() {
		dataPelamarPage.alamatTinggalPelamarKtp(configurationProperties.getAlamatKtp(), configurationProperties.getRtKtp(), configurationProperties.getRwKtp(), configurationProperties.getProvinsiKtp(), configurationProperties.getKotaKtp(), configurationProperties.getKecamatanKtp(), configurationProperties.getKelurahanKtp(), configurationProperties.getKodePosKtp());
		extentTest.log(LogStatus.PASS, "Customer input alamat tinggal pelamar sesuai KTP");
	}
	
	@Then ("Customer berhasil input form alamat tinggal pelamar sesuai KTP")
	public void customer_berhasil_input_form_alamat_tinggal_pelamar_sesuai_KTP() {
		tunggu(2);
		String actualString = dataPelamarPage.getTxtSuccesfullAlamatKtp();
		assertTrue(actualString.contains(configurationProperties.getTxtSuccesfullAlamatKtp()));
		extentTest.log(LogStatus.PASS, "Customer berhasil input form alamat tinggal pelamar sesuai KTP");
	}
	
	//Modul Alamat tinggal sekarang
	@When ("Customer input form alamat tinggal sekarang")
	public void customer_input_form_alamat_tinggal_sekarang() {
		tunggu(1);
		dataPelamarPage.alamatTinggalSekarang(configurationProperties.getAlamatSekarang(), configurationProperties.getRtSekarang(), configurationProperties.getRwSekarang(), configurationProperties.getProvinsiAlamatSekarang(), configurationProperties.getKotaSekarang(), configurationProperties.getKecSekarang(), configurationProperties.getKelSekarang());
		extentTest.log(LogStatus.PASS, "Customer input form alamat tinggal sekarang");
	}
	
	@Then ("Customer berhasil input form alamat tinggal sekarang")
	public void customer_berhasil_input_form_alamat_tinggal_sekarang() {
		tunggu(1);
		assertEquals(configurationProperties.getTxtSuccessfulAlamatSekarang(), dataPelamarPage.getTxtSuccessfulAlamatSekarang());
		extentTest.log(LogStatus.PASS, "Customer berhasil input form alamat tinggal sekarang");
	}
	
	
	//Modul Informasi Saudara Tidak Serumah
	@When("Customer Mengisi Form Informasi Saudara Tidak Serumah")
	public void customer_mengisi_form_informasi_saudara_tidak_serumah() {
		dataPelamarPage.informasiSaudaraTidakSerumah(configurationProperties.getNss(), configurationProperties.getHbs(), configurationProperties.getNhp(), configurationProperties.getAlmt(), configurationProperties.getRt(), configurationProperties.getRw(),
				configurationProperties.getProvinsi(), configurationProperties.getKotaSaudara(), configurationProperties.getKecamatan(), configurationProperties.getKelurahan(), configurationProperties.getKodePos());
		
		extentTest.log(LogStatus.PASS, "Customer Mengisi Form Informasi Saudara Tidak Serumah");
	}
	
	@Then("Customer berhasil Mengisi Form Informasi Saudara Tidak Serumah")
	public void customer_berhasil_mengisi_form_informasi_saudara_tidak_serumah() {
		tunggu(2);
		String actualString = dataPelamarPage.getTxtInformasiKeluargaSerumah();
		assertTrue(actualString.contains(configurationProperties.getTxtInformasiKeluargaSerumah()));
		extentTest.log(LogStatus.PASS, "Customer berhasil Mengisi Form Informasi Saudara Tidak Serumah");
	}
	
	//Modul Informasi keluarga Serumah
	@When("Customer Mengisi Form Informasi Keluarga Serumah")
	public void customer_mengisi_form_informasi_keluarga_serumah() {
		dataPelamarPage.informasiKeluargaSerumah(configurationProperties.getNks(), configurationProperties.getHbsh(), configurationProperties.getNhph(), configurationProperties.getAlmtHome(), configurationProperties.getRtHome(), configurationProperties.getRwHome(),
				configurationProperties.getProvinsiHome(), configurationProperties.getKotaHome(), configurationProperties.getKecamatanHome(), configurationProperties.getKelurahanHome(), configurationProperties.getKodePosHome());
		
		extentTest.log(LogStatus.PASS, "Customer Mengisi Form Informasi Keluarga Serumah");
	}
	
	@Then("Customer berhasil Mengisi Form Informasi Keluarga Serumah")
	public void customer_berhasil_mengisi_form_informasi_keluarga_serumah() {
		tunggu(2);
		String actualString = dataPelamarPage.getTxtSosialMedia();
		assertTrue(actualString.contains(configurationProperties.getTxtSosialMedia()));
		extentTest.log(LogStatus.PASS, "Customer berhasil Mengisi Form Informasi Keluarga Serumah");
	}
	
	//Modul Sosial Media
	@When("Customer Mengisi Form Sosial Media")
	public void customer_mengisi_form_sosial_media() {
		dataPelamarPage.sosialMedia(configurationProperties.getFacebook(), configurationProperties.getTwitter(), configurationProperties.getInstagram());
		
		extentTest.log(LogStatus.PASS, "Customer Mengisi Form Sosial Media");
	}
	
	@Then("Customer berhasil Mengisi Form Sosial Media")
	public void customer_berhasil_mengisi_form_sosial_media() {
		tunggu(2);
		String actualString = dataPelamarPage.getTxtInfolainnya();
		assertTrue(actualString.contains(configurationProperties.getTxtInfolainnya()));
		extentTest.log(LogStatus.PASS, "Customer berhasil Mengisi Form Sosial Media");
	}
	
	//Modul informasi pendidikan
	@When ("Customer input form informasi pendidikan")
	public void customer_input_form_informasi_pendidikan() {
		tunggu(1);
		dataPelamarPage.informasiPendidikan(configurationProperties.getEdu(), configurationProperties.getSchool(), configurationProperties.getMajor(), configurationProperties.getNilai());
		extentTest.log(LogStatus.PASS, "Customer input form informasi pendidikan");
	}
	
	@Then("Customer berhasil input form informasi pendidikan")
	public void customer_berhasil_input_form_informasi_pendidikan() {
		tunggu(1);
		assertEquals(configurationProperties.getTxtSuccesfullPendidikan(), dataPelamarPage.getTxtSuccesfullPendidikan());
		extentTest.log(LogStatus.PASS, "Customer berhasil input form informasi pendidikan");
	}
	
	
	//Modul informasi pengalaman kerja
	@When ("Customer input form informasi pengalaman kerja")
	public void customer_input_form_informasi_pengalaman_kerja() {
		tunggu(1);
		dataPelamarPage.informasiPengalamanKerja(configurationProperties.getCompany(), configurationProperties.getPosition(), configurationProperties.getLngYear(), configurationProperties.getLngMonth());
		extentTest.log(LogStatus.PASS, "Customer input form informasi pengalaman kerja");
	}
		
	@Then("Customer berhasil input form informasi pengalaman kerja")
	public void customer_berhasil_input_form_informasi_pengalaman_kerja() {
		tunggu(1);
		String actualString = dataPelamarPage.getTxtSuccesfullPengalaman();
		assertTrue(actualString.contains(configurationProperties.getTxtSuccesfullPengalaman()));
		extentTest.log(LogStatus.PASS, "Customer berhasil input form informasi pengalaman kerja");
	}
	
	//Modul informasi rekening
	@When ("Customer input form informasi rekening")
	public void customer_input_form_informasi_rekening() {
		tunggu(1);
		dataPelamarPage.informasiRekening(configurationProperties.getNameBank(), configurationProperties.getNoRek(), configurationProperties.getNameBranch());
		extentTest.log(LogStatus.PASS, "Customer input form informasi rekening");
	}
			
	@Then("Customer berhasil input form informasi rekening")
	public void customer_berhasil_input_form_informasi_rekening() {
		tunggu(1);
		assertEquals(configurationProperties.getTxtSuccesfullRekening(), dataPelamarPage.getTxtSuccesfullRekening());
		extentTest.log(LogStatus.PASS, "Customer berhasil input form informasi rekening");
	}
		
	//Modul informasi npwp
	@When ("Customer input form informasi npwp")
	public void customer_input_form_informasi_npwp() {
		tunggu(1);
		dataPelamarPage.informasiNpwp(configurationProperties.getNumberNpwp(), configurationProperties.getAlmtNpwp());
		dataPelamarPage.buttonNextStep();
		extentTest.log(LogStatus.PASS, "Customer input form informasi npwp");
	}
			
	@Then("Customer berhasil input form informasi npwp")
	public void customer_berhasil_input_form_informasi_npwp() {
		tunggu(1);
		assertEquals(configurationProperties.getTxtSuccesfullNpwp(), dataPelamarPage.getTxtSuccesfullNpwp());
		extentTest.log(LogStatus.PASS, "Customer berhasil input form informasi npwp");
	}
	
	//Modul Upload Dokumen
	@When("Customer Upload File Dokumen Ktp")
	public void customer_upload_file_dokumen_ktp() {
		uploadFilePage.uploadKtp();
		extentTest.log(LogStatus.PASS, "Customer Upload File Dokumen Ktp");
	}
	
	@Then("Customer berhasil Upload File Dokumen Ktp")
	public void customer_berhasil_upload_file_dokumen_ktp() {
		tunggu(2);
		String actualString = uploadFilePage.getTxtKtp();
		assertTrue(actualString.contains(configurationProperties.getTxtKtp()));
		extentTest.log(LogStatus.PASS, "Customer berhasil Upload File Dokumen Ktp");
	}
	
	@When("Customer Upload File Dokumen Ijazah")
	public void customer_upload_file_dokumen_ijazah() {
		uploadFilePage.uploadIjazah();
		extentTest.log(LogStatus.PASS, "Customer Upload File Dokumen Ijazah");
	}
	
	@Then("Customer berhasil Upload File Dokumen Ijazah")
	public void customer_berhasil_upload_file_dokumen_ijazah() {
		tunggu(1);
		String actualString = uploadFilePage.getTxtIjazah();
		assertTrue(actualString.contains(configurationProperties.getTxtIjazah()));
		extentTest.log(LogStatus.PASS, "Customer berhasil Upload File Dokumen Ijazah");
	}
	
	@When("Customer Upload File Dokumen Cv")
	public void customer_upload_file_dokumen_cv() {
		uploadFilePage.uploadCv();
		extentTest.log(LogStatus.PASS, "Customer Upload File Dokumen Cv");
	}
	
	@Then("Customer berhasil Upload File Dokumen Cv")
	public void customer_berhasil_upload_file_dokumen_cv() {
		tunggu(2);
		String actualString = uploadFilePage.getTxtCv();
		assertTrue(actualString.contains(configurationProperties.getTxtCv()));
		extentTest.log(LogStatus.PASS, "Customer berhasil Upload File Dokumen Cv");
	}
	
	@When("Customer Upload File Dokumen Kk")
	public void customer_upload_file_dokumen_kk() {
		uploadFilePage.uploadKk();
		extentTest.log(LogStatus.PASS, "Customer Upload File Dokumen Kk");
	}
	
	@Then("Customer berhasil Upload File Dokumen Kk")
	public void customer_berhasil_upload_file_dokumen_kk() {
//		driver.navigate().refresh();
		tunggu(2);
		String actualString = uploadFilePage.getTxtKk();
		assertTrue(actualString.contains(configurationProperties.getTxtKk()));
		extentTest.log(LogStatus.PASS, "Customer berhasil Upload File Dokumen Kk");
	}
	
	@When("Customer Upload File Dokumen Npwp")
	public void customer_upload_file_dokumen_npwp() {
		uploadFilePage.uploadNpwp();
		uploadFilePage.btnNextSubmit();
		extentTest.log(LogStatus.PASS, "Customer Upload File Dokumen Npwp");
	}
	
	@Then("Customer berhasil Upload File Dokumen Npwp")
	public void customer_berhasil_upload_file_dokumen_npwp() {
		tunggu(2);
		String actualString = uploadFilePage.getTxtDataLengkap();
		assertTrue(actualString.contains(configurationProperties.getTxtDataLengkap()));
		extentTest.log(LogStatus.PASS, "Customer berhasil Upload File Dokumen Npwp");
	}
	
	public static void tunggu(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
