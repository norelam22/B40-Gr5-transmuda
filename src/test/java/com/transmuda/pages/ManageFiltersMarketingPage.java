package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.lang.model.element.Element;
import javax.naming.Reference;
import java.net.ConnectException;
import java.util.List;

public class ManageFiltersMarketingPage extends BasePage {


    LoginPage loginPage;

    @Override
    public void waitUntilLoaderScreenDisappear() {
        super.waitUntilLoaderScreenDisappear();
    }

    @FindBy(xpath = "(//span[contains(text(),'Marketing')]/..)[1]")
    public WebElement marketingButton;

    @FindBy(xpath = "(//*[contains(text(),'Campaigns')])[1]")
    public WebElement campaignButton;

    @FindBy(xpath = "(//div//a[@href='#'])[23]")
    public WebElement filterButton;

    @FindBy(xpath = "//a[@class='add-filter-button']/..")
    public WebElement manageFiltersButton;

    @FindBy(xpath = "//select[@data-action='add-filter-select']")
    public WebElement parentElementCheckbox;

    //    public int loopThroughCheckboxesInt() {
//        Select filter = new Select(parentElementCheckbox);
//
//        List<WebElement> listOfFilters = filter.getOptions();
//        listOfFilters.remove(0);
//
//
//        int count = 0;
//
//        for (WebElement eachCheckbox : listOfFilters) {
//            if (eachCheckbox.isSelected()) {
//                count++;
//                BrowserUtils.sleep(1);
//            }
//            return count;
//        }
//        return count;
//    }
    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']//input[@type='checkbox']")
    public List<WebElement> checkboxes;


    //Get selected count method for checkboxes
    public int getSelectedCount() {
        int count = 0;
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                count++;
            }
        }
        return count;
    }


    // Chose the amount of checkboxes you would like to uncheck
    public void chooseWhichCheckboxes_toUncheck(int unCheckedCount) {
        BrowserUtils.sleep(2);

       try {
           for (WebElement eachCheckbox : checkboxes) {
                     // check if each element is clickable
                   // #2 create logic for (if not what will happen) -->
                   if (eachCheckbox.isSelected()) {
                       switch (unCheckedCount) {
                           case (1):

                               checkboxes.get(0).click();
                               break;

                           case (2):

                               BrowserUtils.sleep(1);
                               checkboxes.get(0).click();

                               BrowserUtils.sleep(1);
                               checkboxes.get(1).click();

                               break;
                           case (3):

                               BrowserUtils.sleep(1);
                               checkboxes.get(0).click();

                               BrowserUtils.sleep(1);
                               checkboxes.get(1).click();

                               BrowserUtils.sleep(1);
                               checkboxes.get(2).click();

                               break;
                           case (4):

                               BrowserUtils.sleep(1);
                               checkboxes.get(0).click();

                               BrowserUtils.sleep(1);
                               checkboxes.get(1).click();

                               BrowserUtils.sleep(1);
                               checkboxes.get(2).click();

                               BrowserUtils.sleep(1);
                               checkboxes.get(3).click();

                               break;
                           case (5):
                               BrowserUtils.sleep(1);
                               checkboxes.get(0).click();

                               BrowserUtils.sleep(1);
                               checkboxes.get(1).click();

                               BrowserUtils.sleep(1);
                               checkboxes.get(2).click();

                               BrowserUtils.sleep(1);
                               checkboxes.get(3).click();

                               BrowserUtils.sleep(1);
                               checkboxes.get(4).click();

                               break;
                       }
                   }
               }

       }catch (RuntimeException ignored){

       }
    }




public void ifBoxIsChecked_Uncheck(int desiredCheckbox) {

    for (WebElement checkbox : checkboxes) {
        if (checkbox.isSelected()) {
            checkbox.click();
        }
    }


}


// This method cannot be used,
public boolean loopThroughCheckboxesBoolean() {
    Select filter = new Select(parentElementCheckbox);

    List<WebElement> listOfFilters = filter.getOptions();
    listOfFilters.remove(0);

    for (WebElement eachCheckbox : listOfFilters) {
        BrowserUtils.sleep(1);
        if (eachCheckbox.isSelected()) {
            return eachCheckbox.isSelected();

        }
    }
    return false;
}


// Emanuele's login method (practice)
public void loginAs(String roleType) {

    loginPage = new LoginPage();

    if (roleType.trim().equalsIgnoreCase("driver")) {
        loginPage.login(ConfigurationReader.getProperty("driver_username"),
                ConfigurationReader.getProperty("driver_password"));

    } else if (roleType.trim().equalsIgnoreCase("sales manager")) {
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"),
                ConfigurationReader.getProperty("sales_manager_password"));

    } else if (roleType.trim().equalsIgnoreCase("store manager")) {
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"),
                ConfigurationReader.getProperty("store_manager_password"));

    } else {
        throw new IllegalArgumentException("Invalid role type, please re-enter");
    }

}


}
