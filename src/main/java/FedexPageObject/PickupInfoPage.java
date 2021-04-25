package FedexPageObject;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PickupInfoPage extends AbstractClass {
    ExtentTest logger;
    public PickupInfoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "//select[@id='radiusSelect']") WebElement Miles;
    @FindBy(xpath = "//input[@id='loc_seacrh_text']") WebElement ZipCode;
    @FindBy(xpath = "//a[@id='saveNContBtn']") WebElement Continue;

    public void MilesMethod(String miles) throws InterruptedException {
        Thread.sleep(3000);
        ReusableActions.dropdownByText(driver,Miles,miles,"Miles");
    }

    public void ZipCodeMethod(String zip) throws InterruptedException {
        Thread.sleep(3000);
        ReusableActions.sendKeysMethod(driver,ZipCode,zip,logger,"ZipCode");
    }

    public void ContinueMethod() throws InterruptedException {
        Thread.sleep(3000);
        ReusableActions.clickOnElement(driver,Continue,logger,"Continue");
    }
}
