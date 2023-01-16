module com.example.lab13a {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab13a to javafx.fxml;
    exports com.example.lab13a;
}