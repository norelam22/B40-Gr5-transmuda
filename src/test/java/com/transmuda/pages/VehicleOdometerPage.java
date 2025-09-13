package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage extends BasePage {

@FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;

@FindBy(xpath = "//input[@type='number']")
    public WebElement defaultPage;

@FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPageDropDown;




}
