package com.transmuda.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class VehicleOdometerPage extends BasePage {

@FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;

@FindBy(xpath = "//input[@type='number']")
    public WebElement defaultPage;

@FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPageDropDown;




}
