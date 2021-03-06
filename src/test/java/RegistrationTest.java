import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends BaseUI {




    @Test(dataProvider = "Registration2", dataProviderClass = DataProviders.class)
    public void testRegistration2(String email, String nickname, boolean requirement) {
        System.out.println(email);

        mainPage.clickJoinButton();
        mainPage.completeFirstOfRegistration(email, Data.password);

        if (!requirement) {
            Assert.assertTrue(driver.findElement(Locators.TOOLTIP_ERROR).isDisplayed());
        } else {
            mainPage.clickNextButton();
            mainPage.completeSecondPartOfRegistration(nickname, Data.phone,
                    Data.month, Data.day, Data.year, Data.city, Data.location);

        }

    }

    @Test(dataProvider = "Registration", dataProviderClass = DataProviders.class)
    public void testRegistration (String email, String password, String day, String month, String year,
        String phone, String city, String location) {
        mainPage.clickJoinButton();
        mainPage.completeFirstOfRegistration(email, Data.password);
        mainPage.clickNextButton();
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5), Data.phone,
                Data.month, Data.day, Data.year, Data.city, Data.location);

    }


}




