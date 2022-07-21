package Pages;
import constants.*;

public class IntroPage extends BasePage {
//    private void getToRegistrationPage()throws Exception{
//        pressEnterSlashRegister();
//        clickRegister();
//
//    }
    public void pressEnterSlashRegister() throws Exception {
        clickElement(Locators.ENTER_REGISTER_BUTTON);

    }
    public void clickRegister() throws Exception {
        clickElement(Locators.REGISTER_BUTTON);
    }


}
