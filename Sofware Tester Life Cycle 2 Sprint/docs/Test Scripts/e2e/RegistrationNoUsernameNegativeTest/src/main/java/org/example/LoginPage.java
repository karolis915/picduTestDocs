package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='login']")
    private WebElement inputEmail;
    @FindBy(css = "input[name='password']")
    private WebElement inputPassword;
    @FindBy(css = "button[type='submit']")
    private WebElement buttonSignIn;

    @FindBy(css = "img[alt='Projects icon']")
    private WebElement buttonProject;
    @FindBy(css = "img[alt='Tasks icon']")
    private WebElement buttonTasks;

    @FindBy(css = "img[alt='Account icon']")
    private WebElement buttonAccount;
    @FindBy (css = "div[class='sc-iBdnpw hXsbhP'] div:nth-child(2)")
    private WebElement buttonLogOut;

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > form:nth-child(2) > div:nth-child(1) > p:nth-child(3)")
    private static WebElement answerNumber;



    public static String getAnswerNumber() {
        return answerNumber.getText();
    }

    public void typeEmailAddress(String email) {
        inputEmail.sendKeys(email);
    }

    public void typePassword(String pass) {
        inputPassword.sendKeys(pass);
    }

    public void clickSignIn() {
        buttonSignIn.click();

    }
    public void clickProject() {
        buttonProject.click();
    }
}
// public void clickTasks() {
// buttonTasks.click();

// }
   // public void clickAccount() {
       // buttonAccount.click();

   // }
   // public void clickLogOut() {
      //  buttonLogOut.click();

    //}





