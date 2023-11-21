package com.sales.cloud.pages;


<<<<<<< HEAD
=======
import com.framework.testng.api.base.ProjectSpecificMethods;

>>>>>>> branch 'master' of https://github.com/GokulSekar7/AugInternship
import com.framework.selenium.api.design.Locators;


public class LoginPage extends ProjectSpecificMethods {
	public LoginPage enterUsername(String uname) {
		clearAndType(locateElement(Locators.ID,"username"), uname);
		return this;
	}
	public LoginPage EnterThePassword(String password) {
		clearAndType(locateElement(Locators.ID, "password"), password);
		return this;
	}
	public WelcomePage clickonLogin() {
		click(locateElement(Locators.ID, "Login"));
		return new WelcomePage();
	}

<<<<<<< HEAD
	
=======
>>>>>>> branch 'master' of https://github.com/GokulSekar7/AugInternship
}
