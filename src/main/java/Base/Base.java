package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import static helper.UrlHelper.BANK_URL;
import static helper.UserHelper.DEFAULT_USER;

@Listeners(TestNGListener.class)
public class Base extends WebDriverBase {

    @BeforeSuite
    public void openApp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bartosz.kutkowski\\parabankautomatedtests\\chromedriver.exe");
        driver.get(BANK_URL);
    }

    @BeforeSuite
    public void userIsLoggedIn() {

         final WebElement loginForm = driver.findElement(By.id("loginPanel"));
         final WebElement usernameInput = driver.findElement(By.name("username"));
         final WebElement passwordInput = driver.findElement(By.name("password"));
         final WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));

        if (loginForm.isDisplayed()) {
            usernameInput.sendKeys(DEFAULT_USER.getUsername());
            passwordInput.sendKeys(DEFAULT_USER.getPassword());
            loginButton.click();
        }
    }

//    @AfterSuite
//    public void closeApp() {
//        driver.close();
//    }
}
