<<<<<<< HEAD
package com.ktpl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ktpl.parentbase.Baseinit;

public class Homepage extends Baseinit{

	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]") 
	WebElement promotionalblaock;
	@FindBy(xpath ="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]")
	WebElement Hotsellerblock;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public String homepagetitle() {
		return driver.getTitle();
	}
}
=======
package com.ktpl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ktpl.parentbase.Baseinit;

public class Homepage extends Baseinit{

	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]") 
	WebElement promotionalblaock;
	@FindBy(xpath ="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]")
	WebElement Hotsellerblock;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public String homepagetitle() {
		return driver.getTitle();
	}
}
>>>>>>> 198e6a575fa48515f12a0c590d83f9d55a4fbe71
