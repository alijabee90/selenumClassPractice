package seleniumHomework;
import java.security.spec.ECField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHW {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
        task1();
        task2();
        task3();
    
	}
    public static void task1() throws InterruptedException {
        // Test case 1 - (Use only x path)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to facebook.com
        driver.get("https://facebook.com");
        // find the Email or phone number field and type Automation
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        email.sendKeys("Automation");
        // find the Password field and type Automation
        WebElement pass = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
        pass.sendKeys("Automation");

        // find the Login button and click on it.
        WebElement loginBtn = driver.findElement(By.xpath("//button[@name=\"login\"]"));
        loginBtn.click();
        Thread.sleep(2000);
        driver.quit();
    }

    public static void task2() throws InterruptedException {
        // Test case 2 - (Use only x path)
        WebDriver driver = new ChromeDriver();
       
        // go to facebook.com
        driver.get("https://facebook.com");
        // find the Create New Account button and click on it
        WebElement createNewAccountBtn = driver.findElement(By.xpath("//a[@role=\"button\"]"));
        createNewAccountBtn.click();
        Thread.sleep(2000);
       
        // find the FirstName, LastName, Email and Password fields and type Automation
        WebElement firstName = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        firstName.sendKeys("Automation");
        
        WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        lastName.sendKeys("Automation");
        
        WebElement email = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
        email.sendKeys("automation@test.com");
        
        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("password123");
        
        // find the Sign Up button and click on it.
        WebElement signUpButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
        signUpButton.click();
        
        driver.quit();
        
        }
        public static void task3()throws InterruptedException{
    	WebDriver driver = new ChromeDriver();
        //Go to indeed.com
    	driver.get("https://indeed.com");
        // Find the Where field and get the value of the 'value' attribute
        WebElement whereField = driver.findElement(By.id("where"));
        String valueAttribute = whereField.getAttribute("value");
        // Verify if the 'value' attribute is based on your current location
        String currentLocation = "Des Moines";
         if (valueAttribute.contains(currentLocation)) {
            System.out.println("The 'Where' field value is based on the current location.");
        } else {
            System.out.println("The 'Where' field value is not based on the current location.");
        }
        // Find the Where field and get the CSS value of color
        String colorValue = whereField.getCssValue("color");
        System.out.println("The color value of the 'Where' field is: " + colorValue);
        // Find the Where field and get the tag name
        String tagName = whereField.getTagName();
        if (tagName.equals("input")) {
            System.out.println("The tag name of the 'Where' field is 'input'.");
        } else {
            System.out.println("The tag name of the 'Where' field is not 'input'.");
        }

        driver.quit();
        }
        }
 