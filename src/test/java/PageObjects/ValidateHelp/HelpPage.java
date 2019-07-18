package PageObjects.ValidateHelp;


public interface HelpPage {

    void clickEnterAccount ( ) throws InterruptedException;

    void clickEnterLogin ( ) throws InterruptedException;

    void sendEmail (String name) throws InterruptedException;

    void sendPass (String name) throws InterruptedException;

    void clickEnterAcc ( ) throws InterruptedException;

    void verifyLoginSucess (String name) throws InterruptedException;

    void verifyAvatar ( ) throws InterruptedException;

    void validateNotUserFull ( );

    void pause ( ) throws InterruptedException;

    void clickHelp ( ) throws InterruptedException;


}