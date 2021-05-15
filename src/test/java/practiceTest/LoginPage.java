package practiceTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;

public class LoginPage {
    WebDriver driver;
    WebElement userName;
    WebElement password;

    public LoginPage(){

    }

    @Test
    public void FileDownLoad() throws InterruptedException {
        String downloadFilePath="C:/Users/Haideruzzaman/Desktop/JobPreparation2021";
        HashMap<String, Object> hMap=new HashMap<>();
        hMap.put("profile.default_content_settings.popups",0);
        hMap.put("download.default.directory",downloadFilePath);

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs",hMap);

        driver=new ChromeDriver(chromeOptions);
        driver.get("https://skpatro.github.io/demo/links/");
        driver.findElement(By.xpath("//input[@value='Download']")).click();
        Thread.sleep(4000);
        driver.close();
    }

    public void locateElement(){
        userName=driver.findElement(By.id("username"));
        password=driver.findElement(By.id("password"));
    }

    public  void doLogin(){
        userName.sendKeys("email");
        password.sendKeys("password");
    }
}
