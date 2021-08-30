import org.testng.annotations.Test;

public class ContactUsTest extends BaseUI {


    @Test
    public void testContactUs(){
        mainPage.clickLinkMedia();
        mainPage.clickContactUsLink();
        contactUsPage.completeContactAdministratorForm(Data.yourname,  Data.youremail, Data.subject,
                Data.message, Data.securitycode);

    }




}
