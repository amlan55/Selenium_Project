package DemoWebdriver;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoUrlNSource {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://en.wikipedia.org/wiki/Main_Page");
	  Assert.assertEquals(driver.getTitle(), "Wikipedia, the free encyclopedia");
	  driver.findElement(By.linkText("History")).click();
	  Assert.assertEquals(driver.getTitle(), "Portal:History - Wikipedia");
	  System.out.println("current URL"+driver.getCurrentUrl());
	  System.out.println("the html code"+driver.getPageSource());
	  
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
