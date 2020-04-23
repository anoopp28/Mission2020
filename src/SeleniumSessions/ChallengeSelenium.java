package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;


public class ChallengeSelenium {

	public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
		
		
		
		driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
		
		driver.findElement(By.id("search-input-location")).sendKeys("London");
		driver.findElement(By.xpath("//button[@id='search-submit']")).click();
	
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 

		List<WebElement> listobj =driver.findElements(By.xpath("//ul[@class='listing-results clearfix js-gtm-list']//li//div//div/preceding-sibling::div//a[@class='listing-results-price text-price']"));
		 
		
//		/html[1]/body[1]/div[4]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[2]/a[1]
//		/html[1]/body[1]/div[4]/div[2]/div[1]/ul[1]/li[2]/div[1]/div[2]/a[1]
		
//		/html[1]/body[1]/div[4]/div[2]/div[1]/ul[1]/li[20]/div[1]/div[2]/a[1]
	
				
		String Before_xpath ="/html[1]/body[1]/div[4]/div[2]/div[1]/ul[1]/li[";
		String After_xpath = "]/div[1]/div[2]/a[1]";
		
		System.out.println(listobj.size());
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		for(int i= listobj.size()-1; i>=0; i--) {
			
			System.out.println(listobj.get(i).getText());
			if(i==20) {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
				WebElement PropClick = driver.findElement(By.xpath(Before_xpath+i+After_xpath));
				
				JavascriptExecutor js =  ((JavascriptExecutor)driver);
				js.executeScript("argument[0].click();", PropClick);
			}
		}	
		
		                                                                  
	}

}
