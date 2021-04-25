import ReusableLibrary.AbstractClass;
import FedexPageObject.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FedexPageObject extends AbstractClass {
    @Test
    public void fedex() throws InterruptedException {
        driver.get("https://www.fedex.com/en-us/home.html");

        //   -HomePage-
        BaseClass.homePage().DesignPrintMethod();
        BaseClass.homePage().AllProductsMethod();

        //  -Start Order-
        BaseClass.startOrderPage().StartOrderMethod();

        //  -Document Printing-
        BaseClass.documentPrintingPage().DocumentPrintMethod();

        // Asset that you are on "FedEx Office Print Online" page
        String actualPageTitle = driver.getTitle();
        String expectedTitle = "FedEx Office Print Online";
        Assert.assertEquals(actualPageTitle,expectedTitle);

        //  -Copies & Custom Projects-
        BaseClass.copiesCustomPage().CopiesCustomMethod();


        //  -File Upload -
        BaseClass.fileUploadPage().FileUploadMethod();
        BaseClass.fileUploadPage().ImgUpload("D:\\UploadFiles\\img.jpg");

        // -PrintInfo-
        BaseClass.printInfoPage().ContinueMethod();
        BaseClass.printInfoPage().quantityMethod("5");
        BaseClass.printInfoPage().AddToCartMethod();

        // -CheckOutPage-
        BaseClass.checkOutPage().CheckoutMethod();
        BaseClass.checkOutPage().ProceedAsGuestMethod();

        // -PickupInfoPage-
        BaseClass.pickupInfoPage().MilesMethod("10 Miles");
        BaseClass.pickupInfoPage().ZipCodeMethod("11218");
        BaseClass.pickupInfoPage().ContinueMethod();

        // -InfoPage-
        BaseClass.infoPage().LocationMethod();
        BaseClass.infoPage().checkoutShowLocationMethod();
        BaseClass.infoPage().FirstNameMethod("Mohammad");
        BaseClass.infoPage().LastNameMethod("Newaz");
        BaseClass.infoPage().PhoneMethod("9293057858");
        BaseClass.infoPage().EmailMethod("newaz@gmail.com");
        BaseClass.infoPage().ContactInfoMethod();
        BaseClass.infoPage().CreditCardMethod("MASTERCARD®");
        BaseClass.infoPage().ccNumberMethod("5105105105105100");
        BaseClass.infoPage().csvNumberMethod("767");
        BaseClass.infoPage().MonthMethod("06");
        BaseClass.infoPage().YearMethod("2023");
        BaseClass.infoPage().NameOnCardMethod("Mohammad Aynal");
        BaseClass.infoPage().ContactInformationMethod();
        BaseClass.infoPage().AddressMethod("123 main street");
        BaseClass.infoPage().CityMethod("Brooklyn");
        BaseClass.infoPage().StateMethod("NY");
        BaseClass.infoPage().ZipMethod("11218");
        BaseClass.infoPage().ShowReviewMethod();
        BaseClass.infoPage().TermsConditionsMethod();
        BaseClass.infoPage().SubmitOrderMethod();
        BaseClass.infoPage().ErrorMessageMethod();

    }
}
