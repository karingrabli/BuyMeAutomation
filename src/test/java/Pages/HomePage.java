package Pages;
import constants.Locators;
import driverSingleton.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
    public void enterPrice() throws Exception {
        Select priceSelected = new Select(DriverSingleton.getDriverInstance().findElement(By.id("ember2125")));
        priceSelected.selectByVisibleText("100-199");
    }
    public void pickCategory()throws Exception {
        Select categorySelected = new Select(DriverSingleton.getDriverInstance().findElement(By.id("ember2178")));
        categorySelected.selectByVisibleText("מתנות סוף שנה למורה ולגננת");
    }

    public void pickRegion()throws Exception {
        Select categorySelected = new Select(DriverSingleton.getDriverInstance().findElement(By.id("ember2144")));
        categorySelected.selectByVisibleText("ללא הסביבה");
    }
    public void pressFindMeAGift()throws Exception {
        clickElement(Locators.FIND_ME_A_GIFT_BUTTON);
    }




}
