module com.example.tabla {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.tabla to javafx.fxml;
    exports com.example.tabla;
}