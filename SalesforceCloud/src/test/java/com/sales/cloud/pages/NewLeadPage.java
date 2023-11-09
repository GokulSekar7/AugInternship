package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewLeadPage extends ProjectSpecificMethods {
	public NewLeadPage ClickonSalutation() {
		click(locateElement(Locators.XPATH,"//button[@name='salutation']"));
		return this;
	}
	public NewLeadPage SelectSalutation() {
		click(locateElement(Locators.XPATH,"//span[@title='Mr.']"));
		return this;
	}
	public NewLeadPage ClickonFirstName (String fName) {
		clearAndType(locateElement(Locators.XPATH,"//input[@name='firstName']"),fName);
		return this;
	}
	
	public NewLeadPage ClickonLastName(String lName) {
		clearAndType(locateElement(Locators.XPATH,"//input[@name='lastName']"), lName);
		return this;
	}
	
	public NewLeadPage ClickonCompanyName(String cName) {
		clearAndType(locateElement(Locators.XPATH,"//input[@name='Company']"), cName);
		return this;
	}
	public NewLeadPage ClickonPhoneNumber(String pNumber) {
		clearAndType(locateElement(Locators.XPATH,"//input[@name='Phone']"),pNumber);
		return this;
	}
	
public LeadsPage clickonSave () {
	click(locateElement(Locators.XPATH,"//button[@name='SaveEdit']"));
	return new LeadsPage();
}
}
