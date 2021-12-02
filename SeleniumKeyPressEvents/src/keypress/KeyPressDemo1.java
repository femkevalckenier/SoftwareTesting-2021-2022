package keypress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KeyPressDemo1 {
    private WebDriver driver;
    private String baseURL;
    
    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testKeyPress() throws Exception {
        driver.get(baseURL);
        driver.findElement(By.xpath("//div[@id='navbar-inverse-collapse']/div//a[@href='/login']"));
        driver.findElement(By.id("email")).sendKeys("test@email.com");
        driver.findElement(By.id("password")).sendKeys("password");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Login']")).sendKeys(Keys.ENTER);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
