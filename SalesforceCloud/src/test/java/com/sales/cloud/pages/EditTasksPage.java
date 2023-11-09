package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditTasksPage extends ProjectSpecificMethods{
	public EditTasksPage clickEditSave() {
		click(locateElement(Locators.XPATH, "//button[@title='Save']"));
		return this;
	}

}
