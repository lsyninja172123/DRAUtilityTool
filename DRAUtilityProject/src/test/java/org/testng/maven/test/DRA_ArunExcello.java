package org.testng.maven.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.maven.pages.CasaGrandeHomePage;
import org.testng.maven.pages.CasaGrandeLoginPage;
import org.testng.maven.pages.RadianceHomePage;
import org.testng.maven.pages.RadianceLoginPage;
import org.testng.maven.pages.SameeraHomePage;
import org.testng.maven.pages.SameeraLoginPage;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

@SuppressWarnings("unused")
public class DRA_ArunExcello extends BaseClass {

	public static WebDriver driver;
	static String companyFilePath = "C:\\Users\\DELL\\Desktop\\DRAUtility\\Login Details.xls";
	static String leadsFilePath = "C:\\Users\\DELL\\Desktop\\DRAUtility\\Contact Details.xls";
	static String companyName;
	static String to;
	static String cc;
	static String websiteUrl;
	static String userName;
	static String password;
	static String leadName;
	static String leadEmailID;
	static String leadPhoneNumber;
	static String leadProject;
	static String LeadBudget;
	static String leadLocation;
	static String leadCity;
	static String leadState;
	static String leadCountry;
	static String leadComments;
	static String channelPartnerName;
	static String channelPartnerMobileNumber;
	static String channelPartnerEmail;
	static String statusMessage;
	static String outputExcelFile;
	static Date date = new Date();
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

	public static void browserLaunch() throws Exception {

		driver = getBrowser("chrome");
	}

	public static void browserQuit() throws Exception {

		driverQuit();
	}

