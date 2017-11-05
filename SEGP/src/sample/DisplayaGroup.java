package sample;

import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayaGroup {

    public static  void displayGroup(String groupName){
        TableView<Group> group;
        Stage window= new Stage();
        // window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(groupName);
        //window.setMinWidth(200);

        // Tutor id Colum
        TableColumn<Group, String> studentUoB=new TableColumn<>("UoB");
        studentUoB.setMinWidth(100);
        studentUoB.setCellValueFactory(new PropertyValueFactory<>("rollNo"));

        // Tutor Name Colum
        TableColumn<Group, String> studentName=new TableColumn<>("Name");
        studentName.setMinWidth(200);
        studentName.setCellValueFactory(new PropertyValueFactory<>("name"));

        // Student Programme
        TableColumn<Group, String> studentProgramme=new TableColumn<>("Programme");
        studentProgramme.setMinWidth(100);
        studentProgramme.setCellValueFactory(new PropertyValueFactory<>("programme"));

        // Tutor id Colum
        TableColumn<Group, String> studentEmail=new TableColumn<>("E-mail");
        studentEmail.setMinWidth(200);
        studentEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        // Tutor id Colum
        TableColumn<Group, String> studentYear=new TableColumn<>("Year");
        studentYear.setMinWidth(100);
        studentYear.setCellValueFactory(new PropertyValueFactory<>("year"));

        TableColumn<Group, String> studentTutor=new TableColumn<>("Tutor Id");
        studentTutor.setMinWidth(100);
        studentTutor.setCellValueFactory(new PropertyValueFactory<>("tutorId"));

        TableColumn<Group, String> tutorName=new TableColumn<>("Tutor Name");
        tutorName.setMinWidth(100);
        tutorName.setCellValueFactory(new PropertyValueFactory<>("tutorName"));



        group=new TableView<>();

        DataBase db=new DataBase();
        db.setGroupName(groupName);
        ObservableList<Group> studentList=db.getAGroup();
        ObservableList<Group> tutor=db.getAGroup();
        group.setItems(studentList);


        group.getColumns().addAll(studentUoB, studentName, studentProgramme, studentEmail, studentYear, studentTutor);
        //   student.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        VBox vBox=new VBox();
        vBox.getChildren().add(group);


        Scene scene=new Scene(vBox);

        window.setScene(scene);
        window.showAndWait();
    }
}
