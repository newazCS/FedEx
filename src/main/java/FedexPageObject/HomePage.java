package FedexPageObject;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractClass {
    ExtentTest logger;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "//a[contains(@aria-label,'Open Design')]") WebElement DesignPrint;

    @FindBy(xpath = "//a[contains(@aria-label,'All Products')]") WebElement AllProducts;

    public void DesignPrintMethod(){
        ReusableActions.clickOnElement(driver,DesignPrint,logger,"Design & Print");
    }

    public void AllProductsMethod(){
        ReusableActions.clickOnElement(driver,AllProducts,logger,"AllProducts");
    }
}
