package waittypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void testMouseHoverActions() throws Exception {
        driver.get(baseURL);
        driver.findElement(By.xpath("//div[@id='navbar-inverse-collapse']/div//a[@href='/login']")).click();

        driver.findElement(By.id("email")).sendKeys("Test");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
