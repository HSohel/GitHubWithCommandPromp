package practiceTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    WebDriver driver;

    @FindBy (id="username")
    private WebDriver userName;

    @FindBy (id="password")
    private WebElement password;


    public LoginPageFactory(){
        PageFactory.initElements(driver, this);

    }


    public void doLogin(){

    }

}
