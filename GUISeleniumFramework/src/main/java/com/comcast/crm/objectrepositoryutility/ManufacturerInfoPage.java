package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManufacturerInfoPage {
	
	
	WebDriver driver;
	public ManufacturerInfoPage(WebDriver driver)
	{            
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h1[text()='Welcome Admin']")
	private WebElement welcommsg;

	public WebElement getwelcommsg() {
	return welcommsg;
	}

}
