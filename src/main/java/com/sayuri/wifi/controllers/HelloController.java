package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> comboxUsuario;

    @FXML
    private TextField textFieldUsuario;

    @FXML
    private PasswordField textFieldPwd;

    @FXML
    private Button bttonSalir;

    @FXML
    private Button bttonIniciar;

    @FXML
    void bttonIniciar(MouseEvent event) {

    }

    @FXML
    void bttonSalir(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert comboxUsuario != null : "fx:id=\"comboxUsuario\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert textFieldUsuario != null : "fx:id=\"textFieldUsuario\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert textFieldPwd != null : "fx:id=\"textFieldPwd\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert bttonSalir != null : "fx:id=\"bttonSalir\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert bttonIniciar != null : "fx:id=\"bttonIniciar\" was not injected: check your FXML file 'hello-view.fxml'.";

    }
}
