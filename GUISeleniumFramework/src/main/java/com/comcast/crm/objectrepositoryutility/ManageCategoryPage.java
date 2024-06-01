package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



/*
* @auother:Preethi
*
* contains ManageCategory web elemnets,edit category,add category
*/
public class ManageCategoryPage {

 WebDriver driver;

public ManageCategoryPage(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//input[@value='Delete']")
private WebElement deletebutton;

public WebElement getdeletebutton() {
return deletebutton;
}
@FindBy(xpath = "//input[@value='+ Add Category']")
private WebElement Addcategorybutton;

public WebElement getAddcategorybutton() {
return Addcategorybutton;
}
//ADD Category

@FindBy(id = "categoryName")
private WebElement categoryname;

public WebElement getcategoryname() {
return categoryname;
}


@FindBy(id = "categoryDetails")
private WebElement categorydetails;

public WebElement getcategorydetails() {
return categorydetails;
}

@FindBy(xpath = "//input[@value='Add Category']")
private WebElement Addcategorybutton2;

public WebElement getAddcategorybutton2() {
return Addcategorybutton2;
}
// edit category


@FindBy(id = "categoryName")
private WebElement editcategoryname;

public WebElement geteditcategoryname() {
return editcategoryname;
}


@FindBy(id = "categoryDetails")
private WebElement categorydetails2;

public WebElement getcategorydetails2() {
return categorydetails2;
}


@FindBy(xpath = "//input[@value='Update Category']")
private WebElement updatecategorybtn;

public WebElement getupdatecategorybtn() {
return updatecategorybtn;
}

}
