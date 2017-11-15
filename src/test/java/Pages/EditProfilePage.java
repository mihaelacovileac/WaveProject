package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditProfilePage extends BasePage {
    public EditProfilePage(WebDriver driver){super(driver);}

    //Profile Picture
    @FindBy(xpath = "//button[@class='upload btn btn-labeled btn-primary btn-sm']")
    private WebElement selectPictureBtn;
    @FindBy(xpath = "//button[@ng-click='$ctrl.deleteProfilePicture()']")
    private WebElement deletePictureBtn;
    //General info
    @FindBy(xpath = "//input[@name='name']")
    private  WebElement nameField;
    @FindBy(xpath = "//button[@ng-click='$ctrl.submitGeneralForm()']")
    private WebElement updateNameBtn;
    @FindBy(xpath = "//span[@class ='text-danger' and text()='This field is required']")// "//span[@class='text-danger']"
    private WebElement errorRequired;

    //changePassword form
    @FindBy(xpath = "//input[@name='current_password']")
    private WebElement currentPassword;
    @FindBy(xpath = "//input[@name='new_password']")
    private WebElement newPassword;
    @FindBy(xpath = "//input[@name='password_confirm']")
    private WebElement confirmPassword;
    @FindBy(xpath = "//button[@ng-click='$ctrl.submitPasswordForm()']")
    private WebElement changePasswordBtn;

    //password fields errors
    @FindBy(xpath = "//span[contains(.,'Password does Not match')]")
    private WebElement errorNotMatch;
    @FindBy(xpath = "//span[contains(.,'Input should be 6-20 length')]")
    private  WebElement errorInput6Characters;
    @FindBy(xpath = "/html/body/div[2]/section/div/div/div[2]/form[2]/div/div[2]/fieldset[1]/div/div/span[2]")// "//span[contains(.,'Your current password is different')]"
    private WebElement errorCurrentPassDifferent;

    //Successful message
    // xpath if this doesn't work "//div[@class='uk-notify-message alert-dismissable alert alert-success']"
    // works for all success messages
    @FindBy(xpath = "/html/body/div[3]")
    private WebElement successMessage;


    //methods for upload picture
    public void clickSelectPictureBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(selectPictureBtn)).click();
    }
    public void clickDeletePictureBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(deletePictureBtn)).click();
    }
    //i have to learn hoe to upload a picture and add more methods

    //methods for change name:
    public void setNameField(String strName) {
        wait.until(ExpectedConditions.visibilityOf(nameField));
        nameField.clear();
        nameField.sendKeys(strName);
    }
    public void clickUpdateNameBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(updateNameBtn)).click();
    }

    //methods for changing password
    public void setCurrentPassword(String strCurrentPass) {
        wait.until(ExpectedConditions.visibilityOf(currentPassword));
        currentPassword.clear();
        currentPassword.sendKeys(strCurrentPass);
    }
    public void setNewPassword(String strNewPass) {
        wait.until(ExpectedConditions.visibilityOf(newPassword));
        newPassword.clear();
        newPassword.sendKeys(strNewPass);
    }
    public void setConfirmNewPassword(String strConfirmPass) {
        wait.until(ExpectedConditions.visibilityOf(confirmPassword));
        confirmPassword.clear();
        confirmPassword.sendKeys(strConfirmPass);
    }
    public void clickChangePassBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(changePasswordBtn));
        executor.executeScript("arguments[0].click();",changePasswordBtn);
    }

    //get error messages
    public String getErrorRequired(){ return errorRequired.getText(); }
    public WebElement getVisiblErrorRequiredElement(){
        return wait.until(ExpectedConditions.visibilityOf(errorRequired));
    }

    public String getErrorNotMatch(){ return errorNotMatch.getText(); }
    public WebElement getVisiblErrorNotMatchElement(){
        return wait.until(ExpectedConditions.visibilityOf(errorNotMatch));
    }

    public String getErrorWrongInput(){ return errorInput6Characters.getText();}
    public WebElement getVisiblErrorInput6CharElement(){
        return wait.until(ExpectedConditions.visibilityOf(errorInput6Characters));
    }

    public String getErrorCurrentPassWrong(){ return errorCurrentPassDifferent.getText(); }
    public WebElement getVisiblErrorCurrentPassWrongElement(){
        return wait.until(ExpectedConditions.visibilityOf(errorCurrentPassDifferent));
    }
    public String getSuccessMessage(){
        return successMessage.getText();
    }

}