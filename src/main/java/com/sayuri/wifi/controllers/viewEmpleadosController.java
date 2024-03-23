package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class viewEmpleadosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<?> listViewEmpleado;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonSee;

    @FXML
    void bttonReturn(MouseEvent event) {

    }

    @FXML
    void bttonSee(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert listViewEmpleado != null : "fx:id=\"listViewEmpleado\" was not injected: check your FXML file 'verEmpleados.fxml'.";
        assert bttonReturn != null : "fx:id=\"bttonReturn\" was not injected: check your FXML file 'verEmpleados.fxml'.";
        assert bttonSee != null : "fx:id=\"bttonSee\" was not injected: check your FXML file 'verEmpleados.fxml'.";

    }
}