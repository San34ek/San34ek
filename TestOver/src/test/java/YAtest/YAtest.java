package YAtest;

import Core.BaseSeleniumTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class YAtest extends BaseSeleniumTest {

    @Test
    public void openPage(){
        MainPage main = new MainPage();
        main.newSearch("Как купить хлеб?");
        main.newSearch("Ntcn");
        }


    @Test
    public void openPage2(){
        MainPage main = new MainPage();
        main.newSearch("Кек?");
        main.newSearch("Ntcn");
    }


    @Test
    public void openPage3(){
        MainPage main = new MainPage();
        main.newSearch("Кек2?");
        main.newSearch("Ntcn");
    }
}
