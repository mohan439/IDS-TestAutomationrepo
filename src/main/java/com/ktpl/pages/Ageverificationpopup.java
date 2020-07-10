package com.ktpl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ktpl.parentbase.Baseinit;

public class Ageverificationpopup extends Baseinit{


<<<<<<< HEAD
	
=======
	//test
>>>>>>> 198e6a575fa48515f12a0c590d83f9d55a4fbe71
	@FindBy(xpath="//*[@id=\"welcome-form\"]/button")
	WebElement Entersitebutton;
	
	@FindBy(xpath="//*[@id=\"is_welcomed\"]")
	WebElement Agecehckbox;
	
	@FindBy(xpath="//*[@id=\"delivery-select\"]")
	WebElement countryselection;
	
	public Ageverificationpopup()
	{
		PageFactory.initElements(driver, this);
	}	
	
	public void selectcountry() {
		driver.findElement(By.xpath("//*[@id=\"welcome-form\"]/div[1]/div")).click();
	    WebElement countryselection = driver.findElement(By.xpath("//*[@id=\"welcome-form\"]/div[1]/div/div/div/ul/li[3]"));
		countryselection.click();
	}
	
	public void agecheckbox() {
		Agecehckbox.click();
	}
	
	public void Entersite() {
		Entersitebutton.click();
	}
}
