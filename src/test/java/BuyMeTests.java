import Pages.*;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import driverSingleton.DriverSingleton;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import extentreports.ExtentReportss;

public class BuyMeTests {
    IntroPage introPage = new IntroPage();
    RegistrationPage registrationPage = new RegistrationPage();
    HomePage homePage = new HomePage();
    BusinessPage businessPage = new BusinessPage();
    SenderReceiverInfoPage senderReceiverInfoPage = new SenderReceiverInfoPage();


    @BeforeClass
    public static void openBuyMe() throws Exception {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(  "/Users/karingrabli/IdeaProjects/BuyMeAutomation/extent.html");
        ExtentReportss.extent.attachReporter(htmlReporter);
        DriverSingleton.openURL();
        ExtentReportss.test =  ExtentReportss.extent.createTest("BuyMeTest","BuyMe website sanity test");
    }

//Intro screen

    @Test
    public void test01_enterOrRegisterTest() throws Exception {
        ExtentReportss.test.log(Status.INFO,"introduction page");
        introPage.pressEnterSlashRegister();
    }
    @Test
    public void test02_pressRegisterTest() throws Exception{
        introPage.clickRegister();
    }

    //registration screen

    @Test
    public void test03_enterPrivateInformationTest() throws Exception {
        ExtentReportss.test.log(Status.INFO,"registration page");
        registrationPage.enterCredentials();
    }
    @Test
    public void test04_clickAgreeToTermsTest() throws Exception {
        registrationPage.clickAgreeToTerms();
    }

    //Home Screen
    @Test
    public void test05_selectPriceTest() throws Exception {
        ExtentReportss.test.log(Status.INFO,"home page");
        homePage.enterPrice();
    }
    @Test
    public void test06_selectRegionTest() throws Exception {
        homePage.pickRegion();
    }
    @Test
    public void test07_selectCategoryTest() throws Exception {
        homePage.pickCategory();
    }
    @Test
    public void test08_clickFindGift() throws Exception {
        homePage.pressFindMeAGift();
    }

    //Pick business
    @Test
    public void test09_assertURL()throws Exception{
        businessPage.assertURL();
    }

    @Test
    public void test10_pickBusinessTest() throws Exception {//change numbers
        ExtentReportss.test.log(Status.INFO,"business page");
        businessPage.pickBusiness();
    }
    @Test
    public void test11_enterSumTest() throws Exception {
        businessPage.enterSum();
    }
    @Test
    public void test12_pressPickTest()throws Exception{
        businessPage.pickPick();
    }
    //Sender & Receiver information screen
    @Test
    public void test13_pickSomeoneElseTest()throws Exception{
        ExtentReportss.test.log(Status.INFO,"sender and receiver information page");
        senderReceiverInfoPage.pickSomeoneElse();
    }
    @Test
    public void test14_giftReceiverTest()throws Exception{
        senderReceiverInfoPage.giftReceiver();
    }
    @Test
    public void test15_pickEventTest() throws Exception{
        senderReceiverInfoPage.pickEvent();
    }
    @Test
    public void test16_enterBlessingTest() throws Exception{
        senderReceiverInfoPage.enterBlessing();
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
    public void test23_finish() throws Exception {
        DriverSingleton.getDriverInstance().quit();
        ExtentReportss.extent.flush();
    }

}
