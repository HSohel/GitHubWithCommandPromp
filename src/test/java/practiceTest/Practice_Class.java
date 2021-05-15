package practiceTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

public class Practice_Class {

    WebDriver driver;

    private final By RateLink=By.xpath("//a[text()='Rates']");
    private final By RealApr=By.xpath("//a[text()='Real APR']");
    private final By HomeValue=By.name("HomeValue");
    private final By DownPayment=By.name("DownPayment");
    private final By DownPaymentInDollar=By.id("DownPaymentSel0");
    private final By InterestRate=By.name("Interest");
    private final By Length=By.name("Length");
    private final By Calculate=By.name("calculate");
    private final By ActualAPR=By.xpath("//tr/td/strong[contains(text(),'Actual APR')]/../following-sibling::td/strong");

    @BeforeMethod

    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.mortgagecalculator.org/");
        driver.manage().window().maximize();
    }


    public void navigateToRatePage(){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(RateLink)).perform();
        driver.findElement(RealApr).click();
    }


    public void performAction(){
     Actions builder=new Actions(driver);
     builder.contextClick().perform();

    }


        /*Select select=new Select(driver.findElement(By.xpath("//tr/td/strong[contains(text(),'Actual APR')]/../following-sibling::td/strong")));
        select.selectByVisibleText("Feb");
        WebElement element = driver.findElement(By.xpath("//tr/td/strong[contains(text(),'Actual APR')]/../following-sibling::td/strong"));
        Actions actions=new Actions(driver);
        actions.moveToElement(element).perform();

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        Select select1=new Select(driver.findElement(By.id("HomeValue")));
        select1.selectByVisibleText("");
        select1.selectByIndex(0);
        select1.selectByValue("");

        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.id("HomeValue"))).perform();

        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        alert.accept();
        alert.sendKeys("");
        alert.getText();

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("");

        File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,new File("c:/hfejf"));


        WebDriverWait wait=new WebDriverWait(driver,15);
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocated.driver.findElement(RateLink));


        JavascriptExecutor js=((JavascriptExecutor)driver);
        js.executeScript("window.scrollBy(0,100)");

        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(400,600));
        JavascriptExecutor js1=((JavascriptExecutor)driver);
        js.executeScript("window.resizeTo(400,600)");


        WebDriverWait wait1=new WebDriverWait(driver,15);
        Alert alert2=wait1.until(ExpectedConditions.alertIsPresent());
        //alert2.authenticateUsing(newUserAndPassword("","")); */





















    @Test
    public void calculateRealApr(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        navigateToRatePage();
        driver.findElement(HomeValue).clear();
        driver.findElement(HomeValue).sendKeys("2000000");

        driver.findElement(DownPayment).clear();
        driver.findElement(DownPayment).sendKeys("20000");

        driver.findElement(DownPaymentInDollar).click();

        driver.findElement(InterestRate).clear();
        driver.findElement(InterestRate).sendKeys("3%");

        driver.findElement(Length).clear();
        driver.findElement(Length).sendKeys("30");

        driver.findElement(Calculate).click();


        //Validate APR
        String expectedAPR="3.084%";
        String actualAPR=driver.findElement(ActualAPR).getText();
        Assert.assertEquals(actualAPR,expectedAPR);


    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();

    }
}
