package com.automationpractice.tests;

import com.automationpractice.framework.HomePage;
import com.automationpractice.pages.signin.SignIn;
import com.automationpractice.pages.women.Women;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    String browser = "Chrome";

    public HomePage homePage;

    public SignIn signIn;
    public Women womenPage;

    public static final String URL = "http://automationpractice.com/";


    @BeforeMethod
    public void set_up() {
        Browsers browsers = Browsers.valueOf(browser.toUpperCase());
        switch (browsers) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 5);

        driver.navigate().to(URL);

        homePage = new HomePage(driver, wait);
        signIn = new SignIn(driver, wait);
        womenPage = new Women(driver, wait);


    }

    @AfterMethod
    public void tear_down() {
        driver.quit();
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


