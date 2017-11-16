package Tests;

import Pages.EditProfilePage;
import Pages.HeaderPage;
import Pages.ProfilePanelPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class TestUploadImage extends TestLogin {
    private HeaderPage headerPage;
    private ProfilePanelPage profilePanelPage;
    private EditProfilePage editProfilePage;
    @BeforeClass
    public void uploadImageBeforeClass(){
        headerPage = new HeaderPage(driver);
        profilePanelPage = new ProfilePanelPage(driver);
        editProfilePage = new EditProfilePage(driver);
    }
    @Test
    //this test did not work,need to find how to upload a picture
    public void uploadImageTest() throws InterruptedException, AWTException, IOException {
        headerPage.clickUserLink();
        profilePanelPage.clickEditProfileBtn();
       // editProfilePage.clickSelectPictureBtn();
       // Thread.sleep(50000); // wait for page load
        // Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Users\\mcovi\\OneDrive\\Imagini\\all photo\\5-6august niagara\\example.png"); // Give  path where the exe is saved.
        editProfilePage.uploadImage("C:\\Users\\mcovi\\OneDrive\\Imagini\\all photo\\5-6august niagara\\example.png");
    }
}

