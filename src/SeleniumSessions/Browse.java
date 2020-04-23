package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52001551\\Desktop\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\52001551\\Desktop\\April Release items\\Doc4.docx");
	}

}
