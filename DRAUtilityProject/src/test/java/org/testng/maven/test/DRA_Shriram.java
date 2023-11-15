package org.testng.maven.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.function.Consumer;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.maven.pages.AkshayaHomePage;
import org.testng.maven.pages.AkshayaLoginPage;
import org.testng.maven.pages.CasaGrandeHomePage;
import org.testng.maven.pages.CasaGrandeLoginPage;
import org.testng.maven.pages.RadianceHomePage;
import org.testng.maven.pages.RadianceLoginPage;
import org.testng.maven.pages.ShriramHomePage;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

@SuppressWarnings("unused")
public class DRA_Shriram extends BaseClass {

	public static WebDriver driver;
	static String companyFilePath = "C:\\Users\\LAKSHMI SRI\\Desktop\\Domestic Reality\\CompanyWebsites.xls";
	static String leadsFilePath = "C:\\Users\\LAKSHMI SRI\\Desktop\\Domestic Reality\\Leads.xls";
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
	
	public static String getPropertyValue(String key) throws IOException {
		
		String value = "";
		try {
			InputStream fileInputStream = Files.newInputStream(Paths.get("email.properties"));
			Properties property = new Properties();
			property.load(fileInputStream);
			value = property.getProperty(key);
			System.out.println(value);
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	@AfterMethod // AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult shriramResult) {
		// using ITestResult.FAILURE is equals to result.getStatus then it enter into if
		// condition
		if (ITestResult.FAILURE == shriramResult.getStatus()) {
			try {
				// To create reference of TakesScreenshot
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				// Call method to capture screenshot
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				// Copy files to specific location
				// result.getName() will return name of test case so that screenshot name will
				// be same as test case name
				FileUtils.copyFile(src, new File("C:\\Users\\LAKSHMI SRI\\Desktop\\DRAUtility\\Domestic Reality\\Reports\\" + shriramResult.getName() + ".png"));
				System.out.println("Successfully captured a screenshot");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
	}

	public static String shriramTest(String companyFilePath, String leadsFilePath) throws Exception {

		try {
			browserLaunch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ShriramHomePage shp = new ShriramHomePage(driver);

		File companyDetails = new File(companyFilePath);
		Workbook companyDetailsWorkbook = Workbook.getWorkbook(companyDetails);
		Sheet companyDetailsWorksheet = companyDetailsWorkbook.getSheet(0);
		int companyDetailsTotalNoOfRows = companyDetailsWorksheet.getRows();

		File leadDetails = new File(leadsFilePath);
		Workbook leadDetailsWorkbook = Workbook.getWorkbook(leadDetails);
		Sheet leadDetailsWorksheet = leadDetailsWorkbook.getSheet(0);
		int leadDetailsTotalNoOfRows = leadDetailsWorksheet.getRows();
		System.out.println("leadDetailsTotalNoOfRows is : " + leadDetailsTotalNoOfRows);
		//outputExcelFile ="C:\\Users\\LAKSHMI SRI\\Desktop\\DRAUtility\\DRAUtility\\Domestic Reality\\Reports\\".concat("ShriramReport_" + dateFormat.format(date) + ".xls");
		outputExcelFile =System.getProperty("user.dir").concat("ShriramReport_" + dateFormat.format(date) + ".xls");
		
		WritableWorkbook outputFileWorkbook = Workbook.createWorkbook(new File(outputExcelFile));
		WritableSheet outputFileWorksheet = outputFileWorkbook.createSheet("Akshaya", 0);

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
			case "Shriram":
				try {
					getUrl(websiteUrl);
				} catch (Exception e) {
					e.printStackTrace();
				}

				for (int rows = 1; rows <= leadDetailsTotalNoOfRows-1; rows++) {

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
						if (shp.getDisclaimerPopup().isDisplayed()) {
							elementClick(shp.getDisclaimerPopup());
						}
						else {
							System.out.println("Disclaimer window is closed already");
						}
						elementClick(shp.getPartnersDropDown());
						moveToElement(shp.getChannelPartnerProgram());
						Thread.sleep(2000);
						elementClick(shp.getShriramSynergy());
						elementClick(shp.getChannelPartnerRadioButton());
						elementClick(shp.getChannelPartnerDropDown());
						elementClick(shp.getChannelPartnerTextBox());
						inputValue(shp.getChannelPartnerTextBox(), channelPartnerName);
						Thread.sleep(3000);
						List<WebElement> element = driver.findElements(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li"));
						System.out.println("Size is : "+element);
						System.out.println("html : "+element.get(0).getAttribute("innerHTML"));
						//will work in jre 1.8
						//element.forEach(element2 -> System.out.println("loop : "+element2.getAttribute("innerText")));
						element.forEach(new Consumer<WebElement>() {
							@Override
							public void accept(WebElement element2) {
								System.out.println("loop : "+element2.getAttribute("innerText"));
							}
						});
						for (WebElement selectOption : element) {
							if (selectOption.getAttribute("innerText").contains(channelPartnerName)) {
							WebElement option = driver.findElement(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li"));
							option.click();
							}
						}
						inputValue(shp.getFirstName(), leadName);
						inputValue(shp.getEmailTextBox(), leadEmailID);
						enterRobotClass();
						elementClick(shp.getCountryCodeDropDown());
						selectValuesfromDD(shp.getCountryCodeDropDown(), "value", "India");
						elementClick(shp.getPhoneNumberTextBox());
						if (leadPhoneNumber.startsWith("5")||leadPhoneNumber.startsWith("1-5")) {
							System.out.println("Enter valid phone number");
						} else {
							inputValue(shp.getPhoneNumberTextBox(), leadPhoneNumber);
						}
						enterRobotClass();
						elementClick(shp.getResidentialStatusDropDown());
						selectValuesfromDD(shp.getResidentialStatusDropDown(), "value", "Local");
						inputValue(shp.getResidentialCityTextBox(),leadCity);
						if (shp.getChatMsg().isDisplayed()) {
							elementClick(shp.getChatMsg());
							elementClick(shp.getChatMsgClose());
						}
						else {
							System.out.println("Chat window is closed already");
						}
						elementClick(shp.getProjectCityDropDown());
						selectValuesfromDD(shp.getProjectCityDropDown(), "value", leadCity);
						//inputValue(shp.getProjectCityDropDown(),leadCity);
						elementClick(shp.getSelectProjectsDropdown());
						Select s = new Select(shp.getSelectProjectsDropdown());
						List<WebElement> projects = s.getOptions();
						for (WebElement webElement : projects) {
							String projectList = webElement.getText();
							System.out.println(projectList);
								elementClick(webElement);
								if (projectList.equalsIgnoreCase(leadProject)) {
							Thread.sleep(1000);
							}
							else {
								System.out.println("Project name is invalid");
							}
						}
						
						inputValue(shp.getCommentTextBox(), leadComments);
						elementClick(shp.getChannelPartnerEmailTextBox());
						inputValue(shp.getChannelPartnerEmailTextBox(),channelPartnerEmail);
						elementClick(shp.getChannelPartnerPhoneNumber());
						inputValue(shp.getChannelPartnerPhoneNumber(),channelPartnerMobileNumber);
						elementClick(shp.getSubmitButton());
						elementClick(shp.getDisclaimerPopup());
						statusMessage = getText(shp.getThankyouMsg());
						leadStatusList.add(statusMessage);
						System.out.println("statusMessage is : "+statusMessage);
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				/*
				 * Write the output by creating a new excel file
				 */

				int leadNameIndex = 0;
				int leadEmailIndex = 0;
				int leadPhoneNumberIndex = 0;
				int leadStatusIndex = 0;
				//statusMessage = "Added in Akshaya";
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
		
		String result = shriramTest(companyFilePath, leadsFilePath);
		System.out.println(result);
		
		
	}
}
