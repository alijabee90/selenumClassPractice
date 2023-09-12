package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.SigninPage;
import pages.etsyHomepage;
import utils.DataReader;
import utils.Driver;

public class EtsySignin {
public static void etsyInvalidSigninTest() {
		
		//1. Go to etsy.com
		Driver.getDriver().get(DataReader.getProperty("appurl"));
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.getDriver().manage().window().maximize();
		
		etsyHomepage etsyhomepage = new etsyHomepage();
	    SigninPage signinpage= new SigninPage();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
		
		//2. Click on signin button
		etsyhomepage.hp_signin_button.click();
		wait.until(ExpectedConditions.visibilityOf(signinpage.signin_page_signin_text));
		//3. Type "automation" to email field
		signinpage.signin_page_email.sendKeys("automation");
		//4. Type "automation" to password field
		signinpage.signin_page_password.sendKeys("automation");
		//5. click on the sign in button
		signinpage.signin_page_signIn_button.click();
	}
}
