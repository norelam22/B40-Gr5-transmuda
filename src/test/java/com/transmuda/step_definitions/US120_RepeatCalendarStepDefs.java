package com.transmuda.step_definitions;

import com.transmuda.pages.RepeatCalendarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class US120_RepeatCalendarStepDefs {

    RepeatCalendarPage repeatCalendarPage = new RepeatCalendarPage();


    @And("the user clicks the Create Calendar Event button")
    public void the_user_clicks_the_create_calendar_event_button() {
        repeatCalendarPage.openCreateCalendarEvent();

    }

    @When("user checks the repeat checkbox")
    public void user_checks_the_repeat_checkbox() {
        repeatCalendarPage.repeatCheckBox.click();

    }

    @When("the user enters {string} in the Repeat Every input box")
    public void the_user_enters_in_the_repeat_every_input_box(String invalidInput) {
        repeatCalendarPage.enterInvalidInput(invalidInput);

    }

    @When("clicks outside the input box")
    public void clicks_outside_the_input_box() {
        repeatCalendarPage.randomPlace.click();

    }

    @Then("the user should see the error message {string}")
    public void the_user_should_see_the_error_message(String expectedMessage) {
        repeatCalendarPage.verifyErrorMessage(expectedMessage);

    }

}


