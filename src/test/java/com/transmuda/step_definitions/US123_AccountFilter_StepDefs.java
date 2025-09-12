package com.transmuda.step_definitions;

import com.transmuda.pages.AccountFilterPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US123_AccountFilter_StepDefs {
    AccountFilterPage us123Pages;

    @When("the user navigate to {string} and to {string} module")
    public void the_user_navigate_to_to(String tab, String module) {

        us123Pages = new AccountFilterPage();
        us123Pages.waitUntilLoaderScreenDisappear();
        us123Pages.navigateToModule(tab, module);
    }

    @When("the user views the available filter options")
    public void the_user_views_the_available_filter_options() {

        us123Pages = new AccountFilterPage();
        us123Pages.waitForLoaderToDisappear();
    }

    @Then("the user should see the following 8 filters:")
    public void theUserShouldSeeTheFollowingFilters(List<String> expected) {

        us123Pages = new AccountFilterPage();
        List<String> actualOptions = BrowserUtils.getElementsText(us123Pages.getAccountsDorpDownElement);
        Assert.assertEquals(actualOptions, expected);
    }
}
