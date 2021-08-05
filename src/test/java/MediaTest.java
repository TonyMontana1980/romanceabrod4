import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTest extends BaseUI {
    String currentUrlMedia;


    @Test
    public void testMediaPage() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
        mainPage.javaWaitSec(10);
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);

    }

}





