package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AkshayaLoginPage {
	
	public WebDriver driver;
	
	public AkshayaLoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_email")
	private WebElement userName;
	
	@FindBy(id="user_password")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement signInButton;
	
	@FindBy(xpath="//b[@class='caret']")
	private WebElement signoutDropdown;
	
	@FindBy(linkText="Sign Out")
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
