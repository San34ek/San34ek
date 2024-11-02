package Core;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureId;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import java.time.Duration;

abstract public class BaseSeleniumTest {
    protected WebDriver driver;
    protected ChromeOptions chromeOptions;

    //protected WebDriver driver;
    protected Duration duration = Duration.ofSeconds(10);
    protected Duration durationImplicity = Duration.ofSeconds(15);

    @Before
    public void setUp()
    {
        //System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        chromeOptions = new ChromeOptions();
        WebDriver webdriver = new ChromeDriver(chromeOptions);
        driver = new EventFiringDecorator<>(new AllureCustom()).decorate(webdriver);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(duration);
        driver.manage().timeouts().implicitlyWait(durationImplicity);
        BaseSeleniumPage.setDriver(driver);
    }

    @After
    public void tearDown()
    {
        // driver.close();
        //driver.quit();
    }
}
