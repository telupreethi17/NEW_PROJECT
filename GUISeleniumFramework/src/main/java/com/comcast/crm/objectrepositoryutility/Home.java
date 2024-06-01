package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Preethi
 * 
 * Contains Home page elements & business lib like logOut()
 *
 */  
public class Home {                             
                           
	WebDriver driver;
	 public Home(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath = "//input[@value='Log out']")
	 private WebElement lgBtn;
	 
     @FindBy(linkText = "Retailers")
     private WebElement homeRetailer;
     
     @FindBy(linkText= "Manufacturers")
     private WebElement homeManufacturer;
     
     @FindBy(linkText= "Distributors")
     private WebElement homeDistributor;
     
     @FindBy(linkText = "Products")
     private WebElement homeProducts;
     
     @FindBy(linkText = "Orders")
     private WebElement homeOrders;
     
     @FindBy(linkText = "Invoice")
     private WebElement homeInvoice;
     
     @FindBy(linkText = "Add Products")
     private WebElement homeAddProducts;
     
     @FindBy(linkText = "Add Retailers")
     private WebElement homeAddRetailers;
     
     @FindBy(linkText = "Add Manufacturer")
     private WebElement homeAddManufacturer;
     
     @FindBy(linkText = "Add Distributor")
     private WebElement homeAddDistributor;
     
     @FindBy(linkText = "Manage Unit")
     private WebElement homeManageUnit;
     
     @FindBy(linkText = "Manage Category")
     private WebElement homeManageCategory;
     
     @FindBy(linkText = "Manage Area")
     private WebElement homeManageArea;
     
     @FindBy(linkText = "Change Password")
     private WebElement homeChangePassword;
     
     

	public WebElement getHomeRetailer() {
		return homeRetailer;
	}

	public WebElement getHomeManufacturer() {
		return homeManufacturer;
	}

	public WebElement getHomeDistributor() {
		return homeDistributor;
	}

	public WebElement getHomeProducts() {
		return homeProducts;
	}

	public WebElement getHomeOrders() {
		return homeOrders;
	}

	public WebElement getHomeInvoice() {
		return homeInvoice;
	}

	public WebElement getHomeAddProducts() {
		return homeAddProducts;
	}

	public WebElement getHomeAddRetailers() {
		return homeAddRetailers;
	}

	public WebElement getHomeAddManufacturer() {
		return homeAddManufacturer;
	}

	public WebElement getHomeAddDistributor() {
		return homeAddDistributor;
	}

	public WebElement getHomeManageUnit() {
		return homeManageUnit;
	}

	public WebElement getHomeManageCategory() {
		return homeManageCategory;
	}

	public WebElement getHomeManageArea() {
		return homeManageArea;
	}

	public WebElement getHomeChangePassword() {
		return homeChangePassword;
	}

	public WebElement getLgBtn() {
		return lgBtn;
	}

// Business logic
	public void logout() {
	getLgBtn().click();
		
	}
	

	
	
}
