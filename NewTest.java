package com.demo;

/*import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;*/

public class NewTest {
	public void username() {
		System.out.println("abi");
	}

	
	public void password() {
		System.out.println("abi123");
	}

	public void beforeMethod() {
		System.out.println("login");
	}

	//@AfterMethod
	public void afterMethod() {
		System.out.println("logout");
	}

	//@BeforeClass
	public void beforeClass() {
		System.out.println("open facebook url");
	}

	//@AfterClass
	public void afterClass() {
		System.out.println("close facebook url");
	}

	//@BeforeTest
	public void beforeTest() {
		System.out.println("open chrome");
	}

	//@AfterTest
	public void afterTest() {
		System.out.println("close chrome");
	}

	//@BeforeSuite
	public void beforeSuite() {
	System.out.println("setpropery");
	}

	//@AfterSuite
	public void afterSuite() {
		System.out.println("close setproperty");
	}

}
