package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;

public class TC_001 extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setTestDetail() {
		testCaseName ="Login";
		testDescription =" Positive scenario";
		testCategory = "functional";
		author = "Gokul";
	}
	
	
	@Test
	public void runTc_001() throws IOException {
		
		new Login()
		.enterUsername("gokul.sekar@testleaf.com")
		.enterPassword("Java@223")
		.clickLogin();
		
	}
	

}
