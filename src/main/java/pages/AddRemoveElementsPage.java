package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage {

    private WebDriver driver;
    private By addButton = By.cssSelector("div.example>button");
    private By deleteButton = By.cssSelector("div#elements>button");

    public AddRemoveElementsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddButton(){
        driver.findElement(addButton).click();
    }

    public void clickDeleteButton(){
        driver.findElement(deleteButton).click();
    }

    public int getDeleteButtonsCount(){
        return driver.findElements(deleteButton).size();
    }
}
