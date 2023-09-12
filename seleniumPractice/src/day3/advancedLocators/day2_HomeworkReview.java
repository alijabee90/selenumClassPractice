package day3.advancedLocators;

import java.security.spec.ECField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_HomeworkReview {
// in order to access a class properties, we need to create an object of that class.
	// if the properties are static, no need to  an abject, simply access the properties by class name.
	//static properties belong to the class itself so you don't need to create an object. 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
        
       
		
		day2_HomeworkReview day2= new day2_HomeworkReview();
		day2.task2();

		
	}
	public void task1() throws InterruptedException {
		//Test case 1:
        //Go to etsy.com
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.etsy.com/");
		//	Find Sign in button and click on it
		 WebElement sighinBtn = driver.findElement(By.className("select-signin"));
		 sighinBtn.click();
		 // whenever you navigate to new page, a wait should happen.
		 // most of the time , you need wait when you click on something
		 Thread.sleep(1000);
		//	Find email address field and type "automation"
		 WebElement emailField= driver.findElement(By.id("join_neu_email_field"));
		 emailField.sendKeys("Automation");
		//	Find the password field and type "automation"
		 WebElement passwordField= driver.findElement(By.id("join_neu_password_field"));
		 passwordField.sendKeys("Automation");
		//	Find the sign in button and click on it
		  WebElement signinBtn = driver.findElement(By.name("submit_attempt"));
	        signinBtn.click();
	      
	        driver.quit();
	        
	}
	public void task2() throws InterruptedException {
	//    Test case 2:
		WebDriver driver = new ChromeDriver();
		String searchCriteria = "SDET";
		//Test case 2:
			//1. go to indeed.com
		driver.get("https://indeed.com");
			//2. get the current URL and store it in a variable called homeURL.
		String homeURL = driver.getCurrentUrl();
		System.out.println("Home URL is: " + homeURL);
			//3. get the website title and store it in a variable homeTitle.
		String homeTitle = driver.getTitle();
		System.out.println("Home Title is: " + homeTitle);
			//4. find the input field for WHAT and type SDET
		WebElement whatField = driver.findElement(By.name("q"));
		whatField.sendKeys(searchCriteria); 
			//5. find the Search button and click on it.
		WebElement searchBtn = driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton"));
		searchBtn.click();
		Thread.sleep(1000);
			//6. get the current URL and store it as a variable searchURL.
		String searchURL = driver.getCurrentUrl();
		System.out.println("Search URL is: " + searchURL);
			//7. get the website title and store it in a variable searchTitle.
		String searchTitle = driver.getTitle();
		System.out.println("Search Title is: " + searchTitle);
			//8. verify that searchURL does not equal to homeURL and contains the search criteria.
		if ((!searchURL.equals(homeURL)) && searchURL.contains(searchCriteria)) {
			System.out.println("Search URL Test Pass!");
		}else {
			System.out.println("Search URL Test Fail!");
		}
			//9. verify that searchTitle does not equal to homeTitle and has the search criteria.
		if ((!searchTitle.equals(homeTitle)) && searchTitle.toLowerCase().contains(searchCriteria.toLowerCase())) {
			System.out.println("Search Title Test Pass!");
		}else {
			System.out.println("Search Title Test Fail!");
		}
			//10. Get Text of the JobsInLocation field, store it in a variable, 
		//then verify if it's equal to your search criteria.
		
		WebElement jobsInTextField = driver.findElement(By.className("css-novqjp"));
		String jobsInText = jobsInTextField.getText();
		System.out.println("Jobs in the area text is: " + jobsInText);
		
		// First approach: we could verify the text in this way
		if (jobsInText.contains(searchCriteria)) {
			System.err.println("Jobs in the area text verification pass.");
		}else {
			System.out.println("Jobs in the area text verification fail.");
		}
		
		
		// Second approach:  SDET jobs in Centreville, VA
         String cutText = jobsInText.substring(0, 4);
         System.out.println("SubStringed text is: " + cutText);
		if (cutText.equals(searchCriteria)) {
			System.err.println("Pass - Jobs in the area text verification");
		} else {
			System.err.println("Fail - Jobs in the area text verification");
		}

			
		
}
	public static void task3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      //tagname[@attribute='value']
       // Test case:
        // 	Go to etsy.com
        driver.get("https://www.etsy.com/");
        //Click on Sign in.
        WebElement signInButton = driver.findElement(By.xpath("//button{@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin\"']"));
        
        //Click on Register.
        signInButton.click();
        Thread.sleep(1000);
        //Enter an email address, (jon.dow@gmail.com)
        WebElement email = driver.findElement(By.xpath("//id{@name='email'}"));
        email.sendKeys("jon.dow@gmail.com");
        //Enter first name.
        
        //Enter password.
        //Click on Register.
        //	Verify you get the error message:
        //"Sorry, the email you have entered is already in use."
}
}