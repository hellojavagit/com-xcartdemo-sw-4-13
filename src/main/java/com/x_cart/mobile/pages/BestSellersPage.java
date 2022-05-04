package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSellersPage extends Utility {
    By Hotdeals3 = By.xpath("//*[@id=\\\"header-area\\\"]/div[1]/div/div[4]/div/ul/li[2]/span");
    By Bestsellers = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]");
    By VerifyBestsellersText = By.xpath("//h1[@id='page-title']");
    By SortBy3 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By NameZtoA = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
    By VerifyNameZtoAText = By.xpath("//span[contains(text(),'Name Z - A')]");
    public void clickOnHotdeals3(){
        mouseHoverToElement(Hotdeals3);
    }
    public void clickOnBestsellers(){
        mouseHoverToElementAndClick(Bestsellers);
    }
    public String getVerifyBestsellersText(){
        return getTextFromElement(VerifyBestsellersText);
    }
    public void clickOnSortBy3(){
        mouseHoverToElement(SortBy3);
    }
    public void clickOnNameZtoA(){
        mouseHoverToElementAndClick(NameZtoA);
    }
    public String getVerifyNameZtoAText(){
        return getTextFromElement(VerifyNameZtoAText);
    }
    By Hotdeals4 = By.xpath("//*[@id=\\\"header-area\\\"]/div[1]/div/div[4]/div/ul/li[2]/span");
    By Bestsellers1 = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]");
    By VerifyBestsellersText1 = By.xpath("//h1[@id='page-title']");
    By SortBy4 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By PriceHightoLow = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By VerifyPriceHightoLowText = By.xpath("//span[contains(text(),'Price High - Low')]");

    public void clickOnHotdeals4(){
        mouseHoverToElement(Hotdeals4);
    }
    public void clickOnBestsellers1(){
        mouseHoverToElementAndClick(Bestsellers1);
    }
    public String getVerifyBestsellersText1(){
        return getTextFromElement(VerifyBestsellersText1);
    }
    public void clickOnSortBy4(){
        mouseHoverToElement(SortBy4);
    }
    public void clickOnPriceHightoLow(){
        mouseHoverToElementAndClick(PriceHightoLow);
    }
    public String getVerifyPriceHightoLowText(){
        return getTextFromElement(VerifyPriceHightoLowText);
    }
    By Hotdeals5 = By.xpath("//*[@id=\\\"header-area\\\"]/div[1]/div/div[4]/div/ul/li[2]/span");
    By Bestsellers2 = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]");
    By VerifyBestsellersText2 = By.xpath("//h1[@id='page-title']");
    By SortBy5 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By Rates = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]");
    By VerifyRatesText = By.xpath("//span[contains(text(),'Rates')]");

    public void clickOnHotdeals5(){
        mouseHoverToElement(Hotdeals5);
    }
    public void clickOnBestsellers2(){
        mouseHoverToElementAndClick(Bestsellers2);
    }
    public String getVerifyBestsellersText2(){
        return getTextFromElement(VerifyBestsellersText2);
    }
    public void clickOnSortBy5(){mouseHoverToElement(SortBy5);}
    public void clickOnRates(){
        mouseHoverToElementAndClick(Rates);
    }
    public String getVerifyRatesText(){
        return getTextFromElement(VerifyRatesText);
    }
}



