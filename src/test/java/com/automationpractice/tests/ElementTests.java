package com.automationpractice.tests;

import com.automationpractice.pages.signin.SignIn;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementTests extends BaseTest {


    @Test
    public void test1() {

        // sleep(1000);
        signIn.click_signin();
        //  sleep(1000);
        signIn.type_email("napoleon_971@yahoo.com");
        //  sleep(1000);
        signIn.create_account();
        //  sleep(1000);
        signIn.click_gender(0);
        //  sleep(2000);
        signIn.type_first_name("Bojan");
        // sleep(2000);
        signIn.type_last_name("Veljanoski");
        //  sleep(2000);
        signIn.type_password("Venividivici1");
        //    sleep(2000);
        signIn.click_dateofbirth(0);
        sleep(2000);
        signIn.click_valuedob(0);
        sleep(2000);
        signIn.click_year(0);
        sleep(2000);
        signIn.click_yearvalue(0);
        sleep(2000);
        signIn.selectMonth();
        sleep(2000);
        signIn.click_state(0);
        sleep(2000);
        signIn.state_value(0);
        sleep(2000);
        signIn.type_address("Bulevar Jane Sandanski 90 5/18");
        sleep(2000);
        signIn.type_city("Skopje");
        sleep(2000);
        signIn.type_postcode("10000");
        sleep(2000);
        signIn.type_phonenumber("077888555");
        sleep(2000);
        signIn.type_alliasaddress("");
        sleep(2000);
        //  signIn.click_register();
        // sleep(2000);


    }

    @Test
    public void test2() {
        signIn.click_signin();
        // sleep(2000);
        signIn.signin_email("veljanoski_b@yahoo.com");
        // sleep(2000);
        signIn.type_password("Venividivici1");
        // sleep(2000);
        signIn.click_onsignin();
        //  sleep(2000);
        womenPage.click_onwomen();
        //sleep(2000);
        womenPage.click_ontops();
        //   sleep(2000);
        womenPage.click_ontshirts();
        // sleep(2000);
        womenPage.click_onshortsleeve();
        // sleep(2000);
        womenPage.click_quantity();
        //  sleep(2000);
        womenPage.click_onaddtocart();
        //  sleep(2000);
        womenPage.click_oncontinueshopping();
        // sleep(2000);
        womenPage.click_ondresses();
        //sleep(2000);
        womenPage.click_oncasualdresses();
        // sleep(2000);
        womenPage.click_onprinteddress();
        // sleep(2000);
        womenPage.printeddress_add();
        //  sleep(2000);
        womenPage.click_oncontinueshopping();
        //   sleep(2000);
        womenPage.click_toseecart();
        // sleep(2000);
        Assert.assertEquals(womenPage.returninvoiceaddress(), "INVOICE ADDRESS (NAPOLEON_971@YAHOO.COM)");
        Assert.assertEquals(womenPage.returnnamelastname(), "Bojan Veljanoski");
        Assert.assertEquals(womenPage.returnaddress(), "Bulevar Jane Sandanski 90 5/18");
        Assert.assertEquals(womenPage.returncityandzip(), "Skopje, Alabama 10000");
        Assert.assertEquals(womenPage.returnstate(), "United States");
        Assert.assertEquals(womenPage.returnphonenumber(), "077888555");
        womenPage.delete_product();
        //  sleep(2000);
        womenPage.proceedtoCheckout();
        //  sleep(2000);
        Assert.assertEquals(womenPage.returnbillingaddress(), "YOUR BILLING ADDRESS");
        Assert.assertEquals(womenPage.returnnamelastname1(), "Bojan Veljanoski");
        Assert.assertEquals(womenPage.returnaddress1(), "Bulevar Jane Sandanski 90 5/18");
        Assert.assertEquals(womenPage.returncityandzip1(), "Skopje, Alabama 10000");
        Assert.assertEquals(womenPage.returnstate1(), "United States");
        Assert.assertEquals(womenPage.returnphonenumber1(), "077888555");
        womenPage.proceedtoCheckout1();
        sleep(2000);
        womenPage.agree_toterms();
        sleep(2000);
        womenPage.proceedtoCheckout2();
        sleep(2000);
        womenPage.pay_bybankwire();
        sleep(2000);
        womenPage.confirm_order();
        sleep(2000);


    }


}
