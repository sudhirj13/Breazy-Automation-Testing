import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;


public class beazleyMacSonomaSafari {

    private RemoteWebDriver driver;

    JavascriptExecutor js;

    @Before
    public void setUp() throws MalformedURLException {
        String userName = "USER_NAME";

        String accessKey = "ACCESS_KEY";

        String gridURL = "@hub.lambdatest.com/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform", "MacOS Sonoma");
        caps.setCapability("browserName", "Safari");
        caps.setCapability("version", "17");
        caps.setCapability("build", "BeazleyMacOS");
        caps.setCapability("disable-popup-blocking", true);
        caps.setCapability("name", "BeazleySonoma");
        driver = new RemoteWebDriver(new URL("https://" + userName + ":" + accessKey + gridURL), caps);
        js = (JavascriptExecutor) driver;


    }

    @Test
    public void beazleyy() throws MalformedURLException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        System.out.println("Loading URL");
        driver.get("https://www.beazley.com/");
        Thread.sleep(2000);
        WebElement element1=driver.findElementById("onetrust-accept-btn-handler");
        element1.click();

        Thread.sleep(2000);
        WebElement element2=driver.findElementByXPath("/html/body/header/div[2]/div[1]/div[2]/nav/ul/li[5]/div[1]");
        element2.click();


        Thread.sleep(2000);
        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[2]/div[1]/div[2]/nav/ul/li[5]/div[2]/div[2]/ul/li/a/span")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element3);

        js.executeScript("window.scrollBy(0,800)", "");
        WebElement element4=driver.findElementByXPath("//*[@id=\"main\"]/div/div/div[3]/section/div/div[1]/div[2]/a/span[1]");
        element4.click();

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,500)", "");

        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div/div[3]/react-component/section/div/div[2]/button")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element5);

        Thread.sleep(2000);
        WebElement element6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"notApplicable-question-15904\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element6);

        Thread.sleep(2000);
        WebElement element7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"notApplicable-question-15916\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element7);

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,700)", "");
        WebElement element10 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div/div[3]/react-component/section/div/div[2]/div/form/div[2]/div/div/button")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element10);


        Thread.sleep(2000);

        WebElement element11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15926-Required on some remote network connections \"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element11);

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,400)", "");

        WebElement element12 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15931-Required for all users\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element12);


        WebElement element13 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15935-Required on all cloud applications & systems\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element13);

        WebElement element14 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div/div[3]/react-component/section/div/div[2]/div/form/div[2]/div/div[2]/button")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element14);

        Thread.sleep(2000);

        WebElement element15 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15947-Anti-spam protection\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element15);

        WebElement element16 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15947-External email warnings\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element16);

        WebElement element17 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15947-Malicious link protection\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element17);


        WebElement element18 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15947-Malicious link protection\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element18);

        WebElement element19 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div/div[3]/react-component/section/div/div[2]/div/form/div[2]/div/div[2]/button")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element19);

        Thread.sleep(2000);

        WebElement element20 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15951-Annually\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element20);

        js.executeScript("window.scrollBy(0,500)", "");
        WebElement element21 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15955-Quarterly\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element21);

        js.executeScript("window.scrollBy(0,700)", "");
        WebElement element22 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15957-Monthly\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element22);


        WebElement element23 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div/div[3]/react-component/section/div/div[2]/div/form/div[2]/div/div[2]/button")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element23);
        js.executeScript("window.scrollBy(0,700)", "");

        Thread.sleep(10000);

        driver.quit();


    }
}
