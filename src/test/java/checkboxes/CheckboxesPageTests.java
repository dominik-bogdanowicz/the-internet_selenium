package checkboxes;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckboxesPageTests extends BaseTests {
    @Test
    public void testSelectAllCheckboxes(){
        var checkboxesPage = homePage.checkboxesPageClick();
        checkboxesPage.selectCheckbox(1);
        checkboxesPage.selectCheckbox(2);
        assertTrue(checkboxesPage.isChecked(1) && checkboxesPage.isChecked(2));
    }
}
