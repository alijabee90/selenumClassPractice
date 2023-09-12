package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class etsyHomework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
     
        WebElement signInButton = driver.findElement(By.name("Sign in"));
        signInButton.click();
        
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Automation");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Automation");
        
        WebElement signinBtn = driver.findElement(By.name("submit_attempt"));
        signinBtn.click();
      
        driver.quit();
        
        
	}

}
