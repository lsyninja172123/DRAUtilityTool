package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RislandHomePage {
	
	public WebDriver driver;
	
	public RislandHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="entry.350486477")
	private WebElement customerName;
	
	@FindBy(name="entry.350486477")
	private WebElement emailID;
	
	@FindBy(name="entry.1999963546")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div[2]/div/label/div/div[1]/div[3]")
	private WebElement twoBHKCheckBox;
	
	@FindBy(xpath="//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div[2]/div/label/div/div[1]/div[3]")
	private WebElement investmentCheckBox;
	
	@FindBy(xpath="//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div[1]/div/label/div/div[1]/div[3]")
	private WebElement budgetCheckBox;
	
	@FindBy(xpath="//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div/div[3]/div")
	private WebElement ownHouseCheckBox;
	
	@FindBy(xpath="//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div[1]/div/label/div/div[1]/div[3]")
	private WebElement salariedCheckBox;
	
	@FindBy(xpath="//span[text()='Submit']")
	private WebElement submitButton;

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getEmailID() {
		return emailID;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getTwoBHKCheckBox() {
		return twoBHKCheckBox;
	}

	public WebElement getInvestmentCheckBox() {
		return investmentCheckBox;
	}

	public WebElement getBudgetCheckBox() {
		return budgetCheckBox;
	}

	public WebElement getOwnHouseCheckBox() {
		return ownHouseCheckBox;
	}

	public WebElement getSalariedCheckBox() {
		return salariedCheckBox;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	
	
	
}
