package com.magangkelompok.salesindo.uploadFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magankelompok.salesindo.driver.DriverSingleton;

public class UploadFilePage {
	
	private WebDriver driver;

	public UploadFilePage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[1]/td[4]/a")
	private WebElement btnAddKtp;
	
	@FindBy(id = "file")
	private WebElement ktp;
	
	@FindBy(name = "submit")
	private WebElement btnSubmitKtp;
	
	
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[2]/td[4]/a")
	private WebElement btnAddIjazah;
	
	@FindBy(id = "file")
	private WebElement ijazah;
	
	@FindBy(name = "submit")
	private WebElement btnSubmitIjazah;
	
	
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[3]/td[4]/a")
	private WebElement btnAddCv;
	
	@FindBy(id = "file")
	private WebElement cv;
	
	
	@FindBy(name = "submit")
	private WebElement btnSubmitCv;
	
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[4]/td[4]/a")
	private WebElement btnAddKk;
	
	@FindBy(id = "file")
	private WebElement kk;
	
	@FindBy(name = "submit")
	private WebElement btnSubmitKk;
	
	
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[5]/td[4]/a")
	private WebElement btnAddNpwp;
	
	@FindBy(id = "file")
	private WebElement npwp;
	
	@FindBy(name = "submit")
	private WebElement btnSubmitNpwp;
	
	
	@FindBy(name = "submit")
	private WebElement btnNextSubmit;
	
	
	public void uploadKtp() {
		btnAddKtp.click();
		ktp.sendKeys("/Users/rohman/Downloads/wallpaperbetter (2).jpg");
		btnSubmitKtp.click();
		
	}
	
	public void uploadIjazah() {
		btnAddIjazah.click();
		ijazah.sendKeys("/Users/rohman/Downloads/wallpaperbetter (2).jpg");
		btnSubmitIjazah.click();
		
	}
	
	public void uploadCv() {
		btnAddCv.click();
		cv.sendKeys("/Users/rohman/Downloads/wallpaperbetter (2).jpg");
		btnSubmitCv.click();
		
	}
	
	public void uploadKk() {
		btnAddKk.click();
		kk.sendKeys("/Users/rohman/Downloads/wallpaperbetter (2).jpg");
		btnSubmitKk.click();
		
	}
	
	public void uploadNpwp() {
		btnAddNpwp.click();
		npwp.sendKeys("/Users/rohman/Downloads/wallpaperbetter (2).jpg");
		btnSubmitNpwp.click();
		
	}
	
	public void btnNextSubmit() {
		btnNextSubmit.click();
	}
	
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[1]/td[2]")
	private WebElement txtKtp;
	
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[2]/td[2]")
	private WebElement txtIjazah;
	
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[3]/td[2]")
	private WebElement txtCv;
	
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[4]/td[2]")
	private WebElement txtKk;
	
//	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[1]")
//	private WebElement txtDataLengkap;
	
	@FindBy(id ="content")
	private WebElement txtDataLengkap;
	
	
	public String getTxtKtp() {
		return txtKtp.getText();
	}
	
	public String getTxtIjazah() {
		return txtIjazah.getText();
	}

	public String getTxtCv() {
		return txtCv.getText();
	}

	public String getTxtKk() {
		return txtKk.getText();
	}

	public String getTxtDataLengkap() {
		return txtDataLengkap.getText();
	}

	
	
	
}
