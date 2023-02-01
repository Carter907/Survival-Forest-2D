module com.example.survivalforest2d {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.survivalforest2d to javafx.fxml;
    exports com.example.survivalforest2d;
    exports com.example.survivalforest2d.controllers;
    opens com.example.survivalforest2d.controllers to javafx.fxml;
}