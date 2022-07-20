package Pages;
import constants.Constants;
import constants.Locators;
import org.testng.Assert;

public class RegistrationPage extends BasePage {

    public void enterCredentials() throws Exception {
        String name = "Karin";
        String email = "grablikarine@gmail.com";
        String password = "BuYmE2022";
        String passwordCheck = "BuYmE2022";
        sendKeysToElement(Locators.NAME_BUTTON, Constants.ACCOUNT_OWNER_NAME);
        sendKeysToElement(Locators.EMAIL_BUTTON, Constants.EMAIL);
        sendKeysToElement(Locators.PASSWORD_BUTTON, Constants.PASSWORD);
        sendKeysToElement(Locators.VALIDATE_PASSWORD_BUTTON , Constants.PASSWORD);
        Assert.assertEquals(name, Constants.ACCOUNT_OWNER_NAME);
        Assert.assertEquals(email, Constants.EMAIL);
        Assert.assertEquals(password, Constants.PASSWORD);
        Assert.assertEquals(passwordCheck, Constants.PASSWORD);

    }
    public void clickAgreeToTerms() throws Exception {
        clickElement(Locators.AGREE_TO_TERMS_BUTTON);
    }
    public void clickRegister() throws Exception {
        clickElement(Locators.SUBMIT_BUTTON);
    }


}
