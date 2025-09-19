package com.transmuda.step_definitions;

import com.transmuda.pages.VehicleModelsPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US137_VehicleModelsDefs {

    VehicleModelsPage vehicleModelsPage = new VehicleModelsPage();

    @Then("the user navigates to {string} tab and to {string} module")
    public void the_user_navigates_to_tab_and_to_module(String tab, String module) {
        BrowserUtils.sleep(5);

        vehicleModelsPage.navigateToModule(tab, module);
    }

    @Then("the table shows exactly {int} columns")
    public void the_table_shows_exactly_columns(Integer expectedSize) {
        BrowserUtils.sleep(5);
        List<String> actualHeaders = vehicleModelsPage.getColumnHeaders();
        int actualSize = actualHeaders.size();

        System.out.println("Headers -> " + actualHeaders);
        System.out.println("actualSize = " + actualSize + " | expectedSize = " + expectedSize);

        Assert.assertEquals("Header count mismatch! Headers: " + actualHeaders,
                expectedSize.intValue(), actualSize);
    }


    @Then("the table should contain the following column headers:")
    public void the_table_should_contain_the_following_column_headers(List<String> expectedHeaders) {

        List<String> actualHeaders   = vehicleModelsPage.getColumnHeaders();

        System.out.println("Expected -> " + expectedHeaders);
        System.out.println("Actual   -> " + actualHeaders);


        Assert.assertEquals("Header list mismatch!", expectedHeaders, actualHeaders);


    }
}