module com.pmhau.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.pmhau.quizapp to javafx.fxml;
    exports com.pmhau.quizapp;
}
