package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class opcionUserOrProductController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonSeeUser;

    @FXML
    private Button bttonSeeProduct;

    @FXML
    void bttonSeeProduct(MouseEvent event) {
        HelloApplication.newStage("verProductos", "Ver Productos");
    }

    @FXML
    void bttonSeeUser(MouseEvent event) {
        HelloApplication.newStage("verUsuario", "Ver Usuario");
    }

    @FXML
    void initialize() {
        assert bttonSeeUser != null : "fx:id=\"bttonSeeUser\" was not injected: check your FXML file 'opcionUserOrProduct.fxml'.";
        assert bttonSeeProduct != null : "fx:id=\"bttonSeeProduct\" was not injected: check your FXML file 'opcionUserOrProduct.fxml'.";

    }
}