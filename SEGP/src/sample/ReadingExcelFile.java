package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

    public static ArrayList<Student> readStudentExcelFile(String path) {
        // TODO Auto-generated method stub

        ArrayList<Student> arrayList=new ArrayList<Student>();
        ArrayList<String> arrayListRow = null;



        FileInputStream fis;
        XSSFWorkbook wb= null;
        try {
            fis=new FileInputStream(new File(path));
            wb = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        XSSFSheet sheet=wb.getSheetAt(0);

        FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();

        for(Row row : sheet){
            arrayListRow=new ArrayList<String>();
            for(Cell cell:row){
                switch(formulaEvaluator.evaluateInCell(cell).getCellType()){
                    case Cell.CELL_TYPE_NUMERIC:
                        int x=(int) cell.getNumericCellValue();
                        arrayListRow.add(x+"");
                        //System.out.print(x+"" + "\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        //System.out.print(cell.getStringCellValue() + "\t\t");
                        arrayListRow.add(cell.getStringCellValue());
                        break;
                }

            }

            Student std=new Student();
            std.setRollNo(arrayListRow.get(0));
            std.setName(arrayListRow.get(1));
            std.setProgramme(arrayListRow.get(2));
            std.setEmail(arrayListRow.get(3));
            std.setYear(arrayListRow.get(4));

            arrayList.add(std);

        }


        return arrayList;

    }

    public static ArrayList<Tutor> readTutorExcelFile(String path) {
        // TODO Auto-generated method stub

        ArrayList<Tutor> arrayList=new ArrayList<Tutor>();
        ArrayList<String> arrayListRow = null;


        FileInputStream fis;
        XSSFWorkbook wb= null;
        try {
            fis=new FileInputStream(new File(path));
            wb = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        XSSFSheet sheet=wb.getSheetAt(0);

        FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();

        for(Row row : sheet){
            arrayListRow=new ArrayList<String>();
            for(Cell cell:row){
                switch(formulaEvaluator.evaluateInCell(cell).getCellType()){
                    case Cell.CELL_TYPE_NUMERIC:
                        int x=(int) cell.getNumericCellValue();
                        arrayListRow.add(x+"");
                        //System.out.print(x+"" + "\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        //System.out.print(cell.getStringCellValue() + "\t\t");
                        arrayListRow.add(cell.getStringCellValue());
                        break;
                }

            }

            Tutor tutor=new Tutor();
            tutor.setTutorId(arrayListRow.get(0));
            tutor.setName(arrayListRow.get(1));
            tutor.setEmail(arrayListRow.get(2));
            tutor.setPhone(arrayListRow.get(3));
            arrayList.add(tutor);

        }


        return arrayList;

    }

}
