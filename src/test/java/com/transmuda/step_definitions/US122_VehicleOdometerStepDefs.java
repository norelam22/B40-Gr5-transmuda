package com.transmuda.step_definitions;

import com.transmuda.pages.VehicleOdometerPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US122_VehicleOdometerStepDefs {

    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();

    @When("the user navigates to the {string} tab and to {string} module")
    public void the_user_navigates_to_the_page_and_to_module(String tab, String module) {


        vehicleOdometerPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(5);
        vehicleOdometerPage.navigateToModule(tab, module);
        BrowserUtils.waitForPageToLoad(10);

    }

    @Then("the user should see error message {string}")
    public void the_user_should_see_error_message(String expectedMessage) {

        BrowserUtils.waitForVisibility(vehicleOdometerPage.errorMessage,5);
        BrowserUtils.waitForPageToLoad(10);
        String actualMessage = vehicleOdometerPage.errorMessage.getText().trim();
        Assert.assertEquals(expectedMessage, actualMessage);



    }

    @Then("the user should see the default page as {int}.")
    public void theUserShouldSeeTheDefaultPageAs(int expectedPageNumber) {

        BrowserUtils.waitForVisibility(vehicleOdometerPage.defaultPage,5);

        String actualPageValue = vehicleOdometerPage.defaultPage.getAttribute("value");

        int actualPageNumber = Integer.parseInt(actualPageValue);

        Assert.assertEquals(expectedPageNumber, actualPageNumber);
    }


    @Then("the user should see the View Per Page as {int} by default")
    public void theUserShouldSeeTheViewPerPageAsByDefault(int expectedValue) {

        BrowserUtils.waitForVisibility(vehicleOdometerPage.viewPerPageDropDown,5);

        String actualValueText = vehicleOdometerPage.viewPerPageDropDown.getText().trim();

        int actualValue = Integer.parseInt(actualValueText);

        Assert.assertEquals(expectedValue, actualValue);
    }
}
