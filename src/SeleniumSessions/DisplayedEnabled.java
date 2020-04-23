package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedEnabled {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		
		//isDisplayed
		boolean b = driver.findElement(By.id("u_0_13")).isDisplayed();
		System.out.println(b);
		
		//isEnabled
		boolean b1 = driver.findElement(By.id("u_0_13")).isEnabled();
		System.out.println(b1);
		
		//isSelected - Checkbox/dropdown/radiobutton
		
		boolean b2 = driver.findElement(By.id("u_0_7")).isSelected();
		System.out.println(b2);
		
		driver.findElement(By.id("u_0_7")).click();
		
		boolean b3 = driver.findElement(By.id("u_0_7")).isSelected();
		System.out.println(b3);
		
        driver.findElement(By.id("u_0_7")).click();
		
		boolean b4 = driver.findElement(By.id("u_0_7")).isSelected();
		System.out.println(b4); 
		
		

	}

}
