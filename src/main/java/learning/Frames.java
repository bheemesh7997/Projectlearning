package learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver object = new ChromeDriver();
		
		object.manage().window().maximize();
		
		object.get("https://chercher.tech/practice/frames");
		
		Thread.sleep(3000);
		
		//WebElement fra = object.findElementByXPath("/html/body");
		
		object.switchTo().frame("frame1");
		
		object.findElementByXPath("/html/body/input").sendKeys("hello world");
		
		object.switchTo().frame("frame3");
		
		object.findElementByCssSelector("#a").click();
		
		object.switchTo().defaultContent();
		
		object.switchTo().frame("frame2");
		
		WebElement drop = object.findElementByXPath("/html/body/select");
		
		Select sel = new Select(drop);
		
		sel.selectByValue("big baby cat");
		
		object.close();
		
		
		
		
		
		
		
		
		
	}

}
