package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCostsPage {

    public VehicleCostsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[1]")
    public WebElement typeColumnHeader;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[2]")
    public WebElement totalPriceColumnHeader;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[3]")
    public WebElement dateColumnHeader;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement firstRowCheckbox;

    @FindBy(xpath =" //input[@type='checkbox']")
    public List<WebElement> allCheckboxes;
}
