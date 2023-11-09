package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DeleteTasksPage extends ProjectSpecificMethods{
	
	public DeleteTasksPage clickOnDelete() {
		click(locateElement(Locators.XPATH, "//span[text()='Delete']"));
		return this;
	}

}
