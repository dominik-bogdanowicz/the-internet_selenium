package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    private String homePageUrl = "https://the-internet.herokuapp.com/";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("localhost:4444"), chromeOptions);
        homePage = new HomePage(driver);

        goHome();
    }

    @BeforeMethod
    public void goHome(){
        driver.get(homePageUrl);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
