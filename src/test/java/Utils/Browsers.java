package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Browsers
{
    public static WebDriver driver=null;
    @BeforeTest
    public WebDriver browserChoice(String BrowseC,String url)
    {
        if("chrome".equalsIgnoreCase(BrowseC))
        {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions= new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            driver= new ChromeDriver(chromeOptions);
        }
        else if ("firefox".equalsIgnoreCase(BrowseC))
        {
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        }
        else
        {
            WebDriverManager.edgedriver().setup();
            EdgeOptions edgeOptions= new EdgeOptions();
            edgeOptions.addArguments("--remote-allow-origins=*");
            driver= new EdgeDriver(edgeOptions);
        }
        driver.manage().window().maximize();
        driver.get(url);
        return  driver;
    }
}
