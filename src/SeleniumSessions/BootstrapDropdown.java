package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.jquery-az.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
		
		driver.findElement(By.id("menu-item-7090")).click();
		
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
		
		
		List<WebElement> list =driver.findElements(By.xpath("//a[@class='main-link']"));
		System.out.println(list.size());
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Kotlin")) {
				list.get(i).click();
				break;
			}
		}
		
		
	}	
		

	}


