package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;

    }

    private By signInButton = By.id("btn1");
    private By logo = By.id("logo");
    private By emailField = By.xpath("//input[@ng-model='Email']");
    private By passwordfield = By.xpath("//input[@ng-model='Password']");
    private By enterButton = By.id("enterbtn");
    private By errorMessage = By.id("errormsg");
    private By skipSignInButton=By.id("btn2") ;



    public void clickSignInButton() {
        LOG.info("Click 'Sign In Button' ");

        driver.findElement(signInButton).click();


    }

    public boolean isSignINButtonDisplayed() {
        LOG.info("Verify if 'Sign In Button'is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo image is displayed");
        return driver.findElement(logo).isDisplayed();

    }

    public void insertemailField(String email) {
        LOG.info("input Email address in field");
        driver.findElement(emailField).sendKeys(email);


    }

    public void insertPassword(String Password) {
        LOG.info("input password in field");
        driver.findElement(passwordfield).sendKeys("Password");


    }

    public void clickenterButton() {
        LOG.info("signInPage.clickSignInButton(); ");
        driver.findElement(enterButton).click();
    }

    public boolean iserrorMessageDisplayed() {
        LOG.info("Verify  if error message is displayed");
        return driver.findElement(errorMessage).isDisplayed();
    }

    public void clickBack(){
        LOG.info("Click back in browser");
        driver.navigate().back();


    }

    public void clickSkipSignInButton() {
        LOG.info("Click Skip sign in button");
        driver.findElement(skipSignInButton).click();
    }



}






