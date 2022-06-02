package wrappers;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {


	public static void main(String[] args) {
		
		
		ExtentReports report = new ExtentReports("./Reports/samplereport.html");
		
		ExtentTest test = report.startTest("Tc001_dataprovider", "This testcase is to check teext fields");
		
		test.assignAuthor("Bheemesh");
		
		test.assignCategory("Regression");
		
		test.log(LogStatus.PASS, "Desc");
		
		test.log(LogStatus.FAIL, "Desc");
		
		report.endTest(test);
		
		report.flush();
		
		
		
	}
	
}
