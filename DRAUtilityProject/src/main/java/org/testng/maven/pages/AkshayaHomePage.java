package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AkshayaHomePage {
	
	public WebDriver driver;
	
	public AkshayaHomePage(WebDriver hdriver) {
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
	
	@FindBy(name="partner_name")
	private WebElement cpName;
	
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

	@FindBy(xpath="//*[@id=\"select2-drop\"]/ul/li[4]")
	private WebElement metropolisText;
	
	@FindBy(xpath="//*[@id=\"select2-drop\"]/ul/li[3]")
	private WebElement todayText;
	
	@FindBy(xpath="//*[@id=\"select2-drop\"]/ul/li[2]")
	private WebElement republicText;
	
	@FindBy(id="lead_city")
	private WebElement cityTextBox;
	
	@FindBy(id="lead_state")
	private WebElement stateTextBox;
	
	@FindBy(id="lead_country")
	private WebElement countryTextBox;
	
	@FindBy(id="lead_comment")
	private WebElement commentTextBox;
	
	@FindBy(xpath="//button[@class='btn free-crm-submit]")
	private WebElement popupMsg;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitButton;
	
	@FindBy(xpath="//p[text()='Thank you for visiting with us. ']")
	private WebElement successMsg;
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getPopupMsg() {
		return popupMsg;
	}
	
	public WebElement getRepublicText() {
		return republicText;
	}
	
	public WebElement getCityTextBox() {
		return cityTextBox;
	}

	public WebElement getStateTextBox() {
		return stateTextBox;
	}

	public WebElement getCountryTextBox() {
		return countryTextBox;
	}

	public WebElement getMetropolisText() {
		return metropolisText;
	}

	public WebElement getTodayText() {
		return todayText;
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
