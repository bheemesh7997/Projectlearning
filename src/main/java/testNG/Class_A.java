package testNG;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_A {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("I am before suite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("I am before test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Iam before class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("I am before method");
	}
	
	@Test
	public void test() {
		System.out.println("I am Test 1");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("I am after method");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("I am after class");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("I am after test");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("I am after suite");
	}
	
	
	
	
	
	
	
	
	
	
}
