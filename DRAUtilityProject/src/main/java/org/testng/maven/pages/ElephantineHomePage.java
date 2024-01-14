package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElephantineHomePage {
	
	public WebDriver driver;
	
	public ElephantineHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[contains(text(),'Leads')]")
	private WebElement leads;
	
	@FindBy(xpath="//a[contains(text(),'Add Lead')]")
	private WebElement addLead;
	
	@FindBy(id="name")
	private WebElement firstName;
	
	@FindBy(id="email")
	private WebElement emailIdTextBox;
	
	@FindBy(id="phone")
	private WebElement mobileNumberTextBox;
	
	@FindBy(id="project_id")
	private WebElement selectProjectDropdown;
	
	@FindBy(id="cp_comments")
	private WebElement cpComments; 
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement saveButton;
	
	public WebElement getLeads() {
		return leads;
	}

	public WebElement getCpComments() {
		return cpComments;
	}

	@FindBy(xpath="//button[@class='close']//span")
	private WebElement closeBtn;
	
	@FindBy(xpath="//div[@class='alert alert-danger']/ul/li")
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
