package com.example.lab13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage stage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Lab13.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("MegaCalc");
            stage.show();
        } catch(Exception e){
            e.getStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
