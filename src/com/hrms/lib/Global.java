package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//standard rule: This class is used to provide TestData & Objects for Whole application
	public WebDriver driver; // Object Creation
	//***Test Data
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	public String FN = "John";
	public String LN = "Good";
	
	//*** Objects
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String frm_frame = "rightMenu";
	public String btn_Add = "//input[@value='Add']"; //xpath
	public String txt_FN = "txtEmpFirstName";
	public String txt_LN = "txtEmpLastName";
	public String btn_save = "btnEdit"; //id
}