	@AfterMethod // AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult arunExcelloResult) {
		// using ITestResult.FAILURE is equals to result.getStatus then it enter into if
		// condition
		if (ITestResult.FAILURE == arunExcelloResult.getStatus()) {
			try {
				// To create reference of TakesScreenshot
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				// Call method to capture screenshot
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				// Copy files to specific location
				// result.getName() will return name of test case so that screenshot name will
				// be same as test case name
				FileUtils.copyFile(src,
						new File(System.getProperty("user.dir").concat(arunExcelloResult.getName() + ".png")));
				System.out.println("Successfully captured a screenshot");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
	}

	public static String arunExcelloTest(String companyFilePath, String leadsFilePath) throws Exception {

		try {
			browserLaunch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		SameeraLoginPage slp = new SameeraLoginPage(driver);
		SameeraHomePage shp = new SameeraHomePage(driver);

		File companyDetails = new File(companyFilePath);
		Workbook companyDetailsWorkbook = Workbook.getWorkbook(companyDetails);
		Sheet companyDetailsWorksheet = companyDetailsWorkbook.getSheet(0);
		int companyDetailsTotalNoOfRows = companyDetailsWorksheet.getRows();

		File leadDetails = new File(leadsFilePath);
		Workbook leadDetailsWorkbook = Workbook.getWorkbook(leadDetails);
		Sheet leadDetailsWorksheet = leadDetailsWorkbook.getSheet(0);
		int leadDetailsTotalNoOfRows = leadDetailsWorksheet.getRows();

		// outputExcelFile = "C:\\Users\\LAKSHMI SRI\\Desktop\\DRAUtility\\Domestic
		// Reality\\Reports\\"
		// .concat("RadianceReport_" + dateFormat.format(date) + ".xls");
		outputExcelFile = System.getProperty("user.dir").concat("ArunExcelloReport_" + dateFormat.format(date) + ".xls");
		WritableWorkbook outputFileWorkbook = Workbook.createWorkbook(new File(outputExcelFile));
		WritableSheet outputFileWorksheet = outputFileWorkbook.createSheet("ArunExcello", 0);

		List<String> companyNameList = new ArrayList<String>();
		List<String> toList = new ArrayList<String>();
		List<String> ccList = new ArrayList<String>();
		List<String> websiteUrlList = new ArrayList<String>();
		List<String> userNameList = new ArrayList<String>();
		List<String> passwordList = new ArrayList<String>();

		List<String> leadNameList = new ArrayList<String>();
		List<String> leadEmailIDList = new ArrayList<String>();
		List<String> leadPhoneNumberList = new ArrayList<String>();
		List<String> leadProjectList = new ArrayList<String>();
		List<String> leadCasaGrandeProjectList = new ArrayList<String>();
		List<String> leadRadianceProjectList = new ArrayList<String>();
		List<String> leadCityList = new ArrayList<String>();
		List<String> leadStateList = new ArrayList<String>();
		List<String> leadCountryList = new ArrayList<String>();
		List<String> leadCommentsList = new ArrayList<String>();
		List<String> leadStatusList = new ArrayList<String>();

		for (int row = 1; row < companyDetailsTotalNoOfRows; row++) {
			companyName = companyDetailsWorksheet.getCell(0, row).getContents().trim();
			to = companyDetailsWorksheet.getCell(1, row).getContents().trim();
			cc = companyDetailsWorksheet.getCell(2, row).getContents().trim();
			websiteUrl = companyDetailsWorksheet.getCell(3, row).getContents().trim();
			userName = companyDetailsWorksheet.getCell(4, row).getContents().trim();
			password = companyDetailsWorksheet.getCell(5, row).getContents().trim();

			companyNameList.add(companyName);
			toList.add(to);
			ccList.add(cc);
			websiteUrlList.add(websiteUrl);
			userNameList.add(userName);
			passwordList.add(password);

			switch (companyName) {
			case "Arun Excello":

				JavascriptExecutor executor = (JavascriptExecutor) driver;

				try {
					System.out.println("Inside switch url:" + websiteUrl);
					getUrl(websiteUrl);
					System.out.println("Inside switch userName :" + userName);
					System.out.println("Inside switch password:" + password);

					inputValue(slp.getUserName(), userName);
					inputValue(slp.getPassWord(), password);
					elementClick(slp.getSignInButton());
					Thread.sleep(10000);
					
				} catch (Exception e) {
					e.printStackTrace();
				}

				for (int rows = 1; rows < leadDetailsTotalNoOfRows; rows++) {
					System.out.println("Total Lead : " + leadDetailsTotalNoOfRows);
					leadName = leadDetailsWorksheet.getCell(0, rows).getContents().trim();
					leadEmailID = leadDetailsWorksheet.getCell(1, rows).getContents().trim();
					leadPhoneNumber = leadDetailsWorksheet.getCell(2, rows).getContents().trim();
					leadProject = leadDetailsWorksheet.getCell(3, rows).getContents().trim();
					LeadBudget = leadDetailsWorksheet.getCell(4, rows).getContents().trim();
					leadLocation = leadDetailsWorksheet.getCell(5, rows).getContents().trim();
					leadCity = leadDetailsWorksheet.getCell(6, rows).getContents().trim();
					leadState = leadDetailsWorksheet.getCell(7, rows).getContents().trim();
					leadCountry = leadDetailsWorksheet.getCell(8, rows).getContents().trim();
					leadComments = leadDetailsWorksheet.getCell(9, rows).getContents().trim();
					channelPartnerName = leadDetailsWorksheet.getCell(10, rows).getContents().trim();
					channelPartnerMobileNumber = leadDetailsWorksheet.getCell(11, rows).getContents().trim();
					channelPartnerEmail = leadDetailsWorksheet.getCell(12, rows).getContents().trim();

					leadNameList.add(leadName);
					leadEmailIDList.add(leadEmailID);
					leadPhoneNumberList.add(leadPhoneNumber);
					leadProjectList.add(leadProject);
					leadCityList.add(leadCity);
					leadStateList.add(leadState);
					leadCountryList.add(leadCountry);
					leadCommentsList.add(leadComments);

					try {
						
						WebDriverWait wait = new WebDriverWait(driver, 30);
						
						elementClick(shp.getLeadActivities());
						
						
						if (shp.getAddLead().isDisplayed()) {
							executor.executeScript("arguments[0].click();", shp.getAddLead());
							Thread.sleep(2000);
						}
						
						elementClear(shp.getFirstName());
						elementClick(shp.getFirstName());
						System.out.println("After clicking First name textbox");
						inputValue(shp.getFirstName(), "Ms");
						elementClear(shp.getLastName());
						elementClick(shp.getLastName());
						inputValue(shp.getLastName(), leadName);
						System.out.println("Entering Last Name : "+leadName);
						elementClear(shp.getEmailIdTextBox());
						inputValue(shp.getEmailIdTextBox(), leadEmailID);
						if (leadPhoneNumber.startsWith("5") || leadPhoneNumber.startsWith("1-5")) {
							System.out.println("Enter valid phone number");
				        }
						else {
							elementClear(shp.getMobileNumberTextBox());
							inputValue(shp.getMobileNumberTextBox(), leadPhoneNumber);
							System.out.println("Phone number entered");
						}
				        
						Select s = new Select(shp.getSelectProjectDropdown());
						List<WebElement> projectNames = s.getOptions();
						for (WebElement webelement : projectNames) {
							String projectName = webelement.getText();
							if (projectName.equalsIgnoreCase(leadProject)) {
								elementClick(webelement);
								System.out.println("Selected the project "+webelement.getText());
							}
						}
						inputValue(shp.getChannalPartnerName(), channelPartnerName);
						System.out.println("Channel Partner Name entered");
						inputValue(shp.getChannalPartnerEmail(), channelPartnerEmail);
						System.out.println("Channel Partner Email entered");
						inputValue(shp.getChannalPartnerPhNo(), channelPartnerMobileNumber);
						System.out.println("Channel Partner Phone number entered");
						
						elementClick(shp.getSaveButton());
						System.out.println("Save button clicked");
						Thread.sleep(3000);
						
						try {
							statusMessage = shp.getAlertMessage().getText();
							if (shp.getAlertMessage().isDisplayed()) {
								System.out.println(" inside shp.getAlertMessage() if loop");
								statusMessage = getText(shp.getAlertMessage());
								leadStatusList.add(statusMessage);
								System.out.println("statusMessage is : " + statusMessage);
								elementClick(shp.getCloseBtn());
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Thread.sleep(4000);
						try {
							statusMessage = shp.getSuccessMsg().getText();
							if (shp.getSuccessMsg().isDisplayed()) {
								Thread.sleep(3000);
								System.out.println(" inside shp.getSuccessMsg() if loop");
								statusMessage = shp.getSuccessMsg().getText();
								leadStatusList.add(statusMessage);
								System.out.println("statusMessage is : " + statusMessage);
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				Thread.sleep(5000);
				elementClick(slp.getSignoutDropdown());
				elementClick(slp.getSignOut());
				Thread.sleep(2000);

				/*
				 * Write the output by creating a new excel file
				 */

				int leadNameIndex = 0;
				int leadEmailIndex = 0;
				int leadPhoneNumberIndex = 0;
				int leadStatusIndex = 0;
				// statusMessage = "Added in Arun Excello";
				Label outputFileLeadNameHeader = new Label(0, 0, "Names");
				outputFileWorksheet.addCell(outputFileLeadNameHeader);
				Label outputFileEmailIDHeader = new Label(1, 0, "Email ID");
				outputFileWorksheet.addCell(outputFileEmailIDHeader);
				Label outputFilePhoneNumberHeader = new Label(2, 0, "Phone Number");
				outputFileWorksheet.addCell(outputFilePhoneNumberHeader);
				Label outputFileLeadStatusHeader = new Label(3, 0, "Status");
				outputFileWorksheet.addCell(outputFileLeadStatusHeader);
				for (String value : leadNameList) {
					outputFileWorksheet.addCell(new Label(0, ++leadNameIndex, value));
				}
				for (String value : leadEmailIDList) {
					outputFileWorksheet.addCell(new Label(1, ++leadEmailIndex, value));
				}
				for (String value : leadPhoneNumberList) {
					outputFileWorksheet.addCell(new Label(2, ++leadPhoneNumberIndex, value));
				}

				for (String value : leadStatusList) {
					outputFileWorksheet.addCell(new Label(3, ++leadStatusIndex, value));
				}

				outputFileWorkbook.write();
				outputFileWorkbook.close();
				break;
			}
		}
		try {
			browserQuit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Execution Finished ....";
	}

	public static void main(String[] args) throws Exception {
	//	System.out.println(System.getProperty("user.dir").concat("\\DRAUtility\\Reports\\").concat("RadianceReport_" + dateFormat.format(date) + ".xls"));
	//	System.out.println(System.getProperty("user.dir"));

		String result = arunExcelloTest(companyFilePath, leadsFilePath);
		System.out.println(result);

	}
}
