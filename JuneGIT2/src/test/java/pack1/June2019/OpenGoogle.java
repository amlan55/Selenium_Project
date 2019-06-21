package pack1.June2019;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OpenGoogle {
	WebDriver driver;
	@Test
	public void f() {

		driver.get("https://www.google.com/"); //open the website 
	}

	@AfterTest
	public void afterTest() throws InterruptedException {

		Thread.sleep(3000); //for wait 
		driver.close(); //Close the browser

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver(); // open browser
		driver.manage().window().maximize(); 


	}

}
