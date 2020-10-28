package pages;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestProjectHomePage {

    private WebDriver driver;

    @FindBy(id = "logout")
    private WebElement logout;

    public TestProjectHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickLogout()
    {
        logout.click();
    }

    public void checkReachedHomePage()
    {
        if(logout.isDisplayed()==false)
        {
            throw new ElementNotVisibleException("Logout Button not found");
        }
        else
        {
            System.out.println("Not inside Homepage");
        }
    }


}
