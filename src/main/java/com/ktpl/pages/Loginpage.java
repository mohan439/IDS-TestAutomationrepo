package com.ktpl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ktpl.parentbase.Baseinit;

public class Loginpage extends Baseinit {

	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;
	@FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	WebElement submit;
	@FindBy(xpath = "//a[@class='action create primary']")
	WebElement createaccountbutton;
	@FindBy(xpath = "//a[@class='action remind']//span[contains(text(),'Forgot Your Password?')]")
	WebElement forgotpasswordlink;

	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	public String loginpagetitle() {
		return driver.getTitle();
	}

	public Homepage logintocCustomerAccount(String email, String pwd) throws InterruptedException {
		username.sendKeys(email);
		password.sendKeys(pwd);
		submit.click();
		return new Homepage();
	}

	public CustomerRegistrationpage clickonCreateAccountLink() {
		createaccountbutton.click();
		return new CustomerRegistrationpage();
	}

	public Forgotpasswordpage clickonforgotpasswordlink() {
		forgotpasswordlink.click();
		return new Forgotpasswordpage();
	}
}
