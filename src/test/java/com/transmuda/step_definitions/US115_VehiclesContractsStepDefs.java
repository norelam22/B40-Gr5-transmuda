package com.transmuda.step_definitions;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.*;
import com.transmuda.pages.VehicleContractsPage;
import org.junit.Assert;

public class US115_VehiclesContractsStepDefs {

    VehicleContractsPage vcPage = new VehicleContractsPage();

    @When("I navigate to the Vehicle Contracts page")
    public void i_navigate_to_the_vehicle_contracts_page() {
        vcPage.navigateToFleet();
    }
    @Then("the page URL should be {string}")
    public void the_page_url_should_be(String expectedUrl) {
        BrowserUtils.sleep(5);
        System.out.println(Driver.getDriver().getCurrentUrl());
        BrowserUtils.verifyURLContains(expectedUrl);

    }
    @Then("the page title should be {string}")
        public void the_page_title_should_be(String expectedTitle) {
        System.out.println(Driver.getDriver().getTitle());
        BrowserUtils.waitForTitleContains(expectedTitle);

    }

    @Then("I should see an authorization error {string}")
    public void i_should_see_an_authorization_error(String expectedMessage) {
        Assert.assertEquals(vcPage.errorMessage.getText(), expectedMessage);

    }

    @Then("the page URL should not be {string}")
    public void the_page_url_should_not_be(String expectedURL) {
       //String actualURL = Driver.getDriver().getCurrentUrl();
        BrowserUtils.verifyURLContains(expectedURL);


    }
}
