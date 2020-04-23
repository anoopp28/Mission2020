package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		
		driver.findElement(By.name("email")).sendKeys("anoop2804anu@gmail.com");
		driver.findElement(By.name("password")).sendKeys("anoop2804");
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
//		  Thread.sleep(5000);
//		  
//		  driver.findElement(By.name("first_name")).sendKeys("Anoop");
//		  driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Anoop");
//		  driver.findElement(By.xpath("//input[@name='department']")).sendKeys("Anoop");
		
	
////		/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]
////	    /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]
////	    /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]
////	    /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[2]		
		
	    String before_xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[";
		String After_xpath = "]/td[2]";
		
		for(int i=1; i<=5; i++) {
		  String name =	driver.findElement(By.xpath(before_xpath+i+After_xpath)).getText();
		  System.out.println(name);
	
		if(name.contains("Nithya S")) {
			driver.findElement(By.xpath(before_xpath+i+After_xpath)).click();
		}
		}
		
		
		//Method 2 - Customized Xpath
		
		clickon(driver, driver.findElement(By.xpath("//td[contains(text(),'Nithya S')]//parent::td//preceding-sibling::td//input[@name='id']")), 20);
		
	}
	
	public static void clickon(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}
	}

