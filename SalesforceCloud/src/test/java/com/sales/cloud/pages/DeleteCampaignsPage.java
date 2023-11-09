package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DeleteCampaignsPage extends ProjectSpecificMethods{
	
	public DeleteCampaignsPage clickOnDelete() {
		click(locateElement(Locators.XPATH, "//span[text()='Delete']"));
		return this;
	}

}
