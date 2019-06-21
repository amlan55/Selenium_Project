package DemoWebdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DemoWindow {
	WebDriver driver;
	@Test
	public void f() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
		WebElement about= driver.findElement(By.xpath("//a[@href='#'][contains(.,'AboutUs')]"));
		WebElement office= driver.findElement(By.xpath("//span[contains(.,'Our\n" + 
				"												Offices')]"));
		WebElement chennai=driver.findElement(By.xpath("//a[contains(.,'Chennai')]"));

		Actions act=new Actions(driver);
		act.moveToElement(about).click().pause(4000).perform();
		act.moveToElement(office).click().pause(4000).perform();
		act.moveToElement(chennai).click().perform();

		Set<String> allw=driver.getWindowHandles();
		for(String str:allw)
		{
			driver.switchTo().window(str);

		}
		WebElement e1=driver.findElement(By.name("main_page"));
		driver.switchTo().frame(e1);
		String s=driver.findElement(By.xpath("//*[@id=\"demo3\"]")).getText();
		System.out.println(s);


	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
	}

}
