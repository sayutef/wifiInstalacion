package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class removerComprobanteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textDetelName;

    @FXML
    private Button bttonDetel;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonVer;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> c1Table;

    @FXML
    private TableColumn<?, ?> c2Table;

    @FXML
    private TableColumn<?, ?> c3Table;

    @FXML
    private TableColumn<?, ?> c4Table;

    @FXML
    private TableColumn<?, ?> c5Table;

    @FXML
    void bttonDetel(MouseEvent event) {

    }

    @FXML
    void bttonReturn(MouseEvent event) {

    }

    @FXML
    void bttonVer(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert textDetelName != null : "fx:id=\"textDetelName\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert bttonDetel != null : "fx:id=\"bttonDetel\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert bttonReturn != null : "fx:id=\"bttonReturn\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert bttonVer != null : "fx:id=\"bttonVer\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert c1Table != null : "fx:id=\"c1Table\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert c2Table != null : "fx:id=\"c2Table\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert c3Table != null : "fx:id=\"c3Table\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert c4Table != null : "fx:id=\"c4Table\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";
        assert c5Table != null : "fx:id=\"c5Table\" was not injected: check your FXML file 'eliminarComprobante.fxml'.";

    }
}
