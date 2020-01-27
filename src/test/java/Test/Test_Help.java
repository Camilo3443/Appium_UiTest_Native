package Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;

public class Test_Help extends BaseTestClass  {


    @Test
    @Feature("Register Philos")
    @Severity(SeverityLevel.TRIVIAL)


    public void TestHelp() throws InterruptedException {
        helpPage.clickEnterAccount();
        helpPage.clickEnterLogin();
        helpPage.sendEmail("mailinator");
        helpPage.clickEnterAcc();
        helpPage.sendPass("12345");
        helpPage.clickEnterAcc();
        helpPage.pause();
        helpPage.clickHelp();

    }

}
