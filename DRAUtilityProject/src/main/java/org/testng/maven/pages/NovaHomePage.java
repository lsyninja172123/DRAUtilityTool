package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NovaHomePage {
	
	public WebDriver driver;
	
	public NovaHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//strong[text()='Enquiries'])[1]")
	private WebElement enquriesLink;
	
	@FindBy(xpath="//strong[text()='Add Enquiry']")
	private WebElement addEnquiry;
	
	public WebElement getAddEnquiry() {
		return addEnquiry;
	}

	public WebElement getEnquriesLink() {
		return enquriesLink;
	}

	@FindBy(xpath="//button[@class='btn addButton']")
	private WebElement addLead;
	
	@FindBy(id="Appointments_editView_fieldName_contactname")
	private WebElement firstName;
	
	@FindBy(id="Appointments_editView_fieldName_mobile")
	private WebElement mobileNumberTextBox;
	
	@FindBy(xpath="//table[@class='table table-bordered blockContainer showInlineTable equalSplit']/tbody/tr[2]/td[2]/div/span/div/a/div")
	private WebElement selectProjectDropdown;
	
	@FindBy(xpath="(//div[@class='chzn-drop']//div//input[@type='text'])[3]")
	private WebElement selectProjectTextBox;
	
	@FindBy(id="Appointments_editView_fieldName_email")
	private WebElement emailIdTextBox;
	
	public WebElement getSelectProjectTextBox() {
		return selectProjectTextBox;
	}

	@FindBy(xpath="(//button[@class='btn btn-success'])[1]")
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
