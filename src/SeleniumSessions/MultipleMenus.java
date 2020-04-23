package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleMenus {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);    //This is for web page to load
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);     //This is for all elements in the page
		
		//driver.switchTo().frame(1);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		   //build and perform is to perform the action
		 
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);    //This is for web page to load
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);     //This is for all elements in the page
		
		
		driver.findElement(By.linkText(("Member Login"))).click();
		

	}

}