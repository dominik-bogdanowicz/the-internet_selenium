package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChallengingDOMPage {
    private WebDriver driver;
    //private By editLink = By.xpath(".//a[contains(.,'edit')]");
    private By editLink = By.linkText("edit");
    private By deleteLink = By.linkText("delete");
    private By basicButton = By.xpath("//div[contains(@class, 'large-2')]/a[@class='button']");
    private By buttonAlert = By.className("alert");
    private By buttonSuccess = By.className("success");
    private By tableRows = By.xpath("//table/tbody/tr");
    public ChallengingDOMPage(WebDriver driver){
        this.driver = driver;
    }

    private WebElement getTableElement(int rowIndex, int columnIndex){
        List<WebElement> tableRows = driver.findElements(this.tableRows);
        WebElement row = tableRows.get(rowIndex);
        List<WebElement> tableColumns = row.findElements(By.xpath(".//*"));
        return tableColumns.get(columnIndex);
    }

    public String getTableFieldText(int row, int column){
        return getTableElement(row, column).getText();
    }

    public void clickEditButtonOnTableRow(int row){
       WebElement actionField = getTableElement(row, 6);
       actionField.findElement(editLink).click();
       System.out.println(actionField.findElements(editLink).size());
    }

    public void clickDeleteButtonOnTableRow(int row){
        WebElement actionField = getTableElement(row, 6);
        actionField.findElement(deleteLink).click();
    }

    public void clickBasicButton(){
        driver.findElement(basicButton).click();
    }

    public void clickAlertButton(){
        driver.findElement(buttonAlert).click();
    }

    public void clickSuccessButton(){
        driver.findElement(buttonSuccess).click();
    }

    public String getButtonsText(){
        return  driver.findElement(basicButton).getText() +
                driver.findElement(buttonAlert).getText() +
                driver.findElement(buttonSuccess).getText();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }



}
