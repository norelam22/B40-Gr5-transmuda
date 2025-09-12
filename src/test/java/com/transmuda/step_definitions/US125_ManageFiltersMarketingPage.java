package com.transmuda.step_definitions;

import com.transmuda.pages.ManageFiltersMarketingPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US125_ManageFiltersMarketingPage {

    ManageFiltersMarketingPage ManageFiltersMarketingPage;
    WebDriverWait explicitWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));



    @Given("I navigate to the Marketing page")
    public void i_navigate_to_the_marketing_page() {
        ManageFiltersMarketingPage = new ManageFiltersMarketingPage();                     // Create Object

        ManageFiltersMarketingPage.navigateToModule("Marketing", "Campaigns"); // Navigates to "Marketing" tab
                                                                                         // Then clicks "Campaigns" tab
    }
    @When("I open the filter panel")
    public void i_open_the_filter_panel() {
        BrowserUtils.sleep(6);                                          // Sleep

        ManageFiltersMarketingPage = new ManageFiltersMarketingPage();        // Create Object

        ManageFiltersMarketingPage.filterButton.click();                     // Click filter-icon button

        BrowserUtils.sleep(3);
    }


    @Then("I should see exactly {int} filters checked by default")
    public void iShouldSeeExactlyFiltersCheckedByDefault(int expectedResult) {



        BrowserUtils.sleep(3);                                      // Sleep
        ManageFiltersMarketingPage.manageFiltersButton.click();           // Click "Manage Filters" button

        expectedResult = 5;
        int actualResult = ManageFiltersMarketingPage.getSelectedCount(); // Actual Result -> this method
                                                                         // checks if each filter is selected

        Assert.assertEquals(expectedResult,actualResult);                 // Assertion for checking Expected
                                                                         // Result is equal to Actual Result

    }


    @When("I uncheck {int} random filters")
    public void i_uncheck_random_filters(int uncheckedCount) {

        ManageFiltersMarketingPage = new ManageFiltersMarketingPage();

        BrowserUtils.sleep(5);

        ManageFiltersMarketingPage.chooseWhichCheckboxes_toUncheck(uncheckedCount); // Method used to check uncheck the
                                                                                    // # of boxes you would like to uncheck




    }
    @Then("I should see {int} filters checked")
    public void i_should_see_filters_checked(int expectedCheckedFilters ) {

        ManageFiltersMarketingPage = new ManageFiltersMarketingPage();

        BrowserUtils.sleep(5);

        int actualCheckedFilters = ManageFiltersMarketingPage.getSelectedCount();

        Assert.assertEquals(actualCheckedFilters, expectedCheckedFilters); // Assertion used to VERIFY
                                                                                                    //

    }



}
