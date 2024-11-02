package YAtest;

import Core.BaseSeleniumPage;
import Core.ConfProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MainPage extends BaseSeleniumPage {
    @FindBy(xpath = "//input[@aria-label = \"Запрос\"]")
    private WebElement searchField;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement searchButton;
    public MainPage() {
        driver.get(ConfProperties.getProperty("mainPageYandex"));
        PageFactory.initElements(driver,this);
    }

    public void newSearch(String text)
    {
        searchField.click();
        searchField.sendKeys(text);
        searchButton.click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
    }
}
