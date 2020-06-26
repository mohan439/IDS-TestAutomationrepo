package com.ktpl.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.ktpl.pages.Headersection;
import com.ktpl.parentbase.Baseinit;
import com.ktpl.utilities.UtilityMethods;

public class HeadersectionTest extends Baseinit {
	Headersection headersection;

	@BeforeTest
	public void initiate() throws IOException, InterruptedException {
		UtilityMethods.extentreports();
		startup("StoreURL");
		headersection = new Headersection();
		Thread.sleep(5000);
		UtilityMethods.Entersite();
	}

	@Test(priority = 1)
	public void storelogotest() {
		test = extent.createTest("store logo test");
		boolean logoresult = headersection.verifystorelogo();
		Assert.assertEquals(logoresult, true, "Storelogo not found");
		extent.flush();
	}

	/*
	 * @Test(priority = 2) public void hearderpromotextTest() { test =
	 * extent.createTest("header promo Text test"); String Headerpromotext =
	 * headersection.CheckHeaderpromotext();
	 * Assert.assertTrue(Headerpromotext.contains("Shop with Discount"));
	 * extent.flush(); }
	 */
	@Test(priority=3)
	public void MyaccounticonTest() {
		test =extent.createTest("MyAccount icon test");
		boolean myaccounticon = headersection.myaccountlicon();
		Assert.assertEquals(myaccounticon, true, "My account icon is not displayed on Headersection");
		extent.flush();
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
	@AfterMethod
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
}