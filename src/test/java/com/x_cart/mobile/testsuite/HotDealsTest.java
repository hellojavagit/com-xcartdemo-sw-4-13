package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSellersPage;
import com.x_cart.mobile.pages.SalePage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class HotDealsTest extends TestBase {
        SalePage salePage = new SalePage();
        BestSellersPage bestSellerPage = new BestSellersPage();

        @Test
        public void verifySaleProductsArrangeAlphabetically(){
            salePage.clickOnHotdeals();
            salePage.clickOnSale();
            Assert.assertEquals(salePage.getVerifySaleText(),"Sale");
            salePage.clickOnSortBy();
            salePage.clickOnNameAtoZ();
            Assert.assertEquals(salePage.getVerifyAlphabeticallyText(),"Name A - Z");
        }
        @Test
        public void verifySaleProductsPriceArrangeLowToHigh(){
            salePage.clickOnHotdeals1();
            salePage.clickOnSale1();
            Assert.assertEquals("Sale",salePage.getVerifySaleText1());
            salePage.clickOnSortBy1();
            salePage.clickOnPriceLowToHigh();
            Assert.assertEquals(salePage.getVerifyLowToHighText(),"Price Low - High");
        }
        @Test
        public void verifySaleProductsArrangeByRates(){
            salePage.clickOnHotdeals2();
            salePage.clickOnSale2();
            Assert.assertEquals("Sale",salePage.getVerifySaleText2());
            salePage.clickOnSortBy2();
            salePage.clickOnRates();
            Assert.assertEquals(salePage.getVerifyRatesText(),"Rates");
        }
        @Test
        public void verifyBestSellersProductsArrangeByZToA(){
            bestSellerPage.clickOnHotdeals3();;
            bestSellerPage.clickOnBestsellers();
            Assert.assertEquals("Bestsellers",bestSellerPage.getVerifyBestsellersText());
            bestSellerPage.clickOnSortBy3();
            bestSellerPage.clickOnNameZtoA();
            Assert.assertEquals(bestSellerPage.getVerifyNameZtoAText(),"Name Z - A");
        }
        @Test
        public void verifyBestSellersProductsPriceArrangeHighToLow(){
            bestSellerPage.clickOnHotdeals4();;
            bestSellerPage.clickOnBestsellers1();
            Assert.assertEquals("Bestsellers",bestSellerPage.getVerifyBestsellersText1());
            bestSellerPage.clickOnSortBy4();
            bestSellerPage.clickOnPriceHightoLow();
            Assert.assertEquals(bestSellerPage.getVerifyPriceHightoLowText(),"Price High - Low");
        }
        @Test
        public void verifyBestSellersProductsArrangeByRates(){
            bestSellerPage.clickOnHotdeals5();;
            bestSellerPage.clickOnBestsellers2();
            Assert.assertEquals("Bestsellers",bestSellerPage.getVerifyBestsellersText2());
            bestSellerPage.clickOnSortBy5();
            bestSellerPage.clickOnRates();
            Assert.assertEquals("Rates",bestSellerPage.getVerifyRatesText());
        }
    }

