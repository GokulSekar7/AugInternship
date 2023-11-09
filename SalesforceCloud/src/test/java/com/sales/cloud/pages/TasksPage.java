package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class TasksPage extends ProjectSpecificMethods{
	
	
	
	public TasksPage clickSelectDisplay() {
		clickUsingJs(locateElement(Locators.XPATH, "//button[@title='Select list display']"));
		return this;
	}
	
	public TasksPage clickDisplayAsTable() {
		clickUsingJs(locateElement(Locators.XPATH, "//li[@title='Display as table']"));
		return this;
	}
	public CreateTasksPage clickTaskNew() {
		clickUsingJs(locateElement(Locators.XPATH, "//div[@title='New Task']"));
		return new CreateTasksPage();
	}
	
	
	
	public TasksPage enterSearchBar(String Call) {
		clearAndType(locateElement(Locators.XPATH, "(//input[@aria-label='Search Recently Viewed list view.'])[2]"),Call);
		return this;
	}
	
	public TasksPage clickOnDropdown() {
		clickUsingJs(locateElement(Locators.XPATH, "(//div[@class='forceVirtualActionMarker forceVirtualAction'])"));
		return this;
	}
	
	public EditTasksPage clickOnEditDropdown() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Edit']"));
		return new EditTasksPage();
	}
	

	
	public DeleteTasksPage clickOnDeleteDropdown() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Delete']"));
		return new DeleteTasksPage();
	}
	
	
}

