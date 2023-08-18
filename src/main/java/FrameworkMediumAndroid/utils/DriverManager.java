package FrameworkMediumAndroid.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class DriverManager {


    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    TestUtils utils = new TestUtils();
    public AppiumDriver getDriver() {
        return driver.get();
    }

    public void setDriver(AppiumDriver driver2) {
        driver.set(driver2);
    }

    public void initializeDriver(){
        AppiumDriver driver = null;

        if (driver == null) {
            try {
                utils.log().info("initializing appium driver");
                driver = new AndroidDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                if (driver == null) {
                    throw new Exception("driver is null. ABORT");
                }
                utils.log().info("Driver is initialized");
                this.driver.set(driver);
            } catch (Exception e) {
                e.printStackTrace();
                utils.log().info("Driver initialization failure. ABORT!!!");
            }

        }
    }
}
