package task.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginTask {
    public static @FindBy(xpath = "//*[@id=\"menuUserLink\"]")
    WebElement OpenUser;

    public static @FindBy(name = "username")
    WebElement UserName;

    public static @FindBy(xpath = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")
    WebElement Password;

    public static @FindBy(xpath = "/html/body/login-modal/div/div/div[3]/sec-form/sec-sender/button")
    WebElement SignIn;

    public loginTask openUser() throws InterruptedException{
        Thread.sleep(15000);
        OpenUser.click();
        return new loginTask();
    }

    public loginTask userName(String username) throws InterruptedException{
        Thread.sleep(10000);
        UserName.sendKeys(username);
        return new loginTask();
    }

    public loginTask password(String password) throws InterruptedException{
        Thread.sleep(5000);
        Password.sendKeys(password);
        return new loginTask();
    }

    public loginTask signIn() throws InterruptedException{
        Thread.sleep(5000);
        SignIn.click();
        return new loginTask();
    }
}
