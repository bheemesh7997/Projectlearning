package learning;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class panindia {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver object = new ChromeDriver();
		
		object.manage().window().maximize();
		
		object.get("https://panind.com/india/new_pan/");
		
		Thread.sleep(3000);
		
		WebElement we = object.findElementById("pan_title");
		
		Select sel = new Select(we);
		
		sel.selectByVisibleText("MR.");
		
		object.findElementByName("pan_firstname").sendKeys("Tummalapalli");
		
		object.findElementByName("pan_middlename").sendKeys("Bheemeswara");
		
		object.findElementByName("pan_lastname").sendKeys("Swamy");
		
		object.findElementById("pan_fatherfirstname").sendKeys("Tummalapalli");
		
		object.findElementById("pan_fathermiddlename").sendKeys("Naga kondala");
		
		object.findElementById("pan_fatherlastname").sendKeys("Rao");
		
		object.findElementByName("pan_mobilenumber").sendKeys("7997122853");
		
		object.findElementById("pan_email").sendKeys("bheemesh@gmail.com");
		
		WebElement salary = object.findElementByXPath("//*[@id=\"pan_sourceofincome\"]");
		
		Select sal = new Select(salary);
		
		sal.selectByVisibleText("Salary");
		
		object.findElementByName("pan_dob").sendKeys("18112001");
		
		object.findElementById("office").click();
		
		object.findElementByXPath("/html/body").sendKeys(Keys.PAGE_DOWN);
		
		object.findElementByName("pan_addressline1").sendKeys("1-80/2");
		
		object.findElementByName("pan_addressline2").sendKeys("Love and mercy church street");
		
		object.findElementByName("pan_cityname").sendKeys("kakinada");
		
		WebElement city = object.findElementByName("pan_state");
		
		Select cit = new Select(city);
		
		cit.selectByVisibleText("Andhra Pradesh");
		
		object.findElementByName("pan_pincode").sendKeys("533005");
		
		object.findElementById("pan_officename").sendKeys("Offiec");
		
		object.findElementByName("pan_officecityname").sendKeys("Kakinada");
		
		WebElement state = object.findElementByXPath("/html/body/div[2]/div/form/div[8]/div[4]/div[4]/select");
		
		Select sta = new Select(state);
		
		sta.selectByVisibleText("Andhra Pradesh");
		
		object.findElementById("pan_officepincode").sendKeys("533001");
		
		WebElement idproof = object.findElementByXPath("/html/body/div[2]/div/form/div[9]/div[3]/select");
		
		Select idp = new Select(idproof);
		
		idp.selectByValue("16");
		
		WebElement addproof = object.findElementById("pan_addressproof");
		
		Select ap = new Select(addproof);
		
		ap.selectByValue("11");
		
		WebElement dobproof = object.findElementByName("pan_DOBproof");
		
		Select dob = new Select(dobproof);
		
		dob.selectByValue("2");
		
		WebElement aadproof = object.findElementByName("pan_aadhaarproof");
		
		Select aad = new Select(aadproof);
		
		aad.selectByIndex(1);
		
		object.findElementByXPath("/html/body").sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(3000);
		
		WebElement ofcproof = object.findElementByName("pan_officeaddressproof");
		
		Select ofc = new Select(ofcproof);
		
		ofc.selectByIndex(3);
		
		object.findElementById("pan_source").click();
		
		Thread.sleep(3000);
		
		object.findElementByXPath("/html/body/div[2]/div/form/div[16]/div[2]/input[3]").click();
		
		Thread.sleep(2000);
		
		object.findElementByXPath("/html/body").sendKeys(Keys.PAGE_UP);
		
		Thread.sleep(2000);
		
		object.findElementByXPath("/html/body").sendKeys(Keys.PAGE_UP);
		
		
		
		
		
		

	}

}
