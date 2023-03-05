package stepdefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
Base base;

    public Hooks(Base base) {
        this.base = base;
    }

    @Before
    public void bf(){
       base.setDriver();

    }
    @After
    public void af(){
      base.getDriver().quit();
    }
}
