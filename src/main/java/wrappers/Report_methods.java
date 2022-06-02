package wrappers;

import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Report_methods extends Reports{
	
	public ExtentReports report;
	public static ExtentTest test;

	
	public void startreport() {
		
		report = new ExtentReports("./Reports/samplereport.html");
	}
	
	public void starttest(String tcname, String tcDescription, String author, String category) {
		
		test = report.startTest(tcname, tcDescription);
		
		test.assignAuthor(author);
		
		test.assignCategory(category);
		
	}

	public void logstatus(String status, String Desc) {
		
		if (status.equalsIgnoreCase("PASS")) {
			test.log(LogStatus.PASS, Desc);
		}else if (status.equalsIgnoreCase("FAIL")) {
			test.log(LogStatus.FAIL, Desc);
		}
		
		
		
	}
	 public void endtest() {
		 
			report.endTest(test);
		 
	 }
	
	public void endreport() {
		
		report.flush();
	}
	
	
	
}
