package youtube_auto;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exc_read {

	public XSSFSheet ex_load(String file_loc) throws Exception
		{	
		FileInputStream f= new FileInputStream(file_loc);
		XSSFWorkbook wb = new XSSFWorkbook(f);                    // object to point the file     
		XSSFSheet sh = wb.getSheet("Sheet1");   

		return sh;
		}
	
	
									
     
	
}
