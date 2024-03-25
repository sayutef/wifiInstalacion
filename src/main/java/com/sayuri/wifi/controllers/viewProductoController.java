package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class viewProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listViewProduct;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonSeeProduct;

    @FXML
    void bttonReturn(MouseEvent event) {

    }

    @FXML
    void bttonSeeProduct(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert listViewProduct != null : "fx:id=\"listViewProduct\" was not injected: check your FXML file 'verProductos.fxml'.";
        assert bttonReturn != null : "fx:id=\"bttonReturn\" was not injected: check your FXML file 'verProductos.fxml'.";
        assert bttonSeeProduct != null : "fx:id=\"bttonSeeProduct\" was not injected: check your FXML file 'verProductos.fxml'.";

    }
}