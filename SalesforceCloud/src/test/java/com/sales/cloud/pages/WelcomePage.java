package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods{

	public WelcomePage clickToggleMenu() {
		
		click(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
		return this;
	}
	
public AppLauncherWindowPage clickViewAllButton() {
		
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		return new AppLauncherWindowPage();
	}
	
	
}
