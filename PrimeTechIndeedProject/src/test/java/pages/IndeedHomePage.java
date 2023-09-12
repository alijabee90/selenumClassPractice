package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class IndeedHomePage {
	public IndeedHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "text-input-what")
	public WebElement whatField;
	
	@FindBy (id = "text-input-where")
	public WebElement whereField;
	
	@FindBy (css = ".yosegi-InlineWhatWhere-primaryButton")
	public WebElement homepageSearchButton;
	
	@FindBy (linkText = "Post your resume")
	public WebElement homepagePostResumeLink;
	
}
