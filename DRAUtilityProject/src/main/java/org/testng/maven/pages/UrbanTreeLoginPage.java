package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UrbanTreeLoginPage {
	
	public WebDriver driver;
	
	public UrbanTreeLoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@class='btn btn-danger sbutton']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[@class='dropdown-toggle nav-link dropdown-user-link']")
	private WebElement signoutDropdown;
	
	@FindBy(xpath="//a[@href='logout.php']")
	private WebElement signOut;
	
	public WebElement getLoginButton() {
		return loginButton;
	}

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
	
	
}
