import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;

public class BeazleyChrome10 {

    private RemoteWebDriver driver;

    JavascriptExecutor js;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        String userName = "ayusha";

        String accessKey = "9iXEJQQcqL7phECZqgmR8xWEFt9KppfumY51XV5KjB21Ef0JfE";

        String gridURL = "@hub.lambdatest.com/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("browserName", "chrome");
        caps.setCapability("version", "latest");
        caps.setCapability("build", "Beazley");
        caps.setCapability("disable-popup-blocking", true);
        caps.setCapability("name", "beazley Chrome 10");
        driver = new RemoteWebDriver(new URL("https://" + userName + ":" + accessKey + gridURL), caps);
        js = (JavascriptExecutor) driver;

    }

    @Test
    public void beazley() throws MalformedURLException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        System.out.println("Loading URL");
        driver.get("https://www.beazley.com/");
        driver.findElement(By.cssSelector(".in-header:nth-child(2)")).click();
        driver.findElement(By.linkText("United Kingdom")).click();
        Thread.sleep(5000);

        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[1]/div[2]/nav/ul/li[5]/div[1]"));
        element1.click();

        WebElement element2=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[1]/div[2]/nav/ul/li[5]/div[2]/div[2]/ul/li/a"));
        element2.click();

        Thread.sleep(10000);

        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(2000);

        WebElement element3=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/section/div/div[1]/div[2]/a"));
        element3.click();

        Thread.sleep(4000);

        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        WebElement element4=driver.findElement(By.xpath("/html/body/main/div/div/div[3]/react-component/section/div/div[2]/button"));
        element4.click();

        Thread.sleep(2000);

        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"notApplicable-question-15904\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element5);

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,500)", "");
        WebElement element6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"notApplicable-question-15916\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element6);

        Thread.sleep(3000);

        WebElement element7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div/div[3]/react-component/section/div/div[2]/div/form/div[2]/div/div/button")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element7);

        Thread.sleep(5000);

        WebElement element8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15926-Required on all remote network connections \"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element8);

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,400)", "");
        WebElement element9 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15931-Required for some users \"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element9);

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)", "");
        WebElement element10 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15935-Required on all cloud applications & systems\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element10);

        Thread.sleep(2000);
        WebElement element11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div/div[3]/react-component/section/div/div[2]/div/form/div[2]/div/div[2]/button")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element11);

        Thread.sleep(2000);
        WebElement element12 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15947-Anti-spam protection\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element12);

        WebElement element13 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15947-External email warnings\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element13);

        WebElement element14 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15947-Malicious link protection\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element14);

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)", "");
        WebElement element15 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div/div[3]/react-component/section/div/div[2]/div/form/div[2]/div/div[2]/button")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element15);


        Thread.sleep(2000);
        WebElement element16 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15951-Quarterly\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element16);

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,500)", "");
        WebElement element17 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15955-Monthly\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element17);

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,600)", "");
        WebElement element18 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-15957-Quarterly\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element18);


        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,700)", "");
        WebElement element19 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div/div[3]/react-component/section/div/div[2]/div/form/div[2]/div/div[2]/button")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element19);

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,700)", "");


        Thread.sleep(10000);


        driver.quit();


    }

}
