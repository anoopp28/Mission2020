package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HighlightJavaScript {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://in.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement SearchBtn = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		flash(driver, SearchBtn);
		System.out.println("done");
		
		drawborder(SearchBtn, driver);
		
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\52001551\\eclipse-workspace\\Mission2020\\src\\SeleniumSessions\\screenshot1.png"));
		
		generateAlert("There is a issue with Search Bar", driver);
		
	}
	
	
	public static void flash(WebDriver driver, WebElement Element) {
		String bgcolor = Element.getCssValue("backgroundColor");
		for(int i=0; i<100; i++) {
			changeColor("rgb(0,300,0)", Element, driver);
			changeColor(bgcolor, Element, driver);
		}
	}
		
		public static void changeColor(String color, WebElement Element,WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			((RemoteWebDriver) js).executeScript("arguments[0].style.backgroundColor = '"+color+"'",Element);
			
		}
			
	//draw border
		public static void drawborder(WebElement Element,WebDriver driver) {
				JavascriptExecutor js = ((JavascriptExecutor)driver);
				((RemoteWebDriver) js).executeScript("arguments[0].style.border = '3px solid red'",Element);		
			
		}
		//alert
		public static void generateAlert(String message,WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			((RemoteWebDriver) js).executeScript("alert('"+message+"')");		
		
	}
	
		
}
