package com.ktpl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ktpl.parentbase.Baseinit;

public class Headersection extends Baseinit {

	@FindBy(xpath = "//strong[@class='logo']//img")
	WebElement storelogo;
	@FindBy(xpath = "//div[@class='top-sale']")
	WebElement Headertext;
	@FindBy(xpath = "//a[@class='action showcart'")
	WebElement floatingcarticon;
	@FindBy(xpath = "//div[@class='md-header-links']")
	WebElement myaccounticon;
	@FindBy(xpath = "//li[@class='link wishlist']")
	WebElement wishlistlink;
	@FindBy(xpath = "//a[@id='md-signin-link']")
	WebElement SignInlink;
	@FindBy(xpath = "//input[@id='search']")
	WebElement searchbox;
	@FindBy(xpath = "//div[@class='ktpl-searchautocomplete__autocomplete _active']")
	WebElement searchautosugessionpanel;
	@FindBy(xpath = "//div[@class='section-items nav-sections-items']")
	WebElement Mainmenu;

	public Headersection() {
		PageFactory.initElements(driver, this);
	}

	// Verify logo
	public boolean verifystorelogo() {
		return storelogo.isDisplayed();
	}

	// Top Header promotional text
	public String CheckHeaderpromotext() {
		return Headertext.getText();
	}

	// My Account links
	public boolean myaccountlicon() {
		return myaccounticon.isDisplayed();
	}

	public Loginpopup clickonSignInlink() {
		SignInlink.click();
		return new Loginpopup();
	}

	public Loginpopup clickGuestwishlistlink() {
		wishlistlink.click();
		return new Loginpopup();
	}

	// Floating cart
	public Floatingcartpanel clickfloatingcarticon() {
		floatingcarticon.click();
		return new Floatingcartpanel();
	}

	// Search
	public boolean checksearchbox() {
		return searchbox.isDisplayed();
	}

	// Main Navigation Menu
	public boolean checkmainmenu() {
		return Mainmenu.isDisplayed();
	}

}
