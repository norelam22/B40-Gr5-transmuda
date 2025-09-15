package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US121Page extends BasePage{

    public US121Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "//a[@title='Create Calendar event']")
  public WebElement calendarEventsButton;

    @FindBy(id = "tinymce")
    public WebElement bodyofDescription;

    @FindBy(xpath = "//body[@id='tinymce']/p")
    public WebElement actualTextField;



    public void typeDescription(String text){
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[contains(@id,'oro_calendar_event_form_description')]")));
        //body inside iframe
        BrowserUtils.sleep(5);

        bodyofDescription.click();
        bodyofDescription.clear();
        bodyofDescription.sendKeys(text);

    }

}

