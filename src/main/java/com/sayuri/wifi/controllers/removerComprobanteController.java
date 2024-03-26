package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class removerComprobanteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textDeleteUser;

    @FXML
    private TextField textDetelPaquete;

    @FXML
    private Button bttonDetel;

    @FXML
    private Button bttonReturn;

    @FXML
    void bttonDetel(MouseEvent event) {

    }

    @FXML
    void bttonReturn(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert textDeleteUser != null : "fx:id=\"textDeleteUser\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert textDetelPaquete != null : "fx:id=\"textDetelPaquete\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert bttonDetel != null : "fx:id=\"bttonDetel\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert bttonReturn != null : "fx:id=\"bttonReturn\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";

    }
}