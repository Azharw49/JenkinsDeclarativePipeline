package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CitrixPage {

    @Given("User have opened Citrix")
    public void user_have_opened_citrix() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User have opened Citrix");
    }

    @When("User have gave the credentials")
    public void user_have_gave_the_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User have gave the credentials");
    }

    @Then("Citrix is launched")
    public void citrix_is_launched() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Citrix is launched");
    }
}
