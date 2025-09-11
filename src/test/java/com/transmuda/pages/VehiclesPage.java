package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage extends BasePage {

    public VehiclesPage() {PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath="(//span[@class='title title-level-1'])[2]")
    public WebElement fleetPage;

    @FindBy (xpath="//span[.='Vehicles']")
    public WebElement vehiclesText;

    @FindBy (xpath="//div[@class='dropdown']")
    public WebElement threeDots;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//*[@class='launcher-item']//a")
    public List<WebElement> list_Icon;


}
