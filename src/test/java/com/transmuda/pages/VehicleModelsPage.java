package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleModelsPage extends BasePage {

    public VehicleModelsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    private final By headerCells = By.cssSelector("thead th.grid-cell.grid-header-cell");


    public List<String> getColumnHeaders() {
        WebDriver driver = Driver.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(headerCells, 0));

        List<WebElement> cells = driver.findElements(headerCells);
        List<String> headers = new ArrayList<>();
        for (WebElement c : cells) {
            String t = c.getText().trim();
            if (!t.isBlank()) headers.add(t);
        }
        return headers;
    }


    public void navigateToModule(String tab, String module) {
        super.navigateToModule(tab, module);
    }
}