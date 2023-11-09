package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CasesPage extends ProjectSpecificMethods{
	
	
	public CreateCasePage clickNewButton() {
		clickUsingJs(locateElement(Locators.XPATH, "//div[@title='New']"));
		return new CreateCasePage();
	}
	
	public CasesPage searchInput(String caseNum) {
		typeAndEnter(locateElement(Locators.XPATH, "//input[@placeholder='Search this list...']"), caseNum);
		return this;
	}
	
	public CasesPage clickDropdown() {
		clickUsingJs(locateElement(Locators.XPATH, "//div[@data-aura-class='forceVirtualAction']/*"));
		return this;
	}
	
	public EditCasePage clickEdit() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Edit']"));
		return new EditCasePage();
	}
	
	public DeleteCasePage clickDeleteCase() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Delete']"));
		return new DeleteCasePage();
	}

	
	
	

}
