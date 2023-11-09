package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateOpportunitiesPage extends ProjectSpecificMethods{
	
	public CreateOpportunitiesPage enterOpportunityName(String oppname) {
		typeAndEnter(locateElement(Locators.XPATH, "//input[@name='Name']"),oppname);
		return this;
	}
	
	public CreateOpportunitiesPage clickCloseDate() {
		clickUsingJs(locateElement(Locators.XPATH, "//input[@name='CloseDate']"));
		return this;
	}
	
	public CreateOpportunitiesPage SelectDate() {
		clickUsingJs(locateElement(Locators.XPATH, "//td[@class='slds-is-today']"));
		return this;
	}
	
	public CreateOpportunitiesPage clickStage() {
		clickUsingJs(locateElement(Locators.XPATH, "//button[contains(@aria-label,'Stage')]"));
		return this;
	}
	
	public CreateOpportunitiesPage SelectStage() {
		clickUsingJs(locateElement(Locators.XPATH, "//span[@title='Needs Analysis']"));
		return this;
	}
	
	public CreateOpportunitiesPage clickSave() {
		click(locateElement(Locators.XPATH, "//button[@title='Save']"));
		return this;
	}

}
