package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShriramHomePage {
	
	public WebDriver driver;
	
	public ShriramHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Partners'])[1]")
	private WebElement partnersDropDown;
	
	@FindBy(xpath="//a[text()='Channel partner Program']")
	private WebElement channelPartnerProgram;
	
	@FindBy(xpath="(//a[text()='Shriram Synergy'])[1]")
	private WebElement shriramSynergy;
	
	@FindBy(xpath="//span[text()='Hi, I am Sia. How can I help you today?']")
	private WebElement chatMsg;
	
	@FindBy(xpath="//div[@class='convbot-button']")
	private WebElement chatMsgClose;
	
	@FindBy(id="choice_9_24_0")
	private WebElement channelPartnerRadioButton;
	
	@FindBy(xpath="//span[text()='Channel Partners']")
	private WebElement channelPartnerDropDown;
	
	@FindBy(xpath="//input[@class='chosen-search-input']")
	private WebElement channelPartnerTextBox;
	
	@FindBy(id="input_9_2")
	private WebElement firstName;
	
	@FindBy(id="input_9_3")
	private WebElement emailTextBox;
	
	@FindBy(id="input_9_56")
	private WebElement countryCodeDropDown;

	@FindBy(id="input_9_4")
	private WebElement phoneNumberTextBox;
	
	@FindBy(id="input_9_57")
	private WebElement residentialStatusDropDown;
	
	@FindBy(id="input_9_58")
	private WebElement residentialCityTextBox;
	
	@FindBy(id="input_9_6")
	private WebElement projectCityDropDown;
	
	@FindBy(id="input_9_12")
	private WebElement commentTextBox;
	
	@FindBy(id="input_9_47")
	private WebElement channelPartnerEmailTextBox;
	
	@FindBy(id="input_9_48")
	private WebElement channelPartnerPhoneNumber;

	@FindBy(id="input_9_16")
	private WebElement selectProjectsDropdown;
	
	@FindBy(id="gform_submit_button_9")
	private WebElement submitButton;
	
	@FindBy(xpath="//button[text()='I Agree']")
	private WebElement disclaimerPopup;
	
	@FindBy(xpath="//div[text()='We will get back to you soon! Meanwhile you can enjoy our most read blogs.']")
	private WebElement thankyouMsg;
	
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

	public WebElement getCommentTextBox() {
		return commentTextBox;
	}

	public WebElement getChannelPartnerRadioButton() {
		return channelPartnerRadioButton;
	}

	public WebElement getChannelPartnerDropDown() {
		return channelPartnerDropDown;
	}

	public WebElement getChannelPartnerTextBox() {
		return channelPartnerTextBox;
	}

	public WebElement getCountryCodeDropDown() {
		return countryCodeDropDown;
	}

	public WebElement getResidentialStatusDropDown() {
		return residentialStatusDropDown;
	}

	public WebElement getResidentialCityTextBox() {
		return residentialCityTextBox;
	}

	public WebElement getProjectCityDropDown() {
		return projectCityDropDown;
	}

	public WebElement getChannelPartnerEmailTextBox() {
		return channelPartnerEmailTextBox;
	}

	public WebElement getChannelPartnerPhoneNumber() {
		return channelPartnerPhoneNumber;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getDisclaimerPopup() {
		return disclaimerPopup;
	}

	public WebElement getThankyouMsg() {
		return thankyouMsg;
	}

	public WebElement getPartnersDropDown() {
		return partnersDropDown;
	}

	public WebElement getChannelPartnerProgram() {
		return channelPartnerProgram;
	}

	public WebElement getShriramSynergy() {
		return shriramSynergy;
	}

	public WebElement getChatMsg() {
		return chatMsg;
	}

	public WebElement getChatMsgClose() {
		return chatMsgClose;
	}
	
}
