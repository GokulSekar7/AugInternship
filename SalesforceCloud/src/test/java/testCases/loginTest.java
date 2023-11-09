package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.sales.cloud.pages.LoginPage;

public class loginTest extends ProjectSpecificMethods {
	public void setFile() {
	
		excelFileName = "Login";
	}
	public void setTestDetail() {
		testcaseName = "Login";
		testDescription = "Positive Scenario";
		category = "functional";
		authors = "Niranjana";
	}
	@Test(dataProvider = "fetchData", singleThreaded= true)
	public void runLogin(String uname,String password,String opportunityname) throws InterruptedException, IOException {	
		LoginPage login = new LoginPage();
		login.enterUsername(uname).
		EnterThePassword(password).
		clickonLogin();
	
	}	
}
