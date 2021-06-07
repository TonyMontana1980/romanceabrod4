import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlSearch;
    String currentUrlMedia;
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    String actualTitle = "https://romanceabroad.com/";

    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");

    By LINK_SING_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    By LINK_TOUR_TO_UKRAINE = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By LINK_GIFTS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By LINK_PHOTOS = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    By LINK_PRETTY_W = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_HOW_W_WORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");

    //int indexLinkSignIn = 0;
    //int indexLinkBlog = 0;
    //int indexLinkTourToUkraine = 0;
   // int indexLinkGifts = 0;
   // int indexLinkPhotos = 0;
    //int indexPrettyW = 0;
    int indexHowWWork =0;












    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }


        @Test
        public void testSearchPage() {
            driver.findElement(LINK_SEARCH).click(); //+
            currentUrlSearch = driver.getCurrentUrl();
            System.out.println(currentUrlSearch);
            Assert.assertEquals(currentUrlSearch, expectedUrlSearch);

    }

        @Test
        public void testMainPage2() {
        //driver.findElements(LINK_SING_IN).get(indexLinkSignIn).click(); //+
        //driver.findElements(LINK_BLOG).get(indexLinkBlog).click(); //+
       // driver.findElements(LINK_TOUR_TO_UKRAINE).get(indexLinkTourToUkraine).click(); //+
        //driver.findElements(LINK_GIFTS).get(indexLinkGifts ).click();//+
       // driver.findElements(LINK_PHOTOS).get(indexLinkPhotos).click();
       // driver.findElements(LINK_PRETTY_W).get(indexPrettyW).click();
        driver.findElements(LINK_HOW_W_WORK).get(indexHowWWork).click();

    //}

       // @Test
       // public void testText() {

         //   String actualTitle = driver.findElement(By.class("//['h1']"));

    }

        @Test
        public void testRegistration() {
        driver.findElement(BUTTON_REGISTRATION).click(); //+
        driver.findElement(By.cssSelector("input#email")).sendKeys("12@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("1188Bux@");
        //driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();

    }


        @AfterMethod
        public void afterActions(){
        // driver.quit();
    }
}
