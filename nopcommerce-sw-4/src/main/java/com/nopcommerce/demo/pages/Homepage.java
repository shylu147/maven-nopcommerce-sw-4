package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {
    By loginLink = By.linkText("Log in");

    By registerLink = By.linkText("Register");

    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");

    By deskstopLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");

    public void mouseHoverOnComputerLink() {
        mouseHoverToElement(computerLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void mouseHoverAndClickOnDeskstopLink() {
        mouseHoverToElementAndClick(deskstopLink);
    }

}
