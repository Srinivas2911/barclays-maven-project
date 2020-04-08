package co.uk.barclays.pages;

import co.uk.barclays.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerJumboText = By.xpath("//h2[@class='h2 jumbo-title']");

    public void verifyRegisterJumboText(){
        verifyThatTextIsDisplayed(registerJumboText, "Register for Online Banking");
    }

    public String getRegisterJumboText (){
        return getTextFromElement(registerJumboText);
    }

}
