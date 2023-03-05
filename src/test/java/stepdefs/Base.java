package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
private WebDriver driver;
public WebDriver getDriver(){
    return driver;

}
public void setDriver(){
    String projPath = System.getProperty("user.dir");
    System.setProperty("webdriver.chrome.driver", projPath + "/src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}
}
