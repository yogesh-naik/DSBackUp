import java.io.IOException;
import java.util.Iterator;

import jxl.read.biff.BiffException;
import ExcelReader.CommonMethods;
import ExcelReader.ExcelReader;
import ExcelReader.TestData;


public class ExcelReader2 {

	public static void main(String[] args) throws BiffException {
		// TODO Auto-generated method stub
		// Create Objects
		
		
		
		// Load the excel file for testing
		try {
			ExcelReader excelReaderObj = new ExcelReader("C:\\test2.xls");
			CommonMethods commonMethodobj = new CommonMethods();
			TestData td = new TestData();
			
			// Load the Excel Sheet Col in to Dictionary for use in test cases
			excelReaderObj.ColumnDictionary();
			
			System.out.println("Total Rows "+excelReaderObj.RowCount());
		// Get the data from excel file
			//for(int i =1;i<=excelReaderObj.RowCount()-1;i++)
				commonMethodobj.readExcelData (td,"Safari");
			
			//for(int i=0;i<=td.getBrowser().length()-1;i++)
				System.out.println("Printing -"+td.getPassword());
				System.out.println("Printing -"+td.getLoginUser());
				System.out.println(td.getElement1());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
