package wrappers;


import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Genericwrappers extends Report_methods implements Wrappers_i {

	RemoteWebDriver object = null; 
	
	public void invokeApp(String browser, String url) {
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				object = new ChromeDriver();
				
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("Webdriver.firefox.driver", "./drivers/geckodriver.exe");
				object = new FirefoxDriver();
				
			}else if (browser.equalsIgnoreCase("internet explorer")) {
				System.setProperty("Webdriver.internetexplorer.driver", "./drivers/IEdriver.exe");
				object = new FirefoxDriver();
			}
			

			
			//System.err.println("The browser launched successfully");
			logstatus("PASS", "The browser launched successfully");
		}catch (NoSuchSessionException e) {
			//System.err.println("The browser session not created");
			logstatus("FAIL", "There is no such type of session");
		}catch(SessionNotCreatedException e) {
			//System.err.println("The browser session not created");
			logstatus("FAIL", "The session was not created");
		}catch(WebDriverException e) {
			//System.err.println("The browser not launched");
			logstatus("FAIL", "The browser not launched");
		}
		object.manage().window().maximize();
		object.get(url);
	} 

	@Override
	public void enterById(String idValue, String data) {
		
		try {
			object.findElementById(idValue).sendKeys(data);
			System.err.println("Data entered successfully");
		} catch (NoSuchElementException e) {
			System.err.println("There is no such element in the application"+idValue);
		} catch (ElementNotInteractableException e) {
			System.err.println("Element not interactable in the application"+idValue);
		} catch (ElementNotSelectableException e) {
			System.err.println("Element can not be selectable in the application"+idValue);
		} catch (WebDriverException e) {
			System.err.println("Data is not entered in the text field because of webdriver exception"+idValue);
		}

	}

	@Override
	public void enterByName(String nameValue, String data) {
		
		try {
			object.findElementByName(nameValue).sendKeys(data);
			System.err.println("Data entered successfully");
		} catch (NoSuchElementException e) {
			System.err.println("There is no such element in the application"+nameValue);
		} catch (ElementNotInteractableException e) {
			System.err.println("Element not interactable in the application"+nameValue);
		} catch (ElementNotSelectableException e) {
			System.err.println("Element can not be selectable in the application"+nameValue);
		} catch (WebDriverException e) {
			System.err.println("Data is not entered in the text field because of webdriver exception"+nameValue);
		}
}
		

	public void enterByCssSelector(String value, String data) {
		
		try {
			object.findElementByCssSelector(value).sendKeys(data);
			System.err.println("Data entered successfully");
		} catch (NoSuchElementException e) {
			System.err.println("There is no such element in the application"+value);
		} catch (ElementNotInteractableException e) {
			System.err.println("Element not interactable in the application"+value);
		} catch (ElementNotSelectableException e) {
			System.err.println("Element can not be selectable in the application"+value);
		} catch (WebDriverException e) {
			System.err.println("Data is not entered in the text field because of webdriver exception"+value);
		}
	}
	
	
	@Override
	public void enterByXpath(String xpathValue, String data) {
		
		try {
			object.findElementByXPath(xpathValue).sendKeys(data);
			System.err.println("Data entered successfully");
		} catch (NoSuchElementException e) {
			System.err.println("There is no such element in the application"+xpathValue);
		} catch (ElementNotInteractableException e) {
			System.err.println("Element not interactable in the application"+xpathValue);
		} catch (ElementNotSelectableException e) {
			System.err.println("Element can not be selectable in the application"+xpathValue);
		} catch (StaleElementReferenceException e) {
			System.err.println("Element is not stable in the application"+ xpathValue);
		} catch (WebDriverException e) {
			System.err.println("Data is not entered in the text field because of webdriver exception"+xpathValue);
		}
	}

	@Override
	public void verifyTitle(String title) {
		
		try {
			String Actualtitle = object.getTitle();
			if(Actualtitle.equals(title)) {
				System.out.println("The title was matched");
			}else {
				System.out.println("Title not matched");
			}
		} catch (WebDriverException e) {
			System.err.println("Not getting title because of webdriver exception");
		}
		
	}

	@Override
	public void verifyTextById(String id, String text) {
		
		try {
			String Actualtext = object.findElementById(id).getText();
			if(Actualtext.equals(text)) {
				System.out.println("Text matched");
			}else {
				System.out.println("Text not matched");
			}
			} catch (NoSuchElementException e) {
				System.err.println("There is no such element in the application"+id);
			} catch (ElementNotInteractableException e) {
				System.err.println("Element not interactable in the application"+id);
			} catch (ElementNotSelectableException e) {
				System.err.println("Element can not be selectable in the application"+id);
			} catch (StaleElementReferenceException e) {
				System.err.println("Element is not stable in the application"+ id);
			}catch (WebDriverException e) {
				System.err.println("Text not verified because of webdriver exception"+id);
			}
		
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		
		try {
			String Actualtext = object.findElementByXPath(xpath).getText();
			if(Actualtext.equals(text)) {
				System.out.println("Text matched");
			}else {
				System.out.println("Text not matched");
			}
		} catch (NoSuchElementException e) {
			System.err.println("There is no such element in the application"+xpath);
		} catch (ElementNotInteractableException e) {
			System.err.println("Element not interactable in the application"+xpath);
		} catch (ElementNotSelectableException e) {
			System.err.println("Element can not be selectable in the application"+xpath);
		} catch (StaleElementReferenceException e) {
			System.err.println("Element is not stable in the application"+ xpath);
		}catch (WebDriverException e) {
			System.err.println("Text not verified because of webdriver exceptionr"+xpath);
		}
		
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		
		try {
			String Actualtext = object.findElementByXPath(xpath).getText();
			if(Actualtext.contains(text)) {
				System.out.println("Actualtext contains the given text");
			}else {
				System.out.println("Actualtext does not contains the given text");
			}
		} catch (NoSuchElementException e) {
			System.err.println("There is no such element in the application"+xpath);
		} catch (ElementNotInteractableException e) {
			System.err.println("Element not interactable in the application"+xpath);
		} catch (ElementNotSelectableException e) {
			System.err.println("Element can not be selectable in the application"+xpath);
		} catch (StaleElementReferenceException e) {
			System.err.println("Element is not stable in the application"+ xpath);
		}catch (WebDriverException e) {
			System.err.println("Text not verified because of webdriver exception"+xpath);
		}
		
	}

	@Override
	public void clickById(String id) {

		try {
			object.findElementById(id).click();
			System.err.println("Element clicked successfully");
		}catch (NoSuchElementException e) {
			System.err.println("There is no such element in the application"+id);
		} catch (ElementNotSelectableException e) {
			System.err.println("Element can not be selectable in the application"+id);
		} catch (StaleElementReferenceException e) {
			System.err.println("Element is not stable in the application"+ id);
		} catch (ElementClickInterceptedException e) {
			System.err.println("Element not interactable in the application"+id);
		} catch (WebDriverException e) {
			System.err.println("Element is not clicked because of webdriver exception"+id);
		}
		
	}

	@Override
	public void clickByClassName(String classVal) {
		
		try {
			object.findElementByClassName(classVal).click();
			System.err.println("Element clicked successfully");
		} catch (NoSuchElementException e) {
			System.err.println("There is no such element in the application"+classVal);
		} catch (ElementNotSelectableException e) {
			System.err.println("Element can not be selectable in the application"+classVal);
		} catch (StaleElementReferenceException e) {
			System.err.println("Element is not stable in the application"+ classVal);
		} catch (ElementClickInterceptedException e) {
			System.err.println("Element not interactable in the application"+classVal);
		} catch (WebDriverException e) {
			System.err.println("Element is not clicked because of webdriver exception"+classVal);
		}
	}
		
	public void clickByCssSelector(String classVal) {
		
		try {
			object.findElementByCssSelector(classVal).click();
			System.err.println("Element clicked successfully");
		} catch (NoSuchElementException e) {
			System.err.println("There is no such element in the application"+classVal);
		} catch (ElementNotSelectableException e) {
			System.err.println("Element can not be selectable in the application"+classVal);
		} catch (StaleElementReferenceException e) {
			System.err.println("Element is not stable in the application"+ classVal);
		} catch (ElementClickInterceptedException e) {
			System.err.println("Element not interactable in the application"+classVal);
		} catch (WebDriverException e) {
			System.err.println("Element is not clicked because of webdriver exception"+classVal);
		}
	}
	
	@Override
	public void clickByName(String name) {
		
		try {
			object.findElementByName(name).click();
			System.err.println("Element clicked successfully");
	} catch (NoSuchElementException e) {
		System.err.println("There is no such element in the application"+name);
	} catch (ElementNotSelectableException e) {
		System.err.println("Element can not be selectable in the application"+name);
	} catch (StaleElementReferenceException e) {
		System.err.println("Element is not stable in the application"+ name);
	} catch (ElementClickInterceptedException e) {
		System.err.println("Element not interactable in the application"+name);
	} catch (WebDriverException e) {
		System.err.println("Element is not clicked because of webdriver exception"+name);
	}
		
	}

	@Override
	public void clickByLink(String name) throws IOException {
		
		try {
			object.findElementByLinkText(name).click();
		 System.err.println("Element clicked successfully");
	} catch (NoSuchElementException e) {
		System.err.println("There is no such element in the application"+name);
	} catch (ElementNotSelectableException e) {
		System.err.println("Element can not be selectable in the application"+name);
	} catch (StaleElementReferenceException e) {
		System.err.println("Element is not stable in the application"+ name);
	} catch (ElementClickInterceptedException e) {
		System.err.println("Element not interactable in the application"+name);
	} catch (WebDriverException e) {
		System.err.println("Element is not clicked because of webdriver exception"+name);
	}
		
		
		File screen = object.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/snap.jpeg");
		FileUtils.copyFile(screen, dest);
	}
	

	@Override
	public void clickByLinkNoSnap(String name) {
		
	
	try {
		object.findElementByLinkText(name).click();
		System.err.println("Element clicked successfully");
	} catch (NoSuchElementException e) {
		System.err.println("There is no such element in the application"+name);
	} catch (ElementNotSelectableException e) {
		System.err.println("Element can not be selectable in the application"+name);
	} catch (StaleElementReferenceException e) {
		System.err.println("Element is not stable in the application"+ name);
	} catch (ElementClickInterceptedException e) {
		System.err.println("Element not interactable in the application"+name);
	} catch (WebDriverException e) {
		System.err.println("Element is not clicked because of webdriver exception"+name);
	}
	}
	

	@Override
	public void clickByXpath(String xpathVal) {
		
		try {
			object.findElementByXPath(xpathVal).click();
			
		 System.err.println("Element clicked successfully");
	} catch (NoSuchElementException e) {
		System.err.println("There is no such element in the application"+xpathVal);
	} catch (ElementNotSelectableException e) {
		System.err.println("Element can not be selectable in the application"+xpathVal);
	} catch (StaleElementReferenceException e) {
		System.err.println("Element is not stable in the application"+ xpathVal);
	} catch (ElementClickInterceptedException e) {
		System.err.println("Element not interactable in the application"+xpathVal);
	} catch (WebDriverException e) {
		System.err.println("Element is not clicked because of webdriver exception"+xpathVal);
	}
	}
	
		
	
		


	@Override
	public void clickByXpathNoSnap(String xpathVal) {

		
		try {
			object.findElementByXPath(xpathVal).click();
		 System.err.println("Element clicked successfully");
	} catch (NoSuchElementException e) {
		System.err.println("There is no such element in the application"+xpathVal);
	} catch (ElementNotSelectableException e) {
		System.err.println("Element can not be selectable in the application"+xpathVal);
	} catch (StaleElementReferenceException e) {
		System.err.println("Element is not stable in the application"+ xpathVal);
	} catch (ElementClickInterceptedException e) {
		System.err.println("Element not interactable in the application"+xpathVal);
	} catch (WebDriverException e) {
		System.err.println("Element is not clicked because of webdriver exception"+xpathVal);
	}
	}

	@Override
	public String getTextById(String idVal) {
		
		String Text = object.findElementById(idVal).getText();
		return Text;
	}

	@Override
	public String getTextByXpath(String xpathVal) {

		String Text = object.findElementByXPath(xpathVal).getText();
		return Text;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		
		WebElement dropdown = object.findElementById(id);
		Select drop = new Select(dropdown);
		drop.selectByVisibleText(value);
		
	}
	
	public void selectVisibileTextByxpath(String xpathVal , String value) {
		
		WebElement dropdown = object.findElementByXPath(xpathVal);
		Select drop = new Select(dropdown);
		drop.selectByVisibleText(value);
		
	}

	@Override
	public void selectIndexById(String id, int value) {

		WebElement dropdwon = object.findElementById(id);
		Select drop = new Select(dropdwon);
		drop.selectByIndex(value);
		
	}
	
	public void selectValueByXpath(String xpathVal, String value) {

		WebElement dropdwon = object.findElementByXPath(xpathVal);
		Select drop = new Select(dropdwon);
		drop.selectByValue(value);
		
	}
	
	public void selectValueByID(String ID, String value) {

		WebElement dropdwon = object.findElementById(ID);
		Select drop = new Select(dropdwon);
		drop.selectByValue(value);
		
	}
	
	public void selectValueByName(String name, String value) {

		WebElement dropdwon = object.findElementByName(name);
		Select drop = new Select(dropdwon);
		drop.selectByValue(value);
	
	}
	
	@Override
	public void switchToParentWindow() {
		
		object.switchTo().parentFrame();
		
	}

	@Override
	public void switchToLastWindow() {
		
		Set<String> allwindows = object.getWindowHandles();
		System.out.println(allwindows);
		for (String onewin : allwindows)
		{
			System.out.println(onewin);
			object.switchTo().window(onewin);
			
		}
	}

	@Override
	public void acceptAlert() {
		
		String Text = object.switchTo().alert().getText();
		System.out.println(Text);
		object.switchTo().alert().accept();
		
	}

	@Override
	public void dismissAlert() {
		
		String Text = object.switchTo().alert().getText();
		System.out.println(Text);
		object.switchTo().alert().dismiss();
		
	}

	@Override
	public String getAlertText() {
		String Text = object.switchTo().alert().getText();
		return Text;
	}

	@Override
	public void takeSnap() throws IOException {
		
		File screen = object.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/snap.jpeg");
		FileUtils.copyFile(screen, dest);
		
	}

	public void closeBrowser() {
		
	object.close();
		
	}

	@Override
	public void closeAllBrowsers() {
		
		object.quit();
		
	}
	
	public void pagedown() {
		
		
	}
	
	public void switchToFrameByXPath(String xpathValue) {
		
		WebElement Frame = object.findElementByXPath(xpathValue);
		object.switchTo().frame(Frame);
				
	}
	
	public void switchToDefaultContentpage() {
		
		object.switchTo().defaultContent();
		
	}


}
