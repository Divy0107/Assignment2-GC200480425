module com.example.assignment2gc200480425 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.example.assignment2gc200480425 to javafx.fxml,com.google.gson;
    exports com.example.assignment2gc200480425;
}