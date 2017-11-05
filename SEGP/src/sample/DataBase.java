package sample;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataBase {



    private String database = "SEGP_project";

    private String connectionString = "jdbc:mysql://localhost/segp_project";
    private java.sql.Connection con = null;
    private java.sql.Statement st = null;
    private ResultSet result = null;
    private int rows = 0;
    private ResultSetMetaData resultSet = null;

    public DataBase() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.jdbc.Connection");
            con = DriverManager.getConnection(connectionString, "root","");

            st = con.createStatement();


        } catch (SQLException e1) {
            e1.printStackTrace();
            //System.out.println(e1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void executeQuery(String query) {
        try {
            st.executeUpdate(query);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void getResult(String query) {

        try {

            result = st.executeQuery(query);
            resultSet = (ResultSetMetaData) result.getMetaData();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void insertStudentDataList(ArrayList<Student> student){
        for(Student s: student){
            executeQuery("INSERT INTO `student`(`UoB`, `Name`, `programme`, `email`, `year`) VALUES ('" + s.getRollNo() + "', '" + s.getName() +"', '" + s.getProgramme() +"', '" + s.getEmail() +"', '" + s.getYear() +"')");
        }
    }

    public void insertTutorDataList(ArrayList<Tutor> tutor){
        for(Tutor t: tutor){
            executeQuery("INSERT INTO `tutor`(`tutor_id`, `name`, `email`, `phone`) VALUES ('" + t.getTutorId() + "', '" + t.getName() +"', '" + t.getEmail() +"', '" + t.getPhone() +"')");
        }
    }

    public Student getStudentData(String UoB){
        getResult("select * from student where UoB='" + UoB +"'");
        Student student=new Student();
        try {
            result.next();
            student.setRollNo(result.getString(1));
            student.setName(result.getString(2));
            student.setProgramme(result.getString(3));
            student.setEmail(result.getString(4));
            student.setYear(result.getString(5));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student;
    }

    public Tutor getTutorData(String tutorId){
        getResult("select * from tutor where tutor_id='" + tutorId +"'");
        Tutor tutor=new Tutor();
        try {
            result.next();
            tutor.setTutorId(result.getString(1));
            tutor.setName(result.getString(2));
            tutor.setEmail(result.getString(3));
            tutor.setPhone(result.getString(4));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tutor;
    }

    public void updateStudentData(Student student){
        executeQuery("UPDATE `student` SET `Name`='" +student.getName() + "', `programme`='" + student.getProgramme() + "' ,`email`='" + student.getEmail() + "' ,`year`='"+ student.getYear() + "'  WHERE `UoB`='" +student.getRollNo() +"'");
    }

    public ObservableList<Tutor> getTutorsList(){
        ObservableList<Tutor> tutors= FXCollections.observableArrayList();
        getResult("select * from tutor");
        try {
            result.next();
            while (result.next()){
                tutors.add(new Tutor(result.getString(1), result.getString(2), result.getString(3), result.getString(4)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  tutors;
    }

    private String year;

    public void setYear(String year){
        this.year=year;
    }


    public ObservableList<Student> getStudentsList(){
        ObservableList<Student> students= FXCollections.observableArrayList();
        if(year.equals("All")){
            getResult("select * from student");
        }
        else {
            getResult("select * from student WHERE year='" + year + "'");
        }

        try {
            result.next();
            while (result.next()){
                students.add(new Student(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  students;
    }

    public ObservableList<Student> getUnAllocatedStudentsList(){
        ObservableList<Student> students= FXCollections.observableArrayList();

        getResult("SELECT * FROM `student` where tutor_id Is Null");

        try {
            result.next();
            while (result.next()){
                students.add(new Student(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  students;
    }

    public ObservableList<Tutor> getUnAsignedTutorsList(){
        ObservableList<Tutor> tutors= FXCollections.observableArrayList();
        ObservableList<Tutor> tutorsList=getTutorsList();
        ArrayList<String> tutorsId=new ArrayList<>();

        for(Tutor t: tutorsList){
            getResult("select * from student where tutor_id='" + t.getTutorId() + "'");
            try {
                result.last();
                int rowSize=0;
                rowSize=result.getRow();

                if(rowSize==0) {
                    tutorsId.add(t.getTutorId());
                }
                //System.out.println(rowSize);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        getResult("select * from tutor");
        try {
            result.next();
            while (result.next()){
                for(String s:tutorsId){
                    if(result.getString(1).equals(s)){
                        tutors.add(new Tutor(result.getString(1), result.getString(2), result.getString(3), result.getString(4)));

                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for(Tutor t: tutors){
            System.out.println(t.getTutorId());
        }
        return  tutors;
    }


    public  int getGroupsCountLessThan4Members(){
        int groupCount=0;
        ObservableList<Tutor> tutorsList=getTutorsList();
        ArrayList<String> tutorsId=new ArrayList<>();

        for(Tutor t: tutorsList){
            getResult("select * from student where tutor_id='" + t.getTutorId() + "'");
            try {
                result.last();
                int rowSize=0;
                rowSize=result.getRow();

                if(rowSize<4 && rowSize!=0) {
                    groupCount=groupCount +1;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        //    System.out.println(groupCount);

        }
        return groupCount;
    }

    String groupName="";

    public void setGroupName(String groupName){
        this.groupName=groupName;
    }

    public ObservableList<Group> getAGroup(){
        ObservableList<Group> group= FXCollections.observableArrayList();


        getResult("Select * from student where group_name='" + groupName + "'");
        try {
            result.next();
            while(result.next()){
                group.add(new Group(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  group;
    }
}

