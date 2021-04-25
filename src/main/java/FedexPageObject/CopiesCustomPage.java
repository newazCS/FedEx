package FedexPageObject;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CopiesCustomPage extends AbstractClass {
    ExtentTest logger;
    public CopiesCustomPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "//img[@alt='Copies & Custom Projects']") WebElement CopiesCustom;

    public void CopiesCustomMethod(){
        ReusableActions.clickOnElement(driver,CopiesCustom,logger,"Copies & Custom");
    }

}
