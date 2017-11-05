package sample;

import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DisplayTutorList {



    public static  void displayTutorList(){
        TableView<Tutor> tutor;
        Stage window= new Stage();
       // window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Tutor List");
        //window.setMinWidth(200);

        // Tutor id Colum
        TableColumn<Tutor, String> tutorId=new TableColumn<>("Tutor Id");
        tutorId.setMinWidth(100);
        tutorId.setCellValueFactory(new PropertyValueFactory<>("tutorId"));

        // Tutor Name Colum
        TableColumn<Tutor, String> tutorName=new TableColumn<>("Name");
        tutorName.setMinWidth(200);
        tutorName.setCellValueFactory(new PropertyValueFactory<>("name"));

        // Tutor id Colum
        TableColumn<Tutor, String> tutorEmail=new TableColumn<>("E-mail");
        tutorEmail.setMinWidth(200);
        tutorEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        // Tutor id Colum
        TableColumn<Tutor, String> tutorPhone=new TableColumn<>("Phone");
        tutorPhone.setMinWidth(100);
        tutorPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));

        tutor=new TableView<>();
        DataBase db=new DataBase();
        ObservableList<Tutor> tutorsList=db.getTutorsList();
        tutor.setItems(tutorsList);
        tutor.getColumns().addAll(tutorId, tutorName, tutorEmail, tutorPhone);

        VBox vBox=new VBox();
        vBox.getChildren().add(tutor);


        Scene scene=new Scene(vBox);

        window.setScene(scene);
        window.showAndWait();
    }
}
