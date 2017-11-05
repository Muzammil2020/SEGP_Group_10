package sample;

import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.border.Border;
import javax.swing.plaf.PanelUI;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    public Pane homePane;
    public Pane uploadFilePane;
    public Pane addStudentPane;
    public Pane editStudentPane;
    public Pane editStudentPane2;
    public Pane addTutorPane;
    public Pane editTutorPane1;
    public Pane editTutorPane2;
    public Pane displayYearListPane;
    public Pane groupFormationMainPane;
    public Pane groupPane2;
    public Pane displayaGroupPane;

    public Button newGroupButton1;

    public Button browseButton;
    public TextField fileChooserTextFile;

    // File chooser radio button and toggle group
    public ToggleGroup studentOrTutor;
    public RadioButton studentRadio;
    public RadioButton tutorRadio;

    // Display Student List yearly Radio button and groups
    public  ToggleGroup year;
    public  RadioButton year2Radio;
    public  RadioButton year3Radio;
    public  RadioButton year4Radio;
    public  RadioButton allYearsRadio;

    // Accessing Add Student data on Text Fileds
    public TextField studentUoB;
    public TextField studentName;
    public TextField studentEmail;
    public TextField studentProgramme;
    public TextField studentYear;

    // Accessing edit Student data on Text Fileds
    public TextField editStudentUoB;
    public TextField editStudentName;
    public TextField editStudentEmail;
    public TextField editStudentProgramme;
    public TextField editStudentYear;
    public TextField editUoB;

    // Creating object of Add Tutor Text Fileds
    public TextField tutorId;
    public TextField tutorName;
    public TextField tutorEmail;
    public TextField tutorPhone;

    // Creating object of Edit Tutor Text Fileds
    public TextField editTutorId1;
    public TextField editTutorId;
    public TextField editTutorName;
    public TextField editTutorEmail;
    public TextField editTutorPhone;

    public Button addStudentButton;

    // Group Formation
    public TextField groupName;
    public TextField groupSize;

    // Display a Group
    public TextField getGroupName;

    TableView<Student> student;
    TableView<Tutor> tutor;

    ArrayList<Student> studentsArrayList;
    ArrayList<Tutor> tutorsArrayList;

    public void onBrowseButtonClicked(){
        FileChooser fileChooser=new FileChooser();
        fileChooser.setTitle("Please Choose a Excel file!");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Excel file", "*.xls", "*.xlsx"));

        File file = fileChooser.showOpenDialog(Main.stage);
        if (file != null) {
           // fileLabel.setText(file.getPath());
            fileChooserTextFile.setText(file.getPath());
        }
    }

    public void uploadButtonClicked(){
        String table="";
        String path=fileChooserTextFile.getText();
        DataBase db=new DataBase();
        if(studentOrTutor.getSelectedToggle()==studentRadio && fileChooserTextFile.getText()!=null){
            table="student";
            studentsArrayList=ReadingExcelFile.readStudentExcelFile(path);
            db.insertStudentDataList(studentsArrayList);
            AlertBox.display("Success", "Students Data List is added to Database");
            uploadFilePane.setVisible(false);
            homePane.setVisible(true);

        }
        else if(studentOrTutor.getSelectedToggle()==tutorRadio && fileChooserTextFile.getText()!=null){
            table="tutor";
            tutorsArrayList=ReadingExcelFile.readTutorExcelFile(path);
            db.insertTutorDataList(tutorsArrayList);
            AlertBox.display("Success", "Tutors Data List is added to Database");
            uploadFilePane.setVisible(false);
            homePane.setVisible(true);
        }
    }

    public void cancelUploadButtonClicked(){
        uploadFilePane.setVisible(false);
        homePane.setVisible(true);
    }

    public void uploadFileButtonClicked(){
        homePane.setVisible(false);
        uploadFilePane.setVisible(true);
    }

    public void homeAddStudentButtonClicked(){
        homePane.setVisible(false);
        addStudentPane.setVisible(true);
    }

    public void cancelAddStudentClicked(){
        addStudentPane.setVisible(false);
        homePane.setVisible(true);
    }

    public void addStudentButtonClicked(){
        if((studentUoB.getText().equals("")==false) && (studentName.getText().equals("")==false) && (studentProgramme.getText().equals("")==false) && (studentEmail.getText().equals("")==false) && (studentYear.getText().equals("")==false)){
            DataBase db=new DataBase();
            System.out.println(studentUoB.getText());
            System.out.println(studentName.getText());
            db.executeQuery("INSERT INTO `student`(`UoB`, `Name`, `programme`, `email`, `year`) VALUES ('" + studentUoB.getText() + "', '" + studentName.getText() +"', '" + studentProgramme.getText() +"', '" + studentEmail.getText() +"', '" + studentYear.getText() +"')");
            AlertBox.display("Sucess", "Student is Sucessfully added to database!");
            cancelAddStudentClicked();
        }else{
            AlertBox.display("Incomplete Information!", "Fill all the Feilds of Student Data");
        }
    }

    public void editStudentButtonClicked(){
        homePane.setVisible(false);
        editStudentPane.setVisible(true);
    }

    public void editContinueButtonClicked(){
        if(editUoB.getText().equals("")==false){
            DataBase db=new DataBase();
            Student student=db.getStudentData(editUoB.getText());
            editStudentUoB.setText(student.getRollNo());
            editStudentUoB.setEditable(false);
            editStudentName.setText(student.getName());
            editStudentProgramme.setText(student.getProgramme());
            editStudentEmail.setText(student.getEmail());
            editStudentYear.setText(student.getYear());
            editStudentPane.setVisible(false);
            editStudentPane2.setVisible(true);
        }
        else {
            AlertBox.display("Error","Please enter a UoB!");
        }

    }

    public void cancelEditPaneOneButtonClicked(){
        editStudentPane.setVisible(false);
        homePane.setVisible(true);
    }

    public void cancelEditPaneTwoButtonClicked(){
        editStudentPane2.setVisible(false);
        homePane.setVisible(true);
    }

    public void updateStudentButtonClicked(){
        if( (editStudentName.getText().equals("")==false) && (editStudentProgramme.getText().equals("")==false) && (editStudentEmail.getText().equals("")==false) && (editStudentYear.getText().equals("")==false)){
            DataBase db=new DataBase();

            db.executeQuery("UPDATE `student` SET `Name`='" +editStudentName.getText() + "', `programme`='" + editStudentProgramme.getText() + "' ,`email`='" + editStudentEmail.getText() + "' ,`year`='"+ editStudentYear.getText() + "'  WHERE `UoB`='" +editStudentUoB.getText() +"'");
            AlertBox.display("Sucess", "Student data Sucessfully Updated in database!");
            cancelEditPaneTwoButtonClicked();
        }else{
            AlertBox.display("Incomplete Information!", "Fill all the Feilds of Student Data");
        }
    }

    public void homeAddTutorButtonClicked(){
        homePane.setVisible(false);
        addTutorPane.setVisible(true);
    }

    public void cancelAddTutorButtonClicked(){
        addTutorPane.setVisible(false);
        homePane.setVisible(true);
    }

    public void addTutorButtonClicked(){
        if((tutorId.getText().equals("")==false) && (tutorName.getText().equals("")==false) && (tutorEmail.getText().equals("")==false) && (tutorPhone.getText().equals("")==false)){
            DataBase db=new DataBase();

            db.executeQuery("INSERT INTO `tutor`(`tutor_id`, `name`, `email`, `phone`) VALUES ('" + tutorId.getText() + "', '" + tutorName.getText() +"', '" + tutorEmail.getText() +"', '" + tutorPhone.getText() +"')");
            AlertBox.display("Sucess", "Tutor is Sucessfully added to database!");
            cancelAddTutorButtonClicked();
        }else{
            AlertBox.display("Incomplete Information!", "Fill all the Feilds of Tutor Data");
        }
    }

    public void homeEditTutorButtonClicked(){
        homePane.setVisible(false);
        editTutorPane1.setVisible(true);
    }

    public void editTutorContinueButtonClicked(){
        if(editTutorId1.getText().equals("")==false){
            DataBase db=new DataBase();
            Tutor tutor=db.getTutorData(editTutorId1.getText());
            editTutorId.setText(tutor.getTutorId());
            editTutorId.setEditable(false);
            editTutorName.setText(tutor.getName());
            editTutorEmail.setText(tutor.getEmail());
            editTutorPhone.setText(tutor.getPhone());

            editTutorPane1.setVisible(false);
            editTutorPane2.setVisible(true);
        }
        else {
            AlertBox.display("Error","Please enter a Tutor Id!");
        }
    }

    public void cancelEditTutorButtonClicked(){
        editTutorPane1.setVisible(false);
        editTutorPane2.setVisible(false);
        homePane.setVisible(true);
    }

    public void updateTutorButtonClicked(){
        if((editTutorId.getText().equals("")==false) && (editTutorName.getText().equals("")==false) && (editTutorEmail.getText().equals("")==false) && (editTutorPhone.getText().equals("")==false)){
            DataBase db=new DataBase();

            db.executeQuery("UPDATE `tutor` SET `name`='" +editTutorName.getText() + "', `email`='" + editTutorEmail.getText() + "' ,`phone`='" + editTutorPhone.getText()  + "'  WHERE `tutor_id`='" +editTutorId.getText() +"'");
            AlertBox.display("Sucess", "Tutor data Sucessfully Updated in database!");
            cancelEditTutorButtonClicked();
        }else{
            AlertBox.display("Incomplete Information!", "Fill all the Feilds of Tutor Data");
        }
    }

    public void displayTutorListButtonClicked(){
        DisplayTutorList.displayTutorList();
    }

    public void displayStudentsListButtonClicked(){
        homePane.setVisible(false);
        displayYearListPane.setVisible(true);
    }

    public void displayStudentListBackButtonClicked(){
        displayYearListPane.setVisible(false);
        homePane.setVisible(true);
    }

    public void displayButtonClicked(){
        if(year.getSelectedToggle()==year2Radio){
            DisplayStudentList.displayStudentList("year - 2");
        }
        if(year.getSelectedToggle()==year3Radio){
            DisplayStudentList.displayStudentList("year - 3");
        }
        if(year.getSelectedToggle()==year4Radio){
            DisplayStudentList.displayStudentList("year - 4");
        }
        if(year.getSelectedToggle()==allYearsRadio){
            DisplayStudentList.displayStudentList("All");
        }
    }

    public void newGroupButtonClicked(){
        homePane.setVisible(false);
        groupFormationMainPane.setVisible(true);
    }



    public void continueGroupButtonClicked(){

        int groupCount=new DataBase().getGroupsCountLessThan4Members();
        System.out.println(groupCount);

        if(Integer.parseInt(groupSize.getText())<4 && groupCount>=2){

            AlertBox.display("Invalid","Please enter Group Size 4-8");
            groupSize.setText("");
        } else if(groupName.getText().equals("")==false && groupSize.getText().equals("")==false && Integer.parseInt(groupSize.getText())<=8 && groupCount<=2){
            groupPane2.setVisible(true);

            HBox hBox=new HBox(5);
            hBox.minWidth(600);
            hBox.maxWidth(600);
            groupPane2.getChildren().add(hBox);

            //************* Student ***************//



            // Tutor id Colum
            TableColumn<Student, String> studentUoB=new TableColumn<>("UoB");
            studentUoB.setMinWidth(100);
            studentUoB.setCellValueFactory(new PropertyValueFactory<>("rollNo"));

            // Tutor Name Colum
            TableColumn<Student, String> studentName=new TableColumn<>("Name");
            studentName.setMinWidth(180);
            studentName.setCellValueFactory(new PropertyValueFactory<>("name"));


            student=new TableView<>();

            DataBase db=new DataBase();
            // db.setYear("All");
            ObservableList<Student> studentList=db.getUnAllocatedStudentsList();
            student.setItems(studentList);
            student.getColumns().addAll(studentUoB, studentName);
            student.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            VBox vBox1=new VBox();
            vBox1.setMaxWidth(300);
            vBox1.setMinWidth(300);
            vBox1.setMaxHeight(220);
            vBox1.getChildren().add(student);

            //************* Student ***************//



            // Tutor id Colum
            TableColumn<Tutor, String> tutorId=new TableColumn<>("Tutor Id");
            tutorId.setMinWidth(100);
            tutorId.setCellValueFactory(new PropertyValueFactory<>("tutorId"));

            // Tutor Name Colum
            TableColumn<Tutor, String> tutorName=new TableColumn<>("Name");
            tutorName.setMinWidth(200);
            tutorName.setCellValueFactory(new PropertyValueFactory<>("name"));


            tutor=new TableView<>();

            ObservableList<Tutor> tutorsList=db.getUnAsignedTutorsList();
            tutor.setItems(tutorsList);
            tutor.getColumns().addAll(tutorId, tutorName);

            VBox vBox2=new VBox();
            vBox2.setMaxWidth(300);
            vBox2.setMinWidth(300);
            vBox2.setMaxHeight(220);
            vBox2.getChildren().add(tutor);

            hBox.getChildren().addAll(vBox1, vBox2);
        }
        else {
            AlertBox.display("Invalid Input", "Please fill all Feilds with valid info \n Maximum Group Size=8");
        }

    }

    public void makeGroupButtonClicked(){
        String gName=groupName.getText();
        int gSize=Integer.parseInt(groupSize.getText());
        int countMarkedStudents=0;
        int countMarkedTutor=0;
        String selectedTutorId="";

        ObservableList<Student> stdList;
        stdList=student.getSelectionModel().getSelectedItems();

        ObservableList<Tutor> tutorList;
        tutorList=tutor.getSelectionModel().getSelectedItems();

        for(Student s: stdList){
            countMarkedStudents=countMarkedStudents +1;
        }

        for(Tutor t: tutorList){
            selectedTutorId=t.getTutorId();
            countMarkedTutor=countMarkedTutor +1;
        }
        if(countMarkedStudents==gSize && countMarkedTutor==1){
            DataBase db=new DataBase();
            for(Student s: stdList){
                db.executeQuery("UPDATE `student` SET tutor_id='" + selectedTutorId + "',`group_name`='" + gName +"' WHERE UoB='"+ s.getRollNo() +"'");
            }

            AlertBox.display("Success", "Your Group is created");
            groupName.setText("");
            groupSize.setText("");
            groupPane2.setVisible(false);
            groupFormationMainPane.setVisible(false);
            homePane.setVisible(true);
        }
        else{
            AlertBox.display("Invalid","Please Mark " + gSize + " Students \n & 1 Tutor");
        }

    }

    public void cancelGroupButtonClicked(){
        homePane.setVisible(true);
        groupFormationMainPane.setVisible(false);
    }


    public void displayAGroupButtonClicked(){
        homePane.setVisible(false);
        displayaGroupPane.setVisible(true);
    }

    public void cancelDisplayButtonClicked(){
        displayaGroupPane.setVisible(false);
        homePane.setVisible(true);
    }

    public void displayGroupButtonClicked(){
        if(getGroupName.getText().equals("")==false){
            DisplayaGroup.displayGroup(getGroupName.getText());
        }
    }

}
