package basic_auth;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasicAuthTests extends BaseTests {
    @Test
    public void testLoginWithCredentialsPassedInUrl(){
        var basicAuthPage = homePage.goToBasicAuthPageWithCredentials();
        assertEquals(basicAuthPage.getText(), "Congratulations! You must have the proper credentials.", "Text message does not match");
    }
}
