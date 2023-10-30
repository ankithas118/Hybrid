package Generic_Script;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Read_Excel{
	
public static String fetch_Data(String sheet,int row,int cell)
{
	String val="";
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\Ankitha\\Desktop\\abc.xlsx");
			 Workbook book = WorkbookFactory.create(fis);
			Sheet sh=book.getSheet(sheet);
			Row r = sh.getRow(row);
			Cell ce = r.getCell(cell);
			val=ce.toString();
		}
	catch(Exception e) {
		System.out.println("unable to handle");
		
	}

return val;
}
}