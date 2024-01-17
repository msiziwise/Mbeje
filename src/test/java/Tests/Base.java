package Tests;

import Pages.Account;
import Pages.CustomerPage;
import Pages.Login;
import Pages.Transaction;
import Utils.Browsers;
import Utils.ReadFromExcell;
import Utils.ScreenShots;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Base
{
    Browsers browsers= new Browsers();

    final WebDriver driver= browsers.browserChoice("firefox","https://www.way2automation.com/angularjs-protractor/banking/#/login");
    Login login= PageFactory.initElements(driver,Login.class);
    ScreenShots scs= new ScreenShots();
    Account account = PageFactory.initElements(driver,Account.class);
    CustomerPage customerPage=PageFactory.initElements(driver,CustomerPage.class);

    Transaction transaction=PageFactory.initElements(driver,Transaction.class);


   /* ReadFromExcell readFromExcell;
    {
        try{
            readFromExcell= new ReadFromExcell();
           }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }*/


}
