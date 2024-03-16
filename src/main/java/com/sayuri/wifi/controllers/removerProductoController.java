package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class removerProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textDetelName;

    @FXML
    private TextField textDetelCost;

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
        assert textDetelName != null : "fx:id=\"textDetelName\" was not injected: check your FXML file 'eliminarProductos.fxml'.";
        assert textDetelCost != null : "fx:id=\"textDetelCost\" was not injected: check your FXML file 'eliminarProductos.fxml'.";
        assert bttonDetel != null : "fx:id=\"bttonDetel\" was not injected: check your FXML file 'eliminarProductos.fxml'.";
        assert bttonReturn != null : "fx:id=\"bttonReturn\" was not injected: check your FXML file 'eliminarProductos.fxml'.";

    }
}