package testngExamples;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example_TestNG5 {
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
	//Test Steps
	@Test
	public void tc001() throws Exception{
		FileInputStream file = new FileInputStream("D:\\Jefferson\\Full_Stack_Java_Development\\Testing\\Projects\\HRMS\\LoginDetails.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		String username = st.getCell(0,1).getContents();
		String password = st.getCell(1,1).getContents();
		Reporter.log(username);
		Reporter.log(password);
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened");//Console
		Reporter.log("Application Opened");// HTML report
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Login Completed");
		Reporter.log(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout Completed");
	}
}
