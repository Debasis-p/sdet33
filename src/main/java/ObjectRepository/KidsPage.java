package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class KidsPage {
	@FindBy(xpath = "//a[@href='/s/starting-at-rs-199-4625-8751']")
	private WebElement selectFirstSection;
	
	@FindBy(xpath = "//div[@class='sort ']/div/select")
	private WebElement sortDropDown;
	
	@FindBy(xpath = "//div[@class='imgHolder'][1]/img[@src='https://assets.ajio.com/medias/sys_master/root/20210405/gU2D/606c8542aeb269a9e383157e/gant_orange_striped_polo_t-shirt.jpg']")
	private WebElement firstItem;
	
	public KidsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectingFirstSection() {
		selectFirstSection.click();
	}
	
	public void selectingSortDropDown(String text) {
		WebDriverUtility.selectElementByName(sortDropDown, text);
	}
	
	public void clickFirstItem() {
		firstItem.click();
	}

}
