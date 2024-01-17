package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;

public class ExtentReport
{

    private static String report_dir= System.getProperty("user.dir")+"/Reports/TestReport.html";

    private static ExtentReports extentReports;

    private static ExtentSparkReporter extentSparkReporter;

    public static ExtentReports extentSetup()
    {
        extentReports = new ExtentReports();
        extentSparkReporter= new ExtentSparkReporter(new File(report_dir));
        extentReports.attachReporter(extentSparkReporter);

        extentSparkReporter.config().setDocumentTitle("Extent Report");
        extentSparkReporter.config().setReportName("XYZBankAutomation");
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentReports.setSystemInfo("OS",System.getProperty("os.name"));
        extentReports.setSystemInfo("Execution Machine",System.getProperty("user.name"));

        return extentReports;
    }


}
