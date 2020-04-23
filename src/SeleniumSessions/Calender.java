package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);  
		
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		
		
		String date = "28-April-2017";
		String datearr[] = date.split("-");
		
		String day = datearr[0];
		
		//To select the Day
		
//		/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]
//		/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]
//      /html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]
    		
	    		
	    String before_xpath ="/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[";	
	    String after_xpath = "]/td[";
	    		
	    final int totalweekdays = 7;
	    boolean flag = false;
	    
	    for (int rownum = 1; rownum<=6; rownum++) {
	    	for(int colnum = 1; colnum<=totalweekdays; colnum++) {
	    	String days =	driver.findElement(By.xpath(before_xpath+rownum+after_xpath+colnum+"]")).getText();
	    	System.out.println(days);	
	    	if(days.equals(day)) {
	    		driver.findElement(By.xpath(before_xpath+rownum+after_xpath+colnum+"]")).click();
	    		flag = true;
	    		break;
	    	}
	    }
	    	
	    	if(flag == true) {
	    		break;
	    	}
	    }	

	}

}
