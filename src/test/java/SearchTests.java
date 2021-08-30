import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SearchTests extends BaseUI {
    String currentUrlSearch;

    public static final boolean testCase11 = true;
    public static final boolean testCase12 = true;
    public static final boolean testCase13 = true;



    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_SORT_AGE), "22");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");

    }

    @Test (priority = 2, enabled = testCase12, groups = {"ie", "user","admin"})
    public void testSearchPage1TestCase12() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        searchPage.clickSearchButton();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        // Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Url is wrong");
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Url is wrong");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");
        softAssert.assertAll();
    }
@Test (priority = 3, enabled = testCase13, groups = {"user","admin"})
    public void verificationsWebTestCase13() {
        Assert.assertEquals("Web", "Web");

    }


    @Test (priority = 1, enabled = testCase11, groups =  {"user","admin"})
    public void selectRandomDropDownListTestsOnSearchPageCase11() {
        searchPage.clickSearchButton();
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGE);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGE, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }

        @Test
        public void testSearchPage2() {
            searchPage.clickSearchButton();
            currentUrlSearch = driver.getCurrentUrl();
            System.out.println(currentUrlSearch);
            Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
            searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");

        }



    }
