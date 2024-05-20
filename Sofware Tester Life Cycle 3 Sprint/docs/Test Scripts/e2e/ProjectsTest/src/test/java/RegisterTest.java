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
    void adminCanDeleteProject() throws InterruptedException {
        mainPage = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
       projectPage = new ProjectPage(driver);



        loginPage.typeEmailAddress("admin@gmail.com");
        loginPage.typePassword("Admin123@");
        loginPage.clickSignIn();
        Thread.sleep(2000);



        loginPage.clickProject();
        Thread.sleep(2000);
        projectPage.clickAddProject();
        Thread.sleep(2000);
        String pname = utils.GenerateUnits.generateRandomProjectName();
        projectPage.typeProjectName(pname);
        String pdescription =utils.GenerateUnits.generateRandomProjectDescription();
        projectPage.typeProjectDescription(pdescription);
       Thread.sleep(2000);
       projectPage.clickCreateProject();
        Thread.sleep(2000);


        projectPage.clickDeleteProjectButton();

        projectPage.clickDeleteProjectButtonConfirm();



    }

    @Test
    void userCanAddTask() throws InterruptedException {
        mainPage = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        projectPage = new ProjectPage(driver);



        loginPage.typeEmailAddress("arbakarolis@gmail.com");
        loginPage.typePassword("Karalius1@");
        loginPage.clickSignIn();
        Thread.sleep(2000);



        loginPage.clickProject();
        Thread.sleep(2000);
        projectPage.clickAddProject();
        Thread.sleep(2000);
        String pname = utils.GenerateUnits.generateRandomProjectName();
        projectPage.typeProjectName(pname);
        String pdescription =utils.GenerateUnits.generateRandomProjectDescription();
        projectPage.typeProjectDescription(pdescription);
        Thread.sleep(2000);
        projectPage.clickCreateProject();
        Thread.sleep(2000);
        projectPage.clickProjectName();
        projectPage.clickAddTask();
        Thread.sleep(2000);
        String ppname = utils.GenerateUnits.generateRandomProjectName();
        projectPage.typeProjectName(ppname);
        String ppdescription =utils.GenerateUnits.generateRandomProjectDescription();
        projectPage.typeProjectDescription(ppdescription);
        Thread.sleep(2000);
        projectPage.clickCreateProject();





    }
    @Test
    void adminCanAddTask() throws InterruptedException {
        mainPage = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        projectPage = new ProjectPage(driver);



        loginPage.typeEmailAddress("admin@gmail.com");
        loginPage.typePassword("Admin123@");
        loginPage.clickSignIn();
        Thread.sleep(2000);



        loginPage.clickProject();
        Thread.sleep(2000);
        projectPage.clickAddProject();
        Thread.sleep(2000);
        String pname = utils.GenerateUnits.generateRandomProjectName();
        projectPage.typeProjectName(pname);
        String pdescription =utils.GenerateUnits.generateRandomProjectDescription();
        projectPage.typeProjectDescription(pdescription);
        Thread.sleep(2000);
        projectPage.clickCreateProject();
        Thread.sleep(2000);
        projectPage.clickProjectName();
        projectPage.clickAddTask();
        Thread.sleep(2000);
        String ppname = utils.GenerateUnits.generateRandomProjectName();
        projectPage.typeProjectName(ppname);
        String ppdescription =utils.GenerateUnits.generateRandomProjectDescription();
        projectPage.typeProjectDescription(ppdescription);
        Thread.sleep(2000);
        projectPage.clickCreateProject();





    }
    @Test
    void userCanSearchProjects() throws InterruptedException {
        mainPage = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        projectPage = new ProjectPage(driver);

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

        loginPage.clickProject();
        Thread.sleep(2000);
        projectPage.clickAddProject();
        Thread.sleep(2000);
        String pname = utils.GenerateUnits.generateRandomProjectName();
        projectPage.typeProjectName(pname);
        String pdescription =utils.GenerateUnits.generateRandomProjectDescription();
        projectPage.typeProjectDescription(pdescription);
        Thread.sleep(2000);
        projectPage.clickCreateProject();


        projectPage.typeInSearchBox(pname);
}
}