import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTest extends BaseUI {
    String currentUrlMedia;


    @Test
    public void testMediaPage() {
        mainPage.clickLinkMedia();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);

    }

}





