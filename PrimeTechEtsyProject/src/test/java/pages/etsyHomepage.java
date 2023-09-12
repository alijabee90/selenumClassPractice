package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class etsyHomepage {
	public etsyHomepage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (css = ".select-signin")
	public WebElement hp_signin_button;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_jewelry_accessory_link;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_clothing_shoes_link;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_home_living_link;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_wedding_party_link;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_toys_entertainment_link;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_art_collectables_link;
	}


