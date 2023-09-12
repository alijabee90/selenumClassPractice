package day5_MoreWebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
	
		findElementsDemo();
}
public static void keyPressExample() {
    	WebDriver driver = new ChromeDriver();
    	  // Maximize browser
        driver.manage().window().maximize();

        // Declare implicitly wait for 5 seconds
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Go to amazon.com
        driver.get("https://www.amazon.com");

        // Search "coffee mug"
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("coffee mug");
        searchBox.submit();
         // Navigate back
        driver.navigate().back();
        // Search "pretty coffee mug"
        searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.clear();
        searchBox.sendKeys("pretty coffee mug");
        searchBox.submit();
        // Navigate back
        driver.navigate().back();
        // Navigate forward
        driver.navigate().forward();
       // Refresh the page
        driver.navigate().refresh();
        driver.quit();
}
public static void findElementsDemo() throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();

     // Declare implicitly wait for 5 seconds
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.get("https://www.saucedemo.com");
     //log in with username = standard_user   password = secret_sauce
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
//find all the results. print the price of each result. 
//Hint: loop through the list, get index and get text
		List<WebElement> itemsPrice = driver.findElements(By.cssSelector(".inventory_item_price"));
		
		for (int i = 0; i < itemsPrice.size(); i++) {
		    System.out.println(itemsPrice.get(i).getText());
		    // broken down steps.
//			WebElement singleItem = itemsPrice.get(i);
//			String priceofItem = singleItem.getText();
//			System.out.println(priceofItem);
		}
		
		// for each loop version  == demo purpose only
		for (WebElement singleItemPrice : itemsPrice) {
			System.out.println(singleItemPrice.getText());
		}
    
 }
}

