package com.magangkelompok.salesindo.datapelamar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.magankelompok.salesindo.driver.DriverSingleton;

public class DataPelamarPage {

	private WebDriver driver;
	
	public DataPelamarPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	//input data pelamar
	@FindBy(css = "#content > div.panel-body > div > div.note-content > a")
	private WebElement btnKlik;
		
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div[2]/div[2]")
	private WebElement txtWelcome;
		
	@FindBy(xpath = "//*[@id=\"content\"]/form[2]/div/div[1]/div/div[1]")
	private WebElement txtDataPelamar;
		
	@FindBy(xpath = "//*[@id=\"content\"]/form[2]/div/div[1]/div/div[3]/div[1]/div[2]/span/ul/li/div[3]/a")
	private WebElement btnContent;
		
	@FindBy(id = "file")
	private WebElement file;
		
	@FindBy(id = "Recruiter_Source")
	private WebElement SumberInformasi;
		
	@FindBy(id = "Recruiter")
	private WebElement Recruiter;
	
	//biodata pelamar
//	@FindBy(xpath = "//*[@id=\"ID_Type\"]")
//	private WebElement selectTipeIdentitas;
	
	@FindBy(id = "ID_Type")
	private WebElement selectTipeIdentitas;
		
	@FindBy(id = "ID_Number")
	private WebElement nomorIdentitas;
		
	@FindBy(id="Name")
	private WebElement namaKtp;
		
	@FindBy(id="Email")
	private WebElement emailKtp;
		
	@FindBy(name = "cbo_tanggal")
	private WebElement tglLahir;
		
	@FindBy(name = "cbo_bulan")
	private WebElement bulanLahir;
		
	@FindBy(name = "cbo_tahun")
	private WebElement tahunLahir;
		
	@FindBy(xpath="//*[@id=\"Place_Of_Birth\"]")
	private WebElement kotaLahir;
		
	@FindBy(id="Mother_Maid")
	private WebElement namaIbu;
		
	@FindBy(name="Gender")
	private WebElement jenisKelamin;
		
	@FindBy(name="Religion")
	private WebElement religion;
		
	@FindBy(name="Marital_Status")
	private WebElement statusNikah;
		
	@FindBy(id="Total_Of_Child")
	private WebElement jlhAnak;
		
	@FindBy(id="Body_Height")
	private WebElement tinggiBadan;
		
	@FindBy(id="Body_Weight")
	private WebElement beratBadan;
		
	@FindBy(id="Mobile_Phone_Number")
	private WebElement noHp;
		
	@FindBy(id="Home_Phone_Number_Code")
	private WebElement kodeArea;
		
	@FindBy(id="Home_Phone_Number")
	private WebElement telpRumah;
		
	@FindBy(css="#content > form.form-horizontal.form-bordered > div > div:nth-child(5) > div > div.panel-heading.ui-sortable-handle > h4")
	private WebElement txtBerhasilBiodata;
		
	public String getTxtBerhasilBiodata() {
			return txtBerhasilBiodata.getText();
	}

	public void setTxtBerhasilBiodata(WebElement txtBerhasilBiodata) {
			this.txtBerhasilBiodata = txtBerhasilBiodata;
	}
	
	//alamat tinggal pelamar sesuai KTP
	@FindBy(id="Address_By_ID")
	private WebElement alamatKtp;
		
	@FindBy (id="Address_ID_RT")
	private WebElement rtKtp;
		
	@FindBy (id="Address_ID_RW")
	private WebElement rwKtp;
		
	@FindBy (id="sel_province")
	private WebElement provinsiKtp;
		
	@FindBy (id="city_by_id")
	private WebElement kotaKtp;
		
	@FindBy (id="kecamatan")
	private WebElement kecamatanKtp;
		
	@FindBy (id="kelurahan")
	private WebElement kelurahanKtp;
		
	@FindBy (id="postalcodes")
	private WebElement kodePosKtp;
		
	@FindBy(xpath="//*[@id=\"content\"]/form[2]/div/div[4]/div/div[1]")
	private WebElement txtSuccesfullAlamatKtp;
		
	public String getTxtSuccesfullAlamatKtp() {
		return txtSuccesfullAlamatKtp.getText();
	}

	public void setTxtSuccesfullAlamatKtp(WebElement txtSuccesfullAlamatKtp) {
		this.txtSuccesfullAlamatKtp = txtSuccesfullAlamatKtp;
	}
	
	
	//form alamat tinggal pelamar sekarang
	@FindBy(id="Address_By_Residence")
	private WebElement alamatSekarang;
		
	@FindBy(id="Address_Residence_RT")
	private WebElement rtSekarang;
		
	@FindBy(id="Address_Residence_RW")
	private WebElement rwSekarang;
		
	@FindBy(id="sel_province2")
	private WebElement provinsiAlamatSekarang;
		
