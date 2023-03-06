package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
}
