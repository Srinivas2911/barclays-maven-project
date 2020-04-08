package co.uk.barclays.pages;

import co.uk.barclays.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By textOnLoginPage = By.xpath("//strong[contains(text(),'Quick, safe and convenient')]");
    By registerNowLink = By.linkText("Register now");

    public void setTextOnLoginPage() {
        verifyThatTextIsDisplayed(textOnLoginPage, "Quick, safe and convenient");
    }

    public String getTextOnLoginPage(){
        return getTextFromElement(textOnLoginPage);
    }
    public void clickOnRegisterNowLink() {
        clickOnElement(registerNowLink);
    }
}
