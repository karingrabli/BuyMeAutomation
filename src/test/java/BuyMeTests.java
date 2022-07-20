import Pages.*;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import driverSingleton.DriverSingleton;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import xmlmanager.XMLManager;


public class BuyMeTests {
    IntroPage introPage = new IntroPage();
    RegistrationPage registrationPage = new RegistrationPage();
    HomePage homePage = new HomePage();
    BusinessPage businessPage = new BusinessPage();
    SenderReceiverInfoPage senderReceiverInfoPage = new SenderReceiverInfoPage();


    @BeforeClass
    public static void openBuyMe() throws Exception {
        String cwd = System.getProperty("user.dir");
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter( cwd + "\\extent.html");
        XMLManager.extent.attachReporter(htmlReporter);
        DriverSingleton.openURL();
    }

//Intro screen

    @Test
    public void test01_RegistrationPageTest() throws Exception {
        XMLManager.test.log(Status.INFO,"introduction page");
        introPage.getToRegistrationPage();
    }
    //registration screen

    @Test
    public void test02_enterPrivateInformationTest() throws Exception {
        XMLManager.test.log(Status.INFO,"registration page");
        registrationPage.enterCredentials();
    }
    @Test
    public void test03_clickAgreeToTermsTest() throws Exception {
        registrationPage.clickAgreeToTerms();
    }

    //Home Screen
    @Test
    public void test04_selectPriceTest() throws Exception {
        XMLManager.test.log(Status.INFO,"home page");
        homePage.enterPrice();
    }
    @Test
    public void test05_selectRegionTest() throws Exception {
        homePage.pickRegion();
    }
    @Test
    public void test06_selectCategoryTest() throws Exception {
        homePage.pickCategory();
    }
    @Test
    public void test07_clickFindGift() throws Exception {
        homePage.pressFindMeAGift();
    }

    //Pick business
    @Test
    public void test08_assertURL()throws Exception{
        businessPage.assertURL();
    }

    @Test
    public void test09_pickBusinessTest() throws Exception {//change numbers
        XMLManager.test.log(Status.INFO,"business page");
        businessPage.pickBusiness();
    }
    @Test
    public void test10_enterSumTest() throws Exception {
        businessPage.enterSum();
    }
    @Test
    public void test11_pressPickTest()throws Exception{
        businessPage.pickPick();
    }
    //Sender & Receiver information screen
    @Test
    public void test12_pickSomeoneElseTest()throws Exception{
        XMLManager.test.log(Status.INFO,"sender and receiver information page");
        senderReceiverInfoPage.pickSomeoneElse();
    }
    @Test
    public void test13_giftReceiverTest()throws Exception{
        senderReceiverInfoPage.giftReceiver();
    }
    @Test
    public void test14_pickEventTest() throws Exception{
        senderReceiverInfoPage.pickEvent();
    }
    @Test
    public void test15_enterBlessingTest() throws Exception{
        senderReceiverInfoPage.enterBlessing();
    }
    @Test
    public void test16_uploadPictureTest()throws Exception{

    }
    @Test
    public void test17_pressContinueTest()throws Exception{
        senderReceiverInfoPage.clickContinue();
    }
    @Test
    public void test18_pressNowTest()throws Exception{
        senderReceiverInfoPage.clickNow();
    }
    @Test
    public void test19_pickSMSTest()throws Exception{
        senderReceiverInfoPage.pickSMS();
    }
    @Test
    public void test20_enterNumberTest() throws Exception{
        senderReceiverInfoPage.enterNumber();
    }
    @Test
    public void test21_enterSenderNameTest()throws Exception{
        senderReceiverInfoPage.enterSenderName();
    }
    @Test
    public void test22_proceedToPayTest() throws Exception{
        senderReceiverInfoPage.proceedToPay();
    }

    @AfterClass
    public void test22_finish() throws Exception {
        DriverSingleton.getDriverInstance().quit();
        XMLManager.extent.flush();
    }

}
