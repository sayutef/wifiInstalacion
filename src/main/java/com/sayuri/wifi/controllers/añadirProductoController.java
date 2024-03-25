package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
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
    private Button bttonVolver;

    @FXML
    void bttonAdd(MouseEvent event) {
        Producto producto = null;
        switch (comboProductAdd.getValue()){
            case "LitebeamM5":
                HelloApplication.newStage("litebeamM5View","Agregar Producto");
                break;
            case "Mastil":
                HelloApplication.newStage("mastilView","Agregar Producto");
                break;
            case "Modem":
                HelloApplication.newStage("modemView","Agregar Producto");
                break;
        }
    }
    @FXML
    void bttonVolver(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        comboProductAdd.getItems().addAll("LitebeamM5", "Mastil","Modem");
    }
}





