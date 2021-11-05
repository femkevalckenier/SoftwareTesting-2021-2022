package waittypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitWithMethodClick {
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

        wt.clickWhenReady(By.id("openwindow"), 3);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }

}
