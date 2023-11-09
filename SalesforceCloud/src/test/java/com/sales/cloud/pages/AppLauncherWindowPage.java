package com.sales.cloud.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncherWindowPage extends ProjectSpecificMethods{
	
	public SalesHomePage clickOnSales() {
		click(locateElement(Locators.XPATH, "//p[text()='Sales']"));
		return new SalesHomePage();
	}
	public AccountsPage clickOnAccounts() {
		click(locateElement(Locators.XPATH, "//p[text()='Accounts']"));
		return new AccountsPage();
		
	}
	public CampaignsPage clickOnCampaigns() {
		click(locateElement(Locators.XPATH, "//p[text()='Campaigns']"));
		return new CampaignsPage();
		
	}
	
	
	public CasesPage clickOnCases() {
		click(locateElement(Locators.XPATH, "//p[text()='Cases']"));
		return new CasesPage();
		
	}	
	public ChatterPage clickOnChatter() {
		click(locateElement(Locators.XPATH, "//p[text()='Chatter']"));
		return new ChatterPage();
		
	}
	public ContactsPage clickOnContacts() {
		click(locateElement(Locators.XPATH, "//p[text()='Contacts']"));
		return new ContactsPage();
		
	}
	public DashboardPage clickOnDashboard() {
		click(locateElement(Locators.XPATH, "//p[text()='Dashboards']"));
		return new DashboardPage();
		
	}
	public LeadsPage clickOnLeads() {
		click(locateElement(Locators.XPATH, "//p[text()='Leads']"));
		return new LeadsPage();
		
	}
	public OpportunitiesPage clickOnOpportunities() {
		click(locateElement(Locators.XPATH, "//p[text()='Opportunities']"));
		return new OpportunitiesPage();
		
	}
	public ReportsPage clickOnReports() {
		click(locateElement(Locators.XPATH, "//p[text()='Reports']"));
		return new ReportsPage();
		
	}
	public TasksPage clickOnTasks() {
		click(locateElement(Locators.XPATH, "//p[text()='Tasks']"));
		return new TasksPage();
		
	}
}







