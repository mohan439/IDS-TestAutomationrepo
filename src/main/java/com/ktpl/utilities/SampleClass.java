package com.ktpl.utilities;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.ktpl.parentbase.Baseinit;

public class SampleClass extends Baseinit{
	
	@Test
	public void testmethod() {
		
		System.out.println("Sample test in running");
		ExtentHtmlReporter Extentreport = new ExtentHtmlReporter("./Reprots/Automationreport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(Extentreport);
		ExtentTest test = extent.createTest("sampletest");
		test.log(Status.PASS, "TestPassed");
		extent.flush();
	}

}
