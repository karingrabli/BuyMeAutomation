package Pages;
import driverSingleton.*;
import xmlmanager.*;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.NoSuchElementException;

public class BasePage {
    public void scrollToElement (By locator) throws Exception { // this method receives a locator it scrolls to the wanted element
        WebElement element = DriverSingleton.getDriverInstance().findElement(locator);
        ((JavascriptExecutor) DriverSingleton.getDriverInstance()).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void clickElement(By locator) throws Exception { // clicks element, if unsuccessful it will take a screenshot
        try{
        getWebElement(locator).click();
        }catch (NoSuchElementException e){
            String timeNow = String.valueOf(System.currentTimeMillis());
            XMLManager.test.info("element was not found", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(DriverSingleton.getDriverInstance() , timeNow)).build());
        }
    }

    public void sendKeysToElement(By locator, String text) throws Exception { //writes given text
        getWebElement(locator).sendKeys(text);
    }

    private WebElement getWebElement(By locator) throws Exception { //creates a driver instance and finds element, instead of constantly creating new instances
        return DriverSingleton.getDriverInstance().findElement(locator);
    }

    private static String takeScreenShot(WebDriver driver, String ImagesPath) { //takes screenshot
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagesPath + ".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return ImagesPath + ".png";

    }
}
