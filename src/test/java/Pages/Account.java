package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Account
{
    @FindBy(xpath = "//strong[contains(.,'Welcome Hermoine Granger !!')]")
    WebElement lbl_welcome_xpath;

    @FindBy(xpath = "//button[contains(@ng-click,'deposit()')]")
    WebElement btn_deposit_xpath;

    @FindBy(xpath = "//input[contains(@type,'number')]")
    WebElement txt_deposit_xpath;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Deposit')]")
    WebElement btn2_deposit_xpath;

    @FindBy(xpath = "//span[@class='error ng-binding'][contains(.,'Deposit Successful')]")
    WebElement verify_deposit_success_xpath;

    String dps="1500";
    @FindBy(xpath = "//button[@class='btn btn-default'][contains(.,'Login')]")
    WebElement btn_login_xpath;

    @FindBy(xpath = "//button[@ng-show='logout'][contains(.,'Logout')]")
    WebElement btn_logout_xpath;

    @FindBy(xpath ="//select[contains(@ng-hide,'noAccount')]")
    WebElement dropdown_account;

    @FindBy(xpath ="//button[@ng-class='btnClass1'][contains(.,'Transactions')]")
    WebElement btn_transaction_xpath;

    @FindBy(xpath ="//select[contains(@ng-hide,'noAccount')]")
    WebElement dropdown_account2;

    public  static WebDriver driver=null;

    public Account(WebDriver driver)
    {
        this.driver=driver;
    }
    public void verifyAccount()
    {
        lbl_welcome_xpath.isDisplayed();
        Assert.assertEquals(lbl_welcome_xpath.getText(),"Welcome Hermoine Granger !!");
    }

    public  void btnDeposit1()
    {
        btn_deposit_xpath.click();
    }
    public void input_deposit(String deposit)
    {
        new WebDriverWait(driver, Duration.ofSeconds(3000)).until(ExpectedConditions.visibilityOf(txt_deposit_xpath));
        txt_deposit_xpath.sendKeys(deposit);
    }
    public  void validateDepo()
    {
        txt_deposit_xpath.isDisplayed();
        Assert.assertEquals(txt_deposit_xpath.getText(),dps);
    }
    public  void verify_Deposit_Success()
    {
        verify_deposit_success_xpath.isDisplayed();
        Assert.assertEquals(verify_deposit_success_xpath.getText(),"Deposit Successful");
    }
    public void selectDropdownaccount(int optionValue)
    {
        new WebDriverWait(driver, Duration.ofSeconds(3000)).until(ExpectedConditions.visibilityOf(dropdown_account));
        Select drop= new Select(dropdown_account);
        drop.selectByIndex(optionValue);
    }
    public  void btnDeposit2()
    {
        btn2_deposit_xpath.click();
    }
    public  void customer_logout()
    {
        btn_logout_xpath.click();
    }

    public void btnTransaction()
    {
        btn_transaction_xpath.click();
    }

}
