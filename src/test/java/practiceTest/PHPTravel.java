package practiceTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PHPTravel {

WebDriver driver;

    @BeforeTest
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //WebDriverManager.iedriver().setup();
        //driver=new InternetExplorerDriver();
        driver.get("https://phptravels.com/demo/");
        driver.manage().window().maximize();
    }


    @Test
    public void validateHomePageTitle(){
        String expectedValue="Demo Script Test drive - PHPTRAVELS";
        String actualValue=driver.getTitle();
        Assert.assertEquals(actualValue,expectedValue);
        driver.findElement(By.id("homeval"));
    }

    @AfterTest
    public void CloseBrowser(){
        driver.quit();
    }

}
