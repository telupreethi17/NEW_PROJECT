package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class Manageunitpage{
	public Manageunitpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//input[@value='Delete']")

private WebElement Deletbtn;

//edit

@FindBy(xpath = "//input[@value='Add Unit']")

private WebElement ADDUNITBTN;

public WebElement getADDUNITBTN() {
	return ADDUNITBTN;

}

@FindBy(xpath = "//img[@alt='edit'])[4]")

private WebElement Editimg;

@FindBy(xpath = "//input[@placeholder='Unit Name']")

private WebElement unitNameEdit;
@FindBy(xpath = "//textarea[@placeholder='Details']")

private WebElement DtailseEdit;

@FindBy(xpath = "//input[@value='Update Unit']")

private WebElement updateunitBtn;
@FindBy(xpath = "//input[@value='+ Add Unit']")

private WebElement Addunitbtn;
// add unit page
@FindBy(id = "unitName")

private WebElement addunitname;
@FindBy(id = "unitDetails")

private WebElement addDetails;
@FindBy(xpath = "//input[@value='Add Unit']")
private WebElement AddunitBtn2;
public WebElement getDeletbtn() {
	return Deletbtn;

}
public WebElement getEditimg() {

	return Editimg;
}
public WebElement getUnitNameEdit() {
	return unitNameEdit;
}

public WebElement getDtailseEdit() {

	return DtailseEdit;

}
public WebElement getUpdateunitBtn() {

	return updateunitBtn;

}
public WebElement getAddunitbtn() {

	return Addunitbtn;

}

public WebElement getAddunitname() {

	return addunitname;

}

public WebElement getAddDetails() {

	return addDetails;

}
public WebElement getAddunitBtn2() {

	return AddunitBtn2;

}

}
