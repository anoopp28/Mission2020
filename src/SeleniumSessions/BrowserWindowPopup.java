package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);     

		driver.findElement(By.xpath("//a[contains(text(), 'Good PopUp #1')]")).click();
		
		Set<String> Handler = driver.getWindowHandles();
		
		Iterator<String> it = Handler.iterator();
		
		String ParentID = it.next();
		System.out.println(ParentID);

		String ChildID = it.next();
		System.out.println(ChildID);
		
		
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(ParentID);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
