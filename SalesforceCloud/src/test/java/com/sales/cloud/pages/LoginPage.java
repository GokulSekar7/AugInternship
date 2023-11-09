package com.sales.cloud.pages;

<<<<<<< HEAD
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	
=======

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

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

}
