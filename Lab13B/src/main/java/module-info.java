module com.example.lab13b {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab13b to javafx.fxml;
    exports com.example.lab13b;
}