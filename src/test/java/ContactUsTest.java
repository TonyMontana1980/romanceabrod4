import org.testng.annotations.Test;

public class ContactUsTest extends BaseUI {


    @Test
    public void testContactUs(){
        contactUsPage.completeContactAdministratorForm(Data.yourname,  Data.youremail, Data.subject,
                Data.message, Data.securitycode);

    }




}
