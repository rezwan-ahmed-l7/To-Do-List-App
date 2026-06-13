module com.todolist {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.todolist to javafx.fxml;
    exports com.todolist;
}
