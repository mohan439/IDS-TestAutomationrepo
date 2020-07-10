<<<<<<< HEAD
package com.ktpl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ktpl.parentbase.Baseinit;

public class Headersection extends Baseinit {

	@FindBy(xpath = "//*[@class='logo']//img") 
	WebElement storelogo;
	@FindBy(xpath = "//div[@class='top-sale']")
	WebElement Headertext;
	@FindBy(xpath = "//a[@class='action showcart']")
	WebElement floatingcarticon;
	@FindBy(xpath = "//*[@class='customer-name']")
	WebElement myaccounticon;
	@FindBy(xpath = "//div[@class='panel header']//li[@class='wishlist-nav']//a[contains(text(),'Wishlist')]")
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
=======
package com.ktpl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ktpl.parentbase.Baseinit;

public class Headersection extends Baseinit {

	@FindBy(xpath = "//*[@class='logo']//img") 
	WebElement storelogo;
	@FindBy(xpath = "//div[@class='top-sale']")
	WebElement Headertext;
	@FindBy(xpath = "//a[@class='action showcart']")
	WebElement floatingcarticon;
	@FindBy(xpath = "//*[@class='customer-name']")
	WebElement myaccounticon;
	@FindBy(xpath = "//div[@class='panel header']//li[@class='wishlist-nav']//a[contains(text(),'Wishlist')]")
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
>>>>>>> 198e6a575fa48515f12a0c590d83f9d55a4fbe71
