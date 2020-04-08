package testsuite;

import co.uk.barclays.pages.HomePage;
import co.uk.barclays.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;

public class RegistrationPageTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserIsAbleToNavigateToRegisterPage(){
        homePage.clickOnRegisterLink();
        registerPage.verifyRegisterJumboText();
        String expectedText = "Register for Online Banking";
        String actualText = registerPage.getRegisterJumboText();
        Assert.assertEquals(expectedText, actualText);
    }

}
