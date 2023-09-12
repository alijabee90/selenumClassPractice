package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebaySearch {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");

        WebElement searchBox = driver.findElement(By.id("gh-ac")); 
        searchBox.sendKeys("US Army coffee mug");

        WebElement searchButton = driver.findElement(By.id("gh-btn")); 
        searchButton.click();
    }
}