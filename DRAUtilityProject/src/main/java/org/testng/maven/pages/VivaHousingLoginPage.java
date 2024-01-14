package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VivaHousingLoginPage {
	
	public WebDriver driver;
	
	public VivaHousingLoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="companyname")
	private WebElement companyName;
	
	public WebElement getCompanyName() {
		return companyName;
	}

	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement signInButton;
	
	@FindBy(xpath="(//a[@class='dropdown-toggle nav-link dropdown-user-link']//span)[2]")
	private WebElement signoutDropdown;
	
	@FindBy(xpath="(//a[text()='Logout'])[2]")
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
