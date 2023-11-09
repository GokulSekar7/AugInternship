package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;



public class SalesHomePage extends ProjectSpecificMethods{
	
	public AccountsPage clickAccount() {
		click(locateElement(Locators.XPATH, "//span[text()='Accounts']"));
		return new AccountsPage();
	}
	
	public CampaignsPage clickCampaigns() {
		click(locateElement(Locators.XPATH, "//span[text()='Campaigns']"));
		return new CampaignsPage();
	}
	
	public CasesPage clickCases() {
		click(locateElement(Locators.XPATH, "//span[text()='Cases']"));
		return new CasesPage();
		
	}	
	
	public ChatterPage clickChatter() {
		click(locateElement(Locators.XPATH, "//span[text()='Chatter']"));
		return new ChatterPage();
		
	}
	public ContactsPage clickContacts() {
		click(locateElement(Locators.XPATH, "//span[text()='Contacts']"));
		return new ContactsPage();
		
	}
	public DashboardPage clickDashboards() {
		click(locateElement(Locators.XPATH, "//span[text()='Dashboards']"));
		return new DashboardPage();
		
	}
	public LeadsPage clickLeads() {
		click(locateElement(Locators.XPATH, "//span[text()='Leads']"));
		return new LeadsPage();
		
	}	
	public OpportunitiesPage clickOpportunities() {
		click(locateElement(Locators.XPATH, "//span[text()='Opportunities']"));
		return new OpportunitiesPage();
		
	}	
	public ReportsPage clickReports() {
		click(locateElement(Locators.XPATH, "//span[text()='Reports']"));
		return new ReportsPage();
		
	}
	public TasksPage clickTasks() {
		click(locateElement(Locators.XPATH, "//span[text()='Tasks']"));
		return new TasksPage();
		
	}
		
}
