package testNG;

import org.testng.annotations.Test;

import testcases1.projectwrappers;

public class Demogroups extends projectwrappers{

	
	@Test (groups = {"Regression"})
	
	public void irctcregistration1() throws InterruptedException {
		
		invoked();
		
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
	
	@Test (groups = {"Smoke"})
	
	public void irctcregistration() throws InterruptedException {
		
		invoked();
		
		Thread.sleep(3000);
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]");
		
		Thread.sleep(3000);
		
		pagedown();
		
		enterById("userName", "bheem7997");
		
		enterById("usrPwd", "Bheem@7997");
		
		enterById("cnfUsrPwd", "Bheem@7997");
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div");
		
		clickByXpath("//*[@id=\'ui-tabpanel-0\']/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");
		
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div");
		
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li");
		
		enterByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[7]/input", "Pawan kalyan");
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
		
		Thread.sleep(3000);
		
		enterById("firstName", "Tummalapalli");
		
		enterById("middleName", "Bheemeswara");
		
		enterById("lastname", "Swamy");
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div");
		
		clickByXpath("//*[@id=\'ui-tabpanel-1\']/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[5]/li/span");
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/input");
		
		selectVisibileTextByxpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]", "2001");
		
		Thread.sleep(2000);
		
		selectValueByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]", "10");
		
		Thread.sleep(2000);
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[4]/td[1]/a");
		
		Thread.sleep(1000);
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[7]/span[2]/p-radiobutton/div/div[2]");
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[9]/p-selectbutton/div/div[1]");
		
		enterById("email", "bheemeshtummalapalli@gmail.com");
		
		enterByCssSelector("#mobile", "7997122853");
		
		selectValueByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[13]/select", "94");
		
		clickByCssSelector("#divMain > div > app-user-registration > div > div > form > div > div.col-md-7.col-sm-12.col-xs-12.remove-pad.userReg2.secondPage > div.col-xs-12.ng-star-inserted > div.pull-right.btn-marginR > button");
		
		Thread.sleep(3000);
		
		enterById("resAddress1", "1-80/2");
			
		enterById("resAddress2", "Love and mercy church street");
		
		enterById("resAddress3", "Sarpavaram");
		
		enterByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[4]/input", "533005");
		
		enterById("resState", "Andhra Pradesh");
		
		selectVisibileTextByxpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[6]/select", "EAST GODAVARI");
		
		Thread.sleep(3000);
		
		selectValueByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select", "Madhavapatnam B.O");
		
		Thread.sleep(3000);
		
		enterById("resPhone", "9177829190");
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[9]/span[1]/p-radiobutton/div");
		
		pagedown();
		
		Thread.sleep(3000);
		
		switchToFrameByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[11]/div/app-captcha/div/div/p-captcha/div/div/div/iframe");
		
		clickByXpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]");
		
		Thread.sleep(3000);
		
		switchToDefaultContentpage();
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[12]/span[1]");
		
		
		}
	
	@Test (groups = {"Regression"})
	
	public void irctcregistration2() throws InterruptedException {
		
		invoked();
		
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
