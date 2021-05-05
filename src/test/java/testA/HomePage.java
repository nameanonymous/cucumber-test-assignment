package testA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Optional;

public class HomePage {

    private static final String PAGE_URL = "http://automationpractice.com/";

    @FindBy(className = "login")
    private WebElement signInLink;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    @FindBy(name = "submit_search")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement getproduct1;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span")
    private WebElement goBack;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]")
    private WebElement getproduct2;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    private WebElement addtoCasher;

    @FindBy(css = "[id^='product'] > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey")
    private WebElement quantity;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/a")
    private WebElement backHome;

    @FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
    private WebElement goPayment;

    @FindBy(css = "#center_column > form > p > button")
    private WebElement proCheck;

    @FindBy(css = "#center_column > ul > li > div > div.right-block > div.button-container > a.button.lnk_view.btn.btn-default")
    private WebElement getMoreD;

    public void getMore(){getMoreD.click();}

    @FindBy(name = "Submit")
    private WebElement submit;

    public void submitClick(){submit.click();}

    public void changeSize(){
        Select size = new Select(driver.findElement(By.id("group_1")));
        size.selectByValue("2");

    }

    @FindBy(id = "cgv")
    private WebElement TandC;

    @FindBy(css = "#form > p > button")
    private WebElement finalCheckout;

    @FindBy(className = "bankwire")
    private WebElement bP;

    @FindBy(css = "#cart_navigation > button")
    private WebElement finalP;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void clickaddtoCart(){getproduct1.click();}

    public void clickaddtoCart2(){getproduct2.click();}

    public void continueShopping(){goBack.click();}

    public void goCasher(){addtoCasher.click();}

    public void changeQty(String value){quantity.sendKeys(value);}

    public void backH(){backHome.click();}

    public void goPayment(){goPayment.click();}

    public void pCo() {proCheck.click();}

    public void allowTermsOfService(){TandC.click();}

    public void fCo(){finalCheckout.click();}

    public void bankPayment() {bP.click();}

    public void finalProcess() {finalP.click();}

    @FindBy(className = "logout")
    private WebElement logout;
    public void logout() {logout.click();}

    public Optional<String> getErrorMessage() {
        Optional<WebElement> error = getError();
        if (error.isPresent()) {
            WebElement errorElement = error.get();
            return Optional.of(errorElement.getText());
        } else {
            return Optional.empty();
        }
    }

    public void fillField(String field, String value) {
        getField(By.id(field)).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public WebElement getSignInLink() {
        return signInLink;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    private Optional<WebElement> getError() {
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
        if (elements.size() > 0) {
            return Optional.of(elements.get(0));
        } else {
            return Optional.empty();
        }
    }

}