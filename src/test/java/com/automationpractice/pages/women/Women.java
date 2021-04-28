package com.automationpractice.pages.women;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Women {

    WebDriver driver;
    WebDriverWait wait;

    public Women(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    By clickonwomen = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    By clickontops = By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img");
    By clickontshirts = By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img");
    By clickonshortsleeve = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
    By clickonquantity = By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span");
    By clickonaddtocart = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By clickoncontinueshopping = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span");
    By clickondresses = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
    By clickoncasualdresses = By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img");
    By clickonprinteddress = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
    By printeddressaddtocart = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By clicktoseecart = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
    By deleteproduct = By.xpath("//*[@id=\"3_13_0_490012\"]");
    By proceedtocheckout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    By proceedtocheckout1 = By.xpath("//*[@id=\"center_column\"]/form/p/button");
    By agreetoterms = By.id("uniform-cgv");
    By paybybankwire = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
    By confirmorder = By.xpath("//*[@id=\"cart_navigation\"]/button/span");
    By proceedtocheckout2 = By.xpath("//*[@id=\"form\"]/p/button");

    By returninvoiceaddress = By.xpath("//*[@id=\"center_column\"]/div[3]/div[2]/ul/li[1]/h3");
    By returnnamelastname = By.xpath("//*[@id=\"center_column\"]/div[3]/div[2]/ul/li[2]");
    By returnaddress = By.xpath("//*[@id=\"center_column\"]/div[3]/div[2]/ul/li[3]");
    By returncityandzip = By.xpath("//*[@id=\"center_column\"]/div[3]/div[2]/ul/li[4]");
    By returnstate = By.xpath("//*[@id=\"center_column\"]/div[3]/div[2]/ul/li[5]");
    By returnphonenumber = By.xpath("//*[@id=\"center_column\"]/div[3]/div[2]/ul/li[6]");

    By returnbillingaddress = By.xpath("//*[@id=\"address_invoice\"]/li[1]/h3");
    By returnnamelastname1 = By.xpath("//*[@id=\"address_invoice\"]/li[2]");
    By returnaddress1 = By.xpath("//*[@id=\"address_invoice\"]/li[3]");
    By returncityandzip1 = By.xpath("//*[@id=\"address_invoice\"]/li[4]");
    By returnstate1 = By.xpath("//*[@id=\"address_invoice\"]/li[5]");
    By returnphonenumber1 = By.xpath("//*[@id=\"address_invoice\"]/li[6]");


    public String returnphonenumber1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnphonenumber1)).getText();
    }

    public String returnstate1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnstate1)).getText();
    }

    public String returncityandzip1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returncityandzip1)).getText();
    }

    public String returnaddress1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnaddress1)).getText();
    }


    public String returnnamelastname1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnnamelastname1)).getText();
    }

    public String returnbillingaddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnbillingaddress)).getText();
    }

    public String returnphonenumber() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnphonenumber)).getText();
    }

    public String returnstate() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnstate)).getText();
    }

    public String returncityandzip() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returncityandzip)).getText();
    }

    public String returnaddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnaddress)).getText();
    }

    public String returnnamelastname() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnnamelastname)).getText();
    }

    public String returninvoiceaddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returninvoiceaddress)).getText();
    }


    public void confirm_order() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmorder)).click();
    }

    public void pay_bybankwire() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(paybybankwire)).click();
    }

    public void agree_toterms() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(agreetoterms)).click();
    }

    public void proceedtoCheckout2() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedtocheckout2)).click();
    }


    public void proceedtoCheckout1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedtocheckout1)).click();
    }

    public void proceedtoCheckout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedtocheckout)).click();
    }

    public void delete_product() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteproduct)).click();
    }

    public void click_toseecart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clicktoseecart)).click();
    }

    public void printeddress_add() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(printeddressaddtocart)).click();
    }


    public void click_onprinteddress() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonprinteddress)).click();
    }

    public void click_oncasualdresses() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickoncasualdresses)).click();
    }

    public void click_ondresses() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickondresses)).click();
    }

    public void click_oncontinueshopping() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickoncontinueshopping)).click();
    }

    public void click_onaddtocart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonaddtocart)).click();
    }


    public void click_quantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonquantity)).click();
    }

    public void click_onshortsleeve() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonshortsleeve)).click();
    }

    public void click_ontshirts() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickontshirts)).click();
    }

    public void click_ontops() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickontops)).click();
    }

    public void click_onwomen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonwomen)).click();
    }


}
