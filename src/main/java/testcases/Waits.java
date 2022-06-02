package testcases;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Waits {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		final WebDriver object = new ChromeDriver();
		
		object.manage().window().maximize();
		
		object.get("https://www.google.com");
		
		
		object.findElement(By.name("q")).sendKeys("selenium");
		
		object.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		//Implicitwait
		//object.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//object.findElement(By.xpath("//h3[text() = 'Selenium']")).click();
		
		//Explicitwait
		//WebDriverWait mywait = new WebDriverWait(object, 10);
		
		//WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text() = 'Selenium']")));
		//element.click();
		
		//Fluentwait
		Wait<WebDriver>mywait = new FluentWait<WebDriver>(object)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		WebElement element = mywait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				
				return object.findElement(By.xpath("//h3[text() = 'Selenium']"));
			}
		});
		
		element.click();
		
		
		
		
		
		
		
	}

}
