package testngExamples;

import org.testng.annotations.Test;

public class Example_TestNG {
	@Test //1 annotation of @Test is equal to 1 TestCase/Scenario
	public void login() {
		System.out.println("Login Completed");
	}
	@Test
	public void logout() {
		System.out.println("Logout Completed");
	}
	@Test
	public void addemp() {
		System.out.println("New Emp added");
	}
	@Test
	public void delemp() {
		System.out.println("Delete Emp");
	}
}
