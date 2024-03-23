package sit707_week2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation
 * https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void officeworks_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/svish/Downloads/Software/chromedriver-win32/chromedriver-win32/chromedriver.exe");

		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();

		System.out.println("Driver info: " + driver);

		sleep(2);

		// Load a webpage in chromium browser.
		driver.get(url);

		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Vishuddha");

		/*
		 * Find following input fields and populate with values
		 */
		WebElement lastname = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + lastname);
		// Send lastname name
		lastname.sendKeys("Samarasekara");

		WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + phoneNumber);
		// Send Phone Number
		phoneNumber.sendKeys("0478244505");

		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + email);
		// Send Email name
		email.sendKeys("svishuddha@gmail.com");

		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + password);
		// Send Password name
		password.sendKeys("Ww2#444");

		WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + confirmPassword);
		// Send Confirm Password name
		confirmPassword.sendKeys("Ww2#4444");

		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		WebElement Createaccount = driver
				.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
		System.out.println("Found element: " + Createaccount);
		// Click Create Account Button
		Createaccount.click();

		/*
		 * Take screenshot using selenium API.
		 */
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(
				"D:\\Deakin\\Uni\\2024 Tri 1\\SIT707 - Software Quality And Testing\\OnTrack\\2.1P - Pass Task - Selenium test case\\2.1P-resources\\office_works_login.png"));
		// Sleep a while
		sleep(2);

		// close chrome driver
		driver.close();
	}

	public static void centrecom_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/svish/Downloads/Software/chromedriver-win32/chromedriver-win32/chromedriver.exe");

		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();

		System.out.println("Driver info: " + driver);

		sleep(2);

		// Load a webpage in chromium browser.
		driver.get(url);

		/*
		 * How to identify a HTML input field - Step 1: Inspect the webpage, Step 2:
		 * locate the input field, Step 3: Find out how to identify it, by id/name/...
		 */

		// Find first input field which is firstname
		WebElement firstname = driver.findElement(By.id("inputFName"));
		System.out.println("Found element: " + firstname);
		// Send first name
		firstname.sendKeys("Vishuddha");

		WebElement lastname = driver.findElement(By.id("inputLName"));
		System.out.println("Found element: " + lastname);
		// Send first name
		lastname.sendKeys("Samarasekara");

		WebElement email = driver.findElement(By.id("inputEmail"));
		System.out.println("Found element: " + email);
		// Send first name
		email.sendKeys("svishuddha@gmail.com");

		WebElement password = driver.findElement(By.id("inputPassword"));
		System.out.println("Found element: " + password);
		// Send first name
		password.sendKeys("Ww3#34rdf");

		WebElement conpassword = driver.findElement(By.id("inputConfirmPass"));
		System.out.println("Found element: " + conpassword);
		// Send first name
		conpassword.sendKeys("Ww3#34rdf");

		WebElement Termscconditions = driver.findElement(By.id("AcceptTermsAndConditions"));
		System.out.println("Found element: " + Termscconditions);
		// Send first name
		Termscconditions.click();

		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		WebElement btnregister = driver.findElement(By.xpath("//*[@id=\"formRegister\"]/div[4]/button"));
		System.out.println("Found element: " + btnregister);
		// Send first name
		btnregister.click();

		/*
		 * Take screenshot using selenium API.
		 */
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(
				"D:\\Deakin\\Uni\\2024 Tri 1\\SIT707 - Software Quality And Testing\\OnTrack\\2.1P - Pass Task - Selenium test case\\2.1P-resources\\centercom_register.png"));

		// Sleep a while
		sleep(2);

		// close chrome driver
		driver.close();
	}
}
