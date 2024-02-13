package pages.SignInPage;
import org.openqa.selenium.By;
import org.slf4j.Logger ;
import org.slf4j.LoggerFactory ;


import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG=LoggerFactory.getLogger(SignInPage.class) ;
    public static SignInPage instance ;

    private SignInPage(){
           }
    public static SignInPage getInstance(){
        if(instance==null){
            instance=new SignInPage() ;
        }
        return instance ;

    }

    private By signInButton=By.id("btn1") ;
    private By logo=By.id("logo") ;
    private By emailField= By.xpath("//input[@ng-model='Email']") ;
    private By paswordfield=By.xpath("//input[@ng-model='password']") ;


    public void clickSignInButton(){
        LOG.info("Click 'Sign In Button' ") ;

        driver.findElement(signInButton).click() ;



    }

    public boolean isSignINButtonDisplayed() {
        LOG.info("Verify if 'Sign In Button'is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

        public boolean isLogoDisplayed(){
            LOG.info("Verify if Logo image is displayed");
            return driver.findElement(logo).isDisplayed() ;

        }


    }



