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
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_SORT_AGE = By.xpath("//div[@class ='col-xs-5 no-padding-left']//select[@id='age_min']");
    public static final By DROP_DOWN_MAX_AGE = By.cssSelector("select#age_max");

    public static final By FILTER_MIN_AGE = By.xpath("//select[@id ='age_min']");
    public static final By FILTER_MAX_AGE = By.cssSelector("#age_max");
    public static final By FILTER_SEARCH_BUTTON = By.cssSelector("#main_search_button_user_advanced");

    public static final By  TITLE_OF_PAGE = By.xpath("//h1");
    public static final By  TAB_OF_MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']//li");
    public static final By  IMAGES = By.xpath("//a[@class='g-pic-border g-rounded']");
    public static final By BLOG_LINK = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");

}


