package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US124_VehicleCostsStepDefs extends BasePage {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @When("the user navigates to {string} and {string}")
    public void the_user_navigates_to_and(String tab, String module) {
        this.navigateToModule(tab, module);
        System.out.println("Step reached");
    }

    @Then("the user should see 3 columns on the Vehicle Costs page: TYPE, TOTAL PRICE, DATE")
    public void the_user_should_see_3_columns_on_the_vehicle_costs_page_type_total_price_date() {
        BrowserUtils.waitForVisibility(vehicleCostsPage.typeColumnHeader, 5);
        BrowserUtils.waitForVisibility(vehicleCostsPage.totalPriceColumnHeader, 5);
        BrowserUtils.waitForVisibility(vehicleCostsPage.dateColumnHeader, 5);

        List<String> actualHeaders = Arrays.asList(
                vehicleCostsPage.typeColumnHeader.getText().trim().toUpperCase(),
                vehicleCostsPage.totalPriceColumnHeader.getText().trim().toUpperCase(),
                vehicleCostsPage.dateColumnHeader.getText().trim().toUpperCase()
        );

        List<String> expectedHeaders = Arrays.asList("TYPE", "TOTAL PRICE", "DATE");
        Assert.assertEquals("Headers do not match!", expectedHeaders, actualHeaders);
    }

    @When("the user selects the first checkbox")
    public void the_user_selects_the_first_checkbox() throws InterruptedException {
        BrowserUtils.waitForInvisibilityOf(loaderMask);
        WebElement selectAllCheckbox = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", selectAllCheckbox);
        System.out.println("Clicked the first checkbox");

    }

    @Then("all Vehicle Cost checkboxes should be selected")
    public void all_vehicle_cost_checkboxes_should_be_selected() {

        for (WebElement eachCheckbox : vehicleCostsPage.allCheckboxes) {
            Assert.assertTrue("A check box was not selected", eachCheckbox.isSelected());
        }
    }
}
