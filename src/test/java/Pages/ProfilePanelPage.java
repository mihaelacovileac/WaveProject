package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePanelPage extends BasePage {
    public ProfilePanelPage(WebDriver driver){super(driver);}
    @FindBy(xpath = "//button[@ng-click='app.logout()']")
    private WebElement signOut;
    public void clickSignOut(){
        wait.until(ExpectedConditions.visibilityOf(signOut)).click();
    }
}
