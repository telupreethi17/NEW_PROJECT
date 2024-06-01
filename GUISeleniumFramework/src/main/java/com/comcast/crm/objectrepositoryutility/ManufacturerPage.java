package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.basetest.BaseClass;

/*
 * @auother:Preethi
 *
 * contains Manufacture page web elemnets
 */

public class ManufacturerPage extends BaseClass {

WebDriver driver;
public ManufacturerPage(WebDriver driver)
{            
this.driver = driver;
PageFactory.initElements(driver, this);
}
@FindBy(id = "manufacturer:name")
private WebElement manufname;

public WebElement getmanufname() {
return manufname;
}
@FindBy(id = "manufacturer:email")
private WebElement manufemail;

public WebElement getmanufemail() {
return manufemail;
}
@FindBy(id = "manufacturer:phone")
private WebElement manufphone;

public WebElement getmanufphone() {
return manufphone;
}
@FindBy(id = "manufacturer:username")
private WebElement manufusername;

public WebElement getmanufusername() {
return manufusername;
}
@FindBy(id = "manufacturer:password")
private WebElement manufpassword;

public WebElement getmanufpassword() {
return manufpassword;
}

@FindBy(xpath= "//input[@value='Add Manufacturer']")
private WebElement manufaddbutton;

public WebElement getmanufaddbutton()
{
return manufaddbutton;
}

public void addManufaturer(String name, String email, String phone, String username, String password) throws Throwable
{
	manufname.sendKeys(name);
	manufemail.sendKeys(email);
	manufphone.sendKeys(phone);
	manufusername.sendKeys(username);
	manufpassword.sendKeys(password);
//	manufaddbutton.click();
//	wLib.switchtoAlertAndAccept(driver);
}


public void Manufaturerlogin( String username, String password) throws Throwable
{
	LoginPage lp= new LoginPage(driver);
	lp.getUsernameEdt().sendKeys(username);
	lp.getPasswordEdt().sendKeys(password);

	String txt = eLib.getDataFromExcel("Sheet1", 0, 2);
	
	 wLib.select(lp.getSelectDD(), txt);
	 lp.getSelectDD().click();
	 lp.getLoginBtn().click();

}
}
