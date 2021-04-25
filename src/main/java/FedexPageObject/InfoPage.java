package FedexPageObject;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoPage extends AbstractClass {
    ExtentTest logger;
    public InfoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "(//li[contains(@class,'active')])[2]") WebElement Location;
    @FindBy(xpath = "//a[@id='checkout-show-location']") WebElement checkoutShowLocation;
    @FindBy(xpath = "//input[@name='CustFirstName']") WebElement FirstName;
    @FindBy(xpath = "//input[@name='CustLastName']") WebElement LastName;
    @FindBy(xpath = "//input[@name='CustPhone']") WebElement Phone;
    @FindBy(xpath = "//input[@name='CustEmail']") WebElement Email;
    @FindBy(xpath = "//a[@name='contactInfo-savenCont']") WebElement ContactInfo;
    @FindBy(xpath = "//select[@id='pol-select-card']") WebElement CreditCard;
    @FindBy(xpath = "//input[@id='frmCCNum']") WebElement ccNumber;
    @FindBy(xpath = "//input[@id='csv_number']") WebElement csvNumber;
    @FindBy(xpath = "//select[@id='selected_Month']") WebElement Month;
    @FindBy(xpath = "//select[@id='selected_Year']") WebElement Year;
    @FindBy(xpath = "//input[@id='name_card']") WebElement NameOnCard;
    @FindBy(xpath = "//input[@id='sameAsContactInfo']") WebElement ContactInformation;
    @FindBy(xpath = "//input[@id='address_billing_1']") WebElement Address;
    @FindBy(xpath = "//input[@id='city_billing']") WebElement City;
    @FindBy(xpath = "//select[@id='state_billing']") WebElement State;
    @FindBy(xpath = "//input[@id='zip_code']") WebElement Zip;
    @FindBy(xpath = "//a[@id='checkout-show-rewiew']") WebElement ShowReview;
    @FindBy(xpath = "//label[@id='terms-and-conditions']") WebElement TermsConditions;
    @FindBy(xpath = "//a[@id='submit-order-button']") WebElement SubmitOrder;
    @FindBy(xpath = "//div[contains(@class,'text_error')]") WebElement ErrorMessage;

    public void LocationMethod() throws InterruptedException {
        Thread.sleep(3000);
        ReusableActions.clickOnElement(driver,Location,logger,"Location");
    }
    public void checkoutShowLocationMethod() throws InterruptedException {
        Thread.sleep(2000);
        ReusableActions.clickOnElement(driver,checkoutShowLocation,logger,"Continue");
    }
    public void FirstNameMethod(String firstName) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.sendKeysMethod(driver,FirstName,firstName,logger,"First Name");
    }
    public void LastNameMethod(String lastName) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.sendKeysMethod(driver,LastName,lastName,logger,"Last Name");
    }
    public void PhoneMethod(String phone) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.sendKeysMethod(driver,Phone,phone,logger,"Phone");
    }
    public void EmailMethod(String email) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.sendKeysMethod(driver,Email,email,logger,"Email");
    }
    public void ContactInfoMethod() throws InterruptedException {
        Thread.sleep(2000);
        ReusableActions.clickOnElement(driver,ContactInfo,logger,"Continue");
    }
    public void CreditCardMethod(String crType) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.dropdownByText(driver,CreditCard,crType,"Credit card");
    }

    public void ccNumberMethod(String ccNum) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.sendKeysMethod(driver,ccNumber,ccNum,logger,"cc number");
    }

    public void csvNumberMethod(String csv) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.sendKeysMethod(driver,csvNumber,csv,logger,"cc number");
    }
    public void MonthMethod(String month) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.dropdownByText(driver,Month,month,"Month");
    }

    public void YearMethod(String year) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.dropdownByText(driver,Year,year,"Year");
    }
    public void NameOnCardMethod(String cardName) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.sendKeysMethod(driver,NameOnCard,cardName,logger,"Name on Card");
    }
    public void ContactInformationMethod() throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.clickOnElement(driver,ContactInformation,logger,"contact information");
    }
    public void AddressMethod(String address) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.sendKeysMethod(driver,Address,address,logger,"Address");
    }
    public void CityMethod(String city) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.sendKeysMethod(driver,City,city,logger,"City");
    }
    public void StateMethod(String state) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.dropdownByText(driver,State,state,"Month");
    }
    public void ZipMethod(String zip) throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.sendKeysMethod(driver,Zip,zip,logger,"Zip ");
    }
    public void ShowReviewMethod() throws InterruptedException {
        Thread.sleep(2000);
        ReusableActions.clickOnElement(driver,ShowReview,logger,"Continue");
    }

    public void TermsConditionsMethod() throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.clickOnElement(driver,TermsConditions,logger,"Terms and Conditions");
    }
    public void SubmitOrderMethod() throws InterruptedException {
        Thread.sleep(2000);
        ReusableActions.clickOnElement(driver,SubmitOrder,logger,"Submit Order");
    }
    public void ErrorMessageMethod() throws InterruptedException {
        Thread.sleep(3000);
        String errMes = ReusableActions.captureText(driver,ErrorMessage,0,logger,"Error Message");
        logger.log(LogStatus.INFO,errMes);
    }

}
