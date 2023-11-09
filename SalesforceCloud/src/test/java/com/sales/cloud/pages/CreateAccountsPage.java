package com.sales.cloud.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateAccountsPage extends ProjectSpecificMethods {

	public CreateAccountsPage enterAccountName(String accName) {
		type(locateElement(Locators.XPATH, "//input[@name='Name']"), accName); 
		return this;
	}
	
	public CreateAccountsPage enterOwnership() {
		click(locateElement(Locators.XPATH, "(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]"));
		click(locateElement(Locators.XPATH, "//*[@data-value='Public']"));	
		return this;
	}
	
	public ViewAccountsPage clickSaveButton() {
		click(locateElement(Locators.XPATH, "//button[@name='SaveEdit']"));
			return new ViewAccountsPage();
	}
	
	
	
	
	
	
	
}
