package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BharathiHomesLoginPage {
	
	public WebDriver driver;
	
	public BharathiHomesLoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="j_id0:j_id2:text")
	private WebElement userName;
	
	@FindBy(name="j_id0:j_id2:j_id5")
	private WebElement loginButton;
	
	@FindBy(id="j_id0:j_id2:phone")
	private WebElement passWord;
	
	@FindBy(partialLinkText="Logout")
	private WebElement signOut;
	
	public WebElement getLoginButton() {
		return loginButton;
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
