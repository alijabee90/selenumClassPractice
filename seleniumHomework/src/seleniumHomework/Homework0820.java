package seleniumHomework;
import java.security.spec.ECField;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework0820 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		  // Step 1: Go to http://demo.guru99.com/popup.php
		driver.get("http://demo.guru99.com/popup.php");
		
		 // Step 2: Get title and store it in a variable.
		String mainWindowTitleString = driver.getTitle();
		
		
		// Step 3: Click on Click Here button and switch to next window
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        String mainWindowHandle = driver.getWindowHandle();
        String newWindowHandle = "";

        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                newWindowHandle = handle;
                driver.switchTo().window(newWindowHandle);
                break;
        }
    }

    // Step 4: Provide an email and click Submit.
    WebElement emailInput = driver.findElement(By.name("emailid"));
    emailInput.sendKeys("test@example.com");
    driver.findElement(By.name("btnLogin")).click();
    Thread.sleep(1000);

    // Step 5: Get text of the user ID and password and store them in variables, print them out.
    String userId = driver.findElement(By.xpath("//td[contains(text(),'User ID :')]/following-sibling::td")).getText();
    String password = driver.findElement(By.xpath("//td[contains(text(),'Password :')]/following-sibling::td")).getText();
    System.out.println("User ID: " + userId);
    System.out.println("Password: " + password);
    
    Thread.sleep(1000);

    // Step 6: Verify the text "This access is valid only for 20 days."
    WebElement successMessage = driver.findElement(By.xpath("//h3[text()='This access is valid only for 20 days.']"));
    if (successMessage.isDisplayed()) {
        System.out.println("Success message verified.");
    } else {
        System.out.println("Success message not displayed.");
    }

    // Step 7: Close the window and switch back to the main window.
    driver.close();
    driver.switchTo().window(mainWindowHandle);

    // Step 8: Verify the title equals the stored title.
    if (driver.getTitle().equals(mainWindowHandle)) {
        System.out.println("Main window title verification passed.");
    } else {
        System.out.println("Main window title verification failed.");
    }

    // Quit the driver.
    driver.quit();

	
	
	
	
	}

}
