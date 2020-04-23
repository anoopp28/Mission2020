package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropdownBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("28");
		
		Select select1 = new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("Apr");
		
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1995");
		
		
		
		driver.findElement(By.id("u_0_6")).click();
		
		driver.findElement(By.id("u_0_13")).click();

	}

}
