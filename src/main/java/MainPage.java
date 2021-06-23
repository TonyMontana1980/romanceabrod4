import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage  extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton(){
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void completeFirstOfRegistration(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));

    }

    public void completeSecondPartOfRegistration(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 5));
        driver.findElement(By.cssSelector("#daySelect")).click();
        driver.findElement(Locators.DAY_FIELD).click();
        driver.findElement(By.cssSelector("#monthSelect")).click();
        driver.findElement(Locators.MONTH_FIELD).click();
        driver.findElement(By.cssSelector("#yearSelect")).click();
        driver.findElement(Locators.YEAR_FIELD).click();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        WebElement checkboxConfirmation = driver.findElement(By.cssSelector("input#confirmation"));
        checkboxConfirmation.click();


    }

}


