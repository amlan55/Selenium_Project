package DemoExcel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Lalitha");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		WebElement searchbx=driver.findElement(By.xpath("//input[@type='text']"));
		Actions act=new Actions(driver);

		act.keyDown(searchbx, Keys.SHIFT).perform();
		act.sendKeys("h").pause(3000).sendKeys("e").pause(3000).sendKeys("a").perform();

		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")));
		driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Add to cart')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Cart\n" + 
				"									1')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Checkout')]")).click();
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//input[contains(@value,'LOGIN')]")).click();
		driver.findElement(By.xpath("//input[@value='PASSWORD']")).clear();
		driver.findElement(By.xpath("//input[@value='PASSWORD']")).sendKeys("Trans@456");
		driver.findElement(By.xpath("//input[@value='PayNow']")).click();
		
		

		


	}
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 

	}

	@AfterClass
	public void afterClass() {
	}

}
