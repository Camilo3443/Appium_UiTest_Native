package PageObjects.ValidateHelp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HelpPageAndroid implements HelpPage {

    public HelpPageAndroid (AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "action_conta")
    private MobileElement clickEnter;

    @FindBy(id = "txtNewAccountLogin")
    private MobileElement clickLogin;

    @FindBy(id = "login")
    private MobileElement sendEmailkeys;

    @FindBy(id = "password")
    private MobileElement sendPasskeys;

    @FindBy(xpath = ("//android.widget.Button[@text='ENTRAR']"))
    private MobileElement clickEnterAcc;

//    public void assertContactName (String expectedName) {
//        Assert.assertEquals(expectedName, contactName.getText());
//    }


    public void clickLogin ( ) throws InterruptedException {

    }

    public void assertBottonFB ( ) {

    }

    @Override
    public void clickEnterAccount ( ) throws InterruptedException {

    }

    @Override
    public void clickEnterLogin ( ) throws InterruptedException {

    }

    public void sendEmail (String name) {

    }

    public void sendPass (String name) {

    }

    public void clickEnter ( ) throws InterruptedException {

    }

    public void assertGobloIcon ( ) throws InterruptedException {

    }

    public void clickEnterAcc ( ) throws InterruptedException {

    }

    @Override
    public void verifyLoginSucess (String name) throws InterruptedException {

    }

    @Override
    public void verifyAvatar ( ) throws InterruptedException {

    }

    @Override
    public void validateNotUserFull ( ) {

    }

    @Override
    public void pause ( ) throws InterruptedException {

    }

    @Override
    public void clickHelp ( ) throws InterruptedException {

    }

    public void assertTxt (String name) throws InterruptedException {

    }

    public void assertTxtBotton (String name) throws InterruptedException {

    }

    public void assertBottonEnter ( ) throws InterruptedException {

    }

}