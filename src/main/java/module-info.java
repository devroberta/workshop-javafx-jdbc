module com.devroberta.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.devroberta.workshopjavafxjdbc to javafx.fxml;
    exports com.devroberta.workshopjavafxjdbc;
    exports com.devroberta.workshopjavafxjdbc.util;
    opens com.devroberta.workshopjavafxjdbc.util to javafx.fxml;
}