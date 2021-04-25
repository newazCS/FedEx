package FedexPageObject;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentPrintingPage extends AbstractClass {
    ExtentTest logger;
    public DocumentPrintingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "//a[@title='Document Printing']") WebElement DocumentPrinting;

    public void DocumentPrintMethod(){
        ReusableActions.clickOnElement(driver,DocumentPrinting,logger,"Document Printing");
    }
}
