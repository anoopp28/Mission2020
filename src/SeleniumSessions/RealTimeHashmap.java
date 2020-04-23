package SeleniumSessions;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTimeHashmap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		
	
		System.out.println(userCredentialsMap());
		
				
		driver.findElement(By.name("email")).sendKeys(getUsername("Admin"));
		driver.findElement(By.name("password")).sendKeys( getPassword("Admin"));
	}

	
	public static HashMap<String, String> userCredentialsMap() {
		
		HashMap<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("Customer", "anoop2804anu:anoop2804");
		userMap.put("Admin", "manpreet28:Noida4");
		userMap.put("Supervisor", "supervisor123:Bangalore");
		return userMap;
	}
	
	public static String getUsername(String role) {
		String Credentials = userCredentialsMap().get(role);
		return Credentials.split(":")[0];
	}
	public static String getPassword(String role) {
		String Credentials = userCredentialsMap().get(role);
		return Credentials.split(":")[1];
	}
}
