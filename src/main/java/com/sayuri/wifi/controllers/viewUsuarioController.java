package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Administrador;
import com.sayuri.wifi.models.Persona;
import com.sayuri.wifi.models.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class viewUsuarioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listViewUser;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonSeeUser;

    @FXML
    void bttonReturn(MouseEvent event) {

    }

    @FXML
    void bttonSeeUser(MouseEvent event) {
        Administrador usuario = HelloApplication.getAdmin();
        for (Persona usuario1 : usuario.getListPersona()){
            listViewUser.getItems().add(usuario1.toString());
        }
    }

    @FXML
    void initialize() {
        assert listViewUser != null : "fx:id=\"listViewUser\" was not injected: check your FXML file 'verUsuario.fxml'.";
        assert bttonReturn != null : "fx:id=\"bttonReturn\" was not injected: check your FXML file 'verUsuario.fxml'.";
        assert bttonSeeUser != null : "fx:id=\"bttonSeeUser\" was not injected: check your FXML file 'verUsuario.fxml'.";

    }
}