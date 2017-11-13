package Tests;

import Pages.LoginPage;
import Pages.ProfilePanelPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sign_outTest extends TestLogin {
    private ProfilePanelPage profilePanelPage;
    private LoginPage loginPage;
    @BeforeClass
    public void signOutBeforeClass(){
        loginPage = new LoginPage(driver);
        profilePanelPage = new ProfilePanelPage(driver);
    }
    @Test(priority = 2)
    public void testSignOut(){
        loginPage.clickUserProfileLink();
        profilePanelPage.clickSignOut();
        Assert.assertTrue(loginPage.getSignInToContinue().isDisplayed());
    }
}
