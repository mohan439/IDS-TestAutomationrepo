<<<<<<< HEAD
package com.ktpl.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ktpl.pages.Loginpage;
import com.ktpl.pages.Homepage;
import com.ktpl.parentbase.Baseinit;


public class HomepageTest extends Baseinit {

	Homepage Homepage;
	Loginpage Loginpage;
	
	@BeforeTest
	public void intiatehome() throws IOException {
		startup("StoreURL");
		Homepage = new Homepage();
	}
	
	
	@Test
	public void Homepagetitle() throws InterruptedException {
		Loginpage.logintocCustomerAccount(prop.getProperty("username"), "password");
	//Assert.assertEquals(message, expected, actual);	Homepage.homepagetitle();

	}
	

}
=======
package com.ktpl.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ktpl.pages.Loginpage;
import com.ktpl.pages.Homepage;
import com.ktpl.parentbase.Baseinit;


public class HomepageTest extends Baseinit {

	Homepage Homepage;
	Loginpage Loginpage;
	
	@BeforeTest
	public void intiatehome() throws IOException {
		startup("StoreURL");
		Homepage = new Homepage();
	}
	
	
	@Test
	public void Homepagetitle() throws InterruptedException {
		Loginpage.logintocCustomerAccount(prop.getProperty("username"), "password");
	//Assert.assertEquals(message, expected, actual);	Homepage.homepagetitle();

	}
	

}
>>>>>>> 198e6a575fa48515f12a0c590d83f9d55a4fbe71
