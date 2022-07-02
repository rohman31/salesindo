package com.magangkelompok.salesindo;

import javax.management.loading.PrivateClassLoader;

public enum TestCases {

	T1("Testing Login Invalid Customer"),
	T2("Testing Login Valid Customer"),
	T3("Testing Menu Input Data Pelamar"),
	T4("Testing module biodata pelamar"),
	T5("Testing Mandatory Field Data Pelamar"),
	T6("Testing module Alamat Tinggal Pelamar Sesuai KTP"),
	T7("Testing module Alamat Tinggal Pelamar Sekarang"),
	T8("Testing form Informasi Saudara Tidak Serumah"),
	T9("Testing form Informasi Keluarga Serumah"),
	T10("Testing form Sosial Media"),
	T11("Testing module Informasi Pendidikan"),
	T12("Testing module Informasi Pengalaman Kerja"),
	T13("Testing module Informasi Rekening"),
	T14("Testing module Informasi Npwp"),
	T15("Testing Menu Upload File Dokumen");
	
	
	
	
	
	private String testName;
	
	TestCases(String testName) {
		this.testName = testName;
	}
	
	public String getTestname() {
		return testName;
	}
}
