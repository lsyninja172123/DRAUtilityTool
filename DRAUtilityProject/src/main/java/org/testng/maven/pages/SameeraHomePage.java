package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SameeraHomePage {
	
	public WebDriver driver;
	
	public SameeraHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Add Lead']")
	private WebElement addLead;
	
	@FindBy(id="lead_first_name")
	private WebElement firstName;
	
	@FindBy(id="lead_last_name")
	private WebElement lastName;
	
	@FindBy(xpath="//button[@name='country']")
	private WebElement countryDropdown;
	
	@FindBy(id="lead_phone")
	private WebElement mobileNumberTextBox;
	
	@FindBy(id="lead_email")
	private WebElement emailIdTextBox;
	
	@FindBy(id="lead_project_id")
	private WebElement selectProjectDropdown;
	
	@FindBy(id="lead_referral_name")
	private WebElement channalPartnerName;
	
	@FindBy(id="lead_referral_email")
	private WebElement channalPartnerEmail;
	
	@FindBy(id="lead_referral_phone")
	private WebElement channalPartnerPhNo;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath="//button[@class='close']//span")
	private WebElement closeBtn;
	
	@FindBy(xpath="//div[@class='mb-3 alert alert-danger']//ul//li")
	private WebElement alertMessage;
	
	@FindBy(xpath="//div[@class='noty_body']")
	private WebElement successMsg;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getAlertMessage() {
		return alertMessage;
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

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getMobileNumberTextBox() {
		return mobileNumberTextBox;
	}

	public WebElement getEmailIdTextBox() {
		return emailIdTextBox;
	}

	public WebElement getSelectProjectDropdown() {
		return selectProjectDropdown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getChannalPartnerName() {
		return channalPartnerName;
	}

	public WebElement getChannalPartnerEmail() {
		return channalPartnerEmail;
	}

	public WebElement getChannalPartnerPhNo() {
		return channalPartnerPhNo;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}
	
}
