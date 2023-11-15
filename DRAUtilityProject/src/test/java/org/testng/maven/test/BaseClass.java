package org.testng.maven.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String s) throws Exception {

		try {
			if (s.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WebDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				
			} else if(s.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			
			}else if(s.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", 
						System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			return driver;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Invalid Browser Name");
		}
	}

	public static void waitForVisiblity(WebElement element) {

		try {
			WebDriverWait w = new WebDriverWait(driver, 90);
			w.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static boolean elementIsDisplayed(WebElement element) {

		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static boolean elementIsEnabled(WebElement element) {

		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static boolean elementIsSelected(WebElement element) throws Exception {

		try {
			boolean selected = element.isSelected();
			return selected;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void elementClear(WebElement element) {

		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void inputValue(WebElement element, String value) throws Exception {

		try {
			waitForVisiblity(element);
			if (elementIsDisplayed(element) && elementIsEnabled(element)) {

				element.clear();
				element.sendKeys(value);

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void takeScreenShot(String fileName) throws IOException {

		try {
			File f = new File(System.getProperty("user.dir") + "\\Library\\" + fileName + ".png");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(temp, f);
		} catch (WebDriverException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void moveToElement(WebElement element) {

		try {
			waitForVisiblity(element);
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void actionsClick(WebElement element) {

		try {
			waitForVisiblity(element);
			Actions a = new Actions(driver);
			a.click(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void elementClick(WebElement element) {

		try {
			waitForVisiblity(element);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void selectValuesfromDD(WebElement element, String options, String value) throws Exception {

		try {
			//waitForVisiblity(element);
			Select s = new Select(element);
			if (options.equalsIgnoreCase("index")) {

				s.selectByIndex(Integer.parseInt(value));

			} else if (options.equalsIgnoreCase("value")) {

				s.selectByValue(value);

			} else if (options.equalsIgnoreCase("visible text")) {

				s.selectByVisibleText(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void getUrl(String url) {

		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static String getText(WebElement element) {

		try {
			waitForVisiblity(element);
			String value = element.getText();
			return value;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static String getAttribute(WebElement element) {

		try {
			waitForVisiblity(element);
			String value = element.getAttribute("value");
			return value;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static String getTitle() {

		try {
			String title = driver.getTitle();
			return title;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void dragAndDrop(WebElement element, String options, String value) throws Exception {
		
		try {
			Select s = new Select(element);
			if (options.equalsIgnoreCase("index")) {
				
				s.selectByIndex(Integer.parseInt(value));
				
			} else if(options.equalsIgnoreCase("value")) {

				s.selectByValue(value);			
				
			}else if(options.equalsIgnoreCase("visible text")) {
				
				s.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			throw new Exception();
		}
		
	}
	
	public static void doubleClick(WebElement element) throws Exception {

		try {
			waitForVisiblity(element);
			Actions a = new Actions(driver);
			a.doubleClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void contextClick(WebElement element) {

		try {
			Actions a = new Actions(driver);
			a.contextClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void inputValueusingActions(WebElement element, String value) throws Exception {

		try {
			waitForVisiblity(element);
			Actions a = new Actions(driver);
			a.sendKeys(element, value).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}	
	
	public static void scrollUpandScrollDownusingElement(WebElement  element) throws Exception {

		try {
			//waitForVisiblity(element);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void scrollUpandScrollDownusingCoordinates(WebElement element, String width, String height) throws Exception {

		try {
			waitForVisiblity(element);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+width+", "+height+")");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void scrollToBottomPage() throws Exception {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void waitforAlertisPresent() throws Exception {

		try {
			WebDriverWait wb = new WebDriverWait(driver, 30);
			wb.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void simpleAlert() throws Exception {

		try {
			waitforAlertisPresent();
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void confirmAlert(String options) throws Exception {

		try {
			Alert alert = driver.switchTo().alert();
			if (options.equalsIgnoreCase("ok")) {
				alert.accept();
			} else if(options.equalsIgnoreCase("cancel")) {
				alert.dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void promptAlert(String options, String values) throws Exception {

		try {
			waitforAlertisPresent();
			Alert alert = driver.switchTo().alert();
			if (options.equalsIgnoreCase("ok")) {
				alert.sendKeys(values);
				alert.accept();
			} else if(options.equalsIgnoreCase("cancel")) {
				alert.dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void driverQuit() throws Exception {

		try {
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void navigateToUrl(String url) throws Exception {

		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
		
	}
	
	public static void navigationCommands(String options) {

		if (options.equalsIgnoreCase("back")) {
			driver.navigate().back();

		} else if(options.equalsIgnoreCase("forward")){
			driver.navigate().forward();
		} else if(options.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}
	
	public static void enterRobotClass() throws Exception {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
