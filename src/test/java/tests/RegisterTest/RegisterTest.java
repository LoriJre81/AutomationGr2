package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static java.lang.Thread.sleep;
import static pages.BasePage.* ;


public class RegisterTest extends BaseTest{
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl=getBaseURL()+"Register.html" ;

    String firstName="Ion" ;
    String lastName="Popescu" ;



    @Test
    public void fillRegister(){

        driver.get(newUrl) ;
        try {
            sleep(3000L) ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        LOG.info("Typing full name") ;
        registerPage.insertFullName(firstName,lastName) ;






    }





    }
