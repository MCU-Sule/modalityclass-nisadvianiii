module com.example.t03_2072051 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t03_2072051 to javafx.fxml;
    exports com.example.t03_2072051;

    exports com.example.t03_2072051.controller;
    opens com.example.t03_2072051.controller to javafx.fxml;
}