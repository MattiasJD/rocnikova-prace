module com.example.csmore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csmore to javafx.fxml;
    exports com.example.csmore;
}