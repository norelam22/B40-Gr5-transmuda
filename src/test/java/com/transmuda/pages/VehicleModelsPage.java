package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
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

    public List<String> getColumnHeaders() {
        BrowserUtils.sleep(5);
        List<WebElement> columnsHeaders=Driver.getDriver().findElements(By.xpath("//table/thead//th[contains(@class,'grid-cell grid-header-cell grid-header-cell')]"));

        List<String> text = new ArrayList<>();
        for (WebElement each : columnsHeaders) {
            String header=each.getText().trim();

            System.out.println("header = " + header);
            if (!text.contains(header)&& !header.isEmpty()){
                text.add(header);
            }

        }
        return text;
    }



}
