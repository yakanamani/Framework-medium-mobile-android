package FrameworkMediumAndroid.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import FrameworkMediumAndroid.utils.DriverManager;

import java.io.IOException;

public class Hooks {
    @Before
    public void initialize(){


    }

    @After
    public void quit(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


    }
}
