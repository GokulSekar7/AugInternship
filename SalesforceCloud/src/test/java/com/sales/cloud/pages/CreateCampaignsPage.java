package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateCampaignsPage extends ProjectSpecificMethods{
	
	public CreateCampaignsPage enterCampaignName(String campname) {
		clearAndType(locateElement(Locators.XPATH, "(//input[@class=' input'])[1]"),campname);
		return this;
	}
	public CreateCampaignsPage clickSave() {
		click(locateElement(Locators.XPATH, "//button[@title='Save']"));
		return this;
	}

}
