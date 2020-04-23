package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://in.ebay.com/");
		
		//Dynamic waits
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);    //This is for web page to load
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);     //This is for all elements in the page
		
	}

}
