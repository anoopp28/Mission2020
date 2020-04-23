package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52001551\\Desktop\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		//cannot spy the Javascript popups
		Alert alert = driver.switchTo().alert(); // switch from main to alert will give u one alert class store it in alert ref var
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
		
		alert.accept();  //to click on OK
		System.out.println(text);
		}
		
		else {
			// alert.dismiss();    //to click on cancel 
		}
		
	}

}
