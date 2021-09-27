package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IdXPATHDemo {
    public static void main(String[] args) {
        String baseURL = "https://learn.letskodeit.com/";
        WebDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //navigate to baseURL
        driver.get(baseURL);

        //navigate to login page
        driver.findElement(By.xpath("//a[@href='/sign_in']")).click();

        //enter e-mail in input
        driver.findElement(By.name("email")).sendKeys("femke.val@hotmail.be");
    }
}
