package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage  extends BasePage {

    @FindBy (css = "a[href='/registration']")
    private WebElement linkSignUp;

    // susigeneruojam konstruktoriu
    public MainPage(WebDriver driver) {
        super(driver);
    }
    public  void clickSignUp(){
        linkSignUp.click();
    }

}