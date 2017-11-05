package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage=primaryStage;

     //   DataBase db=new DataBase();

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("PAT Allocator System");
        primaryStage.setScene(new Scene(root, 600, 400));

        primaryStage.show();
        DataBase db=new DataBase();
      //  DisplayTutorList.displayTutorList();
       // db.setYear("All");
       // DisplayStudentList.displayStudentList("year - 3");

        new Login().display("Login", "hsdhfksdhfkj");


    }


    public static void main(String[] args) {

        launch(args);


    }
}
