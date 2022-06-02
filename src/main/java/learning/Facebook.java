package learning;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver object = new ChromeDriver();
		
		object.manage().window().maximize();
		
		object.get("https://www.facebook.com");
		
		
		
		object.findElementByXPath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a").click();
		
		Thread.sleep(3000);
		
		object.findElementByName("firstname").sendKeys("tummalapalli");
		
		object.findElementByName("lastname").sendKeys("bheemesh");
		
		object.findElementByName("reg_email__").sendKeys("7997122851");
		
		object.findElementById("password_step_input").sendKeys("bheem@7997");
		
		WebElement we = object.findElementByName("birthday_day");
		
		Select sel = new Select(we);
		
		sel.selectByVisibleText("18");
		
		WebElement demo = object.findElementByName("birthday_month");
		
		Select sele = new Select(demo);
		
		sele.selectByVisibleText("Nov");
		
		WebElement y = object.findElementByName("birthday_year");
		
		Select selec = new Select(y);
		
		selec.selectByVisibleText("2001");
		
		object.findElementByXPath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input").click();
		
		object.findElementByName("websubmit").click();
				
				
				
				
				
	}

}
