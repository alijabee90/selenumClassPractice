package classReview;
import java.security.spec.ECField;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Wend0816 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
	
		TasteCase1();
	}
	
public static void alertHandle () throws InterruptedException {
//		Click the button to display an alert box.
//		Send text to the Alert with your name and title.
//		Then accept the Alert. 
//		Verify that the message displays as it should.

	WebDriver driver = new ChromeDriver();		
	driver.manage().window().maximize();
	
///		Go to "https://demo.automationtesting.in/Alerts.html"		
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
//	Click on Alert with text box. 
	WebElement alertWtext = driver.findElement(By.xpath("//*[text()='Alert with Textbox ']"));
	alertWtext.click();
	driver.findElement(By.className("btn-info")).click();
	
	Alert alt = driver.switchTo().alert();
	Thread.sleep(2000);
	alt.sendKeys("Hello, I am Sam");
	Thread.sleep(2000);
	System.out.println(alt.getText());
	alt.accept();
}

public static void windowHandles () {
	WebDriver driver = new ChromeDriver();		
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	String mainWindowId = driver.getWindowHandle();
	System.out.println(mainWindowId);
	
	WebElement clickBtn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	clickBtn.click();
	
	Set <String> windowsIds = driver.getWindowHandles();
	
	for (String str : windowsIds) {
		if(!str.equals(mainWindowId)) {driver.switchTo().window(str);}
	}
	
	String newPageTxt = driver.findElement(By.className("fs-1")).getText();
	System.out.println(newPageTxt);
	
	driver.switchTo().window(mainWindowId);
	String mainPagetxt = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']")).getText();
	System.out.println(mainPagetxt);
	
		
	}
public static void TasteCase1() {
	WebDriver driver = new ChromeDriver();		
	driver.manage().window().maximize();
	 
	// Step 1: Go to https://testautomationpractice.blogspot.com
    driver.get("https://testautomationpractice.blogspot.com");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    // Step 2: Locate the "JS Alerts" three buttons
    WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
    WebElement confirmButton = driver.findElement(By.xpath("//button[contains(text(),'Confirm Box')]"));
    WebElement promptButton = driver.findElement(By.xpath("//button[contains(text(),'Prompt Alert')]"));

    // Step 3: Click on 'Alert' button then get the text from the Alert and accept it
    alertButton.click();
    Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    System.out.println("Alert Text: " + alertText);
    alert.accept();

    // Step 4: Click on "Confirm Box Alert" then dismiss the Alert
    confirmButton.click();
    Alert confirmAlert = driver.switchTo().alert();
    confirmAlert.dismiss();

    // Step 5: Click on the "Prompt Alert" then send text with your name
    promptButton.click();
    Alert promptAlert = driver.switchTo().alert();
    promptAlert.sendKeys("Your Name");
    promptAlert.accept();

    // Step 6: Confirm that you can see the entered text
    WebElement promptResult = driver.findElement(By.id("promptreturn"));
    String enteredText = promptResult.getText();
    System.out.println("Entered Text: " + enteredText);

    // Close the Browser
    driver.quit();
}
}
	

	



