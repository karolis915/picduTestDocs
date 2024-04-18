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


        String mail = utils.GenerateUnits.generateRandomEmail();
        registerPage.typeEmail(mail);

  //    String pass = utils.GenerateUnits.generateRandomPass();
  //  registerPage.typeConfirmPassword(pass);
// registerPage.typePassword(pass);

        registerPage.typeName("ResidentEvil");
      //  registerPage.typeEmail("11110020ResidentEvil@yahoo.com");
        registerPage.typePassword("Test@1234");
        registerPage.typeConfirmPassword("Test@1234");
        registerPage.clickCreateAccout();
        Thread.sleep(1000);
        loginPage.typeEmailAddress(mail);
        loginPage.typePassword("Test@1234");
        loginPage.clickSignIn();
        Thread.sleep(1000);
        loginPage.clickAccount();
        loginPage.clickLogOut();


    }
}
