package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestProjectLoginPage {

   private WebDriver driver;


    @FindBy(id="name")
    private WebElement user_name ;

    @FindBy(id="password")
    private WebElement password ;

    @FindBy(id="login")
    private WebElement login;

    public TestProjectLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void enter_user_name(String userName) throws InterruptedException {
        System.out.println(userName);
        user_name.sendKeys(userName);
        Thread.sleep(1000);;
        System.out.println("executed all methods in enter_user_name");
    }

    public void enter_password(String pwd) throws InterruptedException {
        password.sendKeys(pwd);
        Thread.sleep(1000);
    }

    public void clickLogin() throws InterruptedException {
        login.click();
        Thread.sleep(1000);
    }











}
