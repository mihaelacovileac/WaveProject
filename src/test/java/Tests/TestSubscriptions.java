package Tests;

import Pages.HeaderPage;
import Pages.ProfilePanelPage;
import Pages.SubscriptionsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class TestSubscriptions extends TestLogin {
    private HeaderPage headerPage;
    private ProfilePanelPage profilePanelPage;
    private SubscriptionsPage subscriptionsPage;

    @BeforeClass
    public void subscriptionBeforeClass(){
        headerPage = new HeaderPage(driver);
        profilePanelPage =new ProfilePanelPage(driver);
        subscriptionsPage =new SubscriptionsPage(driver);

    }
    @Test(priority = 2)

    //This test case need to be updated  and did not work


    public void SubscriptionTest() throws InterruptedException {
        headerPage.clickUserLink();
        profilePanelPage.clickSubscriptionIcon();
        List<WebElement> nr =subscriptionsPage.getAllSubscriptionLinks();
        Iterator<WebElement> iterator =nr.iterator();
        while (iterator.hasNext()){
            iterator.next().click();////Will click on all subscription links
            driver.switchTo().activeElement();
            subscriptionsPage.changeNrOfUsersDragDrop();
            Thread.sleep(5000);
            subscriptionsPage.clickChangeSubBtn();
            Thread.sleep(14000);
            driver.switchTo().window("https://www.sandbox.paypal.com/us/cgi-bin/webscr?cmd=_flow&SESSION=wj8329eE9Zz2O8EeEDZ7nsj1FMA7tgGZaNIsyOK2B54TrZHuDB29byk7D08&dispatch=50a222a57771920b6a3d7b606239e4d529b525e0b7e69bf0224adecfb0124e9b61f737ba21b08198bdf3462ec1f5893fb648307135523787&rapidsState=OneX__CustomerBillingAgreementOneXFlow___StateOneXBA_Billing&rapidsStateSignature=(null)#pageState=login&pageDispatch=50a222a57771920b6a3d7b606239e4d529b525e0b7e69bf0224adecfb0124e9b61f737ba21b08198bdf3462ec1f5893fb648307135523787&pageSession=jaqqFWaWWFI2-2ZLa_SwkATzEPsIKr8rgkdde7W1psvlLpjr2awHGW3k5Re/");
            Thread.sleep(25000);
            subscriptionsPage.clickPaypalLink();
            Thread.sleep(10000);
            driver.findElement(By.id("login_email")).sendKeys("nabyqug-buyer@banit.me");
            driver.findElement(By.id("login_password")).sendKeys("kisulea123");
            driver.findElement(By.id("submitLogin")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("continue")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[1]/div[1]"))).isDisplayed();
            //subscriptionsPage.clickCloseBtn();
       }
    }
}
