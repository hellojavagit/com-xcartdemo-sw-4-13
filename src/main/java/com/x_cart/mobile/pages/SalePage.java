package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {

    By Hotdeals = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
    By Sale = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
    By VerifySaleText = By.xpath("//h1[@id='page-title']");
    By SortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By NameAtoZ = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
    By VerifyAiphabeticallyText = By.xpath("//span[contains(text(),'Name A - Z')]");

    public void clickOnHotdeals() {
        mouseHoverToElement(Hotdeals);
    }

    public void clickOnSale() {
        mouseHoverToElementAndClick(Sale);
    }

    public String getVerifySaleText() {
        return getTextFromElement(VerifySaleText);
    }

    public void clickOnSortBy() {
        mouseHoverToElement(SortBy);
    }

    public void clickOnNameAtoZ() {
        mouseHoverToElementAndClick(NameAtoZ);
    }

    public String getVerifyAlphabeticallyText() {
        return getTextFromElement(VerifyAiphabeticallyText);
    }


    By Hotdeals1 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
    By Sale1 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
    By VerifySaleText1 = By.xpath("//h1[@id='page-title']");
    By SortBy1 = By.xpath("//span[contains(text(),'Sort by:')]");
    By PriceLowToHigh = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By VerifyLowToHighText = By.xpath("//span[contains(text(),'Price Low - High')]");

    public void clickOnHotdeals1() {
        mouseHoverToElement(Hotdeals1);
    }

    public void clickOnSale1() {
        mouseHoverToElementAndClick(Sale1);
    }

    public String getVerifySaleText1() {
        return getTextFromElement(VerifySaleText1);
    }

    public void clickOnSortBy1() {
        mouseHoverToElement(SortBy1);
    }

    public void clickOnPriceLowToHigh() {
        mouseHoverToElementAndClick(PriceLowToHigh);
    }

    public String getVerifyLowToHighText() {
        return getTextFromElement(VerifyLowToHighText);
    }


    By Hotdeals2 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
    By Sale2 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
    By VerifySaleText2 = By.xpath("//h1[@id='page-title']");
    By SortBy2 = By.xpath("//span[contains(text(),'Sort by:')]");
    By Rates = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]");
    By VerifyRatesText = By.xpath("//span[contains(text(),'Rates')]");

    public void clickOnHotdeals2() {
        mouseHoverToElement(Hotdeals2);
    }

    public void clickOnSale2() {
        mouseHoverToElementAndClick(Sale2);
    }

    public String getVerifySaleText2() {
        return getTextFromElement(VerifySaleText2);
    }

    public void clickOnSortBy2() {
        mouseHoverToElement(SortBy2);
    }

    public void clickOnRates() {
        mouseHoverToElementAndClick(Rates);
    }

    public String getVerifyRatesText() {
        return getTextFromElement(VerifyRatesText);
    }
}


