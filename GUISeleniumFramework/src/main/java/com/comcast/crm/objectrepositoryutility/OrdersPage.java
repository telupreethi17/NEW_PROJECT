package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * @auother:Preethi
 *
 * contains OrdersPAge web elements
 */
public class OrdersPage {

WebDriver driver;

public OrdersPage(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}

@FindBy(id="cmbFilter")
private WebElement OrdersSearchBy;

public WebElement getOrdersSearchBy() {
return OrdersSearchBy;
}



@FindBy(xpath = "//input[@value='Search']")
private WebElement OrdersSearchbutton;

public WebElement getOrdersSearchbutton() {
return OrdersSearchbutton;
}

}
