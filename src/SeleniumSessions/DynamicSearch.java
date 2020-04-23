package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		List<WebElement> listobj=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div/descendant::div[@class='sbl1']"));
		System.out.println("Total suggestions "+listobj.size());
		
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		for(int i=0; i<listobj.size();i++) {
			System.out.println(listobj.get(i).getText());
			
			if(listobj.get(i).getText().equals("java interview questions")) {
				listobj.get(i).click();
				break;
			}
		}
		System.out.println("End");
	}

}