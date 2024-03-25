package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Administrador;
import com.sayuri.wifi.models.Persona;
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
    private ListView<String> ListView;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonVerUser;

    @FXML
    void bttonReturn(MouseEvent event) {

    }

    @FXML
    void bttonVerUser(MouseEvent event) {
        Administrador user = HelloApplication.getAdmin();
        for (Persona imprimir : user.getListPersona()){
            ListView.getItems().add(imprimir.toString());
        }
    }

    @FXML
    void initialize() {

    }
}
