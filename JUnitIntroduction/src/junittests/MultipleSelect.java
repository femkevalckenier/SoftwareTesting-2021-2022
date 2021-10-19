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

public class MultipleSelect {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testMultipleSelect() throws Exception {
        driver.get(baseURL);
        WebElement multipleSelect = driver.findElement(By.id("multiple-select-example"));
        Select sel = new Select(multipleSelect);

        Thread.sleep(2000);
        System.out.println("Selecting orange by value");
        sel.selectByValue("orange");

        Thread.sleep(2000);
        System.out.println("Deselecting orange by value");
        sel.deselectByValue("orange");

        Thread.sleep(2000);
        System.out.println("Selecting peach by index");
        sel.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Selecting apple by visible text");
        sel.selectByVisibleText("Apple");

        Thread.sleep(2000);
        System.out.println("Printing all selected options:");
        List<WebElement> selectedOptions = sel.getAllSelectedOptions();

        for(WebElement option: selectedOptions) {
            System.out.println(option.getText());
        }

        Thread.sleep(2000);
        System.out.println("Deselecting all selected options");
        sel.deselectAll();

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
