package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002_AddEmp {
	//public static void main (String args[]) {
	
	@Test
	public void tc002() {
		//Test Steps
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}

}
