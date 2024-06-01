package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



/*
* @auother:Preethi
*
* contains InvoicePage web elements
*/
public class InvoicePage {
WebDriver driver;

public InvoicePage(WebDriver driver) {
	this.driver = driver;
PageFactory.initElements(driver, this);
}

@FindBy(id="cmbFilter")
private WebElement InvoiceSearchBy;

public WebElement getInvoiceSearchBy() {
return InvoiceSearchBy;
}



@FindBy(xpath = "//input[@value='Search']")
private WebElement InvoiceSearchbutton;

public WebElement getInvoiceSearchbutton() {
return InvoiceSearchbutton;
}

}
