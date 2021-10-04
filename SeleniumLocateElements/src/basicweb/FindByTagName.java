package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindByTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demostore.x-cart.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.tagName("a")).click();

        //Best ways to find elements:
        // id - fastest
        // name
        // xpath
    }
}
