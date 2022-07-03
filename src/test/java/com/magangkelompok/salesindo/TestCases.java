package com.magangkelompok.salesindo;

import javax.management.loading.PrivateClassLoader;

public enum TestCases {

	T1("Testing Login Invalid Customer"),
	T2("Testing Login Valid Customer"),
	T3("Testing Menu Input Data Pelamar"),
	T4("Testing module biodata pelamar"),
//	T5("Testing Mandatory Field Data Pelamar"),
	T5("Testing module Alamat Tinggal Pelamar Sesuai KTP"),
	T6("Testing module Alamat Tinggal Pelamar Sekarang"),
	T7("Testing form Informasi Saudara Tidak Serumah"),
	T8("Testing form Informasi Keluarga Serumah"),
	T9("Testing form Sosial Media"),
	T10("Testing module Informasi Pendidikan"),
	T11("Testing module Informasi Pengalaman Kerja"),
	T12("Testing module Informasi Rekening"),
	T13("Testing module Informasi Npwp"),
	T14("Testing Menu Upload File Dokumen KTP"),
	T15("Testing Menu Upload File Dokumen Ijazah"),
	T16("Testing Menu Upload File Dokumen CV"),
	T17("Testing Menu Upload File Dokumen KK"),
	T18("Testing Menu Upload File Dokumen NPWP");
	
	
	
	
	
	private String testName;
	
	TestCases(String testName) {
		this.testName = testName;
	}
	
	public String getTestname() {
		return testName;
	}
}
