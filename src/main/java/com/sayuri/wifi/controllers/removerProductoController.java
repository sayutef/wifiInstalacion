package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

public class removerProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonDetel;

    @FXML
    private Button bttonReturn;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    void bttonDetel(MouseEvent event) {
        Producto producto = null;
        switch (comboBox.getValue()){
            case "LitebeamM5":
                HelloApplication.newStage("eliminarLitebeam","Agregar Producto");
                break;
            case "Mastil":
                HelloApplication.newStage("eliminarMastil","Agregar Producto");
                break;
            case "Modem":
                HelloApplication.newStage("eliminarModem","Agregar Producto");
                break;
        }

    }
    @FXML
    void bttonReturn(MouseEvent event) {

    }

    @FXML
    void initialize() {
        comboBox.getItems().addAll("LitebeamM5", "Mastil","Modem");
    }
}
