package com.finsburry.scm.manufacturer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.AddProductPage;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)

public class AddProductTest extends BaseClass{
	
	@Test
	public void loginasManufacturer() throws Throwable
	{
		
		LoginPage lp= new LoginPage(driver);
		lp.loginToappManu();
		
		String USERNAME = fLib.getDataFromPropertiesFile("usermanuf");
		String txt = driver.findElement(By.xpath("//section[contains(text(), 'Welcome "+USERNAME+"')]")).getText();
		Assert.assertTrue(txt.contains("Welcome "+USERNAME+""));
		UtilityClassObject.getTest().log(Status.INFO,"Pass: Logined as ADMIN and  Verified");
//ADD PRODUCT
		Home hp= new Home(driver);
		hp.getHomeAddProducts().click();
		AddProductPage adp= new AddProductPage(driver);
		String prdtname = eLib.getDataFromExcel("Sheet1", 4, 1)+jLib.getRandomNumber();
		 adp.getProductEdt().sendKeys(prdtname);
		adp.getPriceEdt().sendKeys(eLib.getDataFromExcel("Sheet1", 5, 2));
		WebElement selectunit = adp.getUnitDD();
		wLib.select(selectunit, eLib.getDataFromExcel("Sheet1", 5, 3));
		WebElement selectcategory = adp.getCategDD();
		wLib.select(selectcategory, eLib.getDataFromExcel("Sheet1", 5, 4));
		adp.getEnableRbtn().click();
		adp.getDescriptn().sendKeys(eLib.getDataFromExcel("Sheet1", 5, 5));
		adp.getAddpbtn().click();
		wLib.switchtoAlertAndAccept(driver);
		
		//VERIFY
		hp.getHomeProducts().click();
		String actname = driver.findElement(By.xpath("//*//section//table//tbody//tr[last()]//td[3]")).getText();
		Assert.assertTrue(actname.contains(prdtname));
		UtilityClassObject.getTest().log(Status.INFO,"Pass: the Product added and Verified in product page");		
}
}
