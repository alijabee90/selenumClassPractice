package daytwoworkingwithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithLocators {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	       
	        
	        driver.get("http://facebook.com");
	        //find the email field type automation
	        driver.findElement(By.name("email"));
	        WebElement emailField = driver.findElement(By.name("email"));
	        emailField.sendKeys("automation");
	        //find the password field and type automation
	        driver.findElement(By.name("pass"));
	        WebElement password = driver.findElement(By.name("pass"));
	        password.sendKeys("automation");
	        //find the login button and type automation
	        WebElement loginButton = driver.findElement(By.name("login"));
	        loginButton.click();

	        // find by linkText
	        driver.get("https://amazon.com");
	        // find back to school link using linkText and click on it.
	        WebElement backToSchoolLinkElement = driver.findElement(By.linkText("Clinic"));
	        backToSchoolLinkElement.click();
	        // find by partial Link text
	        driver.get("https://amazon.com");
	        // find Discover more footwear on shopbop partial link text and click on it
	        WebElement partialText = driver.findElement(By.partialLinkText("footwear on shopbop"));
	        partialText.click();
	        
	        
	        //find by classname
	        driver.get("https://amazon.com");
	        
			WebElement Off  = driver.findElement(By.className("nav-swn-text"));
			Off.click();
	        
	}

}