	@FindBy(id="city_by_id2")
	private WebElement kotaSekarang;
		
	@FindBy(id="kecamatan2")
	private WebElement kecSekarang;
		
	@FindBy(id="kelurahan2")
	private WebElement kelSekarang;
		
	@FindBy(xpath="//*[@id=\"content\"]/form[2]/div/div[5]/div/div[1]/h4")
	private WebElement txtSuccessfulAlamatSekarang;
		
	public String getTxtSuccessfulAlamatSekarang() {
		return txtSuccessfulAlamatSekarang.getText();
	}

	public void setTxtSuccessfulAlamatSekarang(WebElement txtSuccessfulAlamatSekarang) {
		this.txtSuccessfulAlamatSekarang = txtSuccessfulAlamatSekarang;
	}
	
	
	
	//informasi saudara tidak serumah
	@FindBy(id = "Econ_Name")
	private WebElement nameSuadaraSerumah;
	
	@FindBy(id = "Econ_Relationship")
	private WebElement hubunganDenganSaudara;
	
	@FindBy(id = "Econ_Phone_Number")
	private WebElement nomorHp;
	
	@FindBy(id = "Econ_Address")
	private WebElement alamat;
	
	@FindBy(id = "Econ_Address_RT")
	private WebElement RT;
	
	@FindBy(id = "Econ_Address_RW")
	private WebElement RW;
	
	@FindBy(id = "sel_province3")
	private WebElement prov;
	
	@FindBy(id = "city_by_id3")
	private WebElement kot;
	
	@FindBy(id = "kecamatan3")
	private WebElement kec;
	
	@FindBy(id = "kelurahan3")
	private WebElement kel;
	
	@FindBy(id = "postalcode3")
	private WebElement kode;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form[2]/div/div[6]/div/div[1]")
	private WebElement txtInformasiKeluargaSerumah;
	
	
	
	@FindBy(css = "#fileupload > div > div.panel-footer.col-lg-12 > span > button")
	private WebElement btnSubmit;
	
	// informasi keluarga serumah
	@FindBy(id = "Econ_Name_Home")
	private WebElement namaSaudaraSerumahHome;
		
	@FindBy(id = "Econ_Relationship_Home")
	private WebElement hubunganSaudaraSerumah;
		
	@FindBy(id = "Econ_Phone_Number_Home")
	private WebElement nomorHpSerumah;
		
	@FindBy(id = "Econ_Address_Home")
	private WebElement alamatHome;
		
	@FindBy(id = "Econ_Address_RT_Home")
	private WebElement RTHome;
		
	@FindBy(id = "Econ_Address_RW_Home")
	private WebElement RwHome;
		
	@FindBy(id = "sel_province4")
	private WebElement provHome;
		
	@FindBy(id = "city_by_id4")
	private WebElement kotHome;
		
	@FindBy(id = "kecamatan4")
	private WebElement kecHome;
		
	@FindBy(id = "kelurahan4")
	private WebElement kelHome;
		
	@FindBy(id = "postalcode4")
	private WebElement kodePsHome;
		
	@FindBy(xpath = "//*[@id=\"content\"]/form[2]/div/div[7]/div/div[1]")
	private WebElement txtSosialMedia;
	
	
	
	//Rohman input Data Pelamar
	public void buttonDisisi() {
		btnKlik.click();
	}
	
	//Rohman input Data Pelamar
	public void dataPelamarForm(String info, String recuit) {
		btnContent.click();
		file.sendKeys("/Users/rohman/Downloads/wallpaperbetter (2).jpg");
		btnSubmit.click();
		select(SumberInformasi).selectByValue(info);
		select(Recruiter).selectByVisibleText(recuit);
		
		
	}
	
	//method biodata pelamar
	//Pada method ini user isi semua field yang ada pada form biodata pelamar baik mandatory dan optional
	public void biodataPelamar(String selectIdent, String noIdent, String nama, String email, String tanggal, String bulan, String tahun, String kota, String ibu, String jk, String agama, String nikah, String anak, String tinggi, String berat, String hp, String kodArea, String noRumah) {
		select(selectTipeIdentitas).selectByValue(selectIdent);
		nomorIdentitas.sendKeys(noIdent);
		namaKtp.clear();
		namaKtp.sendKeys(nama);
		emailKtp.clear();
		emailKtp.sendKeys(email);
		select(tglLahir).selectByValue(tanggal);
		select(bulanLahir).selectByValue(bulan);
		select(tahunLahir).selectByValue(tahun);
		select(kotaLahir).selectByValue(kota);
		namaIbu.sendKeys(ibu);
		select(jenisKelamin).selectByValue(jk);
		select(religion).selectByValue(agama);
		select(statusNikah).selectByValue(nikah);
		jlhAnak.sendKeys(anak);
		tinggiBadan.sendKeys(tinggi);
		beratBadan.sendKeys(berat);
		noHp.sendKeys(hp);
		kodeArea.sendKeys(kodArea);
		telpRumah.sendKeys(noRumah);
	}
		
