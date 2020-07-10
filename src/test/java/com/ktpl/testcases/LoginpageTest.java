<<<<<<< HEAD
package com.ktpl.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ktpl.pages.Loginpage;
import com.ktpl.pages.Forgotpasswordpage;
import com.ktpl.pages.Homepage;
import com.aventstack.extentreports.Status;
import com.ktpl.pages.CustomerRegistrationpage;
import com.ktpl.parentbase.Baseinit;
import com.ktpl.utilities.UtilityMethods;

public class LoginpageTest extends Baseinit {
	Homepage Homepage;
	Loginpage Loginpage;
	Forgotpasswordpage Forgotpasswordpage;
	CustomerRegistrationpage CustomerRegistrationpage;

	public LoginpageTest() {
		super();
	}

	@BeforeTest
	public void initiateextentreports() {
		UtilityMethods.extentreports();
	}

	@BeforeMethod
	public void initiate() throws IOException, InterruptedException {
		startup("loginpageurl");
		//UtilityMethods.closeNewsletterpopup();
		Loginpage = new Loginpage();
		Thread.sleep(5000);
		UtilityMethods.Entersite();
	}

	@Test(priority = 1)
	public void LoginpagetitleTest() {
		test = extent.createTest("Loginpagetitletest");
		String LoginpageTitle = Loginpage.loginpagetitle();
		Assert.assertEquals(LoginpageTitle, "Customer Login", "Login page title is not as expected");
		extent.flush();
	}

	@Test(priority = 2)
	public void CustomerloginTest() throws InterruptedException {
		test = extent.createTest("CusotmerloginTest");
		Homepage = Loginpage.logintocCustomerAccount(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(Homepage.homepagetitle(), "Home Page", "login is not sucessfull");
		extent.flush();
	}

	@Test(priority = 3)
	public void forgotpasswordlinkTest() {
		test = extent.createTest("forgotpasswordlinkTest");
		Forgotpasswordpage = Loginpage.clickonforgotpasswordlink();
		Assert.assertEquals(Forgotpasswordpage.Forgotpasswordpagetitle(), "Forgot Your Password?",
				"forgot password link is not working ");
		extent.flush();
	}

	@Test(priority = 4)
	public void CreateaccountlinkTest() {
		test = extent.createTest("CreateAccountlinkTest");
		CustomerRegistrationpage = Loginpage.clickonCreateAccountLink();
		Assert.assertEquals(CustomerRegistrationpage.CustomerRegistrationpageTitle(), "Create New Customer Account",
				"Create account link/button is not working");
		extent.flush();

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
		driver.quit();
	}
}
=======
package com.ktpl.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ktpl.pages.Loginpage;
import com.ktpl.pages.Forgotpasswordpage;
import com.ktpl.pages.Homepage;
import com.aventstack.extentreports.Status;
import com.ktpl.pages.CustomerRegistrationpage;
import com.ktpl.parentbase.Baseinit;
import com.ktpl.utilities.UtilityMethods;

public class LoginpageTest extends Baseinit {
	Homepage Homepage;
	Loginpage Loginpage;
	Forgotpasswordpage Forgotpasswordpage;
	CustomerRegistrationpage CustomerRegistrationpage;

	public LoginpageTest() {
		super();
	}

	@BeforeTest
	public void initiateextentreports() {
		UtilityMethods.extentreports();
	}

	@BeforeMethod
	public void initiate() throws IOException, InterruptedException {
		startup("loginpageurl");
		//UtilityMethods.closeNewsletterpopup();
		Loginpage = new Loginpage();
		Thread.sleep(5000);
		UtilityMethods.Entersite();
	}

	@Test(priority = 1)
	public void LoginpagetitleTest() {
		test = extent.createTest("Loginpagetitletest");
		String LoginpageTitle = Loginpage.loginpagetitle();
		Assert.assertEquals(LoginpageTitle, "Customer Login", "Login page title is not as expected");
		extent.flush();
	}

	@Test(priority = 2)
	public void CustomerloginTest() throws InterruptedException {
		test = extent.createTest("CusotmerloginTest");
		Homepage = Loginpage.logintocCustomerAccount(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(Homepage.homepagetitle(), "Home Page", "login is not sucessfull");
		extent.flush();
	}

	@Test(priority = 3)
	public void forgotpasswordlinkTest() {
		test = extent.createTest("forgotpasswordlinkTest");
		Forgotpasswordpage = Loginpage.clickonforgotpasswordlink();
		Assert.assertEquals(Forgotpasswordpage.Forgotpasswordpagetitle(), "Forgot Your Password?",
				"forgot password link is not working ");
		extent.flush();
	}

	@Test(priority = 4)
	public void CreateaccountlinkTest() {
		test = extent.createTest("CreateAccountlinkTest");
		CustomerRegistrationpage = Loginpage.clickonCreateAccountLink();
		Assert.assertEquals(CustomerRegistrationpage.CustomerRegistrationpageTitle(), "Create New Customer Account",
				"Create account link/button is not working");
		extent.flush();

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
		driver.quit();
	}
}
>>>>>>> 198e6a575fa48515f12a0c590d83f9d55a4fbe71
