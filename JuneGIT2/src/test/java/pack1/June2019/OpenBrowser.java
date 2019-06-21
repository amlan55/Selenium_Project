package pack1.June2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver(); // open browser
		driver.manage().window().maximize(); //maximize the size of browser
		driver.get("https://www.seleniumhq.org/"); //open the website 
		Thread.sleep(3000); //for wait 
		driver.close(); //Close the browser
	}

}
