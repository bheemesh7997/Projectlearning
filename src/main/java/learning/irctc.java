package learning;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class irctc {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver object = new ChromeDriver();
		
		object.manage().window().maximize();
		
		object.get("https://www.irctc.co.in/nget/profile/user-registration");
		
		Thread.sleep(3000);
		
		object.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		
		Thread.sleep(3000);
		
		object.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a").click();
		
		object.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]").click();
		
		object.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a").click();
		
		Thread.sleep(5000);
		
		Set<String> allwindows = object.getWindowHandles();
		
		System.out.println(allwindows);
		
		for(String onewin : allwindows)
		{
			System.out.println(onewin);
			object.switchTo().window(onewin);
			Thread.sleep(5000);
		}
		
		WebElement station = object.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[1]/select");
		
		Select sta = new Select(station);
		
		sta.selectByValue("NDLS");
		
		Thread.sleep(3000);
		
		WebElement lounge = object.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[2]/select");
		
		Select lou = new Select(lounge);
		
		lou.selectByValue("2: Object");
		
		Thread.sleep(3000);
		
		WebElement persons = object.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[3]/select");
		
		Select per = new Select(persons);
		
		per.selectByVisibleText("3");
		
		object.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/input").click();
		
		object.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/thead/tr[1]/th[3]/span[1]/i").click();
		
		object.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/tbody/tr[1]/td[3]/span").click();
		
		WebElement time = object.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[5]/select");
		
		Select tim = new Select(time);
		
		tim.selectByVisibleText("10:00");
		
		WebElement duration = object.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[6]/select");
		
		Select dur = new Select(duration);
		
		dur.selectByVisibleText("10:00");
		
		Thread.sleep(4000);
		
		object.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[11]/button[2]").click();
		
		Thread.sleep(3000);
		
		object.findElementByXPath("/html/body/app-root/login/div/div/div/div/ul/li[2]/a").click();
		
		Thread.sleep(3000);
		
		object.findElementByXPath("/html/body/app-root/login/div/div/div/div/div/div[2]/div/form/div[1]/input").sendKeys("bheemesh7997@gmail.com");
		
		object.findElementByXPath("/html/body/app-root/login/div/div/div/div/div/div[2]/div/form/div[2]/input").sendKeys("7997122853");
		
		object.findElementByXPath("/html/body/app-root/login/div/div/div/div/div/div[2]/div/form/div[3]/button").click();
		
		Thread.sleep(3000);
		
		object.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]/input").sendKeys("T Bheemesh");
		
		object.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/input").sendKeys("21");
		
		WebElement gender1 = object.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[4]/select");
		
		Select gen1 = new Select(gender1);
		
		gen1.selectByVisibleText("Male");
		
		object.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[2]/input").sendKeys("T Tanuja");
		
		object.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[3]/input").sendKeys("26");
		
		WebElement gender2 = object.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[4]/select");
		
		Select gen2 = new Select(gender2);
		
		gen2.selectByValue("Female");
		
		object.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[2]/input").sendKeys("T Ammaji");
		
		object.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[3]/input").sendKeys("47");
		
		WebElement gender3 = object.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[4]/select");
		
		Select gen3 = new Select(gender3);
		
		gen3.selectByVisibleText("Female");
		
		object.findElementByXPath("/html/body").sendKeys(Keys.PAGE_DOWN);
		
		WebElement state = object.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[3]/form/div[3]/select");
		
		Select stat = new Select(state);
		
		stat.selectByValue("ANDHRA PRADESH");
		
		Thread.sleep(3000);
		
		object.findElementByCssSelector("body > app-root > acpassangers > div > form > div > div > div > div > div.col-12.text-center.py-2 > button:nth-child(2)").click();
		
		Thread.sleep(3000);
		
		object.findElementByXPath("/html/body").sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(3000);
		
		object.findElementByXPath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[1]/div[6]/div/label/span").click();
		
		//object.findElementByXPath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[2]/button").click();
		
		
		
		

	}

}
