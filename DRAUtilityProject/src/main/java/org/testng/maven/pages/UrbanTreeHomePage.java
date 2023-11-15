package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UrbanTreeHomePage {
	
	public WebDriver driver;
	
	public UrbanTreeHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='ADD LEAD']")
	private WebElement addLead;
	
	@FindBy(name="fname")
	private WebElement firstName;
	
	@FindBy(name="lname")
	private WebElement lastName;
	
	@FindBy(id="select2-country-container")
	private WebElement countryDropDown;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement countrySearchField;
	
	@FindBy(id="emailId")
	private WebElement emailTextBox;
	
	@FindBy(id="mobileNo")
	private WebElement phoneNumberTextBox;
	
	@FindBy(xpath="(//span[@class='select2-selection__arrow'])[2]")
	private WebElement selectProjectsDropdown;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement selectProjectsTextBox;
	
	@FindBy(name="comments")
	private WebElement commentTextBox;
	
	@FindBy(name="submit")
	private WebElement saveButton;
	
	@FindBy(name="ftype")
	private WebElement flatDropDown;
	
	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getCountrySearchField() {
		return countrySearchField;
	}

	public WebElement getFlatDropDown() {
		return flatDropDown;
	}
	
	public WebElement getAddLead() {
		return addLead;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
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
	
	public WebElement getSelectProjectsTextBox() {
		return selectProjectsTextBox;
	}

	
	
}
