package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;
					
					//Class Inheritance
public class General extends Global { 
	//Standard rule: To Provide all re-usable functions/methods related to the whole project
	// Open Application
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\Jefferson\\Full_Stack_Java_Development\\Testing\\Projects\\Automation_Coding\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		System.out.println("Application opened");//Console
		Reporter.log("Application Opened");//HTML Report
		Log.info("ApplicationOpened");// HTML Report
		
	}
	// Close Application
	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
		Log.info("Application Closed");
	}
	//Login Application
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Log.info("Login Completed");
	}
	// Logout Application
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		Log.info("Logout Completed");
	}
	//Enter into Frame
	public void enterFrame() {
		driver.switchTo().frame(frm_frame);
		System.out.println("Entered into Frame");
		Log.info("Enter into Frame");
	}
	//Exit from Frame
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from Frame");
		Log.info("Exit the frame");
	}
	//addEmp
	public void addEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_FN)).sendKeys(FN);
		driver.findElement(By.name(txt_LN)).sendKeys(LN);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New Employee Added");
		Log.info("New Employee Added");
	}
	
	//DeleteEmployee
	public void delEmp() {
		
	}
}