	//method mandatory field form biodata pelamar
	//Pada method ini user hanya isi field yang wajib saja, sedangkan optional field tidak di isi
	public void mandatoryBiodataPelamar(String selectIdent, String noIdent, String nama, String email, String tanggal, String bulan, String tahun, String kota, String ibu,String jk, String agama, String nikah, String tinggi, String berat, String hp) {
		select(selectTipeIdentitas).selectByValue(selectIdent);
		nomorIdentitas.sendKeys(noIdent);
		namaKtp.clear();
		namaKtp.sendKeys(nama);
		emailKtp.clear();
		emailKtp.sendKeys(email);
		select(tglLahir).selectByValue(tanggal);
		select(bulanLahir).selectByValue(bulan);
		select(tahunLahir).selectByValue(tahun);
		select(kotaLahir).selectByValue(kota);
		namaIbu.sendKeys(ibu);
		select(jenisKelamin).selectByValue(jk);
		select(religion).selectByValue(agama);
		select(statusNikah).selectByValue(nikah);
		tinggiBadan.sendKeys(tinggi);
		beratBadan.sendKeys(berat);
		noHp.sendKeys(hp);
	}
		
	//method alamat tinggal pelamar sesuai KTP
	public void alamatTinggalPelamarKtp(String alamat, String rtktp, String rwktp, String selProv, String kotaktp, String kecktp, String kelktp, String kodepos) {
		alamatKtp.sendKeys(alamat);
		rtKtp.sendKeys(rtktp);
		rwKtp.sendKeys(rwktp);
		select(provinsiKtp).selectByVisibleText(selProv);
		select(kotaKtp).selectByVisibleText(kotaktp);
		select(kecamatanKtp).selectByVisibleText(kecktp);
		select(kelurahanKtp).selectByVisibleText(kelktp);
		kodePosKtp.sendKeys(kodepos);
	}
		
	//method alamat tinggal pelamar sekarang
	public void alamatTinggalSekarang(String almtSekarang, String rtSkrg, String rwSkrg, String provSkrg, String kotaSkrg, String kecSkrg, String kelSkrg) {
		alamatSekarang.sendKeys(almtSekarang);
		rtSekarang.sendKeys(rtSkrg);
		rwSekarang.sendKeys(rwSkrg);
		select(provinsiAlamatSekarang).selectByVisibleText(provSkrg);
		select(kotaSekarang).selectByVisibleText(kotaSkrg);
		select(kecSekarang).selectByVisibleText(kecSkrg);
		select(kelSekarang).selectByVisibleText(kelSkrg);
	}
	
	//Rohman informasi saudara tidak serumah
	public void informasiSaudaraTidakSerumah(String nss, String hbs, String nhp, String almt, String rt, String rw, String provinsi,
			String kotaSaudara, String kecamatan, String kelurahan, String kodePos) {
		nameSuadaraSerumah.sendKeys(nss);
		hubunganDenganSaudara.sendKeys(hbs);
		nomorHp.sendKeys(nhp);
		alamat.sendKeys(almt);
		RT.sendKeys(rt);
		RW.sendKeys(rw);
		select(prov).selectByVisibleText(provinsi);
		select(kot).selectByVisibleText(kotaSaudara);
		select(kec).selectByVisibleText(kecamatan);
		select(kel).selectByVisibleText(kelurahan);
//		kode.sendKeys(kodePos);
	}
	
	//Rohman informasi keluarga serumah
	public void informasiKeluargaSerumah(String nks, String hbsh, String nhph, String almtHome, String rtHome, String rwHome, 
			String provinsiHome, String kotaHome, String kecamatanHome, String kelurahanHome, String kodePosHome ) {
	   namaSaudaraSerumahHome.sendKeys(nks);
	   hubunganSaudaraSerumah.sendKeys(hbsh);
	   nomorHpSerumah.sendKeys(nhph);
	   alamatHome.sendKeys(almtHome);
	   RTHome.sendKeys(rtHome);
	   RwHome.sendKeys(rwHome);
	   select(provHome).selectByVisibleText(provinsiHome);
	   select(kotHome).selectByVisibleText(kotaHome);
	   select(kecHome).selectByVisibleText(kecamatanHome);
	   select(kelHome).selectByVisibleText(kelurahanHome);
	   
	}
	
	//Rohman Sosial Media
	@FindBy(id = "FaceBook")
	private WebElement fb;
	
	@FindBy(id = "Twitter")
	private WebElement twit;
	
	@FindBy(id = "Instagram")
	private WebElement inst;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form[2]/div/div[8]/div/div[1]")
	private WebElement txtInfolainnya;
	
	
	//informasi pendidikan
	@FindBy(name="Education")
	private WebElement pendidikan;
		
