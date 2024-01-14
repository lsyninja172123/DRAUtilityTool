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
	
	@FindBy(id="name")
	private WebElement firstName;
	
	@FindBy(id="phone")
	private WebElement mobileNumberTextBox;
	
	@FindBy(id="leadsources")
	private WebElement selectCPName;
	
	@FindBy(id="projects")
	private WebElement selectProjectTextBox;
	
	@FindBy(id="email")
	private WebElement emailIdTextBox;
	
	public WebElement getSelectProjectTextBox() {
		return selectProjectTextBox;
	}

	@FindBy(id="submitForm")
	private WebElement submitButton;
	
	@FindBy(xpath="//button[@class='close']//span")
	private WebElement closeBtn;
	
	@FindBy(id="remarks")
	private WebElement comments;
	
	@FindBy(xpath="//div[@class='noty_body']")
	private WebElement successMsg;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getComments() {
		return comments;
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

	public WebElement getSelectCPName() {
		return selectCPName;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}
	
}
