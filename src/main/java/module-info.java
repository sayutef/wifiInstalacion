module com.sayuri.wifi {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;


    opens com.sayuri.wifi to javafx.fxml;
    exports com.sayuri.wifi;
    exports com.sayuri.wifi.controllers;
    exports  com.sayuri.wifi.models;
    opens com.sayuri.wifi.controllers to javafx.fxml;
}