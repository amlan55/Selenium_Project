package DemoWebdriver;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DemoRegister {
	WebDriver driver1;
	@Test
	public void f() {
		driver1.get("http://newtours.demoaut.com/");
		String homeTitle=driver1.getTitle();
		Assert.assertEquals(homeTitle, "Welcome: Mercury Tours");

		driver1.findElement(By.partialLinkText("REGIS")).click();
		System.out.println("Register link path"+driver1.getTitle());
		Assert.assertEquals(driver1.getTitle(), "Register: Mercury Tours");

		driver1.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Amlan");
		driver1.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Mahish");
		driver1.findElement(By.xpath("//input[@name='phone']")).sendKeys("8910525040");
		driver1.findElement(By.xpath("//input[@name='userName']")).sendKeys("amlan55mahish@gmail.com");
		driver1.findElement(By.xpath("//input[@name='address1']")).sendKeys("Kashi Bose Lane");
		driver1.findElement(By.xpath("//input[@name='city']")).sendKeys("Kolkata");
		driver1.findElement(By.xpath("//input[@name='state']")).sendKeys("West Bengal");
		driver1.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("700012");
		Select sl=new Select(driver1.findElement(By.name("country")));
		sl.selectByVisibleText("INDIA");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("amlan");
		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("amlan55");
		driver1.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("amlan55");
		driver1.findElement(By.xpath("//input[@name='register']")).click();





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
