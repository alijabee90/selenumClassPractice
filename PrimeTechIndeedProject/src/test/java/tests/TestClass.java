package tests;

import java.time.Duration;


import pages.IndeedHomePage;
import utils.DataReader;
import utils.Driver;

public class TestClass {
	public static void main(String[] args) {
		Indeedhomepage();
	}
	
	static IndeedHomePage Indeedpage;
	
	public static void Indeedhomepage() {
		
		Indeedpage= new IndeedHomePage();
		
		Driver.getDriver().get(DataReader.getProperty("indeed"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	
	
	}
}

