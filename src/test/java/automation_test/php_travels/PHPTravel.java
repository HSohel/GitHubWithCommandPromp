package automation_test.php_travels;

import Testing.TestNgMavenTest;
import command_provider.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.GetData;
import utilities.TestEnvironment;

import java.io.IOException;

public class PHPTravel {
    private static final Logger LOGGER= LogManager.getLogger(TestNgMavenTest.class);
WebDriver driver;

    @BeforeTest
    public void BrowserInitialization() throws IOException {
        LOGGER.info("<-----Test Case :PHPTravel start here------>");
        String URL= GetData.getPropertyValue("phpUrl");
        driver= TestEnvironment.selectTestExecutionEnvironment();
        LOGGER.info("Invoke URL "+URL);
        ActOn.browser(driver).OPenBrowser(URL);
    }


    @Test
    public void validateHomePageTitle(){
        String expectedTitle="PHPTRAVELS booking script and system for hotels airline flights tours cars online application - PHPTRAVELS";
        ActOn.browser(driver).validateTitle(expectedTitle);
    }

    @AfterTest
    public void CloseBrowser(){
        ActOn.browser(driver).CloseBrowser();
        LOGGER.info("<-----Test Case :PHPTravel end here------>");
    }


}
