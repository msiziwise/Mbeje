package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    public static WebDriver driver = null;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg'][contains(.,'Customer Login')]")
    WebElement customer_login_xpath;

    public Login(WebDriver driver)
    {
        this.driver = driver;
    }

    public void cust_login()
    {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(customer_login_xpath));
        customer_login_xpath.click();
    }
}
