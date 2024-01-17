package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShots
{
    public static WebDriver driver=null;

    String screenShot_dir= System.getProperty("user.dir")+"/ScreenShot";

    public  void  takeScreenShot(WebDriver driver,String screenShotname)
    {
        TakesScreenshot ts=(TakesScreenshot) driver;
        File dir=ts.getScreenshotAs(OutputType.FILE);
        File Destination= new File(screenShot_dir,screenShotname);

        try
        {
            FileUtils.copyFile(dir,Destination);
        }
        catch (IOException e)
        {
            e.getMessage();
        }

    }

}
