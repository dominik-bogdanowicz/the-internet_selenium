package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage {
    private WebDriver driver;
    private By checkbox1 = By.cssSelector("#form:nth-child(1)");
    private By checkbox2 = By.cssSelector("#form:nth-child(2)");
    private By checkboxes = By.tagName("input");

    public CheckboxesPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param checkboxIndex index starts at 1
     * @return boolean indicating if checkbox is selected
     */
    public boolean isChecked(int checkboxIndex){
        return driver.findElements(checkboxes).get(checkboxIndex-1).isSelected();
    }

    /**
     *
     * @param checkboxIndex index starts at 1
     */
    public void selectCheckbox(int checkboxIndex){
        WebElement checkbox = driver.findElements(checkboxes).get(checkboxIndex-1);
        if(checkbox.isSelected() != true){
            checkbox.click();
        }
    }

    public void deselectCheckbox(int checkboxIndex){
        WebElement checkbox = driver.findElements(checkboxes).get(checkboxIndex-1);
        if(checkbox.isSelected() == true){
            checkbox.click();
        }
    }
}
