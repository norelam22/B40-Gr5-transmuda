package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountFilterPage extends BasePage {

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Customers']")
    public WebElement customers;

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Accounts']")
    public WebElement accounts;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filtersButton;


    @FindBy(xpath = "//div[@class='filter-container']//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    public List<WebElement> getAccountsDorpDownElement;


    public void waitForLoaderToDisappear() {

        BrowserUtils.waitForInvisibilityOf(loaderMask);
        filtersButton.click();
    }


}
