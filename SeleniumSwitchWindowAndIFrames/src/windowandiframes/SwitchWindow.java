package windowandiframes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow {
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
    public void testSwitchWindow() throws Exception {
        //get the handle
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Handle: " + parentHandle);

        // find open window button
        WebElement openWindowBtn = driver.findElement(By.id("openwindow"));
        openWindowBtn.click();

        //get all handles
        Set<String> handles = driver.getWindowHandles();

        //switching between handles
        for (String handle: handles ) {
            System.out.println(handle);
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                WebElement searchBar = driver.findElement(By.name("course"));
                searchBar.sendKeys("python");
                WebElement searchClick = driver.findElement(By.className("search-course"));
                searchClick.click();

                Thread.sleep(2000);

                driver.close();
                break;
            }
        }

        //Switch back to parent window
        driver.switchTo().window(parentHandle);
        WebElement nameInput = driver.findElement(By.id("name"));
        nameInput.sendKeys("Femke");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
