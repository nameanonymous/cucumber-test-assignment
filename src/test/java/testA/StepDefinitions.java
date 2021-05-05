package testA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

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

    @Then("Submit")
    public void changeSize(){homePage.submitClick();}

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

    @Then("Continue Shopping")
    public void continueShop(){homePage.continueShopping();}

    @When("The Product 2 is added to the cart")
    public  void addedProduct2toCart(){homePage.clickaddtoCart2();}

    @Then("Get more details")
    public void getMoreDetails(){homePage.getMore();}

    @Then("Go to the cashier")
    public void gotoCasher(){homePage.goCasher();}

    @When("Create an account start, the filed is {string} and email is {string}")
    public void createAccount(String field,String email){homePage.fillField(field,email);}

    @Then("Click Mr")
    public void clickMr(){homePage.clickMr();}

    @Then("Input First name {string}")
    public void FirstName(String first){homePage.FirstNameInput(first);}

    @Then("Input Last name {string}")
    public void LastName(String last){homePage.LastNameInput(last);}


    @Then("Change the quantity to 10")
    public void changeQuantity(){homePage.changeQty("0"); }

    @Then("Change the size to M")
    public void sizeChange(){homePage.changeSize();}

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


    @Then("Click Create")
    public void clickCreate() {
        homePage.clickCreate();
    }

    @Then("Input email {string}")
    public void inputEmailEmail(String string) {
        homePage.inputEmail(string);
    }

    @Then("Input Pass {string}")
    public void inputPassPass(String string) {
        homePage.inputPass(string);
    }

    @Then("Add address {string} and City {string} and zip {string}")
    public void AddEverything(String address,String ctiy, String zip){
        homePage.addEvery(address,ctiy,zip);
    }

    @Then("Change State")
    public void ChangeState(){homePage.changeState();}

    @Then("Add mobile")
    public void addMobile(){homePage.addMobile();}

    @Then("Submit account")
    public void submitAccount(){homePage.submitAccount();}
}