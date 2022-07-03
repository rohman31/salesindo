package com.magangkelompok.salesindo.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Value("${wrongPassword}")
	private String wrongPassword;
	
	@Value("${txtWelcome}")
	private String txtWelcome;
	
	@Value("${messageErrorLogin}")
	private String messageErrorLogin;
	
	@Value("${txtDataPelamar}")
	private String txtDataPelamar;
	
	@Value("${info}")
	private String info;
	
	@Value("${recuit}")
	private String recuit;
	
	@Value("${nss}")
	private String nss;
	
	@Value("${hbs}")
	private String hbs;
	
	@Value("${nhp}")
	private String nhp;
	
	@Value("${almt}")
	private String almt;
	
	@Value("${rt}")
	private String rt;
	
	@Value("${rw}")
	private String rw;
	
	@Value("${provinsi}")
	private String provinsi;
	
	@Value("${kotaSaudara}")
	private String kotaSaudara;
	
	@Value("${kecamatan}")
	private String kecamatan;
	
	@Value("${kelurahan}")
	private String kelurahan;
	
	@Value("${kodePos}")
	private String kodePos;
	
	@Value("${txtInformasiKeluargaSerumah}")
	private String txtInformasiKeluargaSerumah;
	
	@Value("${nks}")
	private String nks;
	
	@Value("${hbsh}")
	private String hbsh;
	
	@Value("${nhph}")
	private String nhph;
	
	@Value("${almtHome}")
	private String almtHome;
	
	@Value("${rtHome}")
	private String rtHome;
	
	@Value("${rwHome}")
	private String rwHome;
	
	@Value("${provinsiHome}")
	private String provinsiHome;
	
	@Value("${kotaHome}")
	private String kotaHome;
	
	@Value("${kecamatanHome}")
	private String kecamatanHome;
	
	@Value("${kelurahanHome}")
	private String kelurahanHome;
	
	@Value("${kodePosHome}")
	private String kodePosHome;
	
	@Value("${txtSosialMedia}")
	private String txtSosialMedia;
	
	@Value("${facebook}")
	private String facebook;
	
	@Value("${twitter}")
	private String twitter;
	
	@Value("${instagram}")
	private String instagram;
	
	@Value("${txtInfolainnya}")
	private String txtInfolainnya;
	
	@Value("${txtKtp}")
	private String txtKtp;
	
	@Value("${txtIjazah}")
	private String txtIjazah;
	
	@Value("${txtCv}")
	private String txtCv;
	
	@Value("${txtKk}")
	private String txtKk;
	
	@Value("${txtDataLengkap}")
	private String txtDataLengkap;
	

	public String getTxtKtp() {
		return txtKtp;
	}

	public void setTxtKtp(String txtKtp) {
		this.txtKtp = txtKtp;
	}

	public String getTxtIjazah() {
		return txtIjazah;
	}

	public void setTxtIjazah(String txtIjazah) {
		this.txtIjazah = txtIjazah;
	}

	public String getTxtCv() {
		return txtCv;
	}

	public void setTxtCv(String txtCv) {
		this.txtCv = txtCv;
	}

	public String getTxtKk() {
		return txtKk;
	}

	public void setTxtKk(String txtKk) {
		this.txtKk = txtKk;
	}

	public String getTxtDataLengkap() {
		return txtDataLengkap;
	}

	public void setTxtDataLengkap(String txtDataLengkap) {
		this.txtDataLengkap = txtDataLengkap;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getTxtInfolainnya() {
		return txtInfolainnya;
	}

	public void setTxtInfolainnya(String txtInfolainnya) {
		this.txtInfolainnya = txtInfolainnya;
	}

	public String getNks() {
		return nks;
	}

	public void setNks(String nks) {
		this.nks = nks;
	}

	public String getHbsh() {
		return hbsh;
	}

	public void setHbsh(String hbsh) {
		this.hbsh = hbsh;
	}

	public String getNhph() {
		return nhph;
	}

	public void setNhph(String nhph) {
		this.nhph = nhph;
	}

	public String getAlmtHome() {
		return almtHome;
	}

	public void setAlmtHome(String almtHome) {
		this.almtHome = almtHome;
	}

	public String getRtHome() {
		return rtHome;
	}

	public void setRtHome(String rtHome) {
		this.rtHome = rtHome;
	}

	public String getRwHome() {
		return rwHome;
	}

	public void setRwHome(String rwHome) {
		this.rwHome = rwHome;
	}

	public String getProvinsiHome() {
		return provinsiHome;
	}

	public void setProvinsiHome(String provinsiHome) {
		this.provinsiHome = provinsiHome;
	}

	public String getKotaHome() {
		return kotaHome;
	}

	public void setKotaHome(String kotaHome) {
		this.kotaHome = kotaHome;
	}

	public String getKecamatanHome() {
		return kecamatanHome;
	}

	public void setKecamatanHome(String kecamatanHome) {
		this.kecamatanHome = kecamatanHome;
	}

	public String getKelurahanHome() {
		return kelurahanHome;
	}

	public void setKelurahanHome(String kelurahanHome) {
		this.kelurahanHome = kelurahanHome;
	}

	public String getKodePosHome() {
		return kodePosHome;
	}

	public void setKodePosHome(String kodePosHome) {
		this.kodePosHome = kodePosHome;
	}

	public String getTxtSosialMedia() {
		return txtSosialMedia;
	}

	public void setTxtSosialMedia(String txtSosialMedia) {
		this.txtSosialMedia = txtSosialMedia;
	}

	public String getTxtInformasiKeluargaSerumah() {
		return txtInformasiKeluargaSerumah;
	}

	public void setTxtInformasiKeluargaSerumah(String txtInformasiKeluargaSerumah) {
		this.txtInformasiKeluargaSerumah = txtInformasiKeluargaSerumah;
	}

	public String getKotaSaudara() {
		return kotaSaudara;
	}

	public void setKotSaudara(String kotaSaudara) {
		this.kotaSaudara = kotaSaudara;
	}

	public String getKecamatan() {
		return kecamatan;
	}

	public void setKecamatan(String kecamatan) {
		this.kecamatan = kecamatan;
	}

	public String getKelurahan() {
		return kelurahan;
	}

	public void setKelurahan(String kelurahan) {
		this.kelurahan = kelurahan;
	}

	public String getKodePos() {
		return kodePos;
	}

	public void setKodePos(String kodePos) {
		this.kodePos = kodePos;
	}

	public String getProvinsi() {
		return provinsi;
	}

	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}

	public String getNhp() {
		return nhp;
	}

	public void setNhp(String nhp) {
		this.nhp = nhp;
	}

	public String getAlmt() {
		return almt;
	}

	public void setAlmt(String almt) {
		this.almt = almt;
	}

	public String getRt() {
		return rt;
	}

	public void setRt(String rt) {
		this.rt = rt;
	}

	public String getRw() {
		return rw;
	}

	public void setRw(String rw) {
		this.rw = rw;
	}

	public String getHbs() {
		return hbs;
	}

	public void setHbs(String hbs) {
		this.hbs = hbs;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getRecuit() {
		return recuit;
	}

	public void setRecuit(String recuit) {
		this.recuit = recuit;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getTxtDataPelamar() {
		return txtDataPelamar;
	}

	public void setTxtDataPelamar(String txtDataPelamar) {
		this.txtDataPelamar = txtDataPelamar;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTxtWelcome() {
		return txtWelcome;
	}

	public void setTxtWelcome(String txtWelcome) {
		this.txtWelcome = txtWelcome;
	}

	public String getWrongPassword() {
		return wrongPassword;
	}

	public void setWrongPassword(String wrongPassword) {
		this.wrongPassword = wrongPassword;
	}

	public String getMessageErrorLogin() {
		return messageErrorLogin;
	}

	public void setMessageErrorLogin(String messageErrorLogin) {
		this.messageErrorLogin = messageErrorLogin;
	}
	
	//biodata pelamar
	
	@Value("${selectIdent}")
	private String selectIdent;
	
	@Value("${noIdent}")
	private String noIdent; 
	
	@Value("${nama}")
	private String nama; 
	
	@Value("${email}")
	private String email; 
	
	@Value("${tanggal}")
	private String tanggal; 
	
	@Value("${bulan}")
	private String bulan; 
	
	@Value("${tahun}")
	private String tahun;
	
	@Value("${kota}")
	private String kota;
	
	@Value("${ibu}")
	private String ibu; 
	
	@Value("${jk}")
	private String jk; 
	
	@Value("${agama}")
	private String agama; 
	
	@Value("${nikah}")
	private String nikah; 
	
	@Value("${anak}")
	private String anak;
	
	@Value("${tinggi}")
	private String tinggi; 
	
	@Value("${berat}")
	private String berat; 
	
	@Value("${hp}")
	private String hp; 
	
	@Value("${kodArea}")
	private String kodArea; 
	
	@Value("${noRumah}")
	private String noRumah; 
	
	
	public String getSelectIdent() {
		return selectIdent;
	}

	public void setSelectIdent(String selectIdent) {
		this.selectIdent = selectIdent;
	}

	public String getNoIdent() {
		return noIdent;
	}

	public void setNoIdent(String noIdent) {
		this.noIdent = noIdent;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}

	public String getBulan() {
		return bulan;
	}

	public void setBulan(String bulan) {
		this.bulan = bulan;
	}

	public String getTahun() {
		return tahun;
	}

	public void setTahun(String tahun) {
		this.tahun = tahun;
	}

	public String getKota() {
		return kota;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}

	public String getIbu() {
		return ibu;
	}

	public void setIbu(String ibu) {
		this.ibu = ibu;
	}

	public String getJk() {
		return jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}

	public String getAgama() {
		return agama;
	}

	public void setAgama(String agama) {
		this.agama = agama;
	}

	public String getNikah() {
		return nikah;
	}

	public void setNikah(String nikah) {
		this.nikah = nikah;
	}

	public String getAnak() {
		return anak;
	}

	public void setAnak(String anak) {
		this.anak = anak;
	}
	
	public String getTinggi() {
		return tinggi;
	}

	public void setTinggi(String tinggi) {
		this.tinggi = tinggi;
	}

	public String getBerat() {
		return berat;
	}

	public void setBerat(String berat) {
		this.berat = berat;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getKodArea() {
		return kodArea;
	}

	public void setKodArea(String kodArea) {
		this.kodArea = kodArea;
	}

	public String getNoRumah() {
		return noRumah;
	}

	public void setNoRumah(String noRumah) {
		this.noRumah = noRumah;
	}

	//biodata pelamar
	@Value("${txtBerhasilBiodata}")
	private String txtBerhasilBiodata; 
		
	public String getTxtBerhasilBiodata() {
		return txtBerhasilBiodata;
	}

	public void setTxtBerhasilBiodata(String txtBerhasilBiodata) {
		this.txtBerhasilBiodata = txtBerhasilBiodata;
	}
		
	//alamat sesuai KTP
	@Value("${alamatKtp}")
	private String alamatKtp;
		
	@Value("${rtKtp}")
	private String rtKtp;
		
	@Value("${rwKtp}")
	private String rwKtp;
		
	@Value("${provinsiKtp}")
	private String provinsiKtp;
		
	@Value("${kotaKtp}")
	private String kotaKtp;
		
	@Value("${kecamatanKtp}")
	private String kecamatanKtp;
		
	@Value("${kelurahanKtp}")
	private String kelurahanKtp;
		
	@Value("${kodePosKtp}")
	private String kodePosKtp;
		

	@Value ("${txtSuccesfullAlamatKtp}")
	private String txtSuccesfullAlamatKtp;


	public String getAlamatKtp() {
		return alamatKtp;
	}

	public void setAlamatKtp(String alamatKtp) {
		this.alamatKtp = alamatKtp;
	}

	public String getRtKtp() {
		return rtKtp;
	}

	public void setRtKtp(String rtKtp) {
		this.rtKtp = rtKtp;
	}

	public String getRwKtp() {
		return rwKtp;
	}

	public void setRwKtp(String rwKtp) {
		this.rwKtp = rwKtp;
	}

	public String getProvinsiKtp() {
		return provinsiKtp;
	}

	public void setProvinsiKtp(String provinsiKtp) {
		this.provinsiKtp = provinsiKtp;
	}

	public String getKotaKtp() {
		return kotaKtp;
	}

	public void setKotaKtp(String kotaKtp) {
		this.kotaKtp = kotaKtp;
	}

	public String getKecamatanKtp() {
		return kecamatanKtp;
	}

	public void setKecamatanKtp(String kecamatanKtp) {
		this.kecamatanKtp = kecamatanKtp;
	}

	public String getKelurahanKtp() {
		return kelurahanKtp;
	}

	public void setKelurahanKtp(String kelurahanKtp) {
		this.kelurahanKtp = kelurahanKtp;
	}

	public String getKodePosKtp() {
		return kodePosKtp;
	}

	public void setKodePosKtp(String kodePosKtp) {
		this.kodePosKtp = kodePosKtp;
	}

	public String getTxtSuccesfullAlamatKtp() {
		return txtSuccesfullAlamatKtp;
	}

	public void setTxtSuccesfullAlamatKtp(String txtSuccesfullAlamatKtp) {
		this.txtSuccesfullAlamatKtp = txtSuccesfullAlamatKtp;
	}

	//alamat tinggal pelamar sekarang
	@Value("${alamatSekarang}")
	private String alamatSekarang;
		
	@Value("${rtSekarang}")
	private String rtSekarang;
		
	@Value("${rwSekarang}")
	private String rwSekarang;
		
	@Value("${provinsiAlamatSekarang}")
	private String provinsiAlamatSekarang;
		
	@Value("${kotaSekarang}")
	private String kotaSekarang;
		
	@Value("${kecSekarang}")
	private String kecSekarang;
		
	@Value("${kelSekarang}")
	private String kelSekarang;
		
	@Value("${txtSuccessfulAlamatSekarang}")
	private String txtSuccessfulAlamatSekarang;


	public String getAlamatSekarang() {
		return alamatSekarang;
	}

	public void setAlamatSekarang(String alamatSekarang) {
		this.alamatSekarang = alamatSekarang;
	}

	public String getRtSekarang() {
		return rtSekarang;
	}

	public void setRtSekarang(String rtSekarang) {
		this.rtSekarang = rtSekarang;
	}

	public String getRwSekarang() {
		return rwSekarang;
	}

	public void setRwSekarang(String rwSekarang) {
		this.rwSekarang = rwSekarang;
	}

	public String getProvinsiAlamatSekarang() {
		return provinsiAlamatSekarang;
	}

	public void setProvinsiAlamatSekarang(String provinsiAlamatSekarang) {
		this.provinsiAlamatSekarang = provinsiAlamatSekarang;
	}

	public String getKotaSekarang() {
		return kotaSekarang;
	}

	public void setKotaSekarang(String kotaSekarang) {
		this.kotaSekarang = kotaSekarang;
	}

	public String getKecSekarang() {
		return kecSekarang;
	}

	public void setKecSekarang(String kecSekarang) {
		this.kecSekarang = kecSekarang;
	}

	public String getKelSekarang() {
		return kelSekarang;
	}

	public void setKelSekarang(String kelSekarang) {
		this.kelSekarang = kelSekarang;
	}

	public String getTxtSuccessfulAlamatSekarang() {
		return txtSuccessfulAlamatSekarang;
	}

	public void setTxtSuccessfulAlamatSekarang(String txtSuccessfulAlamatSekarang) {
		this.txtSuccessfulAlamatSekarang = txtSuccessfulAlamatSekarang;
	}
		
	//method informasi pendidikan
		
	@Value("${edu}")
	private String edu;
		
	@Value("${school}")
	private String school;
		
	@Value("${major}")
	private String major;
		
	@Value("${nilai}")
	private String nilai;
		
	@Value("${txtSuccesfullPendidikan}")
	private String txtSuccesfullPendidikan;
	
	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getNilai() {
		return nilai;
	}

	public void setNilai(String nilai) {
		this.nilai = nilai;
	}

	public String getTxtSuccesfullPendidikan() {
		return txtSuccesfullPendidikan;
	}

	public void setTxtSuccesfullPendidikan(String txtSuccesfullPendidikan) {
		this.txtSuccesfullPendidikan = txtSuccesfullPendidikan;
	}

	
	//informasi Pengalaman Kerja
	
	@Value("${company}")
	private String company;
		
	@Value("${position}")
	private String position;
		
	@Value("${lngYear}")
	private String lngYear;
		
	@Value("${lngMonth}")
	private String lngMonth;
		
	@Value("${txtSuccesfullPengalaman}")
	private String txtSuccesfullPengalaman;


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getLngYear() {
		return lngYear;
	}

	public void setLngYear(String lngYear) {
		this.lngYear = lngYear;
	}

	public String getLngMonth() {
		return lngMonth;
	}

	public void setLngMonth(String lngMonth) {
		this.lngMonth = lngMonth;
	}

	public String getTxtSuccesfullPengalaman() {
		return txtSuccesfullPengalaman;
	}

	public void setTxtSuccesfullPengalaman(String txtSuccesfullPengalaman) {
		this.txtSuccesfullPengalaman = txtSuccesfullPengalaman;
	}
	
	//informasi Rekening
	
	@Value("${nameBank}")
	private String nameBank;
			
	@Value("${noRek}")
	private String noRek;
			
	@Value("${nameBranch}")
	private String nameBranch;
			
	@Value("${txtSuccesfullRekening}")
	private String txtSuccesfullRekening;
	
	
	public String getNameBank() {
		return nameBank;
	}

	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}

	public String getNoRek() {
		return noRek;
	}

	public void setNoRek(String noRek) {
		this.noRek = noRek;
	}

	public String getNameBranch() {
		return nameBranch;
	}

	public void setNameBranch(String nameBranch) {
		this.nameBranch = nameBranch;
	}

	public String getTxtSuccesfullRekening() {
		return txtSuccesfullRekening;
	}

	public void setTxtSuccesfullRekening(String txtSuccesfullRekening) {
		this.txtSuccesfullRekening = txtSuccesfullRekening;
	}

	
	//informasi Npwp
	
	@Value("${numberNpwp}")
	private String numberNpwp;
			
	@Value("${almtNpwp}")
	private String almtNpwp;
			
	@Value("${txtSuccesfullNpwp}")
	private String txtSuccesfullNpwp;


	public String getNumberNpwp() {
		return numberNpwp;
	}

	public void setNumberNpwp(String numberNpwp) {
		this.numberNpwp = numberNpwp;
	}

	public String getAlmtNpwp() {
		return almtNpwp;
	}

	public void setAlmtNpwp(String almtNpwp) {
		this.almtNpwp = almtNpwp;
	}

	public String getTxtSuccesfullNpwp() {
		return txtSuccesfullNpwp;
	}

	public void setTxtSuccesfullNpwp(String txtSuccesfullNpwp) {
		this.txtSuccesfullNpwp = txtSuccesfullNpwp;
	}
	
	
}
