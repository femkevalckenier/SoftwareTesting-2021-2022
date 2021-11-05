package waittypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithMethod {
    private WebDriver driver;
    private String baseURL;
    private WaitTypes wt;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";
        wt = new WaitTypes(driver);

        driver.manage().window().maximize();
    }

    @Test
    public void testMouseHoverActions() throws Exception {
        driver.get(baseURL);
        WebElement login = driver.findElement(By.xpath("//div[@id='navbar-inverse-collapse']/div//a[@href='/login']"));
        login.click();
        WebElement emailField = wt.waitForElement(By.id("email"), 3);

        emailField.sendKeys("Test");

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
