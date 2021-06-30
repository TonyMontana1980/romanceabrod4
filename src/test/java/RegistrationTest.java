import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends BaseUI {


    @Test
    public void testRegistration() {
        mainPage.clickJoinButton();
        mainPage.completeFirstOfRegistration();
        mainPage.completeSecondPartOfRegistration();

        }

    }




// boolean selectedCheckbox = checkboxConfirmation.isSelected();
// System.out.println(selectedCheckbox + "!!!!!!!!!");