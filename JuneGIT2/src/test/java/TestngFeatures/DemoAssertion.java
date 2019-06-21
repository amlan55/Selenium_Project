package TestngFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertion {
	@Test
	public void test1() {
		System.out.println("test1 Started");

		Assert.assertTrue(20>18, "Error from test1-18 less than 20");

		System.out.println("test1 Completed");
	}
	@Test
	public void test2() {
		System.out.println("test2 Started");

		Assert.assertTrue(20<18, "Error from test2-18 greater than 20");

		System.out.println("test2 Completed");
	}
	@Test
	public void test3() {
		System.out.println("test3 Started");

		Assert.assertTrue("Hello".equals("Hi"), "Error from -both values are different");

		System.out.println("test3 Completed");
	}
	@Test
	public void test4() {
		System.out.println("test4 Started");

		Assert.assertFalse("Hello".equals("Hi"), "Error from -both values are different");

		System.out.println("test4 Completed");
	}
}
