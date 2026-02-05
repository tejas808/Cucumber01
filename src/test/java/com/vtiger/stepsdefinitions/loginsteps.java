package com.vtiger.stepsdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class loginsteps extends basesteps  {



    @Then("user can see the logout option")
    public void user_can_see_the_logout_option() {

        hp.verifylogout();
    }

    @When("user enters invalid credentials")
    public void user_enters_invalid_credentials() {
        lp.login("admin123","admin");

    }
    @Then("user should navigated to login page")
    public void user_should_navigated_to_login_page() throws InterruptedException {
          lp.verifyUserName();
    }
    @Then("user can see the error message")
    public void user_can_see_the_error() {
       lp.verifyErrorMsg();
    }

    @When("user enters invalid credentials as username {string} and password {string}")
    public void user_enters_invalid_credentials_as_username_and_password(String uid, String pwd) {
        lp.login(uid,pwd);
    }



    @Given("user should be on login page")
    public void user_should_be_on_login_page() {
        LaunchApp();

    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
             lp.login("admin","admin");
    }
    @Then("user should navigated to home page")
    public void user_should_navigated_to_home_page() {

        hp.verifyhome();

    }

}
