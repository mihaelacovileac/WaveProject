package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePanelPage extends BasePage {
    public ProfilePanelPage(WebDriver driver){super(driver);}
    @FindBy(xpath = "//button[@ng-click='app.logout()']")
    private WebElement signOut;
    @FindBy(xpath = "//em[@class='icon-user fa-lg']")
    private WebElement userIcon;
    @FindBy(xpath = "//em[@class='icon-equalizer fa-lg']")
    private WebElement subscriptionIcon;
    @FindBy(xpath = "//button[contains(.,'Edit Profile')]")
    private WebElement editProfileBtn;
    @FindBy(xpath = "//button[contains(.,'Edit Company')]")
    private WebElement editCompanyBtn;

    public void clickSignOut(){
        wait.until(ExpectedConditions.visibilityOf(signOut)).click();
    }
    public void clickUserIcon(){
        wait.until(ExpectedConditions.elementToBeClickable(userIcon)).click();
    }
    public void clickSubscriptionIcon(){
        wait.until(ExpectedConditions.elementToBeClickable(subscriptionIcon)).click();
    }
    public void clickEditProfileBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(editProfileBtn)).click();
    }
    public void clickEditCompanyBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(editCompanyBtn)).click();
    }
}
