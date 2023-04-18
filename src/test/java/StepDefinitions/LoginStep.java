package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginStep {
    DialogContent dc=new DialogContent();
    @Given("Navigate to web site")
    public void navigateToNSite() {
        GWD.getDriver().get("https://www.n11.com/");
    }

    @When("Enter valid username and password")
    public void enterValidUsernameAndPassword() {
        dc.clickFunction(dc.signIn);
        dc.sendKeysFunction(dc.email,"bughunters2023@hotmail.com");
        dc.sendKeysFunction(dc.password,"Brd.2023");
        //dc.scroll("500");

    }

    @And("Click on the login button")
    public void clickOnTheLoginButton() {

        dc.loginButton.click();


    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(dc.hesabim.isDisplayed(),"aa");
        dc.verifyContainsTextFunction(dc.hesabim,"MÜ");
    }


}
