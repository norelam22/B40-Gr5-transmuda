package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepeatCalendarPage extends BasePage {

    ////div[@class='btn-group']

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventButton;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//div[@class='recurrence-subview-control__item']//input[3]")
    public WebElement dayInputBox;

    @FindBy(xpath = "//span[text()='day(s)']")
    public WebElement randomPlace;

    @FindBy(xpath = "//span[@class='validation-failed']")
    public WebElement errorMessage;

    //Open Calendar Event Option
    public void selectCalendarEvents() {
        navigateToModule("Activities", "Calendar Events");
    }

    //Select Create Calendar Event Button
    public void openCreateCalendarEvent() {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(createCalendarEventButton, 5).click();
    }

    //Invalid input method
    public void enterInvalidInput(String value) {
        dayInputBox.clear();
        dayInputBox.sendKeys(value);
    }

    //Error message validation
    public void verifyErrorMessage(String expectedMessage) {
        String actualMessage = errorMessage.getText();
        Assert.assertEquals("Error Message validation failed!", expectedMessage, actualMessage);
    }


}
