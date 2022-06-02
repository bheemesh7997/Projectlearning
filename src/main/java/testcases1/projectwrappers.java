package testcases1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import wrappers.Genericwrappers;

public class projectwrappers extends Genericwrappers{
	
	public String tcname, tcDescription, author, category ;

	@BeforeSuite
	public void beforesuite() {
		
		startreport();
	}
	
	@BeforeTest
	public void beforetest() {
		
		
		
	}
	
	@BeforeClass
	public void beforeclass() {
		
	}
	
	@BeforeMethod
	public void invoked() {
		
		starttest(tcname, tcDescription, author, category);

		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");
		
	}
	
	@AfterMethod
	public void closeapp() {
		
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterclass() {
		endtest();
	}
	
	@AfterTest
	public void aftertest() {
		
	}
	
	@AfterSuite
	public void aftersuite() {
		endreport();
	}
	
	
	


	
}
