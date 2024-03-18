package org.testng.maven.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadianceHomePage {
	
	public WebDriver driver;
	
	public RadianceHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='slds-container_fluid slds-truncate'])[1]")
	private WebElement addLead;
	
	@FindBy(xpath="//button[text()='New']")
	private WebElement newButton;
	
	@FindBy(xpath="//div[@class='slds-modal__container']")
	private WebElement modelContainer;
	
	public WebElement getModelContainer() {
		return modelContainer;
	}

	@FindBy(xpath="//input[@name='lastName']")
	private WebElement firstName;
	
	@FindBy(name="lname")
	private WebElement lastName;
	
	@FindBy(xpath="//button[@name='country']")
	private WebElement countryDropdown;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement mobileNumberTextBox;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailIdTextBox;
	
	@FindBy(xpath="//button[@class='slds-combobox__input slds-input_faux']")
	private WebElement selectProjectDropdown;
	
	//(//div[@role='listbox'])[1]/lightning-base-combobox-item/span/span
	@FindBy(xpath="//div[@aria-label='Interested Project']/lightning-base-combobox-item/span/span[@class='slds-truncate']")
	private List<WebElement> projectList;
	
	public WebElement getNewButton() {
		return newButton;
	}

	public List<WebElement> getProjectList() {
		return projectList;
	}

	@FindBy(xpath="//button[contains(@aria-label,'Select an Option')]")
	private WebElement selectIntrestedProject;
	
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	private WebElement selectIntrestedProjectTextBox;
	
	public WebElement getSelectIntrestedProjectTextBox() {
		return selectIntrestedProjectTextBox;
	}

	public WebElement getSelectIntrestedProject() {
		return selectIntrestedProject;
	}

	@FindBy(name="comments")
	private WebElement commentsTextBox;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath="//button[@class='confirm']")
	private WebElement alertButton;
	
	@FindBy(xpath="//div[@class='forceVisualMessageQueue']//span[@data-aura-class='forceActionsText']")
	private WebElement alertMessage;

	public WebElement getAlertMessage() {
		return alertMessage;
	}

	public WebElement getAlertButton() {
		return alertButton;
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

	public WebElement getCommentsTextBox() {
		return commentsTextBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
}
