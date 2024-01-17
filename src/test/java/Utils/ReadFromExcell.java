package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcell
{
    private  static String Exceldata_dir= System.getProperty("user.dir","/src/test/java/TestData/ExcelSampleData.xlsx");

    FileInputStream dir= new FileInputStream(Exceldata_dir);
    XSSFWorkbook workbook= new XSSFWorkbook(dir);

    XSSFSheet sheet= workbook.getSheetAt(0);

    public ReadFromExcell() throws IOException {
    }
    public String deposit_amount= sheet.getRow(1).getCell(0).getStringCellValue();

}
