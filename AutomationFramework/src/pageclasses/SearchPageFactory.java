package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageFactory {

    @FindBy(xpath = "//div[@id='wizardMainRegionV2']//div[@class='uitk-tabs-container']/ul[@role='tablist']/li[2]/a[@role='tab']/span[@class='uitk-tab-text']")
    WebElement flightsTab;

    @FindBy(xpath = "//div[@id='wizardMainRegionV2']//div[@class='uitk-tabs-container']/ul[@role='tablist']/li[3]/a[@role='tab']/span[@class='uitk-tab-text']")
    WebElement carsTab;

    @FindBy(xpath = "//div[@id='wizardMainRegionV2']//div[@class='uitk-tabs-container']/ul[@role='tablist']/li[5]/a[@role='tab']/span[@class='uitk-tab-text']")
    WebElement thingsToDoTab;

    public void clickFlightTab() {
        flightsTab.click();
    }

    public void clickCarsTab() {
        carsTab.click();
    }

    public void clickThingsToDoTab() {
        thingsToDoTab.click();
    }
}
