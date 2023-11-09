package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateTasksPage extends ProjectSpecificMethods{
	public CreateTasksPage clickSearch() {
		click(locateElement(Locators.XPATH, "//input[@class='slds-combobox__input slds-input']"));
		return this;
	}
	
	public CreateTasksPage clickSelectInSearch() {
		click(locateElement(Locators.XPATH, "//span[@title='Call']"));
		return this;
	}
	
	
	
	public CreateTasksPage clickSave() {
		click(locateElement(Locators.XPATH, "//button[@title='Save']"));
		return this;
	}

}
