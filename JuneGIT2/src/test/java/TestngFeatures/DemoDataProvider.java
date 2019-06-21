package TestngFeatures;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DemoDataProvider {
	@Test(dataProvider = "dp")
	public void login(String username, String password) {
		System.out.println("username is :"+username);
		System.out.println("username is :"+password);
	}

	@DataProvider(name="dp")
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "Selenium", "Basic" },
			new Object[] { "Amlan", "Mahish" },
			new Object[] { "Mercury", "Mercury" },

		};
	}
}
