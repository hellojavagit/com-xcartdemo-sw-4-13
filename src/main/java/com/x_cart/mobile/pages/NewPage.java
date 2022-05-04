package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;


public class NewPage extends Utility {
    By New = By.linkText("New!");
    By VerifyNewArrivals = By.xpath("//h1[@id='page-title']");

    public void clickOnNew(){
        clickOnElement(New);
    }
    public String getVerifyNewArrivalsText(){
        return getTextFromElement(VerifyNewArrivals);
    }
}
