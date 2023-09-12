package day6_WorkingWithWebElements2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classActivities {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
		classActivity3();
}
    public static void indeedenable() throws InterruptedException{
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://www.indeed.com");
		
	     WebElement whatField = driver.findElement(By.linkText("css-p1lp5i e1jgz0i3"));
	     WebElement whereField = driver.findElement(By.linkText("css-1svp6q2 e1jgz0i3"));

	        boolean isWhatFieldEnabled = whatField.isEnabled();
	        boolean isWhatFieldDisplayed = whatField.isDisplayed();

	        boolean isWhereFieldEnabled = whereField.isEnabled();
	        boolean isWhereFieldDisplayed = whereField.isDisplayed();

	        if (isWhatFieldEnabled && isWhatFieldDisplayed) {
	            System.out.println("What field is enabled and displayed.");
	        } else {
	            System.out.println("What field is not enabled and displayed.");
	        }

	        if (isWhereFieldEnabled && isWhereFieldDisplayed) {
	            System.out.println("Where field is enabled and displayed.");
	        } else {
	            System.out.println("Where field is not enabled and displayed.");
	        }

	        driver.quit();
	
}
 public static void  primetechpractice() throws InterruptedException {
 WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.get("http://practice.primetech-apps.com/practice/radio-button");
// Find all available radio buttons
List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
// Loop through each radio button
for (WebElement radioButton : radioButtons) { // Check if the radio button is displayed and enabled
	if (radioButton.isDisplayed() && radioButton.isEnabled()) {
	   // Check if the radio button is selected, if not, select it
	         if (!radioButton.isSelected()) {
	             radioButton.click();
	             }

  // Check if the radio button is selected after clicking
	   if (radioButton.isSelected()) {
  System.out.println("Radio button with id: " + radioButton.getAttribute("id") + " is displayed, enabled, and selected.");
	  } else {
		  System.out.println("Radio button with id: " + radioButton.getAttribute("id") + " could not be selected.");
	                }
	            } else {
	                System.out.println("Radio button with id: " + radioButton.getAttribute("id") + " is not displayed or enabled.");
	            }
	        }

	        driver.quit();
	    }
 public static void classActivity3() throws InterruptedException {
		// Test case 3.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     // go to http://practice.primetech-apps.com/practice/check-box
		driver.get("http://practice.primetech-apps.com/practice/check-box");
     // find the checkboxes and verify if it's displayed, if true, then verify if it's enabled, if true, 
		// verify if it's selected, if false, then check the boxes. Then verify if it's checked.
		List<WebElement> checkBoxes = driver.findElements(By.className("form-check-input"));
		for (WebElement checkbox : checkBoxes) {
			if (checkbox.isDisplayed()) {
				System.out.println("Checkbox is displayed.");
				if (checkbox.isEnabled()) {
					System.out.println("Checkbox is enabled.");
					if (checkbox.isSelected()) {
						System.out.println("Checkbox is selected.");
					}else {
						checkbox.click();
					}
				}else {
					System.out.println("Checkbox is NOT enabled.");
				}
			}else {
				System.out.println("Checkbox is NOT displayed.");
			}
			
			if (checkbox.isSelected()) {
				System.out.println("Checkbox is selected now.");
			}else {
				System.out.println("Checkbox is still NOT selected.");
			}
			Thread.sleep(1000);
		}
    
	}
	}

