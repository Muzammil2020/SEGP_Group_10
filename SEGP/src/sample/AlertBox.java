package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {


    public static  void display(String title, String message){
        Stage window= new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(200);

        Label label=new Label(message);
        Button button=new Button("Okay");
        button.setOnAction(event -> window.close());

        FileChooser fileChooser=new FileChooser();
        fileChooser.setTitle("My file");

        VBox layout=new VBox(20);
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);

        Scene scene=new Scene(layout);

        window.setScene(scene);
        window.showAndWait();
    }
}