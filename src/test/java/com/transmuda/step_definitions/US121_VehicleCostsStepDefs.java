package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.US121Page;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class US121_VehicleCostsStepDefs extends BasePage {



    US121Page page=new US121Page();


    @Given("user hovers the mouse cursor on the module Activities and clicks calendar events")
    public void user_hovers_the_mouse_cursor_on_the_module_activities() {
        try {
            Alert alert = Driver.getDriver().switchTo().alert();
            alert.accept();
        }catch (NoAlertPresentException e){
            System.out.println("No alert was present, continuing test");
        }
        BrowserUtils.sleep(5);
        navigateToModule("Activities","Calendar Events");


    }
    @And("user clicks create Calendar Event")
    public void userClicksCreateCalendarEvent() {

        BrowserUtils.sleep(5);

        page.calendarEventsButton.click();

    }
    @Then("user types into the Description field")
    public void user_types_into_the_description_field() {
        page.typeDescription("Hello World");

    }


    @Then("text appears on the page")
    public void textAppearsOnThePage() {
        String actualText=page.actualTextField.getText();
        Assert.assertTrue(actualText.contains("Hello World"));


    }
}

