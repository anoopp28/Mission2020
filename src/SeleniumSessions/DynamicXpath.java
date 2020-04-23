package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://in.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);    //This is for web page to load
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);     //This is for all elements in the page
		
		//Dynamic Xpath - //input html tag[@property = ' ']
		
		driver.findElement(By.xpath("//input[@id ='gh-ac']")).sendKeys("Java");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		select.selectByVisibleText("Books");
		
		//Xpath - contains function
		//id = gh-atn
		//id = gh-btn
		//id = gn-ctn
		//so contains is used 
		
		driver.findElement(By.id("gh-btn")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'gh-btn']")).click();
		driver.findElement(By.xpath("//input[starts-with(@id,'gh-btn']")).click();
		driver.findElement(By.xpath("//input[ends-with(@id,'gh-btn']")).click();
		
		//custom xpaths for links
		driver.findElement(By.xpath("//a[contains(text(),'Sign up']")).click();
	}
}