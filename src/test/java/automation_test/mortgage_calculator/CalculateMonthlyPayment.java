
package automation_test.mortgage_calculator;

import Testing.TestNgMavenTest;
import command_provider.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Home;
import utilities.GetData;
import utilities.ReadConfigFiles;
import utilities.SqlConnector;
import utilities.TestEnvironment;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class CalculateMonthlyPayment {
    private static final Logger LOGGER= LogManager.getLogger(TestNgMavenTest.class);
    WebDriver driver;

    @BeforeMethod
    public void BrowserInitialization() throws IOException {
        LOGGER.info("Test Case : CalculateMonthlyPayment starts here------->");
        driver= TestEnvironment.selectTestExecutionEnvironment();
        String URL= GetData.getPropertyValue("url");
        LOGGER.info("Invoke URL "+URL);
        ActOn.browser(driver).OPenBrowser(URL);
    }


      @Test
       public <ResultSet> void calculateRate(){
          ResultSet rs= SqlConnector.readData("Select * FROM monthly_mortgage");
          try {
              while (rs.next()) {
                  new Home(driver)
                          .typeHomePrice(rs.getString("homevalue"))
                          .typeDownPayment(rs.getString("downpayment"))
                          .clickDollarRadioButton()
                          .typeLoanAmount(rs.getString("loanamount"))
                          .typeInterestRate(rs.getString("interestrate"))
                          .typeLoanTerm(rs.getString("loanterm"))
                          .selectStartDate(rs.getString("startdatemonth"))
                          .typeStartYear(rs.getString("startdateyear"))
                          .typePropertyTax(rs.getString("propertytax"))
                          .typePMI(rs.getString("pmi"))
                          .typeHOI(rs.getString("homeownerinsurance"))
                          .typeHOA(rs.getString("monthlyhoa"))
                          .selectLoanType(rs.getString("loantype"))
                          .selectBuyOrRefinance(rs.getString("buyorrefi"))
                          .clickOnCalculateButton()
                          .validateTotalMonthlyPayment(rs.getString("totalmonthlypayment"));
              }

          } catch (SQLException e) {
                LOGGER.error(e.getMessage());
          }

      }


    @AfterMethod
      public void closeBrowser(){
      ActOn.browser(driver).CloseBrowser();
      LOGGER.info("<------Test Case Ends here------->");

    }
}
