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

    @FindBy(css= "input[placeholder='Search']")
    private WebElement projectSearch;
    @FindBy(xpath = "//select[@class='sc-drMgrp hRtupP']")
    private WebElement filterStatus;
    @FindBy (xpath = "//option[@value='in-progress']")
    private WebElement optionInProgress;
    @FindBy (xpath = "//option[@value='done']")
    private WebElement optionDone;
    @FindBy(css = "img[alt='Download']")
    private WebElement downloadCsv;


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
    public void typeInSearchBox(String pname) {
        projectSearch.sendKeys(pname);
    }
    public void clickProjectsFilterStatus(){
        filterStatus.click();
    }

    // pasirinkti nors vien statusa??


    public void clickProjectsCsv(){
        downloadCsv.click();
    }
}

