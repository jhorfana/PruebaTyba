package stepDefinition.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import task.login.loginTask;
import task.TestBase;

public class loginSteps extends TestBase {
    loginTask logintask;

    @Given("the user enters the page {string}")
    public void theUserEntersThePage(String url) {
        TestBase.initialization();
        TestBase.openNavigator(url);
        logintask = new loginTask();
    }

    @When("the user enters the User option")
    public void theUserEntersTheUserOption() throws InterruptedException{
        logintask = logintask.openUser();

    }

    @And("the user enters the Username {string}")
    public void TheUserEntersTheUsername(String username) throws InterruptedException{
        logintask = logintask.userName(username);

    }

    @And("the user enters the password {string}")
    public void theUserEntersThePassword(String password) throws InterruptedException{
        logintask = logintask.password(password);
    }

    @And("the user selects the Sing in button")
    public void theUserSelectsTheSingInButton() throws InterruptedException{
        logintask = logintask.signIn();

    }

}
