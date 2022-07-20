package Pages;
import constants.*;

public class IntroPage extends BasePage {
    public void getToRegistrationPage()throws Exception{
        pressEnterSlashRegister();
        clickRegister();

    }
    private void pressEnterSlashRegister() throws Exception {
        clickElement(Locators.ENTER_REGISTER_BUTTON);

    }
    private void clickRegister() throws Exception {
        clickElement(Locators.REGISTER_BUTTON);
    }


}
