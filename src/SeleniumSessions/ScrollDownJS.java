package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollDownJS {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://in.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		scrollDown(driver);

		
		WebElement puma = driver.findElement(By.xpath(" //a[contains(text(),'Developers')]"));
		scrollDown(driver, puma);
	}
	
	//Scrolldown
	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		((RemoteWebDriver) js).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	//Scroll until u find element(puma)
	public static void scrollDown(WebDriver driver, WebElement Element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		((RemoteWebDriver) js).executeScript("arguments[0].scrollIntoView(true);",Element);
		
	}

}
