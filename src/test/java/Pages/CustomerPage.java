package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CustomerPage
{
    @FindBy(xpath = "//select[contains(@id,'userSelect')]")
    WebElement dropdown_name;
    @FindBy(xpath = "//label[contains(.,'Your Name :')]") WebElement labe_youname_xpath;

    @FindBy(xpath = "//button[@class='btn btn-default'][contains(.,'Login')]")
    WebElement btn_login_xpath;

    public  static WebDriver driver=null;

    public CustomerPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public  void customer_login()
    {
        btn_login_xpath.click();
    }

    public void selectDropdownOption2()
    {
        new WebDriverWait(driver, Duration.ofSeconds(3000)).until(ExpectedConditions.visibilityOf(dropdown_name));
        dropdown_name.click();
    }
    public void selectDropdownOption(int optionValue)
    {
        Select drop= new Select(dropdown_name);
        drop.selectByIndex(optionValue);
    }

    public void verifyLogin()
    {
        Assert.assertEquals(labe_youname_xpath.getText(),"Your Name :");
    }
}
