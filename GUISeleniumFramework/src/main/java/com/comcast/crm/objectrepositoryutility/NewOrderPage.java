package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrderPage {

	/*
	 * @author Preethi
	 */
	    
	    WebDriver driver;
	        public NewOrderPage(WebDriver driver) {            
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	     }
	    
	  @FindBy(linkText = "New Order")
	  private WebElement newOrder;
	  
	  @FindBy(xpath = "//input[@value='Post Order']")
	  private WebElement postOrderBtn;
	  
	public WebElement getNewOrder() {
		return newOrder;
	}

	public WebElement getPostOrderBtn() {
		return postOrderBtn;
	}
	  
	  
}
