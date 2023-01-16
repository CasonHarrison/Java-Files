package com.example.lab13b;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("MegaCalc");
            stage.show();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
        /*GridPane myGrid = new GridPane();
        Scene scene = new Scene(,300,400);
        stage.setScene(scene);
        stage.setTitle("MegaCalc");
        stage.show();
        Label Sum="";
        TextField UI1="", UI2="";
        Button t1Button = new Button("Clear");
        Button t2Button = new Button("+");
        myGrid.add(Sum,2,4);
        myGrid.add(UI1,2,2);
        myGrid.add(UI2,6,2);
        myGrid.add(t1Button,2,5);
        myGrid.add(t2Button,2,1);
        t1Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                UI1.clear();
                UI2.clear();
                Sum.setText("");
            }
        });
        t2Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int a = Integer.parseInt(UI1.getText());
                int b = Integer.parseInt(UI2.getText());
                Sum.setText(String.valueOf(a + b));
            }
        });
        stage.setScene(scene);
        stage.setTitle("MegaCalc");
        stage.show();
    }
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        */
    public static void main(String[] args) {
        launch();
    }
}