package classReview;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
public class thursday0810 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");

	


		Alerthandel();
	
	}
	
	
	
	public static void testCase1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		
  
//		Navigate to (https://www.thetestingworld.com/testings).
		String url = "https://www.thetestingworld.com/testings";
		driver.get(url);
//		Maximize the browser & declare implicitly wait for 5 second.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
// Implicit Wait:
//      1- Set globally
//		2- Applies to all elements
//		3- Does not require a setting of a condition
//		4- Best used when all elements are loaded before the duration time set

//		Locate  "Register" webelement & varifly the element isDisplayed().
		WebElement registerBtn = driver.findElement(By.id("tab1"));
		System.out.println("The Register Button is Displayed " + registerBtn.isDisplayed());
//		Locate the textBox's for:  userName, email, passWord & sendKeys the values for each box.
		WebElement userName = driver.findElement(By.xpath("//input[@name='fld_username']"));
		String userN = "KingAli";
		WebElement email = driver.findElement(By.xpath("//input[@name='fld_email']"));
		String userEmail = "Alijabee@gmail.com";
		WebElement passWord = driver.findElement(By.xpath("//input[@name='fld_password']"));
		WebElement confirmPassW = driver.findElement(By.xpath("//input[@name='fld_cpassword']"));
		String userPassw = "12345";
		
		userName.sendKeys(userN);
		email.sendKeys(userEmail);
		
		passWord.sendKeys(userPassw);
		confirmPassW.sendKeys(userPassw);
		
		
//		Locate the "Date of birth", send the date in the correct format then click "Enter" using (Keys.ENTER).
		WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
		String userDOB = "12/12/2000";
		
		//dob.sendKeys(userDOB);
		//dob.sendKeys(Keys.ENTER);
		dob.sendKeys(Keys.chord(userDOB, Keys.ENTER));
		//dob.sendKeys("06/13/1997", Keys.ENTER);
		
//		Locate "Select Country" dropdown & use select one for each: by value/visible text/index .
		WebElement countryDD = driver.findElement(By.id("countryId"));
		Select sel = new Select(countryDD);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("4");
		Thread.sleep(2000);
		sel.selectByVisibleText("United States");
//		Locate the "State" dropdown, use explicit wait for 3 seconds the select state by value 
		WebElement stateDD = driver.findElement(By.id("stateId"));
		
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.elementToBeClickable(stateDD));
		
		
		Select sle1 = new Select(stateDD);
		sle1.selectByValue("3974");

		
		
//		Locate the "City" dropdown, use explicit wait for 3 seconds the select state by value 
		WebElement cityDD = driver.findElement(By.id("cityId"));
		
		WebDriverWait wt = new WebDriverWait(driver, 3);
		wt.until(ExpectedConditions.elementToBeClickable(cityDD));
		
		Select sle2 = new Select(cityDD);
		sle2.selectByVisibleText("Reston");
		
		
//		Locate checkbox for "terms & conditions" & "Sign up" then click on both.  
		
	}
	
	
public static void task2() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
    

		
//		Test case: registerUser 
//		   
//		Step 1: Go to URL "https://www.thetestingworld.com/testings".
		WebDriver driver1 = new ChromeDriver();
		String url = "https://www.thetestingworld.com/testings";
		driver1.get(url);
//		Step 2: Maximize the browser & declare implicitly wait for 5 second.
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Step 3:  Verify the browser landed on the "Register" page. 
		
		WebElement registerBtn = driver1.findElement(By.xpath("//*[@for='tab1']"));
		System.out.println("The Register Button is Displayed " + registerBtn.isDisplayed());

