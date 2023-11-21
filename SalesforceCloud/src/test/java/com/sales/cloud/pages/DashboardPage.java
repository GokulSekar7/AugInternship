package com.sales.cloud.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DashboardPage extends ProjectSpecificMethods {
	
public void ClickonDashboard() {
	click(locateElement(Locators.XPATH,"//span[text()='Dashboards']/following::div[text()='New Dashboard']"));
}

public void ClickonDropdownButton() {
}


public DashboardPage clickonSearch(String dashboardName) {
		typeAndEnter(locateElement(Locators.XPATH,"//input[@placeholder='Search recent dashboards...']"), dashboardName); 
		return this;
		}


public DashboardPage clickonTheDropdown(){
    WebElement locateElement = locateElement(Locators.XPATH,"//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']");
	clickUsingJs(locateElement);
	return this;
}

}