package testngExamples;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example_TestNG6 {
	WebDriver driver;
	@BeforeClass
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Jefferson\\Full_Stack_Java_Development\\Testing\\Projects\\Automation_Coding\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	@Test
	public void tc001() throws Exception{
		FileInputStream file = new FileInputStream("D:\\Jefferson\\Full_Stack_Java_Development\\Testing\\Projects\\HRMS\\LoginDetails.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFCell username = sheet.getRow(1).getCell(0);
		XSSFCell password = sheet.getRow(1).getCell(1);
		System.out.println("Username: " + username.getStringCellValue());
		System.out.println("Password: " + password.getStringCellValue());
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened");//Console
		Reporter.log("Application Opened");// HTML report
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserName")).sendKeys(username.getStringCellValue());
		driver.findElement(By.name("txtPassword")).sendKeys(password.getStringCellValue());
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Login Completed");
		Reporter.log(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout Completed");
	}
}
