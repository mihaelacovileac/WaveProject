package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div[1]/a/img")
    private WebElement logo;

    public WebElement getLogo() {
        return wait.until(ExpectedConditions.visibilityOf(logo));
    }

}
