package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementsConcept {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://in.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);    //This is for web page to load
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);     //This is for all elements in the page
		
		//To get the count of links on the page
		//total count of text of each link
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));   

		System.out.println(linklist.size());
		
		for(int i=0; i<linklist.size(); i++) {
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
		}
	}

}
