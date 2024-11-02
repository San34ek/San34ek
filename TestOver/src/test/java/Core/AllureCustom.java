package Core;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllureCustom extends BaseSeleniumPage implements WebDriverListener {

    private static Logger logger = LoggerFactory.getLogger(WebDriver.class);
    public void afterClick(WebElement element) {
        Allure.step("Click on "+ element.getText());
    }
}
