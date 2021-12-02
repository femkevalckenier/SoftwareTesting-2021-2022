package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public static WebElement element = null;

    /**
     * Returns the flight origin text box element
     * @param driver
     * @return
     */
    public static WebElement originTextBox(WebDriver driver) {
        element = driver.findElement(By.xpath("/html//div[@id='location-field-leg1-origin-menu']//button[@class='uitk-fake-input uitk-form-field-trigger']"));
        return element;
    }

    /**
     * Returns the flight destination text box element
     * @param driver
     * return
     */
    public static WebElement destinationTextBox(WebDriver driver) {
        element = driver.findElement(By.xpath("/html//div[@id='location-field-leg1-destination-menu']//button[@class='uitk-fake-input uitk-form-field-trigger']"));
        return element;
    }
}
