import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {
    String currentUrlSearch;

    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        Select select = new Select(driver.findElement(By.xpath("//div[@class ='col-xs-5 no-padding-left']//select[@id='age_min']")));
        //select.selectByValue("date_created");
        select.selectByValue("22");

       // WebElement dropDownListSortByAge = driver.findElement(Locators.DROP_DOWN_LIST_SORT_AGE);


       // WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
    //   getDropDownListByValue(dropDownListSortBy, value:"date_create");



    }

    public void getDropDownListByIndex(WebElement element , int index) {
        Select select = new Select (element);
        select.selectByIndex(index);
    }

    public void getDropDownListByText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }

    public void getDropDownListByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);






    }
}
