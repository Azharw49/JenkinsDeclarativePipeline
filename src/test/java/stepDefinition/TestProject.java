package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.TestProjectHomePage;
import pages.TestProjectLoginPage;


public class TestProject{

     WebDriver driver;
    TestProjectLoginPage loginpg;
    TestProjectHomePage homePage;

    @Given("^Driver is launched$")
    public void driver_is_launched() throws Throwable {
        String root= System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",root + "/src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Then("^Open chrome$")
    public void open_chrome() throws Throwable {
        driver.manage().window().maximize();
    }


    @Given("TestUser in the login page")
    public void test_user_in_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        this.driver.get("https://example.testproject.io/web/");

    }

    @When("^TestUser gives (.+) and (.+)$")
    public void testuser_gives_and(String username, String password) throws Throwable {
        loginpg = new TestProjectLoginPage(driver);
        loginpg.enter_user_name(username);
        loginpg.enter_password(password);
    }

    @When("TestUser Clicks on the Login Button")
    public void test_user_clicks_on_the_login_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        loginpg.clickLogin();
    }

    @Then("TestUser is navigated to HomePage")
    public void test_user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage = new TestProjectHomePage(driver);
        homePage.checkReachedHomePage();
    }


    @Then("Close the Browser")
    public void close_the_browser()
    {
        driver.quit();
    }

    @After()
    public void quitBrowser()
    {
        try
        {
            driver.close();
            driver.get("file:///D:/GitHub%20Projects/Seelnium_Cucumber/target/cucumber-report-html/cucumber-html-reports/feature-overview.html");
        }
        catch (Exception e)
        {
            System.out.println("driver is already closed");
        }

    }








}
