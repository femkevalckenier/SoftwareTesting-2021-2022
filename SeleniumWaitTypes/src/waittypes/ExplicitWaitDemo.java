package waittypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitDemo {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";

        driver.manage().window().maximize();
    }

    @Test
    public void testMouseHoverActions() throws Exception {
        driver.get(baseURL);
        WebElement login = driver.findElement(By.xpath("//div[@id='navbar-inverse-collapse']/div//a[@href='/login']"));
        login.click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement emailField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        emailField.sendKeys("Test");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