//		Step 4: Locate all the required Text Boxes, Dropdowns, Radio Buttons.
	
		WebElement userName = driver1.findElement(By.xpath("//input[@name='fld_username']"));
		String userN = "kingAli101";
		WebElement email = driver1.findElement(By.xpath("//input[@name='fld_email']"));
		String userEmail = "kingali101@gmail.com";
		WebElement passWord = driver1.findElement(By.xpath("//input[@name='fld_password']"));
		WebElement confirmPassW = driver1.findElement(By.xpath("//input[@name='fld_cpassword']"));
		String userPassw = "987654";
		
		userName.sendKeys(userN);
		email.sendKeys(userEmail);
		
		passWord.sendKeys(userPassw);
		confirmPassW.sendKeys(userPassw);
		
		WebElement dob = driver1.findElement(By.xpath("//input[@name='dob']"));
		String userDOB = "10/31/1990";
		
		//dob.sendKeys(userDOB);
		//dob.sendKeys(Keys.ENTER);
		dob.sendKeys(Keys.chord(userDOB, Keys.ENTER));
		
		WebElement phoneNumber = driver1.findElement(By.cssSelector("input[name='phone']"));
		String userPHnumber = "7737737737";
		phoneNumber.sendKeys(userPHnumber);
		
		WebElement address = driver1.findElement(By.cssSelector("input[name='address']"));
		String userAddress = "12345 westown pkwy";
		address.sendKeys(userAddress);
		
		WebElement radioAddresstype = driver1.findElement(By.cssSelector("input[value='office']"));
		radioAddresstype.click();
		
		WebElement genderDD = driver1.findElement(By.cssSelector("select[name='sex']"));
		Select sl3 = new Select(genderDD);
		sl3.selectByVisibleText("Male");
		
		WebElement countryDD = driver1.findElement(By.id("countryId"));
		Select sel = new Select(countryDD);
		sel.selectByValue("231");
		
		WebElement stateDD = driver1.findElement(By.id("stateId"));
		WebDriverWait wait = new WebDriverWait(driver1,3);
		wait.until(ExpectedConditions.elementToBeClickable(stateDD));
		Select sle1 = new Select(stateDD);
		sle1.selectByValue("3974");
		
		WebElement cityDD = driver1.findElement(By.id("cityId"));
		WebDriverWait wt = new WebDriverWait(driver1, 3);
		wt.until(ExpectedConditions.elementToBeClickable(cityDD));
		Select sle2 = new Select(cityDD);
		sle2.selectByVisibleText("Fairfax");
		
		WebElement zipCode = driver1.findElement(By.cssSelector("input[name='zip']"));
		String userZipCode = "11001";
		zipCode.sendKeys(userZipCode);
		
		

//		Step 5: Locate the checkbox for Terms and Conditions and Sign Up button and click.  
		
		WebElement termsAndCond = driver1.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		termsAndCond.click();
		WebElement logInBtn = driver1.findElement(By.xpath("//*[@value='Sign up']"));
		logInBtn.click();
		
//		Step 6: Locate "User is successfully Register. Now You can Login" webelement and verify its displayed on the page. 
		
		String actualMsg = "User is successfully Register. Now You can Login";
		String expectedMsg = driver1.findElement(By.className("vd_green")).getText();
		
//		System.out.println(actualMsg + "VS" +expectedMsg);
//		Step 7: Locate the Login button and click on it. 
		
		
	}
	private static void Task3() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	       

	        // Step 1: Go to URL "https://www.thetestingworld.com/testings"
	        driver.get("https://www.thetestingworld.com/testings");

	        // Step 2: Maximize the browser & declare implicitly wait for 5 seconds
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //Locate the Login button and click on it.
			driver.findElement(By.xpath("//label[contains(text(),'Login')]")).click();
	//Locate the userName and passWord text box and put your info. 
	//Locate the Login button and click on it. 
			WebElement userNameBox = driver.findElement(By.xpath("//input[@name='_txtUserName']"));
			userNameBox.sendKeys("PrimeT");
			WebElement passWordBox = driver.findElement(By.xpath("//input[@name='_txtPassword']"));
			passWordBox.sendKeys("12345");
			WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
			loginBtn.click();
	//Locate the Home button then select "user list" from the drop down menu
			WebElement homeBtn = driver.findElement(By.xpath("//*[contains(text(),'Home')]"));
			//homeBtn.click();
			Thread.sleep(1000);
			
			
			Actions letdoaction = new Actions(driver);
			letdoaction.moveToElement(homeBtn).perform();
			
			Thread.sleep(1000);
			
			WebElement userListbtn = driver.findElement(By.xpath("//*[contains(text(),'User List')]"));
			userListbtn.click();
			
			
	//Save all users in a List of WebElements, then print the user information 
	//Print only the email and phone number for user 2. 

		List <WebElement> usersLst = driver.findElements(By.className("items"));
		System.out.println(usersLst.size());
		for (int i = 0; i < usersLst.size(); i++) {
			System.out.println(usersLst.get(i).getText());
		}
	        // Close the browser
	        driver.quit();
	    }
	public static void Alerthandel() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
			
			String url = "https://demoqa.com/alerts";
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(1000);
			driver.findElement(By.id("promtButton")).click();
			
			Alert alert = driver.switchTo().alert();
			
			alert.sendKeys("Kewan");
			alert.accept();
			
		}
	}
	



	


