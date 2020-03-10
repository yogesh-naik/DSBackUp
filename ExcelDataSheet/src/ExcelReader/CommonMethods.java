package ExcelReader;

import java.util.ArrayList;

public class CommonMethods {

	/**
	* Read the test data from excel file
	*
	* @param data The TestData data object
	*/

	public void readExcelData (TestData data,String testname) {
	       ArrayList<String> browser = new ArrayList<String>();
	       ArrayList<String> username = new ArrayList<String>();
	       ArrayList<String> password = new ArrayList<String>();
	       ArrayList<String> element1 = new ArrayList<String>();
	       ArrayList<String> element2 = new ArrayList<String>();
	       ArrayList<String> element3 = new ArrayList<String>();
		
//		String browser = new String();
//	      String username = new String();
//	       String password = new String();
//	       String element1 = new String();
//	       String element2 = new String();
//	       String element3 = new String();	

	       // Get the data from excel file
	       
	       for (int rowCnt = 1; rowCnt < ExcelReader.RowCount(); rowCnt++) {
	    	   browser.add((ExcelReader.ReadCell(ExcelReader.GetCell("Browser"), rowCnt)));
	    	   if(browser.contains(testname)){
	    		   username.add((ExcelReader.ReadCell(ExcelReader.GetCell("User ID"), rowCnt)));
	    		   password.add((ExcelReader.ReadCell(ExcelReader.GetCell("Password"), rowCnt)));
	    		   element1.add((ExcelReader.ReadCell(ExcelReader.GetCell("Element1"), rowCnt)));
	    		   element2.add((ExcelReader.ReadCell(ExcelReader.GetCell("Element2"), rowCnt)));
	    		   element3.add((ExcelReader.ReadCell(ExcelReader.GetCell("User2.Name"), rowCnt)));
	           break;
	    	   }
	       }//end 
	     
	       
	       data.setBrowser(browser);
	       data.setLoginUser(username);
	       data.setPassword(password);
	       data.setElement1(element1);
	       data.setElement2(element2);
	       data.setElement3(element3);
	    }

}
