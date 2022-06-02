package selenium.learning;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testcases1.projectwrappers;

public class Tc0002_dataprovider2 extends projectwrappers{
	
	
	@BeforeClass
	public void assignvalues() {
		
	
	tcname = "Tc0002_dataprovider2";
	tcDescription = "This is to test the text fields";
	author = "Bheemesh";
	category = "Regression";
	
	}
	

	@Test(dataProvider = "fetchdata2" , dataProviderClass = Dataprovider_Tc0002.class)
	
	public void irctcregistration1(String userid, String password, String cnf_password, String	Sec_answer, String	Email, String Firstname, String Middlename,
		String Lastname, String D_no, String Street, String Area, String Mobile, String zipcode) throws InterruptedException {
		
		Thread.sleep(3000);
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		
		Thread.sleep(3000);
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/a/span/strong");
		
		Thread.sleep(2000);
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[9]");
		
		switchToLastWindow();
		
		clickByXpath("/html/body/form/div/div/table/tbody/tr[4]/td[2]/div/a[2]");
		
		Thread.sleep(3000);
		
		enterById("userId", userid);
		
		enterById("password", password);
		
		enterByName("cnfPassword", cnf_password);
		
		selectValueByXpath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[5]/td[2]/select", "6");
		
		enterById("secAnswer", Sec_answer);
		
		clickById("dateOfBirth");
		
		selectValueByXpath("/html/body/div[3]/div/div/select[1]", "10");
		
		selectValueByXpath("/html/body/div[3]/div/div/select[2]", "2001");
		
		clickByXpath("/html/body/div[3]/table/tbody/tr[4]/td[1]/a");
		
		Thread.sleep(3000);
		
		clickById("gender0");
		
		clickById("maritalStatus1");
		
		enterById("email", Email);
		
		pagedown();
		
		selectValueByID("occupation", "EducationalInstitution");
		
		enterById("fname", Firstname);
		
		enterById("mname", Middlename);
		
		enterById("lname", Lastname);
		
		selectValueByID("natinality", "94");
		
		enterById("flatNo",D_no);
		
		enterByName("street", Street);
		
		pagedown();
		
		enterByName("area", Area);
		
		selectValueByXpath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[20]/td[2]/select", "94");
		
		Thread.sleep(2000);
		
		enterByName("mobile", Mobile);
		
		enterByName("pincode", zipcode);
		
		Thread.sleep(2000);
		

		
		
		
		
		
		
		
	}

}
