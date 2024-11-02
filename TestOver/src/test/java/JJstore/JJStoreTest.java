package JJstore;

import Core.BaseSeleniumTest;
import org.junit.Test;

public class JJStoreTest extends BaseSeleniumTest {

        @Test
        public void test()
        {
                MainPage pg= new MainPage();
                BrandPage bp = pg.clickOnProduct("Apple");
                //pg.clickOnProduct("Samsung");

        }
}
