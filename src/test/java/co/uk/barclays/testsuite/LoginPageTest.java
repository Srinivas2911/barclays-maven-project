package co.uk.barclays.testsuite;

import co.uk.barclays.pages.HomePage;
import co.uk.barclays.pages.LoginPage;
import co.uk.barclays.pages.RegisterPage;
import co.uk.barclays.testbase.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test (priority = 0, groups = {"smoke", "sanity"})
    public void verifyThatUserisAbleToNavigatetoLoginInPage () {
        homePage.clickOnLoginLink();
        loginPage.setTextOnLoginPage();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(loginPage.getTextOnLoginPage().contains("Quick, safe and convenient"));

            }

    @Test (priority = 1, groups = { "regression"})
    public void verifyThatUserisAbleToNavigatetoRegisterPageThruLoginInPage () {
        homePage.clickOnLoginLink();
        loginPage.clickOnRegisterNowLink();
        registerPage.verifyRegisterJumboText();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(registerPage.getRegisterJumboText().contains("Register for Online Banking"));


    }
}
