package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class Login extends ProjectSpecificMethod{

	public Login enterUsername(String uname) throws IOException {
		try {
			getDriver().findElement(By.id("username")).sendKeys(uname);
			reportStep("Enter the username", "pass");
		} catch (Exception e) {
			reportStep(e+" username not entered", "fail");
		}
		return this;
	}
	
	public Login enterPassword(String pwd) throws IOException {
		try {
			getDriver().findElement(By.id("password")).sendKeys(pwd);
			reportStep("Enter the password", "pass");
		} catch (Exception e) {
			reportStep(e+" password not entered", "fail");
		}
		return this;
	}
	
	public Login clickLogin() throws IOException {
		try {
			getDriver().findElement(By.id("Login")).click();
			reportStep("Click on the Login button", "pass");
		} catch (Exception e) {
			reportStep(e+" Failed to click the login button", "fail");
		}
		return this;
	}
	
	
	
}
