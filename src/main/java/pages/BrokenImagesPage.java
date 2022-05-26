package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class BrokenImagesPage {
    private WebDriver driver;
    private By images = By.tagName("img");

    public BrokenImagesPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param index starts at 1
     * @return boolean value indicates if image with given index is loaded correctly
     */
    public boolean isImageDisplayed(int index){
        List<WebElement> imageList = driver.findElements(images);
        WebElement image = imageList.get(index);
        return isImageDisplayed(image);
    }

    public boolean isEveryImageDisplayed(){
        List<WebElement> imageList = driver.findElements(images);
        for(WebElement image: imageList){
            if(!isImageDisplayed(image)) return false;
        }
        return true;
    }

    /**
     * Uses JavascriptExecutor to run the script checking HTMLImageElement properties.
     * HTMLImageElement.complete                  -- boolean value indicates if image has completely loaded
     * typeof HTMLImageElement.naturalWidth       -- indicates if element has naturalWidth property
     * HTMLImageElement.naturalWidth > 0          -- original width of the image is bigger than 0
     * @param img WebElement representing image
     * @return boolean value indicates whether image is loaded correctly
     */
    public boolean isImageDisplayed(WebElement img){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        boolean isDisplayed = (Boolean) jse.executeScript("return arguments[0].complete " +
                "&& typeof arguments[0].naturalWidth != \"undefined\" " +
                "&& arguments[0].naturalWidth > 0", img);
        return isDisplayed;
    }
}
