package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LoginPage;

import java.util.Map;

public class LoginSteps {
    Base base;
    LoginPage loginPage;

    public LoginSteps(Base base) {
        this.base = base;
        loginPage = new LoginPage(base.getDriver());
    }

    @Given("navigate to the url")
    public void navigate_to_the_url() {
        loginPage.navigate();
    }
   @And("enters credentials and clicks login")
    public void enters_credentials_and_clicks_login(Map<String, String> dataTable){
        loginPage.entercredentialsAndLogin(dataTable.get("userId"),dataTable.get("password"));

    }
    @Then("login successful")
    public void login_successful() {
        System.out.println("login successful");
        //homePage.validatePageTitle();
    }
    @Then("click logout")
    public void click_logout() {
     //   loginPage.logout();
    }

}
