package JJstore;

import Core.BaseSeleniumPage;
import Core.ConfProperties;
import org.openqa.selenium.support.PageFactory;

public class BrandPage extends BaseSeleniumPage {

    public BrandPage() {
        PageFactory.initElements(driver,this);
    }
}
