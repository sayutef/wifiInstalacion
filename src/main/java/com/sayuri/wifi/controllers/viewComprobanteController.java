package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Administrador;
import com.sayuri.wifi.models.Comprobante;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class viewComprobanteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listViewComprobante;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonSeeComprobante;

    @FXML
    void bttonReturn(MouseEvent event) {

    }

    @FXML
    void bttonSeeComprobante(MouseEvent event) {
        Administrador comprobante = HelloApplication.getAdmin();
        for (Comprobante comprobante1 : comprobante.getListComprobante()){
            listViewComprobante.getItems().add(comprobante1.toString());
        }
    }

    @FXML
    void initialize() {
        assert listViewComprobante != null : "fx:id=\"listViewComprobante\" was not injected: check your FXML file 'verComprobante.fxml'.";
        assert bttonReturn != null : "fx:id=\"bttonReturn\" was not injected: check your FXML file 'verComprobante.fxml'.";
        assert bttonSeeComprobante != null : "fx:id=\"bttonSeeComprobante\" was not injected: check your FXML file 'verComprobante.fxml'.";

    }
}
