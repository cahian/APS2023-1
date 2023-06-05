module com.unip.aps {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.unip.aps.view to javafx.graphics;
    opens com.unip.aps to javafx.fxml;
    exports com.unip.aps;
}