module com.example.lab13 {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.lab13;

    opens com.example.lab13 to
            javafx.fxml;
}