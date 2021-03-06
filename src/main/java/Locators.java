import org.openqa.selenium.By;

public class Locators {

    public static final By H1_TITLE = By.xpath("//h1");


    //Media page
   public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");

   //Contact Us Page
   public static final By CONTACT_US = By.xpath("//div[@class='footer-menu-list-group-item-text']");
   public static final By LIST_REASON = By.xpath("//select[@name='id_reason']//option[@value='2']");
   public static final By TEXT_FIELD_YOURNAME = By.xpath("//input[@name='user_name']");
   public static final By TEXT_FIELD_YOUREMAIL = By.xpath("//input[@name='user_email']");
   public static final By TEXT_FIELD_SUBJECT = By.xpath("//input[@name='subject']");
   public static final By TEXT_FIELD_MESSAGE = By.xpath("//textarea[@name='message']");
   public static final By TEXT_FIELD_SECURITYCODE = By.xpath("//input[@name='captcha_code']");
   public static final By SEND_BUTTON = By.xpath("//input[@name='btn_save']");



//Registration
    public static final  By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final  By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final  By TOOLTIP_ERROR = By.xpath("//div[@class='tooltip']");

    public static final  By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final  By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final  By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final  By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");

    public static final  By LIST_DAYS = By.cssSelector("#daySelect");
    public static final  By LIST_MONTHS = By.cssSelector("#monthSelect");
    public static final  By LIST_YEARS = By.cssSelector("#yearSelect");
    public static final  By LIST_VALUE_DAY = By.xpath("//li[@data-handler='selectDay']");
    public static final  By LIST_VALUE_MONTH = By.xpath("//li[@data-handler='selectMonth']");
    public static final  By LIST_VALUE_YEAR = By.xpath("//li[@data-handler='selectYear']");
    public static final By CHECKBOX_CONFIRMATION = By.cssSelector("input#confirmation");
    public static final By LIST_VALUE_LOCATION = By.xpath("//div[@class='dropdown dropdown_location']//ul//li");
    public static final By AUTOFILLING_FORM_LOCATION = By.xpath("//input[@name='region_name']");



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



    //
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINKS_OF_ACRTICLES = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//li");

}


