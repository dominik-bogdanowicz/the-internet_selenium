package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public AddRemoveElementsPage addRemovePageClick(){
        clickLink("Add/Remove Elements");
        return new AddRemoveElementsPage(driver);
    }

    public BasicAuthPage goToBasicAuthPageWithCredentials(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        return new BasicAuthPage(driver);
    }

    public BrokenImagesPage brokenImagesPageClick(){
        clickLink("Broken Images");
        return new BrokenImagesPage(driver);
    }

    public ChallengingDOMPage challengingDOMPageClick(){
        clickLink("Challenging DOM");
        return new ChallengingDOMPage(driver);
    }

    public CheckboxesPage checkboxesPageClick(){
        clickLink("Checkboxes");
        return new CheckboxesPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
