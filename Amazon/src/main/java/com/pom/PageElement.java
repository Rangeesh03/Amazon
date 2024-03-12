package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageElement {

	WebDriver driver;

	public PageElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchButton;
	@FindBy(xpath = "//span[.='Apple iPhone 13 (128GB) - Blue']")
	private WebElement iphone_13;
	
	@FindBy(xpath = "//span[.='Apple iPhone 14 (128 GB) - Purple']")
	private WebElement iphone_14;
	
	@FindBy(xpath = "//span[.='Precision 6 Basketball Shoes']")
	private WebElement nike;
	
	@FindBy(xpath = "//span[.='Mens Run Steady M Running Shoe']")
	private WebElement adidas;
	
	
	@FindBy(xpath = "//div[@class='a-section a-spacing-none aok-align-center aok-relative']/span[2]")
	private WebElement discount;

	public WebElement getSearchBox() {
		return searchBox;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}


	public WebElement getIphone_13() {
		return iphone_13;
	}


	public WebElement getIphone_14() {
		return iphone_14;
	}


	public WebElement getNike() {
		return nike;
	}


	public WebElement getAdidas() {
		return adidas;
	}


	public WebElement getDiscount() {
		return discount;
	}


}
