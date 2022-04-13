package GenericUtility;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {
	
	WebDriver driver=null;
	
	
	
	/**
	 * This method is used to open the browser with the url
	 * @param driver
	 * @param url
	 * @return
	 */
	public static WebDriver openBrowserWithUrl(WebDriver driver, String url) {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(opt);
		waitTillElement(driver);
		maximizeWindow(driver);
		
		driver.get(url);
		return driver;		
	}
	
	/**
	 * This method is used to wait implicitly
	 * @param driver
	 */
	public static void waitTillElement(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * This method is used to maximize the browser window
	 * @param driver
	 */
	public static void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used to select element by text
	 * @param element
	 * @param text
	 */
	public static void selectElementByName(WebElement element, String text) {
		Select s= new Select(element);
		s.selectByVisibleText(text);
	}
	
	/**
	 * This method is used to switch windows
	 * @param driver
	 * @param text
	 */
	public static void switchToWindow(WebDriver driver, String text) {
		Set<String> winIds = driver.getWindowHandles();
		for(String id:winIds) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(text)) {
				break;
			}
		}
	}
	
	/**
	 * This method is used to move the mouse cursor to a element
	 * @param driver
	 * @param element
	 */
	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions act= new Actions(driver);
		act.moveToElement(element);
	}

}
