package javascript;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ClickElementUsingJavascript2 {
    private WebDriver driver;
    private JavascriptExecutor js;

    @Before
    private void setUp() throws Exception {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    private void testJSClick2() throws Exception {
        js.executeScript("window.location = 'https://www.retailmenot.com/';");
        driver.findElement(By.xpath("//div[@id='__next']/div[@role='banner']//button[.='Log&nbsp;in']")).click();
    }

    @After
    private void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
