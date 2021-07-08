import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {


    @Test
    public void test1() {
        String fruit1 = "kiwi";
        String fruit2 = "kiwi";

        if (fruit2.contains("kiwi") || fruit1.contains("kiwi")) {
            System.out.println("We can find our fruit 1!");
        } else {
            Assert.fail("We can't find fruit");

        }
    }


    @Test
    public void test2() {
        int number1 = 10;
        int number2 = 10;
        int sum;


        if (number1 == number2) {
            sum = 95 + 100;
        } else {
            sum = 100 - 95;
        }
        System.out.println(sum);


    }

    @Test
    public void test3() {
        boolean requirement = false;

        if (!requirement) {
            System.out.println("Boolean is true!");
        } else {
            Assert.fail("Boolean is false");
        }

    }

    /*@Test
    public void test4(){

        mainPage.clickJoinButton();
        mainPage.completeFirstOfRegistration();
        mainPage.completeSecondPartOfRegistration();

        WebElement checkbox = driver.findElement(Locators.CHECK_BOX);

        if (!checkbox.isSelected()){
           checkbox.click();
            System.out.println("Checkbox is selected!");

        }

    }*/
    @Test
    public void test5() {
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.expectedUrlMedia);
            links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));

        }


    }


    @Test
    public void test6() {
        List<String> tabs = new ArrayList<>(Arrays.asList("Gifts", "Blog"));
        for (int i = 0; i < tabs.size(); i++) {
            if
            (driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']")).getText().contains(tabs.get(i))) {
                driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']")).click();
                //driver.findElement(By.xpath("//div[@class='text-overflow']")).click();
            }

        }


       List<WebElement> list = driver.findElements(By.xpath("//a"));
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i).getText().contains("Gifts")) {
                searchPage.clickSearchButton();

                 }
        }

        List<WebElement> list1 = driver.findElements(By.xpath("//a"));
        for (int i = 0; i <list1.size(); i++) {
            if (i == 2){
                searchPage.clickSearchButton();
            }
       }


    }

}














