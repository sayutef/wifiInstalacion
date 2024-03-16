package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class añadirUsuarioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textNameUser;

    @FXML
    private TextField textApellido;

    @FXML
    private TextField textDireccion;

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
        assert textNameUser != null : "fx:id=\"textNameUser\" was not injected: check your FXML file 'agregarUsuario.fxml'.";
        assert textApellido != null : "fx:id=\"textApellido\" was not injected: check your FXML file 'agregarUsuario.fxml'.";
        assert textDireccion != null : "fx:id=\"textDireccion\" was not injected: check your FXML file 'agregarUsuario.fxml'.";
        assert bttonAdd != null : "fx:id=\"bttonAdd\" was not injected: check your FXML file 'agregarUsuario.fxml'.";
        assert bttonReturn != null : "fx:id=\"bttonReturn\" was not injected: check your FXML file 'agregarUsuario.fxml'.";

    }
}