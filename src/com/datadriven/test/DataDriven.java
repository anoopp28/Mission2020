package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDriven {

	public static void main(String[] args) {
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		
		//Create the object of Xls_Reader class from Excel utility to call the methods of that class and add the path of excel sheet 
		Xls_Reader reader = new Xls_Reader("C:\\Users\\52001551\\Desktop\\Selenuim\\Data.xlsx");
		
		int rowCount = reader.getRowCount("Data");
		System.out.println(rowCount);
		

		reader.addColumn("Data", "Status");
		
		for(int rowNum =2; rowNum<=rowCount; rowNum++) {
	
	
		String Firstname = reader.getCellData("Data", "Firstname", rowNum);
		System.out.println(Firstname);
		
		
		String Surname = reader.getCellData("Data", "Surname", 2);
		System.out.println(Surname);
		
		
		String Mobilenumber = reader.getCellData("Data", "Mobilenumber", 2);
		System.out.println(Mobilenumber);
		
		
		String Newpassword = reader.getCellData("Data", "Newpassword ", 2);
		System.out.println(Newpassword);
	
		
		String Day = reader.getCellData("Data", "Day", 2);
		System.out.println(Day);
		
		//To set the data in excel
		reader.setCellData("Data", "Status", rowNum, "Pass");
		
		}
		
	}

}
