package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader {

	public static HashMap hsobj;

	public static HashMap getData(String DATA) throws IOException {
		
		String[] dataAry = DATA.split("-");
		
		String XLSpath = "C:\\Users\\oye\\Desktop\\"+dataAry[0]+".xlsx";
		String Sheetname = dataAry[1];
		
		
		FileInputStream input = new FileInputStream(XLSpath);

		XSSFWorkbook Workbook = new XSSFWorkbook(input);

		XSSFSheet sheet = Workbook.getSheet(Sheetname);
		hsobj = new HashMap();

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {

			for (int j = 0; j < sheet.getRow(i).getLastCellNum() - 1; j++) {

				Object key = sheet.getRow(i).getCell(j).toString();
				Object value = sheet.getRow(i).getCell(j + 1).toString();
				hsobj.put(key, value);

			}
		}
		
		Workbook.close();
		input.close();
		return hsobj;
	}

	public static void main(String[] args) throws IOException {
		
//		HashMap myHSData = Excelreader.getData("C:\\Users\\oye\\Desktop\\Test.xlsx","Sheet1");
//		
//		System.out.println(myHSData.get("USERNAME"));
//		System.out.println(myHSData.get("PASSWORD"));
	
		

	}

}
