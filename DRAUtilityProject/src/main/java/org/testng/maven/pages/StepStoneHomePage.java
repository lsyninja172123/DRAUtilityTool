package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StepStoneHomePage {
	
	public WebDriver driver;
	
	public StepStoneHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='required number ph-num']")
	private WebElement reqPhoneNo;
	
	@FindBy(id="verify_phone")
	private WebElement verifyPhno;
	
	@FindBy(xpath="//p[@class='popup_text']")
	private WebElement popupMsgHomePage;
	
	@FindBy(xpath="//div[@class='popup_close']")
	private WebElement popUpCloseBtn;
	
	@FindBy(xpath="//li[text()='Asset Build Ventures']")
	private WebElement cpName;
	
	@FindBy(id="custom_cp_number")
	private WebElement cpNumber;
	
	@FindBy(id="select2-custom_cp_name-container")
	private WebElement cpTextBox;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement cpSearchField;
	
	public WebElement getCpTextBox() {
		return cpTextBox;
	}

	public WebElement getCpSearchField() {
		return cpSearchField;
	}

	public WebElement getCpNumber() {
		return cpNumber;
	}

	public WebElement getCpName() {
		return cpName;
	}

	public WebElement getPopUpCloseBtn() {
		return popUpCloseBtn;
	}

	public WebElement getPopupMsgHomePage() {
		return popupMsgHomePage;
	}

	public WebElement getVerifyPhno() {
		return verifyPhno;
	}

	public WebElement getReqPhoneNo() {
		return reqPhoneNo;
	}

	@FindBy(linkText="Leads")
	private WebElement leadsLink;
	
	@FindBy(linkText="Add a Lead")
	private WebElement addLead;
	
	@FindBy(id="svleadname")
	private WebElement firstName;
	
	@FindBy(id="lead_last_name")
	private WebElement lastName;
	
	@FindBy(xpath="//a[@class='select2-choice']")
	private WebElement emailDropdown;
	
	@FindBy(id="svleademail")
	private WebElement emailTextBox;
	
	@FindBy(id="lead_phone")
	private WebElement phoneNumberTextBox;
	
	@FindBy(name="project_id")
	private WebElement selectProjectsDropdown;
	
	@FindBy(xpath="//*[@id='select2-drop']/div/input")
	private WebElement selectProjectsTextBox;
	
	public WebElement getSelectProjectsTextBox() {
		return selectProjectsTextBox;
	}

	@FindBy(id="comments")
	private WebElement commentTextBox;
	
	@FindBy(xpath="//button[@class='btn free-crm-submit]")
	private WebElement popupMsg;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitButton;
	
	@FindBy(xpath="//span[@id='lead_id']")
	private WebElement successMsg;
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}

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

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailDropdown() {
		return emailDropdown;
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

	public WebElement getSubmitButton() {
		return submitButton;
	}

	
	
}
