package usefulmethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IsElementPresentDemo {
    private WebDriver driver;
    private String baseURL;
    private GenericMethods methods;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";
        methods = new GenericMethods(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testMethod() throws Exception {
        driver.get(baseURL);

        boolean result = methods.isElementPresent("name", "id");

        System.out.println("Element is present: " + result);

        result = methods.isElementPresent("name-not-present", "id");

        System.out.println("Element is present: " + result);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
    }
}
