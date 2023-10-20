import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.URL;

public class GameApp {

    String userName = "YOUR_USERNAME";
    String accessKey = "YOUR_ACCESSKEY";

    public String gridURL = "@mobile-hub.lambdatest.com/wd/hub";

    AppiumDriver driver;

    @Test
    @org.testng.annotations.Parameters(value = {"device", "version", "platform"})
    public void AndroidApp1(String device, String version, String platform) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("build","Android+IOS");
            capabilities.setCapability("name",platform+" "+device+" "+version);
            capabilities.setCapability("deviceName", device);
            capabilities.setCapability("platformVersion",version);
            capabilities.setCapability("platformName", platform);
            capabilities.setCapability("isRealMobile", true);
            capabilities.setCapability("disable-popup-blocking", true);
            capabilities.setCapability("autoAcceptAlerts", true);
            capabilities.setCapability("deviceOrientation", "PORTRAIT");
            capabilities.setCapability("console", true);
            capabilities.setCapability("network", false);
            capabilities.setCapability("visual", true);
            capabilities.setCapability("devicelog", true);

            String hub = "https://" + userName + ":" + accessKey + gridURL;
            driver = new AppiumDriver(new URL(hub), capabilities);
            System.out.println("Opening Website");
            driver.get("https://www.gamesglobal.com");

            MobileElement element1 = (MobileElement) driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/button[1]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
            element1.click();


            MobileElement element2 = (MobileElement) driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/button[1]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
            element2.click();

            MobileElement element3 = (MobileElement) driver.findElement(By.xpath("//*[@id=\"mobile-navbar-container\"]/div"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
            element3.click();

//            System.out.println("element 3 clicked");
            Thread.sleep(2000);

            MobileElement element4 = (MobileElement) driver.findElement(By.xpath("//span[normalize-space()='Products']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
            element4.click();

            MobileElement element5 = (MobileElement) driver.findElement(By.xpath("//*[@id=\"video-banner-left-text\"]/a"));
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element5);
            element5.click();
            Thread.sleep(15000);

            System.out.println("Mobile Test Finished");
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
            try{
                driver.quit();
            }catch(Exception e1){
                e.printStackTrace();
            }
        }


    }
}
