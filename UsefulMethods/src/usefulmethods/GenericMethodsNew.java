package usefulmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodsNew {
    WebDriver driver;

    public GenericMethodsNew(WebDriver driver) {
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
        List<WebElement> elementList = new ArrayList<WebElement>();
        if (type.equals("id")) {
            elementList = this.driver.findElements(By.id(locator));
        }
        else if (type.equals("name")) {
            elementList = this.driver.findElements(By.name(locator));
        }
        else if (type.equals("xpath")) {
            elementList = this.driver.findElements(By.xpath(locator));
        }
        else if (type.equals("classname") || type.equals("class")) {
            elementList = this.driver.findElements(By.className(locator));
        }
        else {
            System.out.println("Locator type not supported.");
        }

        if (elementList.isEmpty()) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found with " + type + ": " + locator);
        }

        return elementList;
    }
}
