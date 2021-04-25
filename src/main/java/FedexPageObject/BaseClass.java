package FedexPageObject;

import ReusableLibrary.AbstractClass;

public class BaseClass extends AbstractClass {
    //Home Page
    public static HomePage homePage(){
        HomePage homePage = new HomePage(driver);
        return homePage;
    }
    //Home Page
    public static DocumentPrintingPage documentPrintingPage(){
        DocumentPrintingPage documentPrintingPage = new DocumentPrintingPage(driver);
        return documentPrintingPage;
    }
    //Home Page
    public static StartOrderPage startOrderPage(){
        StartOrderPage startOrderPage = new StartOrderPage(driver);
        return startOrderPage;
    }
    //Home Page
    public static CopiesCustomPage copiesCustomPage(){
        CopiesCustomPage copiesCustomPage = new CopiesCustomPage(driver);
        return copiesCustomPage;
    }
    //Home Page
    public static FileUploadPage fileUploadPage(){
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        return fileUploadPage;
    }
    //Home Page
    public static PrintInfoPage printInfoPage(){
        PrintInfoPage printInfoPage = new PrintInfoPage(driver);
        return printInfoPage;
    }
    //Home Page
    public static CheckOutPage checkOutPage(){
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        return checkOutPage;
    }
    //Home Page
    public static PickupInfoPage pickupInfoPage(){
        PickupInfoPage pickupInfoPage = new PickupInfoPage(driver);
        return pickupInfoPage;
    }
    //Home Page
    public static InfoPage infoPage(){
        InfoPage infoPage = new InfoPage(driver);
        return infoPage;
    }
}
