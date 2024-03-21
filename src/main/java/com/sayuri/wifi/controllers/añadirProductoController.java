package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class añadirProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> comboProductAdd;

    @FXML
    private TextField textCostoProduct;

    @FXML
    private TextField textDescripcionProduct;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttonReturn;

    @FXML
    void bttonAdd(MouseEvent event) {

    }

    @FXML
    void bttonReturn(MouseEvent event) {

    }

    @FXML
    void initialize() {
        comboProductAdd.getItems().addAll("LitebeamM5", "Maastil","Modem");
    }
}