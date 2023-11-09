package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class OpportunitiesPage extends ProjectSpecificMethods{
	
	public CreateOpportunitiesPage clickOpportunityNew() {
		clickUsingJs(locateElement(Locators.XPATH, "//div[@title='New']"));
		return new CreateOpportunitiesPage();
	}
	
	
	public OpportunitiesPage enterSearchBar(String oppname) {
		typeAndEnter(locateElement(Locators.XPATH, "//input[@aria-label='Search Recently Viewed list view.']"),oppname);
		return this;
	}
	
	public OpportunitiesPage clickOnDropdown() {
		clickUsingJs(locateElement(Locators.XPATH, "//span[contains(@class,'slds-icon_container')]"));
		return this;
	}
	
	public EditOpportunitiesPage clickOnEditDropdown() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Edit']"));
		return new EditOpportunitiesPage();
	}
	
	
	
	public DeleteOpportunitiesPage clickOnDeleteDropdown() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Delete']"));
		return new DeleteOpportunitiesPage();
	}
	
	
}
