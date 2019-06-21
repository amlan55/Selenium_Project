package DemoWebdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoNavigation {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.navigate().to("https://www.seleniumhq.org/");
		Thread.sleep(3000);
		driver.navigate().back();

		Assert.assertEquals(driver.getTitle(), "Google");
		Thread.sleep(3000);
		driver.navigate().forward();
		Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println("page refreshed");

	}
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
	}

	@AfterTest
	public void afterTest() {
	}

}
