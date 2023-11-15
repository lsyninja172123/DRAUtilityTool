package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BharathiHomesHomePage {
	
	public WebDriver driver;
	
	public BharathiHomesHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="j_id0:formid:j_id4")
	private WebElement name;
	
	@FindBy(id="j_id0:formid:j_id6")
	private WebElement emailTextBox;
	
	@FindBy(id="j_id0:formid:j_id8")
	private WebElement phoneNumberTextBox;
	
	@FindBy(name="j_id0:formid:j_id10")
	private WebElement selectProjectsDropdown;
	
	@FindBy(id="j_id0:formid:j_id13")
	private WebElement locationTextBox;
	
	@FindBy(id="j_id0:formid:j_id15")
	private WebElement budgetTextBox;
	
	@FindBy(id="j_id0:formid:j_id17")
	private WebElement commentTextBox;
	
	@FindBy(id="j_id0:formid:j_id23")
	private WebElement saveButton;
	
	@FindBy(xpath="//span[@id='j_id0:formid:j_id18']")
	private WebElement statusMessage;
	
	@FindBy(xpath="//span[@id='j_id0:formid:j_id20']//b")
	private WebElement statusMessageAlreadyExist;
	
	
	
	
	public WebElement getStatusMessageAlreadyExist() {
		return statusMessageAlreadyExist;
	}

	public WebElement getStatusMessage() {
		return statusMessage;
	}
	
	public WebElement getName() {
		return name;
	}

	public WebElement getLocationTextBox() {
		return locationTextBox;
	}

	public WebElement getBudgetTextBox() {
		return budgetTextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPhoneNumberTextBox() {
		return phoneNumberTextBox;
	}

	public WebElement getSelectProjectsDropdown() {
		return selectProjectsDropdown;
	}

	public WebElement getCommentTextBox() {
		return commentTextBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	
	
}
