package Pages;
import constants.Locators;
import driverSingleton.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
    public void enterPrice() throws Exception {
        scrollToElement(By.cssSelector("span[alt=סכום]"), "100-199 ש\"ח");
    }
    public void pickRegion()throws Exception {
        scrollToElement(By.cssSelector("span[alt=אזור]"),"ת\"א והסביבה");
    }

    public void pickCategory()throws Exception {
        scrollToElement(By.linkText("קטגוריה"),"מתנות סוף שנה למורה ולגננת");
    }
    public void pressFindMeAGift()throws Exception {
        clickElement(Locators.FIND_ME_A_GIFT_BUTTON);
    }




}
