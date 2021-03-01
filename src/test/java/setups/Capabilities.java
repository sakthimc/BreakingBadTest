package setups;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Capabilities extends DesiredCapabilities {
protected AndroidDriver androidDriver;
    private AppiumDriverLocalService service;
    protected void preparation() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName", "Samsung SM-G950F");
        capabilities.setCapability("appPackage", "com.github.fatihsokmen.breakingbad");
        capabilities.setCapability("appActivity", "com.github.fatihsokmen.breakingbad.home.HomeActivity");
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        String service_url = service.getUrl().toString();
        System.out.println("Appium Service Address: " + service_url);
        androidDriver = new AndroidDriver(new URL(service_url), capabilities);
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void stopServer() {
        service.stop();
    }
}