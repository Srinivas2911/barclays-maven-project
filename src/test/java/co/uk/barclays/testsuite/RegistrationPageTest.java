package co.uk.barclays.testsuite;

import co.uk.barclays.pages.HomePage;
import co.uk.barclays.pages.RegisterPage;
import co.uk.barclays.testbase.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationPageTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test (priority = 0, groups = {"regression"})
    public void verifyUserIsAbleToNavigateToRegisterPage(){
        homePage.clickOnRegisterLink();
        registerPage.verifyRegisterJumboText();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(registerPage.getRegisterJumboText().contains("Register for Online Banking"));
    }

}
