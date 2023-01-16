package com.example.lab13;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Label Sum;
    public TextField UI1, UI2;
    public void Clear(ActionEvent action) {
        UI1.clear();
        UI2.clear();
        Sum.setText("");
    }
    public void calculate(ActionEvent action) {
         int a = Integer.parseInt(UI1.getText());
         int b = Integer.parseInt(UI2.getText());
         Sum.setText(String.valueOf(a + b));
    }
    public void initialize(URL url, ResourceBundle rb) {
        Clear(new ActionEvent());
        calculate(new ActionEvent());
    }
}
