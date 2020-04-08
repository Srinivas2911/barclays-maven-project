package co.uk.barclays.pages;

import co.uk.barclays.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By iconDisplay = By.xpath("//body//header//span[2]");
    By loginLink = By.linkText("Log In");
    By registerLink = By.linkText("Register");
    By contactLink = By.xpath("//li[2]//a[1]//span[1]");
    By findBranchLink = By.xpath("//li[3]//a[1]//span[1]");
    By searchFieldLink = By.xpath("//li[4]//a[1]//span[1]");

    public void iconIsDisplayed (){
        verifyThatElementIsDisplayed(iconDisplay);
    }

    public void loginLinkisDisplayed (){
        verifyThatElementIsDisplayed(loginLink);
    }

    public String getLoginLinkText (){
        return getTextFromElement(loginLink);
    }


    public void registerLinkisDisplayed() {
        verifyThatElementIsDisplayed(registerLink);
    }

    public String getRegisterLinkText(){
        return getTextFromElement(registerLink);
    }

    public void contactLinkIsDisplayed(){
        verifyThatElementIsDisplayed(contactLink);
            }

            public void findBranchLinkisDisplayed(){
        verifyThatElementIsDisplayed(findBranchLink);
            }

            public void searchFieldLink (){
        verifyThatElementIsDisplayed(searchFieldLink);
            }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickOnContactLink() {
        clickOnElement(contactLink);
    }

    public void clickOnFindBranchLink() {
        clickOnElement(findBranchLink);
    }

    public void clickOnSearchFieldlink() {
        clickOnElement(searchFieldLink);
    }

}
