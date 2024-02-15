package tests.SignInTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);


    @Test
    public void SignIn() {
        String email="abc@gmail.com" ;
        String password="parola" ;

        LOG.info("Check Sign in button");
        Assert.assertTrue(signInPage.isSignINButtonDisplayed(), "Button is not displayed");

        LOG.info("Click  Sign in button");
        signInPage.clickSignInButton();

        LOG.info("Verify is logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");


        LOG.info("insert email");
        signInPage.insertemailField(email);

        LOG.info("insert password");
        signInPage.insertPassword(password);

        LOG.info("enter button");
        signInPage.clickenterButton();

        LOG.info("Verify if error message is displayed") ;
        Assert.assertTrue(signInPage.iserrorMessageDisplayed(),"error message is displayed") ;

        LOG.info("Navigate back") ;
        signInPage.clickBack();


        LOG.info("Click Skip sign in button") ;
        signInPage.clickSkipSignInButton();








    }




}
