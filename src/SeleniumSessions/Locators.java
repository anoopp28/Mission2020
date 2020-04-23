package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52001551\\Desktop\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Xpath
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Anoop");
		
		//id
		driver.findElement(By.id("u_0_o")).sendKeys("Bing");
		
		//name
		driver.findElement(By.name("reg_email__")).sendKeys("anoop28.p@gmail.com");
		
		//Linktext - Only for links
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//partiallinktext - only if long text is available
		
		//CSSselector
		driver.findElement(By.cssSelector("#u_0_w")).sendKeys("Anoop@2804");
		
		//Classname - not useful - duplicate classname for different elemnets
		//driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("anoop");
			
		
	}

}
