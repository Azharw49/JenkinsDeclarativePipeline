package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataDriven {

    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on Home Page");
    }

    @When("User Navigate to LogIn Page")
    public void user_navigate_to_log_in_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Navigate to LogIn Page");
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
        System.out.println(string2);
    }

    @Then("Message displayed Login Successfully")
    public void message_displayed_login_successfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Message displayed Login Successfully");
    }

    @When("User enters Credentials to LogIn")
    public void user_enters_credentials_to_log_in(DataTable dataTable) {
        List<List<String>> data=dataTable.asLists();
        System.out.println(data.get(0).get(0));
        System.out.println(data.get(0).get(1));
    }


    @When("User gives the {string} and {string}")
    public void user_gives_the_and(String string1, String string2) {
        System.out.println("user name ="+string1);
        System.out.println("password ="+string2);
    }


    @Given("SQL oracle is launched")
    public void sqlOracleIsLaunched() {
        System.out.println("SQL oracle is launched");
    }

    @Then("Database is connected")
    public void databaseIsConnected() {
        System.out.println("Database is connected");
    }
}
