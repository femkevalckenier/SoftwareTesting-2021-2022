package junittests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownSelect {
    private WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testDropdown() throws Exception {
        driver.get(baseURL);
        WebElement carDropdown = driver.findElement(By.id("carselect"));

        Select sel = new Select(carDropdown);

        Thread.sleep(2000);
        System.out.println("Selecting Benz by value");
        sel.selectByValue("benz");

        Thread.sleep(2000);
        System.out.println("Selecting Honda by index");
        sel.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Selecting BMW by visible text");
        sel.selectByVisibleText("BMW");

        Thread.sleep(2000);
        System.out.println("Printing the list of all options");
        List<WebElement> options = sel.getOptions();

        for (WebElement option: options) {
            String optionName = option.getText();
            System.out.println(optionName);
        }
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