	@FindBy(id="School_Name")
	private WebElement namaSekolah;
		
	@FindBy(id="Majoring")
	private WebElement jurusan;
		
	@FindBy(id="IPK_Value")
	private WebElement ipk;
		
	@FindBy(xpath="//*[@id=\"content\"]/form[2]/div/div[8]/div/div[3]/div/div")
	private WebElement txtSuccesfullPendidikan;
	
	//informasi pengalaman kerja
	@FindBy(id ="Company_Name")
	private WebElement namaPerusahaan;
			
	@FindBy(id = "Last_Position")
	private WebElement jabatan;
			
	@FindBy(id = "Related_Job_Experience_Year")
	private WebElement brptahun;
			
	@FindBy(id="Related_Job_Experience_Month")
	private WebElement brpBulan;
			
	@FindBy(xpath="//*[@id=\"content\"]/form[2]/div/div[8]/div/div[5]/div/div")
	private WebElement txtSuccesfullPengalaman;
	
	//informasi rekening
	@FindBy(id ="Bank_Name")
	private WebElement namaBank;
			
	@FindBy(id = "Bank_Account")
	private WebElement noRekening;
			
	@FindBy(id = "Bank_Branch")
	private WebElement cabangBank;
					
	@FindBy(xpath="//*[@id=\"content\"]/form[2]/div/div[8]/div/div[7]/div")
	private WebElement txtSuccesfullRekening;
	
	
	//informasi NPWP
	@FindBy(id ="NPWP_Number")
	private WebElement noNpwp;
				
	@FindBy(id = "NPWP_Address")
	private WebElement alamatNpwp;
										
	@FindBy(xpath="//*[@id=\"fileupload\"]/div/div[1]")
	private WebElement txtSuccesfullNpwp;


	//Rohman Sosial Media
	public void sosialMedia(String facebook, String twitter, String instagram) {
		fb.sendKeys(facebook);
		twit.sendKeys(twitter);
		inst.sendKeys(instagram);
	}
	
	//method informasi pendidikan
	public void informasiPendidikan(String edu, String school, String major, String nilai) {
		select(pendidikan).selectByValue(edu);
		namaSekolah.sendKeys(school);
		jurusan.sendKeys(major);
		ipk.sendKeys(nilai);
	}
	
	public void informasiPendidikanNegative(String edu, String school, String major, String nilai) {
		select(pendidikan).selectByValue(edu);
		namaSekolah.sendKeys(school);
		jurusan.sendKeys(major);
		ipk.sendKeys(nilai);
	}
			
	//method informasi pengalaman kerja
	public void informasiPengalamanKerja(String company, String position, String lngYear, String lngMonth) {
		namaPerusahaan.sendKeys(company);
		jabatan.sendKeys(position);
		brptahun.sendKeys(lngYear);
		brpBulan.sendKeys(lngMonth);
	}
	
	//method informasi rekening
	public void informasiRekening(String nameBank, String noRek, String nameBranch) {
		namaBank.sendKeys(nameBank);
		noRekening.sendKeys(noRek);
		cabangBank.sendKeys(nameBranch);
		
	}
	
	//method informasi Npwp
	public void informasiNpwp(String numberNpwp, String almtNpwp) {
			noNpwp.sendKeys(numberNpwp);
			alamatNpwp.sendKeys(almtNpwp);			
	}
	
	
	//Button Next & Submit
	@FindBy(name = "submit")
	private WebElement btnNext;
	
	//Rohman Button Next & Submit
	public void buttonNextStep() {
		btnNext.click();
	}
	
	//method select
	public static Select select(WebElement param) {
		Select tekan = new Select(param);
		return tekan;
	}

	//input data pelamar
	public String getTxtDataPelamar() {
		return txtDataPelamar.getText();
	}
	
	//informasi keluarga serumah
	public String getTxtInformasiKeluargaSerumah() {
		return txtInformasiKeluargaSerumah.getText();
	}
	
	//Sosial Media
	public String getTxtSosialMedia() {
		return txtSosialMedia.getText();
	}
	
	//Info Lainnya
	public String getTxtInfolainnya() {
		return txtInfolainnya.getText();
	}
	
	//informasi pendidikan
	public String getTxtSuccesfullPendidikan() {
		return txtSuccesfullPendidikan.getText();
	}
	
	//informasi pengalaman kerja
	public String getTxtSuccesfullPengalaman() {
		return txtSuccesfullPengalaman.getText();
	}

	//informasi rekening
	public String getTxtSuccesfullRekening() {
		return txtSuccesfullRekening.getText();
	}

	//informasi NPWP
	public String getTxtSuccesfullNpwp() {
		return txtSuccesfullNpwp.getText();
	}
	
	
	
	
	
}
