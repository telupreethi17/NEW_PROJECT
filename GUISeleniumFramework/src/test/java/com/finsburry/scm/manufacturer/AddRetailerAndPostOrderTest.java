package com.finsburry.scm.manufacturer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.ManufacturerInfoPage;
import com.comcast.crm.objectrepositoryutility.RetailerPage;
//@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class AddRetailerAndPostOrderTest extends BaseClass {
	@Test
	public void addretailerTest() throws Throwable
	{
		String username = eLib.getDataFromExcel("Sheet1", 3, 4);
		String password = eLib.getDataFromExcel("Sheet1", 3, 5);
		String phone = jLib.getRandomPhnNumber();
		String email = eLib.getDataFromExcel("Sheet1", 3, 2);	
	String address = eLib.getDataFromExcel("Sheet1", 3, 7);
		LoginPage lp= new LoginPage(driver);
		lp.loginToapp();
	    Home hp= new Home(driver);
		ManufacturerInfoPage mip= new ManufacturerInfoPage(driver);
		String headerinfo = mip.getwelcommsg().getText();
		boolean status = headerinfo.contains("Welcome Admin");
		Assert.assertTrue(status);
		UtilityClassObject.getTest().log(Status.INFO,"Pass: Logined as ADMIN and  Verified");
		
		hp.getHomeAddRetailers().click(); 
		RetailerPage rp= new RetailerPage(driver);
		rp.addRetiler(username,password,phone,email,address);
		Thread.sleep(3000);
	hp.getHomeRetailer().click();
	String actualTableInfo = driver.findElement(By.xpath("//*//section")).getText();
		Assert.assertTrue(actualTableInfo.contains(phone));
		UtilityClassObject.getTest().log(Status.INFO,"Pass: the Manufacturer is created and Verified");
		
	}

}
