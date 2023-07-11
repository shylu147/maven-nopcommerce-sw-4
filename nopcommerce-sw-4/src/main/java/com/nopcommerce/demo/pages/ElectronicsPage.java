package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ElectronicsPage extends Utility {
    By electronics = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By cellPhones = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By cellPhoneText = By.xpath("//li[@class='active last']//a[normalize-space()='Cell phones']");
    By listViewTab = By.xpath("//a[contains(text(),'List')]");
    By nokiaLink=By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
    By nokiaText=By.xpath("//h1[contains(text(),'Nokia Lumia 1020");

    public void mouseHoverElectronics() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(electronics)).build().perform();
    }

    public void mouseHoverClickCellPhones() {
        driver.findElement((cellPhones)).click();
    }

    public String getCellPhoneText() {
        return getTextFromElement(cellPhoneText);
    }
    public String getNokiaText() {
        return getTextFromElement(nokiaText);
    }
    public void clickListViewTab(){
        clickOnElement(listViewTab);
    }

    public void clickNokia(){
        clickOnElement(nokiaLink);
    }
}
