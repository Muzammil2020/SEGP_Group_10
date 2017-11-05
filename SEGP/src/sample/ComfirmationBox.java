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
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ComfirmationBox {

    static boolean answer;

    public static  boolean display(String title, String message){
        Stage window= new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(200);

        Label label=new Label(message);

        // creating two buttons

        Button yesButton=new Button("Yes");
        Button noButton=new Button("No");

        yesButton.setOnAction(event -> {
            answer=true;
            window.close();
        });

        noButton.setOnAction(event -> {
            answer=false;
            window.close();
        });


        VBox layout1=new VBox(20);
        layout1.getChildren().add(label);
        layout1.setMinHeight(50);
        layout1.setAlignment(Pos.CENTER);

        HBox layout=new HBox(20);
        layout.getChildren().addAll(yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        BorderPane borderPaneLayout=new BorderPane();
        borderPaneLayout.setTop(layout1);
        borderPaneLayout.setCenter(layout);

        Scene scene=new Scene(borderPaneLayout);

        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}
