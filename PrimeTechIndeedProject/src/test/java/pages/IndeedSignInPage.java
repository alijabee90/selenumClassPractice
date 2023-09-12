package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class IndeedSignInPage {
	
	public IndeedSignInPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (linkText = "Sign in")
	public WebElement signinButton;
	
	@FindBy (xpath = "//h1[text()='Ready to take the next step?']")
	public WebElement signInPage_ReadyForNextStep_Text;
	
	@FindBy (name = "__email")
	public WebElement signInPage_emailField;
	
	@FindBy (xpath = "//button[@data-tn-element='auth-page-email-submit-button']")
	public WebElement signInPage_continueBtn;
	
	@FindBy (xpath = "//h1[text()='Create your account']")
	public WebElement signInPage_createAccount_Text;
	
	@FindBy (linkText = "Sign up with a password instead")
	public WebElement signInPage_signup_with_password;

}

