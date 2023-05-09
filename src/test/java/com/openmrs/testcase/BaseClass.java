package com.openmrs.testcase;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.openmrs.pojo.OpenLoginPage;
import com.openmrs.pojo.RegisterPatientPage;

public class BaseClass {
	public static String baseURL="https://qa-refapp.openmrs.org/openmrs/login.htm";
	public static String username="Admin";
	public static String password="Admin123";

	public static WebDriver driver;
	
	static String screenShotPath = "./Screenshots/";

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\OpemMRS-20230506T160334Z-001\\OpemMRS\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		}
	public static void loginToOpenMRS() throws Exception {
		
			driver.get(baseURL);
			passTextToWebelement(PageFactory.initElements(driver, OpenLoginPage.class).getusername(), username);
			passTextToWebelement(PageFactory.initElements(driver, OpenLoginPage.class).getpassword(), password);
			click(PageFactory.initElements(driver, OpenLoginPage.class).getInpatientWard());
			click(PageFactory.initElements(driver, OpenLoginPage.class).getLogin());

	}
	public static void logout() throws Exception {
		
			waitForElementExplicitly(PageFactory.initElements(driver, OpenLoginPage.class).getLogOut());
			click(PageFactory.initElements(driver, OpenLoginPage.class).getLogOut());
			quitBrowser();
		} 
	
	public static void waitForElementExplicitly(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	public static void quitBrowser() {
		System.out.println("Closing all the Opened Browser in the Exection");
		
			driver.quit();
		} 
	
	public static void CloseAlert()
	{
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();
	}
	public static void selectFromDropBox(WebElement element, String visibleText) {
	

			Select select = new Select(element);
			System.out.println("Selecting " + visibleText + " from Dropbox");
			select.selectByVisibleText(visibleText);
		} 
		public static Boolean compareTwoText(String actualText, String expectedText) throws Exception {
		Boolean flag = false;
		try {
			// Thread.sleep(5000);

			if (actualText.equals(expectedText)) {
				Reporter.log("Trying to compare actual text== -->  " + actualText + "  <-- expected text== -->  " + expectedText, true);
				flag = true;
			} else {
				Reporter.log("Actual Text not equals to Expected Text",true);
				Reporter.log("Actual Text  == -->" + actualText, true);
				Reporter.log("Expected Text== -->" + expectedText, true);
			}

		} catch (Exception exp) {
			Reporter.log("--------------------------------------------------------------------------------", true);

			Reporter.log("Exception Occured in --> compareTwoText <--  method of Base Class", true);
			throw new Exception(actualText + " <----is compared with---> " + expectedText
					+ " Exception Occured while comparing the actual and expected value ");
		}
		return flag;
	}
	public static void click(WebElement element) {
		try {
			waitForElementExplicitly(element);
			element.click();
			//Thread.sleep(2000);			
			Reporter.log("Clicked on this element ---> " + element, true);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			Reporter.log("--------------------------------------------------------------------------------", true);
			Reporter.log("Exception Occured in --> click <--  method of Base Class", true);

			throw new NoSuchElementException(element + " Element is still not clickable");
		}
	}
	public static void passTextToWebelement(WebElement element, String inputData) throws Exception {

		try {
			waitForElementExplicitly(element);

			if (element.isDisplayed()) {
				System.out.println("Entering :" + inputData);
				element.clear();
				element.sendKeys(inputData);
			} else {
				System.out.println("Element is not Displayed ..");
				Assert.assertTrue(false);
			}
		} catch (Exception exp) {
			Reporter.log("--------------------------------------------------------------------------------", true);
			Reporter.log("Exception Occured in --> passTextToWebelement <--  method of Base Class", true);

			throw new NoSuchElementException(element + " Element is still not ready to pass the text " + inputData);
		}

	}
	public static String getText(WebElement element) {
		String actText = null;
		try {
			waitForPageToLoad(5);
			actText = getElement(element).getText();

		} catch (Exception exp) {
			Reporter.log("--------------------------------------------------------------------------------", true);

			Reporter.log("Exception Occured in --> getText <--  method of Base Class", true);

			throw new NoSuchElementException(element + " yet to load the page to fetch the text");

		}
		return actText;
	}
	public static WebElement getElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));
		return ele;
	}
	public static void waitForPageToLoad(int seconds) {
		try {
		//	seconds = 5;
			System.out.println("Waiting For the page to Load till :" + seconds + " secs");
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch (Exception exp) {
			captureScreenshot("waitForPageToLoad");
			System.out.println("Exception Occured while waiting For page to Load Implicitly," + " Exception Message :"
					+ exp.getMessage());
		}
	}
	public static void captureScreenshot(String ImageName) {
		try {
			Reporter.log("--------------------------------------------------------------------------------", true);
			String imagePath = screenShotPath + ImageName + ".png";
			Reporter.log("Capturing ScreenShot trigerred", true);
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(imagePath));

			FileUtils.copyFile(source, new File(imagePath));
		} catch (Exception exp) {
			Reporter.log("--------------------------------------------------------------------------------", true);
			Reporter.log("Exception Occured in --> captureScreenshot <--  method of Base Class", true);

			throw new NoSuchElementException(" Exception Occured while capturing the Screenshot  ");
		}
	}
	
}