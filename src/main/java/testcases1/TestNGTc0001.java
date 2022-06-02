package testcases1;

import org.testng.annotations.Test;

public class TestNGTc0001 extends projectwrappers{
	
	
	@Test
	
	public void irctcregistration() throws InterruptedException {
		
		
		Thread.sleep(3000);
		
		clickByXpath("//button[starts-with(@class, 'btn')]");
		
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
