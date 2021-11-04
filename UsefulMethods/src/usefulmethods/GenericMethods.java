package usefulmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

public class GenericMethods {
    WebDriver driver;

    public GenericMethods(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(String locator, String type) {
        type = type.toLowerCase();
        if (type.equals("id")) {
            System.out.println("Element found with id");
            return this.driver.findElement(By.id(locator));
        }
        else if (type.equals("xpath")) {
            System.out.println("Element found with xpath");
            return this.driver.findElement(By.xpath(locator));
        }
        else if (type.equals("classname") || type.equals("class")) {
            System.out.println("Element found with class");
            return this.driver.findElement(By.className(locator));
        }
        else {
            System.out.println("Unsupported type");
            return null;
        }
    }

    public List<WebElement> getElementList(String locator, String type) {
        type = type.toLowerCase();
        if (type.equals("id")) {
            System.out.println("Element found with id");
            return this.driver.findElements(By.id(locator));
        }
        else if (type.equals("xpath")) {
            System.out.println("Element found with xpath");
            return this.driver.findElements(By.xpath(locator));
        }
        else if (type.equals("classname") || type.equals("class")) {
            System.out.println("Element found with class");
            return this.driver.findElements(By.className(locator));
        }
        else {
            System.out.println("Unsupported type");
            return null;
        }
    }

    public boolean isElementPresent(String locator, String type) {
        List<WebElement> elementList = getElementList(locator, type);

        int size = elementList.size();

        if (size > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
