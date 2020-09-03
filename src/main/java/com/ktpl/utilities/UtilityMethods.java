package com.ktpl.utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ktpl.pages.Ageverificationpopup;
import com.ktpl.parentbase.Baseinit;

public class UtilityMethods extends Baseinit {
	

	// Read data from excel file

	// Extent report
	
	//Close newsletter pop up
	public static void Entersite() {
		Ageverificationpopup Agepopup = new Ageverificationpopup();
		try {
			Agepopup.selectcountry();
		System.out.println("country selected");
		//Agepopup.agecheckbox();
		Agepopup.Entersite();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("popup not displayed");
		}
		
	}
	public static ExtentReports extentreports() {
		if(extent==null) {
		
			System.out.println("before test extent reprots");
			htmlReporter = new ExtentHtmlReporter("./Reprots/Automationreport"+System.currentTimeMillis()+".html");
			htmlReporter.config().setDocumentTitle("IDS Automation Report");
			htmlReporter.config().setReportName("IDS Test Automation Reprot");
			htmlReporter.config().setTheme(Theme.DARK);

			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
		}
		return extent;
	}
	
	
	public static void extentteardown(ITestResult result) {
		System.out.println("after method listner");
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName() + "Testcase failed");
			test.log(Status.FAIL, "Testcase failed" + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test case passed" + result.getName());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "TestCase skipped" + result.getName());
		}
		
	}

	// Take screenshot
	public static void takescreenshot() {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		String screenshotpath = System.getProperty("user.dir")+"//Reprots//screenshot"+System.currentTimeMillis()+".png";
			
		


	}
	// Mouse hover

	// Switch frame

}
