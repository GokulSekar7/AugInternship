package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DeleteLeadPage  extends ProjectSpecificMethods {
	public void clickonDeleteButton() {
		click(locateElement(Locators.XPATH,"//button/span[text()='Delete']"));
		
	}

}
