package junittests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasicProjectTest {

    // a small first test on our SmartApps project to see if it works

    WebDriver driver = new ChromeDriver();
    String baseURL;

    @Before
    public void setUp() throws Exception {
        baseURL = "http://localhost:3000/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() {
        driver.get(baseURL);
        driver.findElement(By.xpath(".//div[@id='navbar']//a[@href='/movies']")).click();
        driver.findElement(By.xpath(".//div[@class='form-group']//input[@class='form-control']")).sendKeys("Spider-man");
        driver.findElement(By.xpath(".//button[@class='btn btn-warning']")).click();
    }
}
