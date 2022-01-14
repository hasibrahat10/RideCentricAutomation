package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.TestSetupPage;

public class LoginPage extends TestSetupPage {

    @FindBy(id="UserName")
    WebElement userName;
    @FindBy(id="btnNext")
    WebElement nextBtn;

    @FindBy(id="Password")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(), 'Login')]")
    WebElement login;

    @FindBy(xpath = "//i[@class='ss-logout']")
    WebElement logOut;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void setEmail(){
        userName.sendKeys("hasancse10@gmail.com");
        nextBtn.click();
    }

    public void setLogin(){
        password.sendKeys("123456");
        login.click();
    }

    public void clickLogOut(){
        sleep(5);
        logOut.click();
    }

}
