package JJstore;

import Core.BaseSeleniumPage;
import Core.ConfProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath="//a[@class=\"category_name parent\" and contains(text(), 'Apple')]")
    private WebElement product;

    @FindBy(xpath="//a[@class=\"category_name parent\"]")
    private List<WebElement> products;
    public MainPage() {
        driver.get(ConfProperties.getProperty("mainPageJJStore"));
        PageFactory.initElements(driver,this);
    }

    public BrandPage clickOnProduct(String Name)
    {
        WebElement foundElement = null;

        for (WebElement element : products) {
            if (element.getText().equals(Name)) {
                foundElement = element;
                break;
            }
        }

        foundElement.click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        return new BrandPage();
    }
}
