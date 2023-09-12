package test;

import java.time.Duration;

import pages.AmazonHomePage;
import utils.Driver;
import utils.TestDataReader;

public class TestClass {

	public static void main(String[] args) {
		amazonTest();
	}
	
	static AmazonHomePage azpage;
	
	public static void amazonTest() {
		
		azpage = new AmazonHomePage();
		
		Driver.getDriver().get(TestDataReader.getProperty("amazon"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		azpage.amazonSearchBox.sendKeys("Coffee mug");
		azpage.amazonSearchButton.click();
		
	}
}
