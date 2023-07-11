package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {
    By computer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By deskstop = By.xpath("//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");


    By sortByLink = By.xpath("//select[@id='products-orderby']");
    By zToALink = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By allProducts = By.xpath("//h2[@class='product-title']/a");
    By AToZLink=(By.id("products-orderby"));
    By addToCart=(By.xpath("//div/button[@class='button-2 product-box-add-to-cart-button']"));
    By instructionText=(By.xpath("//h1[contains(text(),'Build your own computer')]"));
    public void selectDropDownAToZ(){
        selectByContainsTextFromDropDown(By.id("products-orderby"),"Name: A to Z");
    }
    public void clickAddToCart(){clickOnElement(addToCart);

    }
    public void mouseHoverOnComputer() {
        mouseHoverToElement(computer);
    }

    public void mouseHoverClickOnDeskstop() {
        mouseHoverToElementAndClick(deskstop);
    }

    public void clickOnSortByLink() {
        clickOnElement(sortByLink);
    }

    public void clickOnZToALink() {
        clickOnElement(zToALink);
    }


    // Get all the products name and stored into list
    public void selectDropDownZToA() {
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
    }

    public ArrayList<String> getProductList() {
        List<WebElement> productList = driver.findElements(allProducts);
        ArrayList<String> originalAllProducts = new ArrayList<>();
        for (WebElement webElement : productList) {
            originalAllProducts.add(webElement.getText());
        }
        return originalAllProducts;
    }
    public String getInstructionText(){
        return getTextFromElement(instructionText);
    }
}


