package junittests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtonsAndCheckBoxes {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(2000);
        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
        bmwRadioBtn.click();
        System.out.println("Clicked bmw radiobutton");

        Thread.sleep(2000);
        WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
        benzRadioBtn.click();
        System.out.println("Clicked benz radiobutton");

        Thread.sleep(2000);
        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
        WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
        bmwCheckBox.click();
        System.out.println("Clicked bmw checkbox");
        Thread.sleep(2000);
        benzCheckBox.click();
        System.out.println("Clicked benz checkbox");

        System.out.println("BMW Radio is selected? " + bmwRadioBtn.isSelected());
        System.out.println("Benz Radio is selected? " + benzRadioBtn.isSelected());
    }

    @After
    public void tearDown() throws Exception{
        Thread.sleep(3000);
        driver.quit();
    }
}
