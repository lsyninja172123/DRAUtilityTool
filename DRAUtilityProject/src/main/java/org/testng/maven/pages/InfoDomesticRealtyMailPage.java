package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoDomesticRealtyMailPage {
	
	public WebDriver driver;
	
	public InfoDomesticRealtyMailPage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='domesticreality82@gmail.com']")
	private WebElement fromAddress;
	
	@FindBy(xpath="(//a[@href='http://99acres.com'])[1]")
	private WebElement forwardedFromAddress;
	
	@FindBy(xpath="//*[@id=\"message-htmlpart1\"]/div/div/div[2]/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table[1]/tbody/tr[1]/td/b/text()[1]")
	private WebElement commentsMessage;
	
	@FindBy(xpath="//*[@id=\"message-htmlpart1\"]/div/div/div[2]/div[2]/table/tbody/tr/td/table/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/text()[1]")
	private WebElement customerName;
	
	@FindBy(xpath="//*[@id=\"message-htmlpart1\"]/div/div/div[2]/div[2]/table/tbody/tr/td/table/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/a")
	private WebElement customerMailID;
	

	

	
	
}
