package TestngFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertEquals {
	@Test
	public void test1() {

		int exp=50;
		int actual=50;
		Assert.assertEquals(actual, exp,"Error test1");

	}
	@Test
	public void test2() {
		Assert.assertEquals("Hello", "Welcome","Error from test2");
	}
	@Test
	public void test3() {
		Object test=null;
		Assert.assertNotNull(test,"Object is not null");
	}
	@Test
	public void test4() {

		Assert.fail("Intetionally failing the test");
	}
}
