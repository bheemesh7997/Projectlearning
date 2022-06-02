package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc003 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver object = new ChromeDriver();
		
		object.manage().window().maximize();
		
		object.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(3000);
		
		object.findElementByXPath("//button[starts-with(@class, 'btn')]").click();
		
		Thread.sleep(3000);
		
		WebElement holidays = object.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/a/span/strong");
		
		//WebElement stays = object.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[9]");
		
		Actions act = new Actions(object);
		
		act.moveToElement(holidays).perform();
		
		//object.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		
		//Thread.sleep(3000);
		
		//object.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/a/span/strong").click();
		
		object.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[9]").click();
		
		/*Set<String> allwindows = object.getWindowHandles();
		
		System.out.println(allwindows);
		
		for(String onewin : allwindows)
		{
			System.out.println(onewin);
			object.switchTo().window(onewin);
			Thread.sleep(3000);
		}
		
		object.findElementByXPath("/html/body/form/div/div/table/tbody/tr[4]/td[2]/div/a[2]").click();
		
		Thread.sleep(3000);
		
		object.findElementById("userId").sendKeys("Bheem_123");
		
		object.findElementById("password").sendKeys("Bheem1234");
		
		object.findElementByName("cnfPassword").sendKeys("Bheem1234");
		
		WebElement security = object.findElementByXPath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[5]/td[2]/select");
		
		Select sec = new Select(security);
		
		sec.selectByValue("6");
		
		object.findElementById("secAnswer").sendKeys("Pulsar");
		
		object.findElementById("dateOfBirth").click();
		
		WebElement month = object.findElementByXPath("/html/body/div[3]/div/div/select[1]");
		
		Select mon = new Select(month);
		
		mon.selectByValue("10");
		
		WebElement year = object.findElementByXPath("/html/body/div[3]/div/div/select[2]");
		
		Select yea = new Select(year);
		
		yea.selectByValue("2001");
		
		object.findElementByXPath("/html/body/div[3]/table/tbody/tr[4]/td[1]/a").click();
		
		Thread.sleep(3000);
		
		object.findElementById("gender0").click();
		
		object.findElementById("maritalStatus1").click();
		
		object.findElementById("email").sendKeys("bheemesh123456@gmail.com");
		
		object.findElementByXPath("/html/body").sendKeys(Keys.PAGE_DOWN);
		
		WebElement occupation = object.findElementById("occupation");
		
		Select occ = new Select(occupation);
		
		occ.selectByValue("EducationalInstitution");
		
		object.findElementById("fname").sendKeys("Tummalapalli");
		
		object.findElementById("mname").sendKeys("Bheemeswara");
		
		object.findElementById("lname").sendKeys("Swamy");
		
		WebElement nationality = object.findElementById("natinality");
		
		Select nat = new Select(nationality);
		
		nat.selectByValue("94");
		
		object.findElementById("flatNo").sendKeys("1-80/2");
		
		object.findElementByName("street").sendKeys("Love and mercy church street");
		
		object.findElementByXPath("/html/body").sendKeys(Keys.PAGE_DOWN);
		
		object.findElementByName("area").sendKeys("Sarpavaram");
		
		WebElement country = object.findElementByXPath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[20]/td[2]/select");
		
		Select cou = new Select(country);
		
		cou.selectByValue("94");
		
		Thread.sleep(3000);
		
		object.findElementByName("mobile").sendKeys("9381993835");
		
		object.findElementByName("pincode").sendKeys("533005");
		
		Thread.sleep(3000);
		
		WebElement city = object.findElementByName("city");
		
		Select cit = new Select(city);
		
		cit.selectByValue("East Godavari");
		
		Thread.sleep(3000);
		
		WebElement postoffice = object.findElementByName("postOffice");
		
		Select post = new Select(postoffice);
		
		post.selectByVisibleText("Madhavapatnam B.O");*/
		
		
		
		
		
		
		
		
		
		
	}

}
