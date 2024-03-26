package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;
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

    }

    @FXML
    void bttonSeeUser(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert bttonSeeUser != null : "fx:id=\"bttonSeeUser\" was not injected: check your FXML file 'opcionUserOrProduct.fxml'.";
        assert bttonSeeProduct != null : "fx:id=\"bttonSeeProduct\" was not injected: check your FXML file 'opcionUserOrProduct.fxml'.";

    }
}