package FiledRF;

import Core.BaseSeleniumPage;
import Core.ConfProperties;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {

    public MainPage() {
        driver.get(ConfProperties.getProperty("mainpageFieldRF"));
        PageFactory.initElements(driver,this);
    }
}
