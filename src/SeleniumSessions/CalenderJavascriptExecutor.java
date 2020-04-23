package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class CalenderJavascriptExecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		
		WebElement date = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']"));
		String datevalue = "31-12-2020";
		
		selectDateByJs(driver, date, datevalue);
	}
	
	
	public static void selectDateByJs(WebDriver driver, WebElement date, String datevalue) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		((RemoteWebDriver) js).executeScript("arguments[0].setAttribute('value', '"+datevalue+"');",date);
		
	}

}
