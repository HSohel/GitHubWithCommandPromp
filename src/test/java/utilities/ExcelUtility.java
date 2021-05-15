package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ExcelUtility {
    private static List<Map<String, String>> getTestData(String PackageName ) throws IOException {
        List<Map<String, String>> testDataAllRows = null;

        Map<String, String> testData = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("C:/Development/JavaProject1/src/test/resources/MortGageCalculator.xlsx");
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            //Sheet sheet = workbook.getSheetAt(0);
            Sheet sheet = workbook.getSheet(PackageName);
            int lastRowNumber = sheet.getLastRowNum();
            int lastColNumber = sheet.getRow(0).getLastCellNum();

            //Steps for Add column header to the Array list
            List<String> list = new ArrayList();
            for (int i = 0; i < lastColNumber; i++) {
                Row row = sheet.getRow(0);
                Cell cell = row.getCell(i);
                String rowHeader = cell.getStringCellValue().trim();
                list.add(rowHeader);
            }

            testDataAllRows = new ArrayList<Map<String, String>>();
            for (int j = 1; j <= lastRowNumber; j++) {
                Row row = sheet.getRow(j);

                testData = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
                for (int k = 0; k < lastColNumber; k++) {
                    Cell cell = row.getCell(k);
                    String colValue = cell.getStringCellValue().trim();
                    testData.put(list.get(k), colValue);
                }
                testDataAllRows.add(testData);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return testDataAllRows;
    }

    public static String getExcelData(String className, String PackageName, String columnName) throws IOException {
        List<Map<String, String>> testDataInMap = getTestData(PackageName);
        String expectedValue="";

        for (int i=0; i<testDataInMap.size(); i++){
            if (testDataInMap.get(i).containsValue(className)){
                expectedValue = testDataInMap.get(i).get(columnName);
                break;
            }
        }
        return  expectedValue;
    }

}



