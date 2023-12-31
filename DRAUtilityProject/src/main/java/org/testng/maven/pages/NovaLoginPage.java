package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NovaLoginPage {
	
	public WebDriver driver;
	
	public NovaLoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@class='btn btn-danger sbutton']")
	private WebElement signInButton;
	
	@FindBy(xpath="//a[@id='menubar_item_right_LBL_CRM_SETTINGS']")
	private WebElement signoutDropdown;
	
	@FindBy(xpath="//a[@id='menubar_item_right_LBL_SIGN_OUT']")
	private WebElement signOut;

	public WebElement getSignoutDropdown() {
		return signoutDropdown;
	}

	public WebElement getSignOut() {
		return signOut;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	
	
}
