package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//a[text()='KIDS']")
	private WebElement kidsTab;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public void clickKidsTab() {
		kidsTab.click();
	}
	
	

}
