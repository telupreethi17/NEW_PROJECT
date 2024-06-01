package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Deepak
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class LoginPage extends BaseClass{                              // Rule-1  create a separte java class
                           
	WebDriver driver;
	 public LoginPage(WebDriver driver) {             //Rule 3 : Object Initialization
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	                           
	@FindBy(name="txtUsername")                        // Rule-2 Object Creation
	private WebElement usernameEdt;
	
	@FindBy(name="txtPassword")
	private WebElement passwordEdt;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginBtn;
	     
	@FindBy(id = "login:type")
	private WebElement selectDD;
	                                             
	public WebElement getSelectDD() {
		return selectDD;
	}

	public WebElement getUsernameEdt() {            //Rule-4 : Object Encapsulation
		return usernameEdt;                        //Rule-5 : Object Utilization
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
/**
 *  login to application based username , password , url argumnets 
 * @param url
 * @param username
 * @param password
 * @throws Throwable 
 */
	 public void loginToapp() throws Throwable {
		 wLib.waitForPageToLoad(driver);
		 String URL = fLib.getDataFromPropertiesFile("url") ;
		 String USERNAME = fLib.getDataFromPropertiesFile("username");
		 String PASSWORD = fLib.getDataFromPropertiesFile("password");
		 driver.get(URL);
		 driver.manage().window().maximize();
		 usernameEdt.sendKeys(USERNAME);
		 passwordEdt.sendKeys(PASSWORD);
		 String txt = eLib.getDataFromExcel("Sheet1", 0, 3);
		 wLib.select(selectDD, txt);
		 loginBtn.click();
	 }
	 
	 public void loginToappManu() throws Throwable {
		 wLib.waitForPageToLoad(driver);
		 String URL = fLib.getDataFromPropertiesFile("url") ;
		 String USERNAME = fLib.getDataFromPropertiesFile("usermanuf");
		 String PASSWORD = fLib.getDataFromPropertiesFile("passwordmanuf");
		 driver.get(URL);	
		 driver.manage().window().maximize();
		 usernameEdt.sendKeys(USERNAME);
		 passwordEdt.sendKeys(PASSWORD);
		 String txt = eLib.getDataFromExcel("Sheet1", 0, 2);
		 wLib.select(selectDD, txt);
		 loginBtn.click();
	 }
	 
	 public void loginToappRetailer() throws Throwable {
		 wLib.waitForPageToLoad(driver);
		 String URL = fLib.getDataFromPropertiesFile("url") ;
		 String USERNAME = fLib.getDataFromPropertiesFile("userretailer");
		 String PASSWORD = fLib.getDataFromPropertiesFile("passwordretailer");
		 driver.get(URL);	
		 driver.manage().window().maximize();
		 usernameEdt.sendKeys(USERNAME);
		 passwordEdt.sendKeys(PASSWORD);
		 String txt = eLib.getDataFromExcel("Sheet1", 0, 1);
		 wLib.select(selectDD, txt);
		 loginBtn.click();
	 }
	
	
}
