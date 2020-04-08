package testsuite;

import co.uk.barclays.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;

public class HomePageTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void verifyThatLoginLinkDisplayedOnHomepage() {
        homePage.loginLinkisDisplayed();
        String expectedText = "Log In";
        String actualText = homePage.getLoginLinkText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void verifyThatRegisterLinkIsDisplayedOnHomepage() {
        homePage.registerLinkisDisplayed();
        String expectedText = "Register";
        String actualText = homePage.getRegisterLinkText();
        Assert.assertEquals(expectedText,actualText);

    }
}