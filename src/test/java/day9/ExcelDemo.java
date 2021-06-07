package day9;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelDemo {
    private  static Workbook workbook;
    private static Sheet sheet;
    private static Row row;
    private static Cell cell;
    private  static String url = "D:\\LemonClass\\code\\java29_maven_base\\src\\test\\resources\\exam.xls";
    private static String sheetName = "用例";

    public static void main(String[] args) throws Exception {
       WriteBackData w1 = new WriteBackData(1,2,"Pass");
        WriteBackData w2 = new WriteBackData(2,2,"Fail");
        WriteBackData w3 = new WriteBackData(3,2,"Pass");
        List<WriteBackData> list =new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        excelOpen(url,sheetName);
        setExcelData(url,list);
        getExcelData();
    }
    public static void excelOpen(String excelUrl,String sheetName) throws Exception {
        FileInputStream fis = new FileInputStream(excelUrl);
        workbook = WorkbookFactory.create(fis);
        sheet=workbook.getSheet(sheetName);
    }
    public static void getExcelData(){
        for (Row r : sheet){
            for (Cell c : r){
                c.setCellType(CellType.STRING);
                System.out.print(c.getStringCellValue()+",");
            }
            System.out.println();
        }
    }

    public static void setExcelData(String excelUrl,List<WriteBackData> list) throws Exception{
        for (int i = 0; i <list.size() ; i++) {
            WriteBackData writeBackData = list.get(i);
            row = sheet.getRow(writeBackData.getRowNum());
            cell = row.getCell(writeBackData.getCellNum(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
            cell.setCellValue(writeBackData.getContent());
//           if (row.getCell(writeBackData.getCellNum()) == null){
//            cell = row.createCell(writeBackData.getCellNum());
//           }else {
//            cell = row.getCell(writeBackData.getCellNum());
//           }

        }
        FileOutputStream fos = new FileOutputStream(excelUrl);
        workbook.write(fos);
    }






}
