package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.Homepage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ComputerPageTest extends BaseTest {

    Homepage homepage = new Homepage();
    ComputerPage deskstopPage = new ComputerPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        homepage.mouseHoverOnComputerLink();
        homepage.mouseHoverAndClickOnDeskstopLink();
        Thread.sleep(20);
        deskstopPage.clickOnSortByLink();
        Thread.sleep(20);

        ArrayList<String> allProducts = deskstopPage.getProductList();
        System.out.println(allProducts);


        deskstopPage.selectDropDownZToA();
        Thread.sleep(50);
        ArrayList<String> allProductsAsc = deskstopPage.getProductList();
        System.out.println(allProductsAsc);
        Assert.assertEquals(allProducts, allProductsAsc);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homepage.mouseHoverOnComputerLink();
        homepage.mouseHoverAndClickOnDeskstopLink();
        deskstopPage.clickOnSortByLink();
        deskstopPage.selectDropDownAToZ();
        //clickOnElement(By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]"));
        //deskstopPage.getInstructionText();
       // Assert.assertEquals(deskstopPage.getInstructionText(),"Build your own computer");

    }
}


