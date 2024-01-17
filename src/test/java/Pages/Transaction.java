package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Transaction
{
    @FindBy(xpath = "//input[contains(@id,'start')]")
    WebElement calende_xpath;

    public void clickCalende()
    {
        calende_xpath.click();
    }
}
