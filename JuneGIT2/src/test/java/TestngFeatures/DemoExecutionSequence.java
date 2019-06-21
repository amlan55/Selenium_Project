package TestngFeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoExecutionSequence {
	@Test
	public void f() {
		System.out.println("I am in @test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in @beforemethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in @aftermethod");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in @beforeclass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am in @afterclass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in @beforetest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am in @aftertest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am in @beforesuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am in @aftersuite");
	}

}
