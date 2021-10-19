package profilesandoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class ChromeOptionsDemo {
    public static void main(String[] args) {
        String baseURL = "https://google.com";
        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:/Users/Femke/AppData/Local/Google/Chrome/User Data/Default/Extensions/ghbmnnjooekpmoecnnnilnnbdlolhkhi/1.35.0_0.crx"));

        driver = new ChromeDriver(options);
        driver.get(baseURL);
    }
}
