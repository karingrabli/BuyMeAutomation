package driverSingleton;
import constants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.time.Duration;


public class DriverSingleton {
    private static WebDriver driver;
    public static WebDriver getDriverInstance() throws Exception {
        if(driver == null){
        String type = getData("browserType");
        if(type.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }else if(type.equals("FF")){
            System.setProperty("webdriver.firefox.driver", "C:\\geckodriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }}
        return driver;
    }
    private static String getData (String keyName) throws Exception{
        File fXmlFile = new File("/Users/karingrabli/Desktop/data.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }
    public static void openURL() throws Exception {
        DriverSingleton.getDriverInstance().get(getData("URL"));
    }

    }


