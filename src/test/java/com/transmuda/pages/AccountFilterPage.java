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
//      emanuele check boxes count code
//    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']//input[@type='checkbox']")
//    public List<WebElement> checkboxes;
//
//    public void uncheckSelectedCheckBoxes(int uncheckedCount) {
//
//        waitUntilLoaderScreenDisappear();
//        int unchecked = 0;
//
//        for (WebElement checkbox : checkboxes) {
//            if (checkbox.isSelected() && checkbox.isEnabled() && checkbox
//                    .isDisplayed()) {
//                checkbox.click();
//                unchecked++;
//            }
//            if (unchecked >= uncheckedCount) {
//                break;
//            }
//        }
//    }

}
