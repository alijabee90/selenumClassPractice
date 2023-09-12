package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class indeedHomeWrok {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.indeed.com/");
        
        String homeURL = driver.getCurrentUrl();
        System.out.println("Home URL is: " + homeURL);

        String homeTitle = driver.getTitle();
        System.out.println("Title is: " + homeTitle);

        WebElement what = driver.findElement(By.name("q"));
        what.sendKeys("SDET");

        WebElement searchButton = driver.findElement(By.className("icl-WhatWhere-button"));
        searchButton.click();
        
        Thread.sleep(1000);

        String searchURL = driver.getCurrentUrl();
        System.out.println("Search URL is: " + searchURL);

        String searchTitle = driver.getTitle();
        System.out.println("Search Title is: " + searchTitle);

        if (!searchURL.equals(homeURL) && searchURL.contains("SDET")) {
            System.out.println(" Passed - searchURL is different from homeURL and contains the search criteria.");
        } else {
            System.out.println(" Failed - searchURL is equal to homeURL or does not contain the search criteria.");
        }

        if (!searchTitle.equals(homeTitle) && searchTitle.contains("SDET")) {
            System.out.println(" Passed - searchTitle is different from homeTitle and has the search criteria.");
        } else {
            System.out.println(" Failed - searchTitle is equal to homeTitle or does not have the search criteria.");
        }

        WebElement jobsInLocation = driver.findElement(By.id("searchCountPages"));
        String jobsInLocation_text = jobsInLocation.getText();

        if (jobsInLocation_text.contains("SDET")) {
            System.out.println(" Passed - The JobsInLocation field contains the search criteria.");
        } else {
            System.out.println(" Failed - The JobsInLocation field does not contain the search criteria.");
        }

        driver.quit();
    }
}