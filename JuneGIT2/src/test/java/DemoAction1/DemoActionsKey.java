package DemoAction1;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DemoActionsKey {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		WebElement searchbx=driver.findElement(By.xpath("//input[@type='text']"));

		Actions act=new Actions(driver);

		act.keyDown(searchbx, Keys.SHIFT).perform();
		act.sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g").perform();
		
		act.moveToElement(driver.findElement(By.xpath("(//div[contains(.,'Hand bag')])[4]"))).click();
		driver.findElement(By.xpath("//input[@type='submit']"));
		Thread.sleep(4000);
		String text=driver.findElement(By.xpath("//h4[contains(.,'Hand bag')]")).getText();
		Assert.assertTrue(text.contains("Hand"));


	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "resources\\geckodriver.exe");
		driver=new FirefoxDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
	}

}
