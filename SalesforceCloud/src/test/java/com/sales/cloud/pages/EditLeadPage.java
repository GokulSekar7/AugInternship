package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
	public EditLeadPage EnterStreetAs(String street) {
	clearAndType(locateElement(Locators.XPATH,"//div/textarea[@name='street']"),street);
	return this;
	
	}
	public EditLeadPage EnterCityAs(String city) {
	clearAndType(locateElement(Locators.XPATH,"//div/input[@name='city']"), city);
	return this;
	}
	public EditLeadPage EnterPostalCodeAs(String poCode) {
	clearAndType(locateElement(Locators.XPATH,"//div/input[@name='postalCode']"), poCode);	
	return this;
	}
	public EditLeadPage EnterStateAs(String province) {
	clearAndType(locateElement(Locators.XPATH,"//div/input[@name='province']"), province);	
	return this;
	}
	public EditLeadPage EnterCountryAs(String country) {
	clearAndType(locateElement(Locators.XPATH,"//div/input[@name='country']"), country);
	return this;
	}
	public void clickonSave () {
	click(locateElement(Locators.XPATH,"//button[@name='SaveEdit']"));
	}
	
}

