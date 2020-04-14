package co.uk.barclays.testsuite;

import co.uk.barclays.pages.HomePage;
import co.uk.barclays.testbase.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test (priority = 0, groups = {"smoke", "sanity"})
    public void verifyThatLoginLinkDisplayedOnHomepage() {
        homePage.loginLinkisDisplayed();

        SoftAssert sa = new SoftAssert();
        sa.assertTrue(homePage.getLoginLinkText().contains("Log In"));

    }

    @Test (priority = 1, groups = {"sanity", "regression"})
    public void verifyThatRegisterLinkIsDisplayedOnHomepage() {
        homePage.registerLinkisDisplayed();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(homePage.getRegisterLinkText().contains("Register"));

    }
}