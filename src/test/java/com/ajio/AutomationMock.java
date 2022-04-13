package com.ajio;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import GenericUtility.PropertyUtility;
import GenericUtility.WebDriverUtility;
import ObjectRepository.CartPage;
import ObjectRepository.HomePage;
import ObjectRepository.KidsPage;
import ObjectRepository.ProductPage;

public class AutomationMock {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= null;
		
		PropertyUtility.initalizeProperty();
		String url= PropertyUtility.getPropertyData("url");
		
		driver= WebDriverUtility.openBrowserWithUrl(driver, url);
		
		
		HomePage homepage= new HomePage(driver);
		KidsPage kidsPage = new KidsPage(driver);
		ProductPage productPage= new ProductPage(driver);
		CartPage cartPage= new CartPage(driver);
	
		homepage.clickKidsTab();
		kidsPage.selectingFirstSection();
		kidsPage.selectingSortDropDown("Price (highest first)");
		kidsPage.clickFirstItem();
		WebDriverUtility.switchToWindow(driver, "orange");
		productPage.selectingSize();
		productPage.clickAddToCartButton();
		Thread.sleep(3000);
		productPage.moveCursor(driver);
		Thread.sleep(3000);
		cartPage.clickDeletebutton();
		
		
		
		
		
	}
}
