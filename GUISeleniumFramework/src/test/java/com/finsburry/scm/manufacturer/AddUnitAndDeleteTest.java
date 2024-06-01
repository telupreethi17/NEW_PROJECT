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
import com.comcast.crm.objectrepositoryutility.Manageunitpage;
import com.comcast.crm.objectrepositoryutility.ManufacturerInfoPage;


@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class AddUnitAndDeleteTest extends BaseClass {
	@Test
	public void addUnitandDeletetest() throws Throwable
	{
	LoginPage lp= new LoginPage(driver);
	lp.loginToapp();
    Home hp= new Home(driver);
	ManufacturerInfoPage mip= new ManufacturerInfoPage(driver);
	String headerinfo = mip.getwelcommsg().getText();
	boolean status = headerinfo.contains("Welcome Admin");
	Assert.assertTrue(status);
	UtilityClassObject.getTest().log(Status.INFO, " Logined as ADMIN and  Verified");
	
	hp.getHomeManageUnit().click();
	Manageunitpage mup= new Manageunitpage(driver);
	mup.getAddunitbtn().click();
	String unitname = eLib.getDataFromExcel("Sheet1", 9, 1);
	 mup.getUnitNameEdit().sendKeys(unitname);
	mup.getAddDetails().sendKeys(eLib.getDataFromExcel("Sheet1", 9, 2));
	mup.getADDUNITBTN().click();
	wLib.switchtoAlertAndAccept(driver);
	
	hp.getHomeManageUnit().click();
	
	String unitverify = driver.findElement(By.xpath("//td[text()='"+" "+unitname+" "+"']")).getText();
	Assert.assertEquals(unitverify,unitname);
	UtilityClassObject.getTest().log(Status.INFO,"Pass:Unit added successfully and verified");
	
	driver.findElement(By.xpath("//td[text()='"+" "+unitname+" "+"']/preceding-sibling::*")).click();
    mup.getDeletbtn().click();
   String popupmesage = driver.switchTo().alert().getText();
    wLib.switchtoAlertAndAccept(driver);
    UtilityClassObject.getTest().log(Status.INFO,"Pass:"+popupmesage+" and verified");
    
	
	}
}
