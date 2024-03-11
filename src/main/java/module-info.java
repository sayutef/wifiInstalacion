module com.sayuri.wifi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sayuri.wifi to javafx.fxml;
    exports com.sayuri.wifi;
    exports com.sayuri.wifi.controllers;
    opens com.sayuri.wifi.controllers to javafx.fxml;
}