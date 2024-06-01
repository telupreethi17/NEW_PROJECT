package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
 * @auother:Preethi
 *
 * contains distributor page web elemnets
 */
public class DistributorPage {

WebDriver driver;
public DistributorPage(WebDriver driver)
{            
this.driver = driver;
PageFactory.initElements(driver, this);
}
@FindBy(id = "distributor:name")
private WebElement distriname;

public WebElement getdistriname() {
return distriname;
}

@FindBy(id = "distributor:email")
private WebElement distriemail;

public WebElement getdistriemail() {
return distriemail;
}
@FindBy(id = "distributor:phone")
private WebElement distriphone;

public WebElement getdistriphone() {
return distriphone;
}
@FindBy(id = "distributor:address")
private WebElement distriadress;

public WebElement getdistriadress() {
return distriadress;
}
@FindBy(xpath= "//input[@value='Add Distributor']")

 private WebElement distributoraddbutton;

public WebElement getdistributoraddbutton()
{
return distributoraddbutton;
}


}
