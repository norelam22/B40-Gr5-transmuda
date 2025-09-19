package com.transmuda.step_definitions;

import com.transmuda.pages.VehicleModelPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

public class US116_VehiclesModelStepDef {

    VehicleModelPage vehicleModelPage = new VehicleModelPage();

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        // TODO: Implement login logic by role (store manager / sales manager)
    }

    @When("the user navigates to the {string} tab and to the {string} module")
    public void the_user_navigates_to_the_tab_and_to_the_module(String tab, String module) {
        // TODO: Implement navigation to Fleet > Vehicles Model
    }

    @Then("the user should see the following column headers in order:")
    public void the_user_should_see_the_following_column_headers_in_order(DataTable expectedHeaders) {
        // TODO: Collect table header texts and assert exact order vs expectedHeaders
    }

    @Then("the table should have at least {int} data row")
    public void the_table_should_have_at_least_data_row(Integer minRows) {
        // TODO: Count tbody rows and assert >= minRows
    }

    @Given("the user logged in as {string} with password {string}")
    public void the_user_logged_in_as_with_password(String username, String password) {
        // TODO: Implement direct login using username/password (e.g. User20 / UserUser123)
    }

    @Then("the user should see an error message {string}")
    public void the_user_should_see_an_error_message(String expectedMessage) {
        // TODO: Assert that the UI shows the expected error message
    }

    @Then("the Vehicles Model table should not be visible")
    public void the_vehicles_model_table_should_not_be_visible() {
        // TODO: Verify the table is not displayed / not present in DOM
    }
}