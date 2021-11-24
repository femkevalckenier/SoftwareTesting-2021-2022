package windowandiframes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchFrame {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @Test
    public void testSwitchFrame() throws Exception {
        Thread.sleep(6000);
        driver.switchTo().frame("iframe-name");
        WebElement searchBar = driver.findElement(By.id("search"));
        searchBar.sendKeys("python");
        WebElement searchClick = driver.findElement(By.name("search"));
        searchClick.click();

        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Femke");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
