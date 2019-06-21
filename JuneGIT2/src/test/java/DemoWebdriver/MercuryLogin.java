package DemoWebdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MercuryLogin {
	WebDriver driver1;
	@Test
	public void f() {
	}
	@BeforeTest
	public void beforeTest() {
		
		 System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
			driver1=new ChromeDriver(); 
			driver1.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
