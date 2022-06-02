package testcases1;

import org.testng.annotations.Test;

public class TestNGTc005 extends projectwrappers {

@Test
	
	public void irctcregistration4() throws InterruptedException {
		
		Thread.sleep(3000);
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		
		Thread.sleep(3000);
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/a/span/strong");
		
		Thread.sleep(2000);
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[9]");
		
		switchToLastWindow();
		
		clickByXpath("/html/body/form/div/div/table/tbody/tr[4]/td[2]/div/a[2]");
		
		Thread.sleep(3000);
		
		enterById("userId", "Bheem_123");
		
		enterById("password", "Bheem1234");
		
		enterByName("cnfPassword", "Bheem1234");
		
		selectValueByXpath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[5]/td[2]/select", "6");
		
		enterById("secAnswer", "Pulsar");
		
		clickById("dateOfBirth");
		
		selectValueByXpath("/html/body/div[3]/div/div/select[1]", "10");
		
		selectValueByXpath("/html/body/div[3]/div/div/select[2]", "2001");
		
		clickByXpath("/html/body/div[3]/table/tbody/tr[4]/td[1]/a");
		
		Thread.sleep(3000);
		
		clickById("gender0");
		
		clickById("maritalStatus1");
		
		enterById("email","bheemesh123456@gmail.com");
		
		pagedown();
		
		selectValueByID("occupation", "EducationalInstitution");
		
		enterById("fname", "Tummalapalli");
		
		enterById("mname", "Bheemeswara");
		
		enterById("lname", "Swamy");
		
		selectValueByID("natinality", "94");
		
		enterById("flatNo","1-80/2");
		
		enterByName("street", "Love and mercy church street");
		
		pagedown();
		
		enterByName("area", "Sarpavaram");
		
		selectValueByXpath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[20]/td[2]/select", "94");
		
		Thread.sleep(2000);
		
		enterByName("mobile", "9381993835");
		
		enterByName("pincode", "533005");
		

		
		
		
		
		
		
		
	}
	
	
	

}

