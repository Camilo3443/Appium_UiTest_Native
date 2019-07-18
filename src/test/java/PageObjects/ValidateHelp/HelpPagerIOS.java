package PageObjects.ValidateHelp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HelpPagerIOS implements HelpPage {

    public HelpPagerIOS (AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "iconsProfile")
    private MobileElement clickloginEnter;

    @FindBy(id = "userAvatar")
    private MobileElement idAvatar;


//    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
//    private MobileElement emailInput;
//

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Entrar\"]")
    private MobileElement idEnter;

    @FindBy(id = "ENTRAR")
    private MobileElement idEnterGcom;
    @FindBy(id = "Ajuda")
    private MobileElement idHelp;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"E-mail\"]")
    private MobileElement emailSend;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Senha\"]")
    private MobileElement passSend;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Luis Eduardo Camilo\"]")
    private MobileElement emailOk;


//    public void assertContactName (String expectedName) {
//        Assert.assertEquals(expectedName, contactName.getText());
//    }

    public void clickEnterAccount ( ) throws InterruptedException {
        clickloginEnter.click();
        Thread.sleep(2000);

    }

    public void clickEnterLogin ( ) throws InterruptedException {
        idEnter.click();

    }

    public void sendEmail (String name) throws InterruptedException {
        emailSend.sendKeys(name);

    }

    public void sendPass (String name) throws InterruptedException {
        passSend.sendKeys(name);


    }

    public void clickEnterAcc ( ) throws InterruptedException {
        idEnterGcom.click();
        Thread.sleep(5000);

    }

    public void verifyLoginSucess (String expectedName) throws InterruptedException {
        Thread.sleep(Long.parseLong("2000"));
        Assert.assertEquals(expectedName, emailOk.getText());

    }   public void clickHelp (String expectedName) throws InterruptedException {
        Thread.sleep(Long.parseLong("2000"));
        idHelp.click();

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


}

