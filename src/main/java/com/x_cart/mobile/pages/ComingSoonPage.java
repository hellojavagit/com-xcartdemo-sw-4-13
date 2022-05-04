package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoonPage extends Utility {

    By Comingsoon = By.linkText("Coming soon");
    By VerifyComingsoon = By.id("page-title");

    public void clickOnComingsoon() {
        clickOnElement(Comingsoon);
    }

    public String getVerifyComingsoonText() {
        return getTextFromElement(VerifyComingsoon);
    }
}
