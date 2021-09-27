package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "https://letskodeit.com/";
        driver.get(baseURL);
    }
}
