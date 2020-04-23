package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	
	
	public static void main(String[] args) throws InterruptedException {
	

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
		
		
		//driver.findElement(By.xpath("//a[contains(text(),'£825,000')]")).click();
		
		
		
//		String Before_xpath ="/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[";
//		String After_xpath = "]/div[1]/div[2]/a[1]";
//		
//		driver.findElement(By.xpath(Before_xpath+20+After_xpath)).click();

		List<WebElement> obj = driver.findElements(By.tagName("iframe"));
		
		
		System.out.println(obj.size());
		
		for(int i=0; i<obj.size(); i++) {
			
			System.out.println(obj.get(i).getText());
		}
		
		
		
	}

}
