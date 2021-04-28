package com.automationpractice.pages.signin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {

    WebDriver driver;
    WebDriverWait wait;

    public SignIn(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }


    public void click_signin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signinclick)).click();
    }

    By signinclick = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By email = By.id("email_create");
    By createanaccount = By.id("SubmitCreate");
    By clickgender = By.xpath("//*[@id=\"id_gender1\"]");
    By firstname = By.id("customer_firstname");
    By lastname = By.id("customer_lastname");
    By password = By.id("passwd");
    By dateofbirth = By.id("uniform-days");
    By clickvaluedob = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select/option[14]");
    By clickyear = By.id("uniform-years");
    By clickyearvalue = By.xpath("//*[@id=\"years\"]/option[33]");
    By clickstate = By.id("uniform-id_state");
    By statevalue = By.xpath("//*[@id=\"id_state\"]/option[6]");
    By address = By.id("address1");
    By city = By.id("city");
    By postcode = By.id("postcode");
    By phonemobile = By.id("phone_mobile");
    By assignaddress = By.id("alias");
    By clickregister = By.id("submitAccount");
    By signinemail = By.id("email");
    By clickonsignin = By.id("SubmitLogin");

    public void selectMonth() {
        WebElement eleMonth = driver.findElement(By.id("months"));
        Select selectMonth = new Select(eleMonth);
        selectMonth.selectByIndex(6);

    }

    public void click_onsignin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonsignin)).click();
    }

    public void state_value(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(statevalue)).get(index).click();
    }

    public void click_state(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(clickstate)).get(index).click();
    }


    public void click_yearvalue(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(clickyearvalue)).get(index).click();
    }

    public void click_year(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(clickyear)).get(index).click();
    }


    public void signin_email(String email_address) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signinemail)).sendKeys(email_address);
    }

    public void type_email(String emailAddress) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(emailAddress);
    }

    public void create_account() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(createanaccount)).click();
    }


    public void click_gender(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(clickgender)).get(index).click();
    }

    public void type_first_name(String firstName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstname)).sendKeys(firstName);
    }

    public void type_last_name(String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastname)).sendKeys(lastName);
    }

    public void type_password(String passWord) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(passWord);
    }


    public void click_dateofbirth(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dateofbirth)).get(index).click();
    }


    public void click_valuedob(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(clickvaluedob)).get(index).click();
    }


    public void type_address(String addRess) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(address)).sendKeys(addRess);
    }

    public void type_city(String citY) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(city)).sendKeys(citY);
    }

    public void type_postcode(String postCode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(postcode)).sendKeys(postCode);
    }

    public void type_phonenumber(String phoneNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phonemobile)).sendKeys(phoneNumber);
    }

    public void type_alliasaddress(String alliasAddress) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(assignaddress)).sendKeys(Keys.CONTROL + "A");
        wait.until(ExpectedConditions.visibilityOfElementLocated(assignaddress)).sendKeys("napoleon_971@hotmail.com");
    }


    public void click_register() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickregister)).click();
    }
}
