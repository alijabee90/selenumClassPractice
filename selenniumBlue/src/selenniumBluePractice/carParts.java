package selenniumBluePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class carParts {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alija\\OneDrive\\Desktop\\web tools\\selenium-java-3.141.59\\chroomdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.copart.com");

        WebElement searchBox = driver.findElement(By.id("input-search"));
        searchBox.sendKeys("Mercedes e63 AMG");

        WebElement searchButton = driver.findElement(By.id("homepageHeadersearchsubmit")); 
        searchButton.click();
	}

}
