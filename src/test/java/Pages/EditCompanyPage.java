package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditCompanyPage extends BasePage {
    public EditCompanyPage(WebDriver driver){super(driver);}
    @FindBy(xpath = "//input[@ng-model='$ctrl.company.name']")
    private WebElement companyName;
    @FindBy(xpath = "//select[@name='country']")
    private WebElement country;
    @FindBy(xpath = "//input[@ng-model='$ctrl.company.address1']")
    private WebElement address1;
    @FindBy(xpath = "//input[@ng-model='$ctrl.company.address2']")
    private WebElement address2;
    @FindBy(xpath = "//input[@ng-model='$ctrl.company.city']")
    private WebElement city;
    @FindBy(xpath = "//select[@name='state']")
    private WebElement state;
    @FindBy(xpath = "//input[contains(@ng-model,'$ctrl.company.zip')]")
    private WebElement zip;
    @FindBy(xpath = "//input[@ng-model='$ctrl.company.phone']")
    private  WebElement phone;
    @FindBy(xpath = "//input[@ng-model='$ctrl.company.email']")
    private WebElement email;
    @FindBy(xpath = "//textarea[@ng-model='$ctrl.company.notes']")
    private WebElement notes;
    @FindBy(xpath = "//button[@ng-click='$ctrl.submitAction()']")
    private WebElement update;

    //methods for update information about company

    public void setCompanyName(String strCompanyName) {
        companyName.clear();
        companyName.sendKeys(strCompanyName);
    }

    public void setAddress1(String strAddress1) {
        address1.clear();
        address1.sendKeys(strAddress1);
    }

    public void setAddress2(String strAddress2) {
        address2.clear();
        address2.sendKeys(strAddress2);
    }

    public void setCity(String strCity) {
        city.clear();
        city.sendKeys(strCity);
    }

    public void setZip(String intZip) {
        zip.clear();
        zip.sendKeys(intZip);
    }

    public void setPhone(String intPhone) {
        phone.clear();
        phone.sendKeys(intPhone);
    }

    public void setEmail(String strEmail) {
        email.sendKeys(strEmail);
    }

    public void setNotes(String strNotes) {
        notes.clear();
        notes.sendKeys(strNotes);
    }

    public void clickUpdateBtn() {
        update.click();
    }

    public void setCountry(String strCountry) {
        Select countryDropdown = new Select(country);
        countryDropdown.selectByVisibleText(strCountry);
    }

    public void setState(String strState) {
        Select stateDropdown = new Select(state);
        stateDropdown.selectByVisibleText(strState);
    }
}
