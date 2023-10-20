
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsAndMacOS {

    private RemoteWebDriver driver;

    @BeforeMethod
    @org.testng.annotations.Parameters(value = {"platform","browser"})
    public void setup(Method m, ITestContext ctx , String platform,String browser) throws MalformedURLException {

        String username = "YOUR_USERNAME";
        String authkey = "YOUR_ACCESSKEY";

        String hub = "@hub.lambdatest.com/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform", platform);
        caps.setCapability("browserName", browser);
        caps.setCapability("version", "latest");
        caps.setCapability("build", "Win+Mac");
        caps.setCapability("name", m.getName() + this.getClass().getName());

        driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);
    }

    @Test
    public void basicTest() throws InterruptedException {
        System.out.println("Loading Url");

        driver.get("https://www.gamesglobal.com/");

        WebElement element1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/button[1]"));
        element1.click();
//        System.out.println("I am 18 years or older");

        WebElement element2=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/button[1]"));
        element2.click();
//        System.out.println("Accept All Cookies");

        WebElement element3= driver.findElement(By.xpath("//*[@id=\"desktop-navbar-container\"]/ul/li[1]/a/span"));
        element3.click();
//        System.out.println("Products clicked");

        WebElement element4=driver.findElement(By.xpath("//*[@id=\"video-banner-left-text\"]/a"));
        element4.click();
//        System.out.println("Play Button clicked");

        Thread.sleep(15000);

        System.out.println("WindowsAndMac Test Finished");
        driver.quit();
    }


}