package com.sales.cloud.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
	public NewLeadPage clickonNewButton() {
	click(locateElement(Locators.XPATH,"//span[text()='Leads']/following::div[@title='New']"));
	return new NewLeadPage();
		}
	
	public LeadsPage clickonSearch(String leadName) {
	typeAndEnter(locateElement(Locators.XPATH,"//div/input[@name='Lead-search-input']"), leadName);
	return this;
	}
	
    public LeadsPage clickonTheDropdown(){
    WebElement locateElement = locateElement(Locators.XPATH,"//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']");
	clickUsingJs(locateElement);
	return this;
	//doubt: is WebElement creation correct?
	}

	public EditLeadPage clickonEdit() {
	click(locateElement(Locators.XPATH,"//span[text()='Leads']/following::a[@title='Edit']"));
	return new EditLeadPage();
	}
	
	public DeleteLeadPage clickonDelete() {
	click(locateElement(Locators.XPATH,"//span[text()='Leads']/following::a[@title='Delete']"));
	return new DeleteLeadPage();
	}
}

