package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageAreaPage {
/*
 * @author Preethi
 * 
 * conatins Manage area web elements
 */
    
    WebDriver driver;
        public ManageAreaPage(WebDriver driver) {            
        this.driver = driver;
        PageFactory.initElements(driver, this);
     }
    
     @FindBy(xpath="//input[@value='Delete']") 
     private WebElement deleteBtn;
     
     @FindBy(xpath="//input[@value='+ Add Area']")
     private WebElement addAreaBtn;
     
     @FindBy(id ="areaName")
     private WebElement addAreaName;
     
     @FindBy(id ="areaCode")
     private WebElement addAreaCode;
     
     @FindBy(xpath= "//input[@value='Add Area']")
     private WebElement addAreaBtn2;
     
     @FindBy(name = "txtAreaName")
     private WebElement editAreaName;
     
     @FindBy(name = "txtAreaCode")
     private WebElement editAreaCode;
     
     @FindBy(xpath = "//input[@value='Update Area']")
     private WebElement UpdateAreaBtn;
     
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getAddAreaBtn() {
		return addAreaBtn;
	}

	public WebElement getAddAreaName() {
		return addAreaName;
	}

	public WebElement getAddAreaCode() {
		return addAreaCode;
	}

	public WebElement getAddAreaBtn2() {
		return addAreaBtn2;
	}

	public WebElement getEditAreaName() {
		return editAreaName;
	}

	public WebElement getEditAreaCode() {
		return editAreaCode;
	}

	public WebElement getUpdateAreaBtn() {
		return UpdateAreaBtn;
	}
     
     //Edit button and CheckBox ------dynamic elements
     
     
}
