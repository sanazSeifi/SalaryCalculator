module com.example.salaryprogect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.salaryprogect to javafx.fxml;
    exports com.example.salaryprogect;
}