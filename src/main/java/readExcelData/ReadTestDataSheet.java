package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadTestDataSheet {
	
	public static Map<String,String> readtestSheet() throws IOException
	{
		String path = "E:\\Java_Selenium1\\DataDriven\\TestData.xlsx";
		File file = new File(path);
		FileInputStream input = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(input);
		
		XSSFSheet sheet = book.getSheetAt(0);
		Map<String,String> map = new HashMap<String, String>();
		 for(int i=1 ; i<=sheet.getLastRowNum();i++)
		 {
			 String user = sheet.getRow(i).getCell(0).getStringCellValue().toString();
			 String pass = sheet.getRow(i).getCell(1).getStringCellValue().toString();
			 
			 System.out.println("Username is: "+user+" and password is :"+pass);
			 map.put(user, pass);
		}
		 return map;
	}

public static void getdatauserName() throws IOException
	{
	
	Map<String,String> data =  new HashMap<String,String>();	
	data = ReadTestDataSheet.readtestSheet();
	System.out.println(data);
}

}