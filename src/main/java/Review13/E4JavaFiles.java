package Review13;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E4JavaFiles {

        public static void main(String[] args) {
            String path="/Users/porschabuttercup/IdeaProjects/JavaBasics/Files/Employees.xlsx"; //locate the file
            try(FileInputStream fileInputStream=new FileInputStream(path);
                XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream)){ //the software that'll be able to read the file
                Sheet sheet=  xssfWorkbook.getSheet("EmpData"); //the actual file with the data
                int noOfRows=sheet.getPhysicalNumberOfRows();
                List<Map<String,String>> excelData=new ArrayList<>();
                Row headerRow= sheet.getRow(0);
                for (int i=1;i<noOfRows;i++){
                    Map<String,String> rowDataMap=new LinkedHashMap<>();

                    Row row= sheet.getRow(i);
                    int noOfCells=row.getPhysicalNumberOfCells();
                    for (int j = 0; j < noOfCells; j++) {
                        String key=headerRow.getCell(j).toString();
                        String value=row.getCell(j).toString();
                        rowDataMap.put(key,value);
                    }
                    excelData.add(rowDataMap);
                }
                System.out.println(excelData);
            }catch (IOException io){
                io.printStackTrace();
            }


        }

    }

