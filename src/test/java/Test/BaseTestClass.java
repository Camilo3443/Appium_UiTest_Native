package Test;

import AppiumSupport.AppiumBaseClass;

import PageObjects.LoginUserNotSubscribe.LoginNotSubscriber;
import PageObjects.LoginUserNotSubscribe.LoginNotSubscriberPageAndroid;
import PageObjects.LoginUserNotSubscribe.LoginNotSubscriberPageIOS;
import PageObjects.LoginUserSubscriber.LoginSubscriber;
import PageObjects.LoginUserSubscriber.LoginSubscriberPageAndroid;
import PageObjects.LoginUserSubscriber.LoginSubscriberPageIOS;
import PageObjects.Register.RegisterPage;
import PageObjects.Register.RegisterPageAndroid;
import PageObjects.Register.RegisterPagerIOS;
import PageObjects.ValidateHelp.HelpPage;
import PageObjects.ValidateHelp.HelpPageAndroid;
import PageObjects.ValidateHelp.HelpPagerIOS;
import org.junit.After;
import org.junit.Before;

import AppiumSupport.AppiumController;


public class BaseTestClass extends AppiumBaseClass {

    RegisterPage registerPage;
    LoginSubscriber loginsubscribe;
    LoginNotSubscriber loginNotSubscriber;
    HelpPage helpPage;

    @Before
    public void setUp ( ) throws Exception {
        AppiumController.instance.start();
        switch (AppiumController.executionOS) {
            case ANDROID:
                registerPage = new RegisterPageAndroid(driver());
                loginsubscribe = new LoginSubscriberPageAndroid(driver());
                loginNotSubscriber =new LoginNotSubscriberPageAndroid(driver());
                helpPage =new HelpPageAndroid(driver());

            break;
            case IOS:
                registerPage = new RegisterPagerIOS(driver());
                loginsubscribe = new LoginSubscriberPageIOS(driver());
                loginNotSubscriber =new LoginNotSubscriberPageIOS(driver());
                helpPage =new HelpPagerIOS(driver());


                break;
            case IOS_FARM:
                registerPage = new RegisterPagerIOS(driver());
                loginsubscribe = new LoginSubscriberPageIOS(driver());
                loginNotSubscriber =new LoginNotSubscriberPageIOS(driver());
                helpPage =new HelpPagerIOS(driver());

                break;
            case ANDROID_FARM:
                registerPage = new RegisterPageAndroid(driver());
                loginsubscribe = new LoginSubscriberPageAndroid(driver());
                loginNotSubscriber =new LoginNotSubscriberPageAndroid(driver());
                helpPage =new HelpPageAndroid(driver());
                break;

        }
    }

    @After
    public void tearDown ( ) {
        AppiumController.instance.stop();
    }
}
