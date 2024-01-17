package Tests;

import Pages.Transaction;
import Utils.Browsers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


@Test
public class LoginTest extends Base
{
    @Test
   public void login1()
    {
       login.cust_login();
    }
    @Test(dependsOnMethods = "login1")
    public void customer()
    {
        scs.takeScreenShot(driver,"CustomerPage"+".png");
        customerPage.selectDropdownOption2();
        customerPage.selectDropdownOption(1);
        customerPage.customer_login();
        scs.takeScreenShot(driver,"CustomerPage"+".png");
        //customerPage.verifyLogin();
    }
    @Test(dependsOnMethods = "customer")
    public void Account()
    {
        //account.verifyAccount();
        account.selectDropdownaccount(0);
        account.btnDeposit1();
        account.input_deposit("1500");
        //account.input_deposit(readFromExcell.deposit_amount);
        account.btnDeposit2();
        account.verify_Deposit_Success();
        scs.takeScreenShot(driver,"Verify Deposit Screen"+".png");
    }
    @Test(dependsOnMethods = "Account")
    public void Account2()
    {
        for(int i=0;i<3;i++)
        {
            //account.verifyAccount();
            account.selectDropdownaccount(i);
            account.btnDeposit1();
            account.input_deposit("1500");
            //account.input_deposit(readFromExcell.deposit_amount);
            account.btnDeposit2();
            account.verify_Deposit_Success();
            scs.takeScreenShot(driver, "Verify Deposit Screen" +i+1+ ".png");
        }
    }
    @Test(dependsOnMethods = "Account2")
    public void Account3()
    {
        //account.verifyAccount();
        account.selectDropdownaccount(0);
        account.btnDeposit1();
        account.input_deposit("31459");
        //account.input_deposit(readFromExcell.deposit_amount);
        account.btnDeposit2();
        account.verify_Deposit_Success();
        account.btnTransaction();
        scs.takeScreenShot(driver,"Verify Deposit Screen"+".png");
        //account.customer_logout();
    }
   /* @Test(dependsOnMethods = "Account3")
    public void Transction()
    {
        transaction.clickCalende();
    }*/

}