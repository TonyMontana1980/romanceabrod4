import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MainPageTest1 extends BaseUI {


    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(5000);
        WebElement ele = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']"));
        driver.switchTo().frame(ele);
        mainPage.clickPlayButtonLink();

    }

    @Test
    public void testLinksOnMainPage() {
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
        mainPage.searchLink();
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");

    }

 @Test
    public  void smokeTestMainPage(){
     List<WebElement> mainTabs = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li/a"));
     for (int i = 0; i <mainTabs.size(); i++) {
         mainTabs.get(i).click();
         driver.get(Data.Main_Url);
         mainTabs = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li/a"));


     }
 }

        }











