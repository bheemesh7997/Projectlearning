package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc001 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver object = new ChromeDriver();
		
		object.get("https://www.irctc.co.in/nget/train-search");
		
		object.manage().window().maximize();
		
		Thread.sleep(3000);
		
		object.findElementByXPath("//button[starts-with(@class, 'btn')]").click();
		
		
		object.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]").click();
		
		Thread.sleep(3000);
		
		object.findElementByXPath("/html/body").sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(3000);
		
		object.findElementById("userName").sendKeys("bheem7997");
		
		object.findElementById("usrPwd").sendKeys("Bheem@7997");
		
		object.findElementById("cnfUsrPwd").sendKeys("Bheem@7997");
		
		
		object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div").click();
		
		object.findElementByXPath("//*[@id=\'ui-tabpanel-0\']/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		
		object.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div").click();
		
		object.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li").click();
		
		object.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("snoopy");
		
		object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		
		Thread.sleep(3000);
		
		object.findElementById("firstName").sendKeys("Tummalapalli");
		
		object.findElementById("middleName").sendKeys("Bheemeswara");
		
		object.findElementById("lastname").sendKeys("Swamy");
		
		object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div").click();
		
		object.findElementByXPath("//*[@id=\'ui-tabpanel-1\']/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[5]/li/span").click();

		object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/input").click();
		
		WebElement year = object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]");
		
		Select yea = new Select(year);
		
		yea.selectByVisibleText("2001");
		
		WebElement month = object.findElementByXPath("//*[@id=\'ui-tabpanel-1\']/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]");
		
		Select mon = new Select(month);
		
		mon.selectByValue("10");
		
		Thread.sleep(2000);
		
		object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[4]/td[1]/a").click();
		
		Thread.sleep(2000);
		
		object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[7]/span[2]/p-radiobutton/div/div[2]").click();
		
		object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[9]/p-selectbutton/div/div[1]").click();
		
		object.findElementById("email").sendKeys("bheemeshtummalapalli@gmail.com");
		
		object.findElementByCssSelector("#mobile").sendKeys("7997122853");
		
		WebElement nationality = object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[13]/select");
		
		Select nat = new Select(nationality);
		
		nat.selectByValue("94");
		
		object.findElementByCssSelector("#divMain > div > app-user-registration > div > div > form > div > div.col-md-7.col-sm-12.col-xs-12.remove-pad.userReg2.secondPage > div.col-xs-12.ng-star-inserted > div.pull-right.btn-marginR > button").click();
		
		Thread.sleep(3000);
		
		object.findElementById("resAddress1").sendKeys("1-80/2");
		
		object.findElementById("resAddress2").sendKeys("Love and mercy church street");
		
		object.findElementById("resAddress3").sendKeys("Sarpavaram");
		
		object.findElementByName("resPinCode").sendKeys("533005");
		
		object.findElementById("resState").sendKeys("Andhra Pradesh");
		
		Thread.sleep(3000);
		
		WebElement city = object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[6]/select");
		
		
		
		Select cit = new Select(city);
		
		cit.selectByVisibleText("EAST GODAVARI");
		
		Thread.sleep(3000);
		
		WebElement postoffice = object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select");

		Select post = new Select(postoffice);
				
		post.selectByValue("Madhavapatnam B.O");
		
		Thread.sleep(3000);
		
		object.findElementById("resPhone").sendKeys("9177829190");
		
		object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[9]/span[1]/p-radiobutton/div").click();
		
		object.findElementByXPath("/html/body").sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
		
		WebElement frame = object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[11]/div/app-captcha/div/div/p-captcha/div/div/div/iframe");
		
		object.switchTo().frame(frame);
		
		object.findElementByXPath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]").click();
		
		Thread.sleep(3000);
		
		object.switchTo().defaultContent();
		
		object.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[12]/span[1]").click();
		
		
		
		
		
	}

}
