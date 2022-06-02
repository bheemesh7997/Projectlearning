package selenium.learning;

import org.testng.annotations.Test;

import testcases1.projectwrappers;

public class Tc001_dataprovider extends projectwrappers{
	
	@Test(dataProvider = "fetchdata" , dataProviderClass = Dataprovider_Tc001.class)
	
	public void irctcregistration(String username, String password, String conf_password, String Fav_hero, String Firstname, String Middlename, String Lastname, 
			String Email, String mobile, String D_no, String street, String area, String pincode, String state, String mobile1 ) throws InterruptedException {
		
		
		Thread.sleep(3000);
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]");
		
		Thread.sleep(3000);
		
		pagedown();
		
		enterById("userName", username);
		
		enterById("usrPwd", password);
		
		enterById("cnfUsrPwd", conf_password);
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div");
		
		clickByXpath("//*[@id=\'ui-tabpanel-0\']/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");
		
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div");
		
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li");
		
		enterByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[7]/input", Fav_hero);
		
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
		
		Thread.sleep(3000);
		
		enterById("firstName", Firstname);
		
		enterById("middleName", Middlename);
		
		enterById("lastname", Lastname);
		
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
		
		enterById("email", Email);
		
		enterByCssSelector("#mobile", mobile );
		
		selectValueByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[13]/select", "94");
		
		clickByCssSelector("#divMain > div > app-user-registration > div > div > form > div > div.col-md-7.col-sm-12.col-xs-12.remove-pad.userReg2.secondPage > div.col-xs-12.ng-star-inserted > div.pull-right.btn-marginR > button");
		
		Thread.sleep(3000);
		
		enterById("resAddress1", D_no);
			
		enterById("resAddress2", street);
		
		enterById("resAddress3", area);
		
		enterByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[4]/input", "533005");
		
		enterById("resState", state);
		
		selectVisibileTextByxpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[6]/select", "EAST GODAVARI");
		
		Thread.sleep(3000);
		
		selectValueByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select", "Madhavapatnam B.O");
		
		Thread.sleep(3000);
		
		enterById("resPhone", mobile1);
		
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
