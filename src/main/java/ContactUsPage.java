import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ContactUsPage extends BaseActions {

    public ContactUsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

    }

    public void completeContactAdministratorForm(String yourname, String youremail, String subject, String message,
                                                 String securitycode) {


        driver.findElement(Locators.LIST_REASON).click();

        driver.findElement(Locators.TEXT_FIELD_YOURNAME).sendKeys(yourname);

        driver.findElement(Locators.TEXT_FIELD_YOUREMAIL).sendKeys(youremail);

        driver.findElement(Locators.TEXT_FIELD_SUBJECT).sendKeys(subject);

        driver.findElement(Locators.TEXT_FIELD_MESSAGE).sendKeys(message);

        driver.findElement(Locators.TEXT_FIELD_SECURITYCODE).sendKeys(securitycode);
        driver.findElement(Locators.SEND_BUTTON).click();


    }
}



