package com.finsburry.scm.manufacturer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.EditManufacturerPage;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.ManufacturerInfoPage;
import com.comcast.crm.objectrepositoryutility.ManufacturerPage;
//@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class AddManufacturedAndChangePwdTest extends BaseClass {
	@Test
	public void addmnaufac() throws Throwable
	{
		LoginPage lp= new LoginPage(driver);
		lp.loginToapp();
		ManufacturerInfoPage mip= new ManufacturerInfoPage(driver);
		String headerinfo = mip.getwelcommsg().getText();
		boolean status = headerinfo.contains("Welcome Admin");
		Assert.assertTrue(status);
		UtilityClassObject.getTest().log(Status.INFO,"Pass: Logined as ADMIN and  Verified");
		//add manufacturer
		Home hp= new Home(driver);
		hp.getHomeAddManufacturer().click();
		
		String name = eLib.getDataFromExcel("Sheet1", 2, 1);
		String email = eLib.getDataFromExcel("Sheet1", 2, 2);
		String phone = jLib.getRandomPhnNumber();
		String username = eLib.getDataFromExcel("Sheet1", 2, 4);
		String password = eLib.getDataFromExcel("Sheet1", 2, 5);
		ManufacturerPage mp= new ManufacturerPage(driver);
		mp.getmanufname().sendKeys(name);
		mp.getmanufemail().sendKeys(email);
		mp.getmanufphone().sendKeys(phone);
		mp.getmanufusername().sendKeys(username);
		mp.getmanufpassword().sendKeys(password);
		mp.getmanufaddbutton().click();
		wLib.switchtoAlertAndAccept(driver);
		//verify
		hp.getHomeManufacturer().click();
	String verifyaddmanuf = driver.findElement(By.xpath("//td[text()='"+" "+username+" "+"']")).getText();
		Assert.assertEquals(verifyaddmanuf, username);
		UtilityClassObject.getTest().log(Status.INFO,"Pass:Manufacturer creted  and  Verified");

		hp.logout();
		 String URL = fLib.getDataFromPropertiesFile("url") ;
		 driver.get(URL);	
		 driver.manage().window().maximize();
		 lp.getUsernameEdt().sendKeys(verifyaddmanuf);
		
		 lp.getPasswordEdt().sendKeys(password);
		 String txt = eLib.getDataFromExcel("Sheet1", 0, 2);
		 
		 wLib.select(lp.getSelectDD(), txt);
		 lp.getLoginBtn().click();
		 
		 String manufupageverify = driver.findElement(By.xpath("//section[contains(text(), 'Welcome "+username+"')]")).getText();
			Assert.assertTrue(manufupageverify.contains("Welcome "+username+""));
			UtilityClassObject.getTest().log(Status.INFO,"Pass: Logined as Manufacturer and Verified");
			driver.findElement(By.xpath("//td[text()='"+" "+username+" "+"']/..//img")).click();
			EditManufacturerPage emp= new EditManufacturerPage(driver);
			emp.getChangepass().click();
			emp.getOldpass().sendKeys(password);
			emp.getNewpass().sendKeys(password);
			emp.getConfpass().sendKeys(password);
			emp.getChangepass2().click();
			String popmessage = driver.switchTo().alert().getText();
			wLib.switchtoAlertAndAccept(driver);
			 UtilityClassObject.getTest().log(Status.INFO,"Pass:"+popmessage+" and verified");
			 System.out.println(popmessage);
			
			
		
	}

}
