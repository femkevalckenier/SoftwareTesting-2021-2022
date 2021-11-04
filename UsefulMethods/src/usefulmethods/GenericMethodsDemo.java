package usefulmethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GenericMethodsDemo {
    private WebDriver driver;
    private String baseURL;
    private GenericMethods methods;
    private GenericMethodsNew methods2;

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

        WebElement element = methods.getElement("name", "id");
        element.sendKeys("test");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
    }
}
