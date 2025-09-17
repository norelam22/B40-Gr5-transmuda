package com.transmuda.step_definitions;

import com.transmuda.pages.AccountFilterPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US123_AccountFilter_StepDefs {

    AccountFilterPage us123Pages = new AccountFilterPage();

    @When("the user views the available filter options")
    public void the_user_views_the_available_filter_options() {

        us123Pages.waitForLoaderToDisappear();
    }

    @Then("the user should see the following 8 filters:")
    public void theUserShouldSeeTheFollowingFilters(List<String> expected) {

        us123Pages.listOfFilters(expected);
    }


}
