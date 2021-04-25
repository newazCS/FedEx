package FedexPageObject;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartOrderPage extends AbstractClass {
    ExtentTest logger;
    public StartOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "//a[contains(@aria-label,'Start Order')]") WebElement StartOrder;

    public void StartOrderMethod(){
        ReusableActions.clickOnElement(driver,StartOrder,logger,"StartOrder");
    }
}
