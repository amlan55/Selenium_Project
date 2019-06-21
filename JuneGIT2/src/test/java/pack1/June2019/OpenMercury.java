package pack1.June2019;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OpenMercury {
	WebDriver driver1;
	
  @Test
  public void f() throws InterruptedException {
	  
	
	  driver1.findElement(By.name("userName")).sendKeys("mercury");
	  driver1.findElement(By.name("password")).sendKeys("mercury");
	  driver1.findElement(By.name("login")).click();
		Thread.sleep(3000); 
	  driver1.findElement(By.linkText("SIGN-OFF")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver1=new ChromeDriver(); 
		driver1.manage().window().maximize(); 
		  driver1.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() {
	  
	
		driver1.close();
  }

}
