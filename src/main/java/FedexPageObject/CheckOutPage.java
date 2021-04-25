package FedexPageObject;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends AbstractClass {
    ExtentTest logger;
    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "//a[@id='cartToCheckoutBtn']") WebElement Checkout;
    @FindBy(xpath = "//a[@id='continueAsGuest']") WebElement ProceedAsGuest;

    public void CheckoutMethod() throws InterruptedException {
        Thread.sleep(3000);
        ReusableActions.clickOnElement(driver,Checkout,logger,"Checkout");
    }

    public void ProceedAsGuestMethod() throws InterruptedException {
        Thread.sleep(3000);
        ReusableActions.clickOnElement(driver,ProceedAsGuest,logger,"Proceed As Guest");
    }
}
