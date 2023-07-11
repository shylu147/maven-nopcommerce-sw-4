package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonePageSuccessFully() {
        electronicsPage.mouseHoverElectronics();
        electronicsPage.mouseHoverClickCellPhones();
        Assert.assertEquals(electronicsPage.getCellPhoneText(), "Cell phones");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronicsPage.mouseHoverElectronics();
        electronicsPage.mouseHoverClickCellPhones();
        electronicsPage.clickListViewTab();

    }
}
