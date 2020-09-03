package com.ktpl.parentbase;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Baseinit {
	public static WebDriver driver;
	public static Properties prop;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;


	public Baseinit() {
		/* Loading properties file */
		prop = new Properties();
		FileInputStream propfile;
		try {
			propfile = new FileInputStream(
					System.getProperty("user.dir")+"\\src\\main\\java\\com\\ktpl\\properties\\ktplproperties.properties");
			prop.load(propfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void startup(String testcaseurl) throws IOException {
		/*
		 * Automate the management of the binary drivers required by Selenium
		 * https://github.com/bonigarcia/webdrivermanager
		 */
			WebDriverManager.chromedriver().setup();
			WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.operadriver().setup();
		// WebDriverManager.phantomjs().setup();
		// WebDriverManager.edgedriver().setup();
		// WebDriverManager.iedriver().setup();

		if (prop.getProperty("Browser").equalsIgnoreCase("chrome")) {
			System.out.println("calling chromedriver");
			driver = new ChromeDriver();
		
		} else if (prop.getProperty("Browser").equalsIgnoreCase("firefox")) {
			System.out.println("calling firefox driver");
			driver = new FirefoxDriver();
		} else {
			System.out.println("calling " + prop.getProperty("Browser") + " is not configured");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty(testcaseurl));
	}
}
