package com.qa.utils;

public class GlobalParams {
    // only one capability can be used along execution. Thread in safe.
    private static ThreadLocal<String> platformName = new ThreadLocal<String>();
    private static ThreadLocal<String> udid = new ThreadLocal<String>();
    private static ThreadLocal<String> deviceName = new ThreadLocal<String>();
    private static ThreadLocal<String> systemPort = new ThreadLocal<String>(); //parallel execution
    private static ThreadLocal<String> chromeDriverPort = new ThreadLocal<String>(); //parallel execution
    private static ThreadLocal<String> wdaLocalPort = new ThreadLocal<String>(); // ios
    private static ThreadLocal<String> webkitDebugProxyPort = new ThreadLocal<String>(); // ios

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

    public String getWdaLocalPort() {
        return wdaLocalPort.get();
    }

    public void setWdaLocalPort(String wdaLocalPort2) {
        wdaLocalPort.set(wdaLocalPort2);
    }

    public String getWebkitDebugProxyPort() {
        return webkitDebugProxyPort.get();
    }

    public void setWebkitDebugProxyPort(String webkitDebugProxyPort2) {
        webkitDebugProxyPort.set(webkitDebugProxyPort2);
    }

    public void initializeGlobalParams(){
        GlobalParams globalParams = new GlobalParams();
        globalParams.setPlatformName(System.getProperty("platformName", "Android"));
        globalParams.setUDID(System.getProperty("udid", "emulator-5554"));
        globalParams.setDeviceName(System.getProperty("deviceName", "serkanEmulator"));

        switch(globalParams.getPlatformName()){
            case "Android":
                globalParams.setSystemPort(System.getProperty("systemPort", "10000"));
                globalParams.setChromeDriverPort(System.getProperty("chromeDriverPort", "11000"));
                break;
            case "iOS":
                globalParams.setWdaLocalPort(System.getProperty("wdaLocalPort", "10001"));
                globalParams.setWebkitDebugProxyPort(System.getProperty("webkitDebugProxyPort", "11001"));
                break;
            default:
                throw new IllegalStateException("Invalid Platform Name!");
        }
    }
}
