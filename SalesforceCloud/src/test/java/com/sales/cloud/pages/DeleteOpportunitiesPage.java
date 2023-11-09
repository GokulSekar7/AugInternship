package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DeleteOpportunitiesPage extends ProjectSpecificMethods{
	
	public DeleteOpportunitiesPage clickOnDelete() {
		click(locateElement(Locators.XPATH, "//span[text()='Delete']"));
		return this;
	}

}
