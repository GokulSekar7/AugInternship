package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CampaignsPage extends ProjectSpecificMethods{
	
	public CreateCampaignsPage clickAccountNew() {
		clickUsingJs(locateElement(Locators.XPATH, "//div[@title='New']"));
		return new CreateCampaignsPage();
	}
	
	
	public CampaignsPage enterSearchBar(String campname) {
		typeAndEnter(locateElement(Locators.XPATH, "//input[@aria-label='Search Recently Viewed list view.']"),campname);
		return this;
	}
	
	public CampaignsPage clickOnDropdown() {
		clickUsingJs(locateElement(Locators.XPATH, "//span[contains(@class,'slds-icon_container')]"));
		return this;
	}
	
	public EditCampaignsPage clickOnEditDropdown() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Edit']"));
		return new EditCampaignsPage();
	}
	
	
	
	public DeleteCampaignsPage clickOnDeleteDropdown() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Delete']"));
		return new DeleteCampaignsPage();
	}
	
	
}
