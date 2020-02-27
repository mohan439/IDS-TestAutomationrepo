package com.ktpl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ktpl.parentbase.Baseinit;

public class Newsletterpopup extends Baseinit{

	@FindBy(xpath="//aside[contains(@class,'_inner-scroll _show')]//button[contains(@class,'action-close')]") 
	WebElement popupcloseicon;
	
	@FindBy(xpath="//form[contains(@class,'md-form subscribe')]//button[contains(@class,'action subscribe primary')]")
	WebElement popupSubscribebutton;
	
	@FindBy(xpath="//input[contains(@placeholder,'Enter your email address')]")
	WebElement emailtextfield;
	
	public Newsletterpopup()
	{
		PageFactory.initElements(driver, this);
	}	
	
	
	public void closenewsletterpopup() {
		popupcloseicon.click();
	}
	
	public void entersubscriptionemail(String customeremail) {
		emailtextfield.sendKeys(prop.getProperty(customeremail));
	}
	
	public void clickonSubscribebutton() {
		popupSubscribebutton.click();
	}
}
