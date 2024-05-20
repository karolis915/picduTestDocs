package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePage {
    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[normalize-space()='Add project']")
    private WebElement buttonAddProject;

    @FindBy(xpath = "//button[normalize-space()='Add project']")
    private WebElement buttonAddTask;

    @FindBy(css = "input[name='name']")
    private WebElement projectName;
    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement projectDescription;

    @FindBy(css = "button[type='submit']")
    private WebElement buttonCreatProject;

    @FindBy(css= "[class='sc-jIBlqr dScqTt']")
    private WebElement projectSearch;
    @FindBy(xpath = "//select[@class='sc-drMgrp hRtupP']")
    private WebElement filterStatus;
    @FindBy (xpath = "//option[@value='in-progress']")
    private WebElement optionInProgress;
    @FindBy (xpath = "//option[@value='done']")
    private WebElement optionDone;
    @FindBy(css = "img[alt='Download']")
    private WebElement downloadCsv;

    @FindBy(css= "body > div:nth-child(1) > div:nth-child(4) > div:nth-child(7) > p:nth-child(3) > p:nth-child(2) > img:nth-child(2)")
    private WebElement deleteButton;
    @FindBy(css= ".sc-cSxRuM.sc-jMbVJB.uFJjS.jfIlnq")
    private WebElement deleteButtonConfirmation;

    @FindBy(css = "div[id='root'] div:nth-child(1) div:nth-child(2) p:nth-child(2)")
    private WebElement projectName1;
    @FindBy(css = ".sc-cCzLxZ.dgWQHX")
    private WebElement addTaskButton;
    @FindBy(css= "input[placeholder='Search']")
    private WebElement projectSearch1;




    public void clickAddProject() {
        buttonAddProject.click();

    }
    public void typeProjectName(String name) {
        projectName.sendKeys(name);
    }
    public void typeProjectDescription(String description) {
        projectDescription.sendKeys(description);
    }

    public void clickCreateProject() {
        buttonCreatProject.click();

    }
    public void typeCreatedProjectName(String pname) {
        projectSearch.sendKeys(pname);
    }
    public void clickProjectsFilterStatus(){
        filterStatus.click();
    }

    // pasirinkti nors vien statusa??


    public void clickProjectsCsv(){
        downloadCsv.click();
    }
    public void clickDeleteProjectButton(){
        deleteButton.click();
    }
    public void clickDeleteProjectButtonConfirm(){
        deleteButtonConfirmation.click();
    }
    public void clickProjectName(){
        projectName1.click();
    }
    public void clickAddTask(){
        addTaskButton.click();
    }
    public void typeInSearchBox(String pname) {
        projectSearch1.sendKeys(pname);
    }
}

