package DemoExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DemoWorkBookCreation {
  @Test
  public void f() throws IOException {
	  
	  XSSFWorkbook wb=new XSSFWorkbook(); // create a blank workbook
		FileOutputStream out=new FileOutputStream(new File("DemoWB.xlsx"));
		wb.write(out);
		out.close();
		System.out.println("the workbook is created");
  }
  
}
