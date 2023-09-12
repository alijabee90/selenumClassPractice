package daytwoworkingwithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class classActevity {

	

	    public static void main(String[] args) throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	      //Test case 2 
	           //go to facebook.com
			
			driver.get("https://facebook.com");
			
			
			// get title
			String webTitle = driver.getTitle();
			System.out.println("Title is: " + webTitle);
			
			
			
	           //find the Create New Account button and click on it
			WebElement newAccountBtn = driver.findElement(By.linkText("Create new account"));
			newAccountBtn.click();
			
			// Thread.sleep - stops the java code execution for certain amount of time given.
			Thread.sleep(1000);
			
	           //find the FirstName,  LastName, Email and Password fields and type Automation
			WebElement firstName = driver.findElement(By.name("firstname"));
			WebElement lastName = driver.findElement(By.name("lastname"));
			WebElement email = driver.findElement(By.name("reg_email__"));
			WebElement password = driver.findElement(By.name("reg_passwd__"));
			firstName.sendKeys("automation");
			lastName.sendKeys("automation");
			email.sendKeys("automation");
			password.sendKeys("automation");
	           //find the Sign Up button and click on it.
			WebElement signupBtn = driver.findElement(By.name("websubmit"));
			signupBtn.click();
			
			
			// get current url
			System.out.println("Current URL is: " + driver.getCurrentUrl());
			
			
			// get text of element
			WebElement nonUserNoticeLink = driver.findElement(By.id("non-users-notice-link"));
			String noticeLinkText = nonUserNoticeLink.getText();
			System.out.println("Notice LInk Text Is: " + noticeLinkText);
			
			
			
			
			// quit the driver  - shut down everything.
			driver.quit();
        
        		

	}

}
