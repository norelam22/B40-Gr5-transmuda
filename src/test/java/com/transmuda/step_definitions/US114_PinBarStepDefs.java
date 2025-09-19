package com.transmuda.step_definitions;


import com.transmuda.pages.US114PinBarPage;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US114_PinBarStepDefs {

    US114PinBarPage pinBarPage = new US114PinBarPage();


    @When("the user clicks {string}")
    public void the_user_clicks(String string) {
        pinBarPage.goToPinBarLink();

    }

    @Then("the pinbar help title is visible as {string}")
    public void the_pinbar_help_title_is_visible_as(String expectedTitle) {
       pinBarPage.getPinBarTitle(expectedTitle);

    }
    @Then("the pinbar help text showed {string}")
    public void the_pinbar_help_text_showed(String expectedText) {
        pinBarPage.getHelpText(expectedText);

    }

    @Then("the PinBar help image is displayed")
    public void thePinBarHelpImageIsDisplayed() {
        pinBarPage.imageDisplayVerification();
    }

    @And("the PinBar help image src is {string}")
    public void thePinBarHelpImageSrcIs(String expectedSrc) {
       pinBarPage.imageSrcVerification(expectedSrc);


    }
}
