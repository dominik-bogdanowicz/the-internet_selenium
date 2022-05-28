package challenging_dom;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChallengingDOMTests extends BaseTests {
    @Test
    public void testButtonsChangingTextAfterBasicButtonClick(){
        var domPage = homePage.challengingDOMPageClick();
        String preClickText = domPage.getButtonsText();
        domPage.clickBasicButton();
        String postClickText = domPage.getButtonsText();
        assertTrue(preClickText!=postClickText);
    }
    @Test
    public void testButtonsChangingTextAfterAlertButtonClick(){
        var domPage = homePage.challengingDOMPageClick();
        String preClickText = domPage.getButtonsText();
        domPage.clickAlertButton();
        String postClickText = domPage.getButtonsText();
        assertTrue(preClickText!=postClickText);
    }
    @Test
    public void testButtonsChangingTextAfterSuccessButtonClick(){
        var domPage = homePage.challengingDOMPageClick();
        String preClickText = domPage.getButtonsText();
        domPage.clickSuccessButton();
        String postClickText = domPage.getButtonsText();
        assertTrue(preClickText!=postClickText);
    }
    @Test
    public void testUrlChangingAfterEditClick(){
        var domPage = homePage.challengingDOMPageClick();
        domPage.clickEditButtonOnTableRow(0);
        assertEquals(domPage.getUrl(), "https://the-internet.herokuapp.com/challenging_dom#edit");
    }
    @Test
    public void testUrlChangingAfterDeleteClick(){
        var domPage = homePage.challengingDOMPageClick();
        domPage.clickDeleteButtonOnTableRow(1);
        assertEquals(domPage.getUrl(), "https://the-internet.herokuapp.com/challenging_dom#delete");
    }

}
