import org.example.LoginPage;
import org.example.MainPage;
import org.example.ProjectPage;
import org.example.RegisterPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RegisterTest extends BasePageTest{
    MainPage mainPage;
    RegisterPage registerPage;
    LoginPage loginPage;
    ProjectPage projectPage;


    @Test
    void userCanNotLogin() throws InterruptedException {
        mainPage = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
       projectPage = new ProjectPage(driver);

        mainPage.clickSignUp();
        registerPage.typeName("Testtest");
        String mail = utils.GenerateUnits.generateRandomEmail();
        registerPage.typeEmail("823vardas@one.lt");

        String pass = utils.GenerateUnits.generateRandomPass();
        registerPage.typePassword(pass);
        registerPage.typeConfirmPassword(pass);
        registerPage.clickCreateAccout();

     //   Thread.sleep(1000);
   //     loginPage.typeEmailAddress(mail);
     //   loginPage.typePassword(pass);
     //   loginPage.clickSignIn();
        Thread.sleep(200);

      String actualNumber = LoginPage.getAnswerNumber();
      String expectedNumber = "Email already exists.";

      assertEquals(expectedNumber, actualNumber);

     //   loginPage.clickProject();
      //  Thread.sleep(2000);
     //   projectPage.clickAddProject();
      //  Thread.sleep(2000);
     //   String pname = utils.GenerateUnits.generateRandomProjectName();
      //  projectPage.typeProjectName(pname);
      //  String pdescription =utils.GenerateUnits.generateRandomProjectDescription();
     //   projectPage.typeProjectDescription(pdescription);
    //    Thread.sleep(2000);
     //   projectPage.clickCreateProject();


     //   projectPage.typeCreatedProjectName(pname);
     //   Thread.sleep(2000);
      //  projectPage.clickProjectsFilterStatus();
     //   Thread.sleep(2000);
      //  projectPage.clickProjectsCsv();


        //loginPage.clickTasks();





       // loginPage.clickAccount();
       // Thread.sleep(2000);
       // loginPage.clickLogOut();
       // Thread.sleep(2000);

    }
}