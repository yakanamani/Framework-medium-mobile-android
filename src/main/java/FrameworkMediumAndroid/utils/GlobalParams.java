package FrameworkMediumAndroid.utils;

public class GlobalParams {
    private static ThreadLocal<String> platformName = new ThreadLocal<>();
    private static ThreadLocal<String> udid = new ThreadLocal<>();
    private static ThreadLocal<String> deviceName = new ThreadLocal<>();

    private static ThreadLocal<String> virtualDevice = new ThreadLocal<String>();

    private static ThreadLocal<String> systemPort = new ThreadLocal<>();
    private static ThreadLocal<String> chromeDriverPort = new ThreadLocal<>();

    public void setPlatformName(String platformName1){
        platformName.set(platformName1);
    }

    public String getPlatformName(){
        return platformName.get();
    }

    public String getUDID() {
        return udid.get();
    }

    public void setUDID(String udid2) {
        udid.set(udid2);
    }

    public String getDeviceName() {
        return deviceName.get();
    }

    public void setDeviceName(String deviceName2) {
        deviceName.set(deviceName2);
    }
    public String  getVirtualDevice() {return virtualDevice.get();}

    public void setVirtualDevice(String virtualDevice2) { virtualDevice.set(virtualDevice2);}

    public String getSystemPort() {
        return systemPort.get();
    }

    public void setSystemPort(String systemPort2) {
        systemPort.set(systemPort2);
    }

    public String getChromeDriverPort() {
        return chromeDriverPort.get();
    }

    public void setChromeDriverPort(String chromeDriverPort2) {
        chromeDriverPort.set(chromeDriverPort2);
    }






    public void initializeGlobalParams(){
        GlobalParams params = new GlobalParams();
        params.setPlatformName(System.getProperty("platformName", "Android"));
        params.setUDID(System.getProperty("udid", "emulator-5556"));
        params.setDeviceName(System.getProperty("deviceName", "Pixel_6"));
        params.setVirtualDevice(System.getProperty("virtualDevice", "true"));
        params.setSystemPort(System.getProperty("systemPort", "10000"));
        params.setChromeDriverPort(System.getProperty("chromeDriverPort", "11000"));

    }
}
