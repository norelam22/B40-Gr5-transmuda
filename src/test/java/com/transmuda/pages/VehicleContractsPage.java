package com.transmuda.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class VehicleContractsPage extends BasePage {


    @FindBy (xpath = "//div[@class='alert alert-error fade in top-messages ']//div[text()='You do not have permission to perform this action.']")
           // "//div[.='You do not have permission to perform this action.']")

    public WebElement errorMessage;


    public void navigateToFleet() {

        navigateToModule("Fleet", "Vehicle Contracts");
    }





}