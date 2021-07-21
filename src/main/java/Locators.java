import org.openqa.selenium.By;

public class Locators {


    //Media page
   public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");


//Registration
    public static final  By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final  By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");

    public static final  By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final  By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final  By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final  By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");

    public static final  By DAY_FIELD = By.xpath("//li[@data-handler='selectDay']//a[text()='2']");
    public static final  By MONTH_FIELD = By.xpath("//li[@data-handler='selectMonth']//a[text()='May']");
    public static final  By YEAR_FIELD = By.xpath("//li[@data-handler='selectYear']//a[text()='2001']");

    public static final By CHECK_BOX = By.cssSelector("input#confirmation");
//Search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    //Lesson 14 Xpath
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_SORT_AGE = By.xpath("//div[@class ='col-xs-5 no-padding-left']//select[@id='age_min']");
    public static final By DROP_DOWN_MAX_AGEX = By.xpath("//div[@class ='col-xs-5 no-padding-right']//select[@id='age_max']");
    public static final By  TAB_OF_MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']//li");
    public static final By  TAB_OF_JOIN_TODAY = By.xpath("//div[@class='col-lg-12 text-center']//a[@href='#']");
    public static final By  TAB_OF_PHONE = By.xpath("//div[@class='col-lg-5']//a[@href='callto:18885997816']");
    public static final By  TAB_OF_EMAIL = By.xpath("//div[@class='col-lg-5']//a[@href='mailto:support@romanceabroad.com']");
    public static final By  TAB_OF_YOUTUBE = By.xpath("//div[@class='col-lg-5']//a['@href=https://www.youtube.com/channel/UCCmXAG1ToSyHymqYzzJcTfQ']");
    public static final By  TAB_OF_FACEBOOK = By.xpath("//div[@class='col-lg-5']//a['@href=https://m.facebook.com/RomanceAbroad/?ref=bookmarks']");
    public static final By  TAB_OF_PAYPAL = By.xpath("//div[@class='mt20']//a['@href=https://www.paypal.com/webapps/hermes?token=3ET13042FB395174M&useraction=commit&mfid=1626749785173_6b0e909cbaf30']");

    public static final By  HOW_WE_WORK = By.xpath("//a[text()='HOW WE WORK'][@class='nav-link ']");
    public static final By  PRETTY_WOMEN = By.xpath("//a[text()='PRETTY WOMEN'][@class='nav-link']");
    public static final By  PHOTOS = By.xpath("//a[text()='PHOTOS'][@class='nav-link']");
    public static final By  GIFTS = By.xpath("//a[text()='GIFTS'][@class='nav-link']");
    public static final By  HOME = By.xpath("//a[text()='HOME'][@class='nav-link']");
    public static final By  TOUR_TO_UKRAINE = By.xpath("//a[text()='TOUR TO UKRAINE'][@class='nav-link ']");
    public static final By  BLOG = By.xpath("//a[text()='BLOG'][@class='nav-link ']");
    public static final By  SIGN_IN = By.xpath("//a[text()='SIGN IN'][@class='nav-link active']");
    public static final  By DAY_FIELDD = By.xpath("//li[@data-handler='selectDay']//a[text()='3']");
    public static final By  REGISTRATION_B = By.xpath("//button[@id='show-registration-block'][//button='JOIN FOR FREE NOW']");




    public static final By DROP_DOWN_MAX_AGE = By.cssSelector("select#age_max");

    public static final By FILTER_MIN_AGE = By.xpath("//select[@id ='age_min']");
    public static final By FILTER_MAX_AGE = By.cssSelector("#age_max");
    public static final By FILTER_SEARCH_BUTTON = By.cssSelector("#main_search_button_user_advanced");

    public static final By  TITLE_OF_PAGE = By.xpath("//h1");
   // public static final By  TAB_OF_MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']//li");
    public static final By  IMAGES = By.xpath("//a[@class='g-pic-border g-rounded']");
    public static final By BLOG_LINK = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");

}


