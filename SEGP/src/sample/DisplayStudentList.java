package sample;

import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayStudentList {
    public static  void displayStudentList(String year){
        TableView<Student> student;
        Stage window= new Stage();
        // window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Student List");
        //window.setMinWidth(200);

        // Tutor id Colum
        TableColumn<Student, String> studentUoB=new TableColumn<>("UoB");
        studentUoB.setMinWidth(100);
        studentUoB.setCellValueFactory(new PropertyValueFactory<>("rollNo"));

        // Tutor Name Colum
        TableColumn<Student, String> studentName=new TableColumn<>("Name");
        studentName.setMinWidth(200);
        studentName.setCellValueFactory(new PropertyValueFactory<>("name"));

        // Student Programme
        TableColumn<Student, String> studentProgramme=new TableColumn<>("Programme");
        studentProgramme.setMinWidth(100);
        studentProgramme.setCellValueFactory(new PropertyValueFactory<>("programme"));

        // Tutor id Colum
        TableColumn<Student, String> studentEmail=new TableColumn<>("E-mail");
        studentEmail.setMinWidth(200);
        studentEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        // Tutor id Colum
        TableColumn<Student, String> studentYear=new TableColumn<>("Year");
        studentYear.setMinWidth(100);
        studentYear.setCellValueFactory(new PropertyValueFactory<>("year"));

        student=new TableView<>();

        DataBase db=new DataBase();
        db.setYear(year);
        ObservableList<Student> studentList=db.getStudentsList();
        student.setItems(studentList);
        student.getColumns().addAll(studentUoB, studentName, studentProgramme, studentEmail, studentYear);
     //   student.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        VBox vBox=new VBox();
        vBox.getChildren().add(student);


        Scene scene=new Scene(vBox);

        window.setScene(scene);
        window.showAndWait();
    }
}
