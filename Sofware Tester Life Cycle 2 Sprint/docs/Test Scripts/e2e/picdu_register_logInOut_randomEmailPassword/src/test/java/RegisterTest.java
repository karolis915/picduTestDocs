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
        registerPage.typeName("ResidentEvil");
        String mail = utils.GenerateUnits.generateRandomEmail();
        registerPage.typeEmail(mail);

        String pass = utils.GenerateUnits.generateRandomPass();
        registerPage.typePassword(pass);
        registerPage.typeConfirmPassword(pass);
        registerPage.clickCreateAccout();

        Thread.sleep(1000);
        loginPage.typeEmailAddress(mail);
        loginPage.typePassword(pass);
        loginPage.clickSignIn();

        Thread.sleep(2000);
        loginPage.clickAccount();
        Thread.sleep(2000);
        loginPage.clickLogOut();
        Thread.sleep(2000);

    }
}