package add_delete;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;

import static org.testng.Assert.*;

public class AddRemoveElementsTests extends BaseTests {
    @Test
    public void testAddButton(){
        AddRemoveElementsPage addRemovePage = homePage.addRemovePageClick();

        addRemovePage.clickAddButton();

        assertEquals(addRemovePage.getDeleteButtonsCount(), 1, "Wrong number of delete buttons on page");
    }
    @Test
    public void testDeleteButton(){
        AddRemoveElementsPage addRemovePage = homePage.addRemovePageClick();
        //Add two delete buttons
        addRemovePage.clickAddButton();
        addRemovePage.clickAddButton();
        //Delete one of the buttons
        addRemovePage.clickDeleteButton();
        //There should be one delete button left
        assertEquals(addRemovePage.getDeleteButtonsCount(), 1, "Wrong number of delete buttons on page");
    }
}
