package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import static sample.Main.stage;


public class Login {

    Stage window;
    Stage mainWindow=stage;

    Label labelUsername;
    Label labelPassword;
    TextField username;
    TextField password;
    Button buttonLogin;
    Button buttonCancel;


    public void display(String title, String message){
        window= new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("LogIn");
        window.setMinWidth(250);
        window.setOnCloseRequest(event -> {
            event.consume();
            window.close();
            stage.close();
        });

        GridPane gridPane=new GridPane();

        labelUsername=new Label("Username :");
        GridPane.setConstraints(labelUsername, 0, 0);

        labelPassword=new Label("Password :");
        GridPane.setConstraints(labelPassword, 0, 1);

        username=new TextField();
        GridPane.setConstraints(username, 1,0);

        password=new TextField();
        GridPane.setConstraints(password, 1,1);

        buttonLogin=new Button("Log In");
        buttonLogin.setOnAction(event -> login());
       // GridPane.setConstraints(buttonLogin, 1, 2);

        buttonCancel=new Button("Cancel");
        buttonCancel.setOnAction(event -> cancel());
        //GridPane.setConstraints(buttonCancel, 1, 2);

        HBox hBox=new HBox(20);
        hBox.getChildren().addAll(buttonCancel, buttonLogin);
        GridPane.setConstraints(hBox, 1, 2);


        gridPane.getChildren().addAll(labelUsername, labelPassword, username, password, hBox);
        gridPane.setHgap(20);
        gridPane.setVgap(20);
        Scene scene=new Scene(gridPane, 200, 200);

        window.setScene(scene);
        window.showAndWait();
    }

    public void login(){
        String user="admin";
        String pass="admin";

        if(username.getText().equals(user) && password.getText().equals(pass)){
            window.close();
            username.setText("");
            password.setText("");
        }
        else {
            password.setText("");

        }

    }

    public void cancel(){
        window.close();
        mainWindow.close();
    }
}
