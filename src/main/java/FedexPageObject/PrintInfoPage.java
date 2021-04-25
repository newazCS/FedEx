package FedexPageObject;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintInfoPage extends AbstractClass {
    ExtentTest logger;
    public PrintInfoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "//a[text()='CONTINUE WITH EXISTING']") WebElement ContinueEXISTING;
    @FindBy(xpath = "//input[@class='quantity-field']") WebElement quantity;
    @FindBy(xpath = "//button[text()='Add to cart']") WebElement AddToCart;

    public void ContinueMethod(){
        ReusableActions.clickOnElement(driver,ContinueEXISTING,logger,"Continue EXISTING");
    }

    public void quantityMethod(String quantityNum) throws InterruptedException {
        Thread.sleep(3000);
        ReusableActions.sendKeysMethod(driver,quantity,quantityNum,logger,"quantity");
    }
    public void AddToCartMethod() throws InterruptedException {
        Thread.sleep(3000);
        ReusableActions.clickOnElement(driver,AddToCart,logger,"AddToCart");
    }
}
