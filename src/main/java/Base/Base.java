package Base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

import static helper.UrlHelper.BANK_URL;

@Listeners(TestNGListener.class)
public class Base extends WebDriverBase {

    @BeforeClass
    public void openApp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bartosz.kutkowski\\parabankautomatedtests\\chromedriver.exe");
        driver.get(BANK_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void closeApp() {
        driver.close();
    }
}
