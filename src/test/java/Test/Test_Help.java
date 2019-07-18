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
        helpPage.sendEmail("luis.camilo@dextra-sw.com");
        helpPage.clickEnterAcc();
        helpPage.sendPass("Dudu3443");
        helpPage.clickEnterAcc();
        helpPage.pause();
        helpPage.clickHelp();

    }

}
