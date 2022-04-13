package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductPage {
	
	@FindBy(xpath = "//span[text()='9-10Y']")
	private WebElement selectSize;
	
	@FindBy(xpath = "(//button[text()=' Next'])[2]")
	private WebElement nextButton;
	
	@FindBy(className = "ic-pdp-add-cart")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "//div[@class='ic-cart ']")
	private WebElement cartButton;
	
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickNextButton() {
		nextButton.click();
	}
	
	public void selectingSize() {
		clickNextButton();
		selectSize.click();
	}
	
	public void clickAddToCartButton() {
		addToCartBtn.click();
	}
	
	public void moveCursor(WebDriver driver) {
		cartButton.click();
	}

}
