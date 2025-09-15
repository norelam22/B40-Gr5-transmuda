package com.transmuda.step_definitions;

import com.transmuda.pages.VehiclesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class US118_VehicleSelectionStepDefs {

    VehiclesPage vehiclesPage = new VehiclesPage();

    @Then("all vehicle checkboxes should be unchecked")
    public void all_vehicle_checkboxes_should_be_unchecked() {

        for (WebElement each : vehiclesPage.allCheckBoxes) {

            Assert.assertFalse("Expected checkbox to be unchecked, but it was checked", each.isSelected());

        }
    }

    @When("the user checks the first checkbox")
    public void the_user_checks_the_first_checkbox() {

        vehiclesPage.checkBox.click();

    }


    @Then("all vehicle checkboxes should be checked")
    public void all_vehicle_checkboxes_should_be_checked() {

        for (WebElement each : vehiclesPage.allCheckBoxes) {

            Assert.assertTrue("Expected checkbox to be checked, but it was unchecked", each.isSelected());

        }
    }


    @Then("the user checks the checkbox of a specific vehicle")
    public void the_user_checks_the_checkbox_of_a_specific_vehicle() {

        vehiclesPage.randomCarSelected.click();

    }


    @Then("only that vehicle’s checkbox should be checked")
    public void only_that_vehicle_s_checkbox_should_be_checked() {

        int selectedCount = 0;
        for (WebElement each : vehiclesPage.allCheckBoxes) {
            if (each.isSelected()) {
                selectedCount++;

            }
        }

        Assert.assertEquals("More than one or none selected", 1, selectedCount);

    }
}
