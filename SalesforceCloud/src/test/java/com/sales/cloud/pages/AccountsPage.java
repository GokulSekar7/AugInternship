package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;



public class AccountsPage extends ProjectSpecificMethods {

	public CreateAccountsPage clickNewButton() {
		clickUsingJs(locateElement(Locators.XPATH, "//div[@title='New']"));
		return new CreateAccountsPage();
	}
	
	public AccountsPage searchInput(String accName) {
		typeAndEnter(locateElement(Locators.XPATH, "//input[@placeholder='Search this list...']"), accName);
		return this;
	}
	
	public AccountsPage clickDropdown() {
		clickUsingJs(locateElement(Locators.XPATH, "//div[@data-aura-class='forceVirtualAction']/*"));
		return this;
	}
	
	public EditAccountPage clickEdit() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Edit']"));
		return new EditAccountPage();
	}
	
	public DeleteAccountPage clickDeleteAccount() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Delete']"));
		return new DeleteAccountPage();
	}
	
	
	
}
