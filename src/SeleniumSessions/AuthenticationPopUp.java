package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
	            //("http://usrname:pwd@url");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");


	}

}
