package testngExamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example_TestNG2 {
	@BeforeMethod // It will Execute First 
	public void login() {
		System.out.println("Login Completed");
	}
	@AfterMethod //It will Execute last
	public void logout() {
		System.out.println("Logout Completed");
	}
	@Test(priority = 2)
	public void addemp() {
		System.out.println("New Emp added");
	}
	@Test(priority = 1)
	public void delemp() {
		System.out.println("Delete Emp");
	}
}
