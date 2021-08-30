
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void completeFirstOfRegistration(String email, String password) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_EMAIL)));
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondPartOfRegistration(String nickname, String phone, String month, String day,
                                                 String year, String city, String location) {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(nickname);

        driver.findElement(Locators.LIST_DAYS).click();
        clickValueOfLists(Locators.LIST_VALUE_DAY, day);

        driver.findElement(Locators.LIST_MONTHS).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.LIST_VALUE_MONTH)));
        clickValueOfLists(Locators.LIST_VALUE_MONTH, month);

        driver.findElement(Locators.LIST_YEARS).click();
        clickValueOfLists(Locators.LIST_VALUE_YEAR, year);

        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(phone);
        driver.findElement(Locators.CHECKBOX_CONFIRMATION).click();

        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys(city);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.LIST_VALUE_LOCATION)));
        clickValueOfLists(Locators.LIST_VALUE_LOCATION, location);

    }
   public void clickTabBlog(){
        driver.findElement(Locators.LINK_BLOG).click();


   }
   public void clickLinkMedia(){
       wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
       driver.findElement(Locators.LINK_MEDIA).click();
   }
}










