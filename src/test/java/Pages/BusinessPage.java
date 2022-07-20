package Pages;
import constants.Locators;
import driverSingleton.*;
import org.testng.Assert;

public class BusinessPage extends BasePage {
    public void assertURL() throws Exception { //makes sure that URL path is correct
        String URL = DriverSingleton.getDriverInstance().getCurrentUrl();
        Assert.assertEquals(URL, "https://buyme.co.il/search?budget=2&category=409&region=13");
    }
    public void pickBusiness() throws Exception {
        clickElement(Locators.NALAGAAT_BUSINESS_BUTTON);
    }
    public void enterSum() throws Exception{
        sendKeysToElement(Locators.SUM_BUTTON,"101");
    }
    public void pickPick() throws Exception{
      clickElement(Locators.CHOOSE_BUTTON);
    }

}
