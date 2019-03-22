package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadByDatarovider {

	public static XSSFSheet sheet;
	public static XSSFCell Cell;
	
	public static Object[][] readData(String sheetpath) throws Exception 
	{
		String path = sheetpath;
		String[][] tabArray = null;
		 
		try {
			 
			    FileInputStream input = new FileInputStream(path);
			    XSSFWorkbook book = new XSSFWorkbook(input);
				sheet = book.getSheetAt(0); 
			    int startRow = 1;			 
			    int startCol = 0;
			 
			    int ci,cj;
			 
			    int totalRows = sheet.getLastRowNum();
			    int totalCols = 2;
			 
			    tabArray= new String[totalRows][totalCols];
			 
			    ci=0;
			 
			    for (int i=startRow;i<=totalRows;i++, ci++) {              
			 
			   cj=0;
			 
			    for (int j=startCol;j<=totalCols;j++, cj++){
			 
			    tabArray[ci][cj]=getCellData(i,j);
			 
			    System.out.println(tabArray[ci][cj]);  
			 
			 }
			 
			 }
			 
		}
	 
	 catch (FileNotFoundException e){
	 
	 System.out.println("Could not read the Excel sheet");
	 
	 e.printStackTrace();
	 
	 }
	 
	 catch (IOException e){
	 
	 System.out.println("Could not read the Excel sheet");
	 
	 e.printStackTrace();
	 
	 }
	 
	 return(tabArray);
	 
	 }
	 
	
	
	 public static String getCellData(int RowNum, int ColNum) throws Exception {
	 
	 try{
	 
	  XSSFCell Cell = sheet.getRow(RowNum).getCell(ColNum);
	 int dataType = Cell.getCellType();
	 if  (dataType == 3) {
	 
	 return "";
	 
	 }
	 else
	 {
	 
	 String CellData = Cell.getStringCellValue();
	 return CellData;
	 
	 }
	 }
	 catch (Exception e){
	 
	 System.out.println(e.getMessage());
	 
	 throw (e);
	 
	 }
	 
	 }

	}


