module learning.exercise.coursecontent {
    requires javafx.controls;
    requires javafx.fxml;


    opens src.exercise.coursecontent to javafx.fxml;
    exports src.exercise.coursecontent;
}