package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryInfoPage {

	WebDriver driver;
	public CategoryInfoPage(WebDriver driver)
	{            
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h1[text()='View Category']")
	private WebElement viewcategory;

	public WebElement getviewcategory() {
	return viewcategory;
	}
	
	@FindBy(xpath="//h1[text()='Update Category']")
	private WebElement updatecategoryinfo;

	public WebElement getupdatecategoryinfo() {
	return updatecategoryinfo;
	}
	

}
