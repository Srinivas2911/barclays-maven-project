package testsuite;

import co.uk.barclays.pages.HomePage;
import co.uk.barclays.pages.LoginPage;
import co.uk.barclays.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatUserisAbleToNavigatetoLoginInPage () {
        homePage.clickOnLoginLink();
        loginPage.setTextOnLoginPage();
        String expectedText = "Quick, safe and convenient";
        String actualText = loginPage.getTextOnLoginPage();
        Assert.assertEquals(expectedText,actualText);

            }

    @Test
    public void verifyThatUserisAbleToNavigatetoRegisterPageThruLoginInPage () {
        homePage.clickOnLoginLink();
        loginPage.clickOnRegisterNowLink();
        registerPage.verifyRegisterJumboText();
        String expectedText = "Register for Online Banking";
        String actualText = registerPage.getRegisterJumboText();
        Assert.assertEquals(expectedText,actualText);

    }
}
