package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ProjectSpecificMethod {
	
	public ExtentReports extent;
	public String testCaseName, testDescription,testCategory, author;
	
	
	private static ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
	
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	
	private static ThreadLocal<String> testName = new ThreadLocal<String>();
	
	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	
	public void setTest() {
		ExtentTest childTest = parentTest.get().createNode(getTestName());
		test.set(childTest);
	}
	
	
	public String getTestName() {
		return testName.get();
	}
	
	
	public void setDriver() {
		rd.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
		return rd.get();
	}
	

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	
	@BeforeClass
	public void testCaseDetails() {
		ExtentTest parent = extent.createTest(testCaseName, testDescription);
		parent.assignCategory(testCategory);
		parent.assignAuthor(author);
		parentTest.set(parent);
		testName.set(testCaseName);
		
	}
	
	
	
	public void reportStep(String msg, String status) throws IOException {
		if(status.equalsIgnoreCase("pass")) {
			test.get().pass(msg, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			test.get().fail(msg, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		}
	}
	
	
	public int takeSnap() throws IOException {
		int radNum = (int)(Math.random()*99999);
		File src = getDriver().getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+radNum+".png");
		FileUtils.copyFile(src, des);
		return radNum;
	}
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
	
	
	@BeforeMethod
	public void preCondition() {
		setTest();
		setDriver();
		getDriver().get("https://login.salesforce.com");
	}
	
	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}
	
	
}
