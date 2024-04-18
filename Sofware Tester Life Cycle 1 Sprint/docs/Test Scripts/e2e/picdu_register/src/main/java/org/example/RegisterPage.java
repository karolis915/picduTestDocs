package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='name']")
    private WebElement inputName;
    @FindBy(css = "input[name='email']")
    private WebElement inputEmail;
    @FindBy(css = "input[name='password']")
    private WebElement inputPassword;
    @FindBy(css = "input[name='repeatPassword']")
    private WebElement inputConfirmPassword;
    @FindBy(css = "button[type='submit']")
    private WebElement buttonCreateAccount;

    // susigeneruojam konstruktoriu
       public void typeName(String name) {
        inputName.sendKeys(name);
    }
    public void typeEmail(String email) {
        inputEmail.sendKeys(email);
    }
    public void typePassword(String password) {
        inputPassword.sendKeys(password);
    }
    public void typeConfirmPassword(String confirmpassword) {
        inputConfirmPassword.sendKeys(confirmpassword);
    }
    public void clickCreateAccout() {
        buttonCreateAccount.click();

    }
}


