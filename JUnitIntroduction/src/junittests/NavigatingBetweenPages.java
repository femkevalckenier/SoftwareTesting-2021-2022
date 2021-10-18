package junittests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigatingBetweenPages {

    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void test() throws InterruptedException {
        driver.get(baseURL);
        String title = driver.getTitle();
        String currentURL = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentURL + " with title: " + title);

        String urlToNavigate = "https://sso.teachable.com/secure/42299/identity/login";
        driver.navigate().to(urlToNavigate);

        title = driver.getTitle();
        currentURL = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentURL + " with title: " + title);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate back");
        title = driver.getTitle();
        currentURL = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentURL + " with title: " + title);

        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("Navigate forward");
        title = driver.getTitle();
        currentURL = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentURL + " with title: " + title);

        driver.navigate().refresh();
        System.out.println("Refreshed the page");

        String pageSource = driver.getPageSource();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
