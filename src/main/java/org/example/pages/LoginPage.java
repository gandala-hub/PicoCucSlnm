package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    private By loginBtn= By.xpath("//*[text()='Login']");
    private By username= By.name("login");
    private By password= By.name("password");
    private By buggyRatingLink = By.partialLinkText("Buggy Rating");
    private By logoutBtn = By.partialLinkText("Logout");

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public void navigate(){
        driver.get("https://buggy.justtestit.org/");
    }
    public void entercredentialsAndLogin(String user, String pwd){
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginBtn).click();
    }
    public String validatePageTitle() {
        return driver.getTitle();
    }

    public void logout(){
        try{
            Thread.sleep(1000);
        }catch (Exception e){}
        //driver.findElement(buggyRatingLink).click();
        driver.findElement(logoutBtn).click();
    }

}
