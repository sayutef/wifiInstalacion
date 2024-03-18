package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Administrador;
import com.sayuri.wifi.models.Persona;
import com.sayuri.wifi.models.Tecnico;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class viewEmpleadosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listViewEmpleado;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonSee;

    @FXML
    void bttonReturn(MouseEvent event) {

    }

    @FXML
    void bttonSee(MouseEvent event) {
        Administrador tecnicos = HelloApplication.getAdmin();
        for (Persona imprimir : tecnicos.getListPersona()){
            listViewEmpleado.getItems().add(imprimir.toString());
        }
    }

    @FXML
    void initialize() {

    }
}