package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllianceHomePage {
	
	public WebDriver driver;
	
	public AllianceHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='kt-menu__link'])[2]")
	private WebElement leadsLink;
		
	@FindBy(xpath="//button[@class='btn btn-brand btn-elevate btn-icon-sm lead_new_btn']")
	private WebElement addLead;
	
	@FindBy(name="name")
	private WebElement firstName;
	
	@FindBy(name="email")
	private WebElement emailTextBox;
	
	@FindBy(xpath="//div[@class='iti__selected-flag']")
	private WebElement countryListBox;
	
	@FindBy(xpath="//li[@data-dial-code='91']")
	private WebElement indiaCode;
	
	@FindBy(name="contact")
	private WebElement phoneNumberTextBox;
	
	@FindBy(xpath="//select[@id='select_project']")
	private WebElement selectProjectsDropdown;
	
	@FindBy(xpath="//select[@name='sub_project']")
	private WebElement subProjectsDropdown;
	
	@FindBy(name="notes")
	private WebElement notesTextBox;
	
	@FindBy(xpath="//div[text()='Thank you for your Submission!']")
	private WebElement popupMsg;
	
	@FindBy(xpath="(//div[@class='col-sm-12']/table/tbody/tr/td[6])[1]")
	private WebElement statusMsg;
	
	public WebElement getPopupMsg() {
		return popupMsg;
	}
	
	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getAddLead() {
		return addLead;
	}

	public WebElement getFirstName() {
		return firstName;
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

	public WebElement getSubProjectsDropdown() {
		return subProjectsDropdown;
	}

	public WebElement getNotesTextBox() {
		return notesTextBox;
	}

	public WebElement getCountryListBox() {
		return countryListBox;
	}

	public WebElement getStatusMsg() {
		return statusMsg;
	}

	public WebElement getIndiaCode() {
		return indiaCode;
	}

	
	
}
