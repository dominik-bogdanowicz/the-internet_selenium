package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicAuthPage {
    private WebDriver driver;
    private By text = By.cssSelector("div@example>p");

    public BasicAuthPage(WebDriver driver){
        this.driver = driver;
    }

    public String getText(){
        return driver.findElement(text).getText();
    }
}
