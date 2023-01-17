module com.example.w23comp1008cardexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w23comp1008cardexample to javafx.fxml;
    exports com.example.w23comp1008cardexample;
}