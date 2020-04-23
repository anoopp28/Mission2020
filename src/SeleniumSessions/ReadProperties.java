package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		Properties prop = new Properties();     //default class available in Java
		FileInputStream ip = new FileInputStream("C:\\Users\\52001551\\eclipse-workspace\\Mission2020\\src\\SeleniumSessions\\config.properties");
		
        prop.load(ip);
        
        String BrowserName = prop.getProperty("Browser");
        System.out.println(BrowserName);
        
        if(BrowserName.contentEquals("Chrome")) {
        	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        	 driver = new ChromeDriver();
        	
        	 System.out.println(driver.getCurrentUrl());
        	}
        
        driver.get(prop.getProperty("Url"));
        
        driver.findElement(By.name(prop.getProperty("username_login"))).sendKeys(prop.getProperty("Username"));
        driver.findElement(By.name(prop.getProperty("password_login"))).sendKeys(prop.getProperty("Password"));
        driver.findElement(By.className(prop.getProperty("oginbtn_xpath"))).click();
        
        
        
        
	}

}
