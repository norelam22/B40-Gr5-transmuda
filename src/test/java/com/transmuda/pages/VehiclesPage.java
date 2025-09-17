package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class VehiclesPage extends BasePage {


    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetPage;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesText;

    @FindBy(xpath = "//div[@class='dropdown']")
    public WebElement threeDots;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//*[@class='launcher-item']//a")
    public List<WebElement> list_Icon;

    @FindBy(xpath = "//button//input[@type='checkbox']")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@data-role='select-row-cell']")
    public List<WebElement> allCheckBoxes;

    @FindBy(xpath = "//input[@data-role='select-row-cell']")
    public List<WebElement> randomCarSelected;

    public void selectRandomCar() {

        Random random = new Random();
        int randomNumber = random.nextInt(23); //0 to 23 (excluded)
        randomCarSelected.get(randomNumber).click();

    }


    public void countSelected() {


        int selectedCount = 0;

        for (WebElement each : allCheckBoxes) {
            if (each.isSelected()) {
                selectedCount++;

            }
        }

        Assert.assertEquals("More than one or none selected", 1, selectedCount);
    }
}
