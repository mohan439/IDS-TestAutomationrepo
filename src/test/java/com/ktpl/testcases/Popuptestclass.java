package com.ktpl.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.ktpl.parentbase.Baseinit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popuptestclass extends Baseinit{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://integration-5ojmyuq-arowgj4koob7k.eu-3.magentosite.cloud/");
		Thread.sleep(5000);
		
		String popuptext = driver.findElement(By.xpath("//*[@id=\"welcome-form\"]/h2")).getText();
		System.out.println(popuptext);
		//*[@id="delivery-select"]
		//*[@id="welcome-form"]/div[1]/div/div/div
	    driver.findElement(By.xpath("//*[@id=\"welcome-form\"]/div[1]/div")).click();
	    WebElement countryselection = driver.findElement(By.xpath("//*[@id=\"welcome-form\"]/div[1]/div/div/div/ul/li[3]"));
		countryselection.click();
		//driver.findElement(By.xpath("//*[@id=\"is_welcomed\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-form\"]/button")).click();
	}
}
