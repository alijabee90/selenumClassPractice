package seleniumHomework;

import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UselessFileDetector;
import org.openqa.selenium.support.ui.Sleeper;

public class HomeWork0806 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
task3();

	}
	   public static void task1() throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        // 1: go to amazon.com
	        driver.get("https://www.amazon.com");

	        // 2: Click on the "Sign in" button
	        WebElement signinBTN = driver.findElement(By.id("nav-signin-tooltip"));
	        signinBTN.click();

	        // Step 3: Verify that you are on the sign-in page (use isDisplayed - either by sign-in text or email field).
	        WebElement emailField = driver.findElement(By.id("ap_email"));
	        if (emailField.isDisplayed()) {
	            System.out.println("Step 3 - You are on the sign-in page.");
	        } else {
	            System.out.println("Step 3 - You are NOT on the sign-in page.");
	        }

	        // Step 4: Navigate back, and navigate forward
	        driver.navigate().back();
	        driver.navigate().forward();
	        Thread.sleep(1000);

	        // Step 5: Verify that you are on the sign-in page (use isDisplayed - either by sign-in text or email field).
	        if (emailField.isDisplayed()) {
	            System.out.println("Step 5 - You are on the sign-in page.");
	        } else {
	            System.out.println("Step 5 - You are NOT on the sign-in page.");
	        }

	        // Step 6: Click on the "Create your Amazon account" button, verify you are on the new account create page.
	        WebElement createAccountButton = driver.findElement(By.id("createAccountSubmit"));
	        createAccountButton.click();

	        WebElement firstNameField = driver.findElement(By.id("ap_customer_name"));
	        if (firstNameField.isDisplayed()) {
	            System.out.println("Step 6 - You are on the new account create page.");
	        } else {
	            System.out.println("Step 6 - You are NOT on the new account create page.");
	        }

	        // Step 7: Navigate back, verify you are on the sign-in page.
	        driver.navigate().back();
	        if (emailField.isDisplayed()) {
	            System.out.println("Step 7 - You are on the sign-in page.");
	        } else {
	            System.out.println("Step 7 - You are NOT on the sign-in page.");
	        }

	        // Step 8: Navigate forward, verify you are on the create account page.
	        driver.navigate().forward();
	        if (firstNameField.isDisplayed()) {
	            System.out.println("Step 8 - You are on the create account page.");
	        } else {
	            System.out.println("Step 8 - You are NOT on the create account page.");
	        }

	        // Step 9: Click on the "Continue" button without filling the form.
	        WebElement continueButton = driver.findElement(By.id("continue"));
	        continueButton.click();

	        // Step 9: Verify error messages displayed and get text to verify.
	        WebElement nameErrorMessage = driver.findElement(By.xpath("//span[contains(text(),'Enter your name')]"));
	        WebElement emailErrorMessage = driver.findElement(By.xpath("//span[contains(text(),'Enter your email or mobile phone number')]"));
	        WebElement passwordErrorMessage = driver.findElement(By.xpath("//span[contains(text(),'Minimum 6 characters required')]"));

	        if (nameErrorMessage.isDisplayed() && emailErrorMessage.isDisplayed() && passwordErrorMessage.isDisplayed()) {
	            System.out.println("Step 9 - Error messages displayed:");
	            System.out.println("Name Error Message: " + nameErrorMessage.getText());
	            System.out.println("Email Error Message: " + emailErrorMessage.getText());
	            System.out.println("Password Error Message: " + passwordErrorMessage.getText());
	        } else {
	            System.out.println("Step 9 - Error messages NOT displayed.");
	        }

	        driver.quit();
	    }
	   public static void task2 () {
		   WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        // 1: go to ebay
	        driver.get("https://www.ebay.com");
	        // Search for "coffee mug"
	        WebElement searchBox = driver.findElement(By.id("gh-ac"));
	        searchBox.sendKeys("coffee mug");
	        WebElement searchButton = driver.findElement(By.id("gh-btn"));
	        searchButton.click();

	        // Find all the results and store them in a list of WebElements
	        List<WebElement> searchResults = driver.findElements(By.xpath("//li[contains(@class,'s-item')]"));

	        // Loop through all the results and get the prices of each item and print it out
	        for (WebElement result : searchResults) {
	            WebElement priceElement = result.findElement(By.className("s-item__price"));
	            String price = priceElement.getText();
	            System.out.println("Price: " + price);
	         // Quit the browser
	        driver.quit();
	    }
}
	   public static void task3() {
		   WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.get("https://www.amazon.com");
	        // Verify that you are on the amazon home page (verify with title).
	        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	        String actualTitle = driver.getTitle();
	        if (actualTitle.equals(expectedTitle)) {
	            System.out.println("Step 1 - You are on the Amazon home page.");
	        } else {
	            System.out.println("Step 1 - You are NOT on the Amazon home page.");
	        }

	        // Verify dropdown value is by default "All Departments"
	        WebElement departmentDropdown = driver.findElement(By.id("searchDropdownBox"));
	        String defaultDepartment = departmentDropdown.getAttribute("value");
	        if (defaultDepartment.equals("search-alias=aps")) {
	            System.out.println("Step 2 - The default department is 'All Departments'.");
	        } else {
	            System.out.println("Step 2 - The default department is NOT 'All Departments'.");
	        }

	        // Select department Home & Kitchen, and search coffee mug.
	        departmentDropdown.sendKeys("Home & Kitchen");
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.sendKeys("coffee mug");
	        WebElement searchButton = driver.findElement(By.className("nav-input"));
	        searchButton.click();

	        // Verify you are on the coffee mug search results page (use title).
	        expectedTitle = "Amazon.com: coffee mug";
	        actualTitle = driver.getTitle();
	        if (actualTitle.contains(expectedTitle)) {
	            System.out.println("Step 3 - You are on the coffee mug search results page.");
	        } else {
	            System.out.println("Step 3 - You are NOT on the coffee mug search results page.");
	        }

	        // Verify you are in the Home & Kitchen department.
	        departmentDropdown = driver.findElement(By.id("searchDropdownBox"));
	        String selectedDepartment = departmentDropdown.getAttribute("value");
	        if (selectedDepartment.equals("search-alias=garden")) {
	            System.out.println("Step 4 - You are in the 'Home & Kitchen' department.");
	        } else {
	            System.out.println("Step 4 - You are NOT in the 'Home & Kitchen' department.");
	        }

	        // Quit the browser
	        driver.quit();
	    }
	}

	




	
