package classReview;
import java.security.spec.ECField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class firstClassReview {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
		 
		
		 test1(); 
	}
		public static void test1() throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
//			Go to "https://automationtesting.co.uk"
			driver.get("https://automationtesting.co.uk");
			driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
			
			WebElement ConactUsForm = driver.findElement(By.xpath("//a[@href='contactForm.html']"));
			ConactUsForm.click();

			WebElement firstNameField = driver.findElement(By.xpath("//input[@name='first_name']"));
			WebElement lastNameField = driver.findElement(By.xpath("//input[@name='last_name']"));
			WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
			WebElement messageField = driver.findElement(By.xpath("//textarea[@name='message']"));
			
			String fNameText = "Hamzah";
			String lNameText = "Aldeen";
			String emailText = "hamazah@gmail.com";
			String messageText = "Hello, this is my message"; 
			String actualMsg = "Thank you for your mail!";
			
			WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));

			Thread.sleep(2000);
//				Click on Contact Us Form Test.
			
//				Find the Test field for first name and 	Enter a first name
			Thread.sleep(2000);
			
			firstNameField.sendKeys(fNameText);
			
//				Find the Test field for last name and Enter last name.
			lastNameField.sendKeys(lNameText);
			
//				Find the Test field for email and Enter email address
			emailField.sendKeys(emailText);
			
//				Find the Test field for massage	and Enter a massage
			
			messageField.sendKeys(messageText);

//				Click on Submit
			submitBtn.click();
			
			Thread.sleep(2000);
//			
			//Verify you get the error message:
//				" Thank you for your mail! "
			String  expectedMsg = driver.findElement(By.xpath("//h3[text()='Thank you for your mail!']")).getText();
			
			if(expectedMsg.equals(actualMsg)) {
				System.out.println("Test Pass");
			}else {
				System.out.println("Test Fail");
			}
			
			Thread.sleep(1000);
			
			driver.quit();
			
		}
		public static void test2() throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
//			Go to "https://automationtesting.co.uk"
			driver.get("https://automationtesting.co.uk");
			
//			Click on Contact Us Form Test.
			WebElement ConactUsForm = driver.findElement(By.xpath("//a[@href='contactForm.html']"));
			ConactUsForm.click();
			Thread.sleep(1000);
			
//			Find the Test field for email
//			Enter email address 
			WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
			email.sendKeys("Zhivko@gmail.com");
			
//			Click on Submit
			WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
			submit.click();
//			Verify you get the error message:
//			"Error: all fields are required"
	//	
			
			Thread.sleep(2000);
			
			String  expectedMsg = driver.findElement(By.xpath("html/body")).getText();
			//System.out.println(expectedMsg);
			
			String actualMsg = "Error: all fields are required";

			if(expectedMsg.equals(actualMsg)) {
				System.out.println("Test Pass");
			}else {
				System.out.println("Test Fail");
			}
			
			
			
			driver.quit();
			
			
		}
		
	    }
	

	