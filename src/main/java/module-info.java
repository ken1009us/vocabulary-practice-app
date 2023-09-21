module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vocabularyapp to javafx.fxml;
    exports com.vocabularyapp;
}