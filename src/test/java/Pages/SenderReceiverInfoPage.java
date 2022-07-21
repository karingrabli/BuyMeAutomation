package Pages;
import constants.Constants;
import constants.Locators;
import org.testng.Assert;

public class SenderReceiverInfoPage extends BasePage {
    public void pickSomeoneElse() throws Exception {
        clickElement(Locators.SOMEONE_ELSE_BUTTON);
    }
    public void giftReceiver() throws Exception {
        sendKeysToElement(Locators.RECEIVER_NAME_BUTTON, Constants.RECEIVER_NAME);
    }
    public void pickEvent() throws Exception {
        scrollToElement(Locators.WHATS_THE_OCCASION_BUTTON,"מתנות סוף שנה");
    }
    public void enterBlessing() throws Exception {
        sendKeysToElement(Locators.BLESSING_BUTTON, Constants.BLESSING);
    }
    public void clickContinue() throws Exception {
        clickElement(Locators.CONTINUE_BUTTON);
    }
    public void clickNow() throws Exception {
        clickElement(Locators.NOW_BUTTON);
    }
    public void pickSMS() throws Exception {
        clickElement(Locators.SEND_BY_EMAIL_ICON);
    }
    public void enterNumber() throws Exception {
        sendKeysToElement(Locators.RECEIVER_EMAIL_LOCATOR, Constants.RECEIVER_EMAIL);
        Assert.assertEquals(Constants.RECEIVER_EMAIL, "receiversgmail@gmail.com");
    }
    public void enterSenderName() throws Exception {
        sendKeysToElement(Locators.GIFT_SENDER_NAME_BUTTON, Constants.SENDER_NAME);
        Assert.assertEquals(Constants.SENDER_NAME,"John" );
    }
    public void proceedToPay() throws Exception {
        clickElement(Locators.PROCEED_TO_PAYMENT_BUTTON);
    }


}


