import org.example.LoginPage;
import org.example.MainPage;
import org.example.RegisterPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class RegisterTest extends BasePageTest{
    MainPage mainPage;
   RegisterPage registerPage;
   LoginPage loginPage;
   

    @Test
    void userCanLogin() throws InterruptedException {
        mainPage = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);



        mainPage.clickSignUp();


       // String mail = utils.GenerateUnits.generateRandomEmail();
        //registerPage.typeEmail(mail);

      //  String pass = utils.GenerateUnits.generateRandomPass();
     //   registerPage.typeConfirmPassword(pass);
//        registerPage.typePassword(pass);

        registerPage.typeName("ResidentEvil");
        registerPage.typeEmail("110020ResidentEvil@yahoo.com");
        registerPage.typePassword("Test@1111");
        registerPage.typeConfirmPassword("Test@1111");
        registerPage.clickCreateAccout();
        Thread.sleep(2000);
        loginPage.typeEmailAddress("110020ResidentEvil@yahoo.com");
        loginPage.typePassword("Test@1111");
        loginPage.clickSignIn();
        Thread.sleep(2000);
        loginPage.clickAccount();
        loginPage.clickLogOut();


    }
}
