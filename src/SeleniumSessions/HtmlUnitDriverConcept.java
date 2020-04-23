package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver(); 
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
	
	
	}

}
