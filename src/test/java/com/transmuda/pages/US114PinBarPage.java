package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US114PinBarPage extends BasePage {


    //@FindBy(xpath = "//a[text()='How To Use Pinbar']")
    @FindBy(xpath = "//div[@class='pin-bar-empty']//a")
    public WebElement howToUSePinBarLink;

    // @FindBy(xpath = "//*[@class='fa-thumb-tack hide-text']")
//public WebElement pinIcon;

    @FindBy(xpath = "//h3[text()='How To Use Pinbar']")
    public WebElement pinBarTitle;

    //@FindBy(xpath ="//p[contains(text(),'Use pin icon on the right top corner of page to create fast access link in the pinbar')]")
    @FindBy(xpath = "//p[1]")
    public WebElement helpText;

    //@FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    @FindBy(xpath = "//p[2]//img")
    public WebElement helpImage;
    public void goToPinBarLink(){
        waitUntilLoaderScreenDisappear();
        howToUSePinBarLink.click();
        BrowserUtils.waitForVisibility(pinBarTitle,5);
    }

    public void getPinBarTitle(String expectedTitle){

        Assert.assertEquals(expectedTitle,pinBarTitle.getText());
    }

    public void getHelpText(String expectedText){
        String actualText = helpText.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void imageDisplayVerification(){
        Assert.assertTrue(BrowserUtils.waitForVisibility(helpImage,5).isDisplayed());

    }

    public void imageSrcVerification(String expectedSrc){
        String actualSrc = helpImage.getAttribute("src");
        Assert.assertTrue(actualSrc.contains(expectedSrc));
    }





}
