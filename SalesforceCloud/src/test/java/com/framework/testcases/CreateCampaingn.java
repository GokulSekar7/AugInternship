package com.framework.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.sales.cloud.pages.LoginPage;



public class CreateCampaingn extends ProjectSpecificMethods {
	@BeforeTest
	public void setTestDetail() {
		
		testcaseName ="Login";
		testDescription =" Positive scenario";
		category = "functional";
		authors = "Suneetha";
		excelFileName ="CreateCampaign";
	
	}
	@Test(dataProvider="fetchData",singleThreaded = true)
	public void runCreateAccount(String campname) throws IOException {
		LoginPage object =new LoginPage();
		object.enterUsername("suni.bhagya306@gmail.com")
		.EnterThePassword("Suneetha@051")
		.clickonLogin()
		.clickToggleMenu().clickViewAllButton().clickOnSales().clickCampaigns().clickCampaignsNew().enterCampaignName(campname)
         .clickSave();
	}
}
