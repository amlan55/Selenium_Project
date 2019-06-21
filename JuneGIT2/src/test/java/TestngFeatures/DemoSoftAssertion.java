package TestngFeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssertion {
	@Test
	public void demo() {
		SoftAssert sa=new SoftAssert();
		System.out.println("Test1-checking 1st test");
		sa.assertEquals(10, 12,"Error1");


		System.out.println("Test2-checking 2st test");
		sa.assertEquals("Hello", "HII","");

		sa.assertAll();
	}
}
