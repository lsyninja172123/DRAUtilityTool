package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SameeraLoginPage {
	
	public WebDriver driver;
	
	public SameeraLoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	private WebElement userName;
	
	@FindBy(id="user_password")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@value='Sign In']")
	private WebElement signInButton;
	
	@FindBy(xpath="//a[@id='navbarDropdown']")
	private WebElement signoutDropdown;
	
	@FindBy(xpath="//a[text()='Sign Out']")
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
