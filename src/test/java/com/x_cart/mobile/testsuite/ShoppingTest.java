package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.ShoppingPage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class ShoppingTest extends TestBase {
        ShoppingPage shoppingPage = new ShoppingPage();

        @Test
        public void verifyThatUserShouldPlaceOrderSuccessfully() throws InterruptedException {
            shoppingPage.clickOnHotdeals();
            shoppingPage.clickOnBestsellers3();
            Assert.assertEquals(shoppingPage.getVerifyBestsellersText3(),"Bestsellers");
            shoppingPage.clickOnSortBy();
            shoppingPage.clickOnNameAtoZ();
            shoppingPage.clickOnAddtocart1();
            shoppingPage.clickOnOllieTheAppControlledRobot();
            Thread.sleep(2000);
            Assert.assertEquals(shoppingPage.getVerifyGreenBarText(),"Product has been added to your cart");
            shoppingPage.clickOnxsignClose();
            shoppingPage.clickOnYourCart();
            shoppingPage.clickOnViewCart1();
            shoppingPage.clickOnViewCart2();
            Assert.assertEquals(shoppingPage.getVerifyShoppingcart1(),"Your shopping cart - 1 item");
            Assert.assertEquals( shoppingPage.getVerifySubTotal(),"$14.99");
            Assert.assertEquals(shoppingPage.getVerifytotal(),"$20.75");
            shoppingPage.clickOnGotoCheckOutButton();
            Assert.assertEquals(shoppingPage.getVerifyLogintoyouraccount(),"Log in to your account");
            shoppingPage.enterEmailAddress("prime123@gmail.com");
            shoppingPage.clickOnContinuebutton();
            Assert.assertEquals(shoppingPage.getVerifySecureCheckoutText(),"Secure Checkout");

            shoppingPage.enterFirstName("Hi");
            shoppingPage.enterLastName("Hello");
            shoppingPage.enterStreet("TheAvenue");
            shoppingPage.enterCity("London");
            shoppingPage.enterCountryCode("United Kingdom");
            shoppingPage.enterState("UK");
            shoppingPage.enterZipcode("123456");
            shoppingPage.enterPhoneNumber("123456789");
            shoppingPage.enterEmail("prime123@gmail.com");
            Assert.assertEquals(shoppingPage.getVerifyCheckBox(),"Create an account for later use");
            shoppingPage.enterPassword("abcd123");
            shoppingPage.clickOnLocalShipping();
            shoppingPage.clickOnPaymentMethodCOD();
            //Assert.assertEquals( shoppingPage.getVerifyTotal1(),"$21.77",);
            shoppingPage.clickOnPlaceOrder();
            Assert.assertEquals(shoppingPage.getVerifyThankyouText(),"Thank you for your order");
        }

        @Test
        public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
            shoppingPage.clickOnHotdeals1();
            shoppingPage.clickOnBestsellers4();
            Assert.assertEquals(shoppingPage.getVerifyBestsellersText4(),"Bestsellers");
            shoppingPage.clickOnSortBy();
            shoppingPage.clickOnNameAtoZ();
            Thread.sleep(2000);
            shoppingPage.clickOnAddtocart1();
            Assert.assertEquals( shoppingPage.getVerifyGreenBar(),"Product has been added to your cart");
            shoppingPage.clickOnXsignclose();

            shoppingPage.clickOnYourCart1();
            shoppingPage.clickOnViewCart();
            Assert.assertEquals( shoppingPage.getVerifyYourShopping(),"Your shopping cart - 1 item");
            shoppingPage.clickOnEmptyyourcart();
            shoppingPage.VerifyAlert();
            Assert.assertEquals(shoppingPage.getVerifyMsg(),"Item(s) deleted from your cart");
            Assert.assertEquals( shoppingPage.getVerifyYourCartIsEmpty(),"Your cart is empty");
        }
    }

