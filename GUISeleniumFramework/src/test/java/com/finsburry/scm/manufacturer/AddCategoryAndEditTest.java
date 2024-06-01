package com.finsburry.scm.manufacturer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.CategoryInfoPage;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.ManageCategoryPage;
import com.comcast.crm.objectrepositoryutility.ManufacturerInfoPage;
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)

public class AddCategoryAndEditTest extends BaseClass
{
	@Test
	public void addcategory() throws Throwable
	{
	LoginPage lp= new LoginPage(driver);
	lp.loginToapp();
    Home hp= new Home(driver);
	ManufacturerInfoPage mip= new ManufacturerInfoPage(driver);
	String headerinfo = mip.getwelcommsg().getText();
	boolean status = headerinfo.contains("Welcome Admin");
	Assert.assertTrue(status);
	UtilityClassObject.getTest().log(Status.INFO,"Pass: Logined as ADMIN and  Verified");

	hp.getHomeManageCategory().click();
	CategoryInfoPage cip= new CategoryInfoPage(driver);
	String categoryinfo = cip.getviewcategory().getText();
	Assert.assertTrue(categoryinfo.contains("View Category"));
	UtilityClassObject.getTest().log(Status.INFO,"Pass: the Manage category page is Verified");
	ManageCategoryPage mcp= new ManageCategoryPage(driver);
	mcp.getAddcategorybutton().click();
	String name = eLib.getDataFromExcel("Sheet1", 7, 1)+jLib.getRandomNumber();
	String description = eLib.getDataFromExcel("Sheet1", 7, 2);
	mcp.getcategoryname().sendKeys(name);
	mcp.getcategorydetails().sendKeys(description);
	mcp.getAddcategorybutton2().click();
	wLib.switchtoAlertAndAccept(driver);
	
	//verify of added category
	hp.getHomeManageCategory().click();
	String categoryinformation = driver.findElement(By.xpath("//*//section")).getText();
	Assert.assertTrue(categoryinformation.contains(name));
	
	//td[text()=' Biscuits ']/..//img
	driver.findElement(By.xpath("//td[text()='"+" "+name+" "+"']/..//img")).click();
	String updatpage = cip.getupdatecategoryinfo().getText();
	Assert.assertTrue(updatpage.contains("Update Category"));
	UtilityClassObject.getTest().log(Status.INFO,"Pass: The update category Page is Verified");

	mcp.getcategorydetails().clear();
	String updateddescriptionexce = eLib.getDataFromExcel("Sheet1", 7, 3);
	mcp.getcategorydetails2().sendKeys(updateddescriptionexce);
	mcp.getupdatecategorybtn().click();
	wLib.switchtoAlertAndAccept(driver);
	String updatesdescrp = driver.findElement(By.xpath("//td[text()='"+" "+updateddescriptionexce+" "+"']")).getText();
	Assert.assertEquals(updatesdescrp,updateddescriptionexce);
	UtilityClassObject.getTest().log(Status.INFO,"Pass:Updated category description successfully");


	}
}
