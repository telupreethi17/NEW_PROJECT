package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditRetailerPage {

	WebDriver driver;

	public EditRetailerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Edit Profile")
	private WebElement editRetailer;

	@FindBy(name = "txtRetailerPhone")
	private WebElement editPhone;

	@FindBy(name = "txtRetailerEmail")
	private WebElement editEmail;

	@FindBy(name = "txtRetailerAddress")
	private WebElement editAddress;

	@FindBy(xpath = "//input[@value='Update Profile']")
	private WebElement updateProfileBtn;

	@FindBy(xpath = "//input[@value='Change Password']")
	private WebElement changePasswordBtn;

	@FindBy(name = "txtOldPassword")
	private WebElement enterOldPassword;

	@FindBy(name = "txtNewPassword")
	private WebElement enterNewPassword;

	@FindBy(name = "txtConfirmPassword")
	private WebElement enterConfirmPassword;

	public WebElement getEditRetailer() {
		return editRetailer;
	}

	public WebElement getEditPhone() {
		return editPhone;
	}

	public WebElement getEditEmail() {
		return editEmail;
	}

	public WebElement getEditAddress() {
		return editAddress;
	}

	public WebElement getUpdateProfileBtn() {
		return updateProfileBtn;
	}

	public WebElement getChangePasswordBtn() {
		return changePasswordBtn;
	}

	public WebElement getEnterOldPassword() {
		return enterOldPassword;
	}

	public WebElement getEnterNewPassword() {
		return enterNewPassword;
	}

	public WebElement getEnterConfirmPassword() {
		return enterConfirmPassword;
	}

}
