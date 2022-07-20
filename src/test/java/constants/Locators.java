package constants;
import org.openqa.selenium.By;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Locators {
    //intro page locators
    public static final By ENTER_REGISTER_BUTTON = By.xpath("span[כניסה / הרשמה]");
    public static final By REGISTER_BUTTON = with(By.cssSelector("span[data-ember-action=2486]")).toRightOf(By.linkText("פעם ראשונה ב-BUYME?"));

    //registration page locators
    public static final By NAME_BUTTON = By.id("ember2518");
    public static final By EMAIL_BUTTON = By.id("ember2525");
    public static final By PASSWORD_BUTTON = By.id("valPass");
    public static final By VALIDATE_PASSWORD_BUTTON = By.id("ember2539");
    public static final By AGREE_TO_TERMS_BUTTON = with(By.cssSelector("polygon[points=8.6 14.7 4.1 10.2 5.6 8.8 8.6 11.9 14.4 6 15.9 7.4 8.6 14.7]")).below(By.id("ember2539"));
    public static final By SUBMIT_BUTTON = By.cssSelector("button[gtm=הרשמה ל-BUYME]");

    //home page locators in home page
    public static final By FIND_ME_A_GIFT_BUTTON = By.id("ember2200");

    //business page locators
    public static final By NALAGAAT_BUSINESS_BUTTON = By.cssSelector("a[href=https://buyme.co.il/supplier/400331?budget=2&category=409&query=&region=13]");
    public static final By SUM_BUTTON = By.id("ember3009");
    public static final By CHOOSE_BUTTON = By.id("ember3015");

    // sender and receiver info page
    public static final By SOMEONE_ELSE_BUTTON = By.cssSelector("div[gtm=למישהו אחר]");
    public static final By RECEIVER_NAME_BUTTON = By.cssSelector("input[data-parsley-required-message=מי הזוכה המאושר? יש להשלים את שם המקבל/ת]");
    public static final By WHATS_THE_OCCASION_BUTTON = By.id("ember3289");
    public static final By BLESSING_BUTTON = By.cssSelector("textarea[data-parsley-group=voucher-greeting]");
    public static final By CONTINUE_BUTTON = By.cssSelector("button[gtm=המשך]");
    public static final By NOW_BUTTON = By.cssSelector("div[gtm=עכשיו]");
    public static final By SEND_BY_EMAIL_ICON = By.cssSelector("svg[gtm=method-email]");
    public static final By RECEIVER_EMAIL_LOCATOR = By.cssSelector("input[placeholder=מייל מקבל/ת המתנה]");
    public static final By GIFT_SENDER_NAME_BUTTON = By.cssSelector("input[placeholder=שם שולח המתנה]");
    public static final By PROCEED_TO_PAYMENT_BUTTON = By.cssSelector("button[gtm=המשך לתשלום]");





}
