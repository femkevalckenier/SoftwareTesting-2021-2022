package junittests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasicActions {

    WebDriver driver = new ChromeDriver();
    String baseURL;

    @Before
    public void setUp() throws Exception {
        baseURL = "https://letskodeit.teachable.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() {
        driver.get(baseURL);
        driver.findElement(By.xpath(".//div[@id='navbar']//a[@href='/sign_in']")).click();
        System.out.println("Clicked on login!");

        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("test@email.com");
        System.out.println("Sending keys to e-mail field");

        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_email")).sendKeys("password");
        System.out.println("Sending keys to password field");
    }
}
