package broken_images;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BrokenImagesTests extends BaseTests {
    @Test
    public void testAreAllImagesDisplayed(){
        var brokenImages = homePage.brokenImagesPageClick();
        assertTrue(brokenImages.isEveryImageDisplayed());
    }
    @Test
    public void testIsThirdImageDisplayed(){
        var brokenImages = homePage.brokenImagesPageClick();
        assertTrue(brokenImages.isImageDisplayed(3));
    }
    @Test
    public void testIsFirstImageBroken(){
        var brokenImages = homePage.brokenImagesPageClick();
        assertFalse(brokenImages.isImageDisplayed(1));
    }
}
