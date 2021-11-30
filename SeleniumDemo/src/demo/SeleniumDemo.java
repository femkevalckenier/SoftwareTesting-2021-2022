package demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumDemo {
    private WebDriver driver;
    private String baseURL;
    private JavascriptExecutor js;

    @Before
    public void setUp() throws Exception {
        baseURL = "https://courses.letskodeit.com/practice";
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;

        // pagina naar maximum grootte zetten en wachten tot alle elementen op de pagina geladen zijn
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // naar baseURL navigeren
        driver.get(baseURL);
    }

    @Test
    public void clickRadioButton() throws Exception {
        //vind de radiobutton en klik erop met de .click() methode
        Thread.sleep(2000);
        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
        bmwRadioBtn.click();
        System.out.println("Clicked radio button BMW");
    }

    @Test
    public void selectFromDropDown() throws Exception {
        //vind de dropdown
        Thread.sleep(2000);
        WebElement carDropdown = driver.findElement(By.id("carselect"));
        Select sel = new Select(carDropdown);

        //verschillende manieren om items te selecteren
        Thread.sleep(2000);
        sel.selectByValue("bmw");
        System.out.println("Selected BMW by value");

        Thread.sleep(2000);
        sel.selectByVisibleText("Benz");
        System.out.println("Selected Benz by value");

        Thread.sleep(2000);
        sel.selectByIndex(2);
        System.out.println("Selected Honda by index");
    }

    @Test
    public void multipleSelect() throws Exception {
        Thread.sleep(2000);
        WebElement fruitsMultipleSelect = driver.findElement(By.name("multiple-select-example"));
        Select sel = new Select(fruitsMultipleSelect);

        Thread.sleep(2000);
        sel.selectByValue("orange");
        System.out.println("Selected orange by value");

        Thread.sleep(2000);
        sel.selectByIndex(0);
        System.out.println("Selected apple by index");

        Thread.sleep(2000);
        sel.selectByVisibleText("Peach");
        System.out.println("Selected peach by visible text");
    }

    @Test
    public void switchWindows() throws Exception {
        //parenthandle (de originele pagina waarop je begonnen bent) ophalen
        Thread.sleep(2000);
        String parentHandle = driver.getWindowHandle();
        System.out.println("ParentHandle: " + parentHandle);

        //zoek de open window button en klik erop
        WebElement openWindowBtn = driver.findElement(By.id("openwindow"));
        openWindowBtn.click();

        //alle handles ophalen
        Set<String> handles = driver.getWindowHandles();

        //switchen tussen verschillende handles
        for (String handle: handles) {
            System.out.println(handle);
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                WebElement searchBar = driver.findElement(By.name("course"));
                searchBar.sendKeys("python");
                driver.findElement(By.className("search-course")).click();

                Thread.sleep(2000);

                driver.close();
                break;
            }
        }
    }

    @Test
    public void scrollOnPage() throws Exception {
        Thread.sleep(2000);

        //Scroll down
        js.executeScript("window.scrollBy(0, 1900)");
        Thread.sleep(2000);

        //Scroll up
        js.executeScript("window.scrollBy(0, -1900)");
        Thread.sleep(2000);

        //Scroll Element into view
        WebElement element = driver.findElement(By.id("mousehover"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -1900)");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
