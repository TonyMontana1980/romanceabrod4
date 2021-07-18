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


        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");

    }

    @Test
    public void testSearchPage1() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        // Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Url is wrong");
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Url is wrong");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");

    }

    public void validateAssertions() {
        Assert.assertEquals("Web", "Web is");

        Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(), "Element is not displayed");

        Assert.fail("Element is not displayed");

    }


    @Test
    public void selectRandomDropDownList() {
        driver.findElement(Locators.LINK_SEARCH).click();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGE);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGE, "Sort by");
            mainPage.javaWaitSec(3);
        }

    }
}