package com.transmuda.step_definitions;

import com.transmuda.pages.VehiclesPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US117_VehiclesStepDefs {

        //US117_VehiclesStepDefs us117_VehiclesStepDefs = new US117_VehiclesStepDefs();
    VehiclesPage vehiclesPage = new VehiclesPage();

    @When("the user navigate to {string} to {string}")
    public void the_user_navigate_to_to(String tab, String module) {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        vehiclesPage.navigateToModule(tab,module);


    }

    @Then("the user hover over three dots")
    public void the_user_hover_over_three_dots() {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(2);
        BrowserUtils.hover(vehiclesPage.threeDots);
        BrowserUtils.sleep(2);

    }

    @Then("the user see following options")
    public void theUserSeeFollowingOptions(List<String> options) {

        BrowserUtils.sleep(3);

        //this will get three options (View, Edit, Delete) from the page
        List<String> ActualOptions = BrowserUtils.getElementsTitle(vehiclesPage.list_Icon);

        System.out.println("Expected Options: " + options);
        System.out.println("Actual Options: " + ActualOptions);

        Assert.assertEquals(options,ActualOptions);

    }



}
