package testA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class StepDefinitions {

    private static final int WAIT_TIME = 10;

    private static HomePage homePage;

    private static WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
    }

    @Given("The AutomationPractice site is open")
    public void theAutomationPracticeSiteIsOpen() {
        homePage = new HomePage(driver);
    }

    @And("The Sign In link is clicked")
    public void theSignInLinkIsClicked() {
        homePage.clickSignInLink();
    }

    @When("The Product 1 is added to the cart")
    public  void addedProduct1toCart(){homePage.clickaddtoCart();}

    @When("Search the womens cloths")
    public void searchStarted(){homePage.clickSearchButton();}

    @When("The Sign In button is clicked")
    public void theSignInButtonIsClicked() {
        homePage.clickSignInButton();
    }

    @Given("The {string} is filled with {string}")
    public void theFieldIsFilledWithParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @Then("The {string} is also filled with {string}")
    public void theFieldIsAlsoFilledWithParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @Then("The {string} message is shown")
    public void theMsgMessageIsShown(String msg) {
    }

    @Then("Go to the cashier")
    public void gotoCasher(){homePage.goCasher();}

    @Then("Change the quantity to 10")
    public void changeQuantity(){homePage.changeQty("0"); }

    @Then("Go back to home")
    public void backHome(){homePage.backH();}

    @Then("Go payment")
    public void goPmt(){homePage.goPayment();}

    @Then("Proceed to checkout")
    public void pCheckout(){homePage.pCo();}

    @Then("Agree Terms of Service")
    public void allowToS(){homePage.allowTermsOfService();}

    @Then("Checkout")
    public void finalCheck(){homePage.fCo();}

    @Then("Select bank payment")
    public void bankP(){homePage.bankPayment();}

    @Then("Confirm my order")
    public void FinalP(){homePage.finalProcess();}

    @Then("log out")
    public void logout(){homePage.logout();}
}