package CaseStudy;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CaseStudyTestMe {



	WebDriver driver;
	WebDriverWait wait;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
	
	@Test(priority=1,dataProvider = "credentials")
	public void testmeapplogin(String username, String password, String bankname,String bankusername,String bankpassword,String transactionpw) throws InterruptedException {
		logger = extent.createTest("passTest");
		
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.name("Login")).click();        //login
		
		WebElement searchbx=driver.findElement(By.xpath("//input[@type='text']"));
		Actions act=new Actions(driver);

		act.keyDown(searchbx, Keys.SHIFT).perform();
		act.sendKeys("h").pause(3000).sendKeys("e").pause(3000).sendKeys("a").perform();

		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")));
		driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Add to cart')]")).click();//add to cart
		driver.findElement(By.xpath("//a[contains(.,'Cart\n" + 
				"									1')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Checkout')]")).click();//checkout
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		Thread.sleep(3000);

		switch(bankname)
		{
		case ("Andhra Bank") :
			driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
			makepayment(bankusername,bankpassword,transactionpw);
		case ("HDFC Bank") :
			driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
			makepayment(bankusername,bankpassword,transactionpw);

		case ("IDBI Bank") :
			driver.findElement(By.xpath("//label[contains(text(),'IDBI Bank')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
			makepayment(bankusername,bankpassword,transactionpw);
		case ("UCO Bank") :
			driver.findElement(By.xpath("//label[contains(text(),'UCO Bank')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
			makepayment(bankusername,bankpassword,transactionpw);
		case ("State Bank Of India") :
			driver.findElement(By.xpath("//label[contains(text(),'State Bank Of India')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
			makepayment(bankusername,bankpassword,transactionpw);



		}

		logger.log(Status.PASS, MarkupHelper.createLabel("test case passed is Pass test", ExtentColor.GREEN));

	}
	@Test(priority=2)
	public void makepayment(String bank_username, String bank_password, String transaction_pw)
	{
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(bank_username);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(bank_password);
		driver.findElement(By.xpath("//input[contains(@value,'LOGIN')]")).click();
		driver.findElement(By.xpath("//input[@value='PASSWORD']")).clear();
		driver.findElement(By.xpath("//input[@value='PASSWORD']")).sendKeys(transaction_pw);
		driver.findElement(By.xpath("//input[@value='PayNow']")).click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignOut")));
		driver.findElement(By.linkText("SignOut")).click();
	}

	@DataProvider(name="credentials")
	public Object[][] getData() throws IOException {
		return MyExcelReader.ReadData();

	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, 30);



		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") 
				+ "/extent-reports/" + new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy")
				.format(new Date()) + ".html");
		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "GFT NexGen Testing Stream");
		extent.setSystemInfo("Environment", "Automation Testing Selenium");
		extent.setSystemInfo("User Name", "Pratiksha Daptare");

		htmlReporter.config().setDocumentTitle("Title of the report comes here");
		htmlReporter.config().setReportName("Name of the report name comes here");
		htmlReporter.config().setTheme(Theme.STANDARD);	

	}

	@AfterTest
	public void afterTest() {
		extent.flush();
	}
}
