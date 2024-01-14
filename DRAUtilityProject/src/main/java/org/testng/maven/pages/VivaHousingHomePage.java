package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VivaHousingHomePage {
	
	public WebDriver driver;
	
	public VivaHousingHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//i[text()='shopping_cart_checkout'])[3]")
	private WebElement enquriesLink;
	
	@FindBy(xpath="//a[@data-original-title='Add Enquiry']")
	private WebElement addEnquiry;
	
	public WebElement getAddEnquiry() {
		return addEnquiry;
	}

	public WebElement getEnquriesLink() {
		return enquriesLink;
	}

	@FindBy(xpath="//input[@name='enquiry_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='enquiry_mobileno']")
	private WebElement mobileNumberTextBox;
	
	@FindBy(xpath="//select[@name='enquiry_preferredlocation']")
	private WebElement selectProjectDropdown;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement selectProjectTextBox;
	
	@FindBy(xpath="//input[@name='enquiry_email']")
	private WebElement emailIdTextBox;
	
	@FindBy(xpath="//textarea[@name='enquiry_description']")
	private WebElement descriptionTextBox;
	
	public WebElement getDescriptionTextBox() {
		return descriptionTextBox;
	}

	public WebElement getSelectProjectTextBox() {
		return selectProjectTextBox;
	}

	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath="//h3[text()='Enquiry Detail View']")
	private WebElement enquiryDetailView;
	
	@FindBy(xpath="//h3[text()='Enquiry Detail View']//following-sibling::h3")
	private WebElement enquiryNumber;
	
	
	public WebElement getEnquiryNumber() {
		return enquiryNumber;
	}

	public WebElement getEnquiryDetailView() {
		return enquiryDetailView;
	}

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

	public WebElement getFirstName() {
		return firstName;
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

	public WebElement getCloseBtn() {
		return closeBtn;
	}
	
}
