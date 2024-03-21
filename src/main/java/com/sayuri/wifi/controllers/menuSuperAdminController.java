package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class menuSuperAdminController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonAddTec;

    @FXML
    private Button bttonDelateTec;

    @FXML
    private Button bttonDelatePaquete;

    @FXML
    private Button bttonSeePaquete;

    @FXML
    private Button bttonSeeTecnicos;

    @FXML
    private Button bttonAddPaquete;

    @FXML
    private Button bttonSeeUser;

    @FXML
    private Button bttonDelateUser;

    @FXML
    private Button bttonAddUser;

    @FXML
    private Button bttonDelateProductos;

    @FXML
    private Button bttonAddProductos;

    @FXML
    private Button bttonSeeProduct;

    @FXML
    private Button bttonSalir;

    @FXML
    void bttonAddPaquete(MouseEvent event) {
        HelloApplication.newStage("agregarPaquetes", "Agregar Paquetes");
    }

    @FXML
    void bttonAddProductos(MouseEvent event) {

    }

    @FXML
    void bttonAddTec(MouseEvent event) {
        HelloApplication.newStage("agregarTecnicos","Agregar Tecnico");
    }

    @FXML
    void bttonAddUser(MouseEvent event) {
       HelloApplication.newStage("agregarUsuario","Agregar Usuario");
    }

    @FXML
    void bttonDelatePaquete(MouseEvent event) {
     ;
    }

    @FXML
    void bttonDelateProductos(MouseEvent event) {
        ;
    }

    @FXML
    void bttonDelateTec(MouseEvent event) {
       ;
    }

    @FXML
    void bttonDelateUser(MouseEvent event) {
        ;
    }

    @FXML
    void bttonSalir(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonSeePaquete(MouseEvent event) {
       ;
    }

    @FXML
    void bttonSeeProduct(MouseEvent event) {
        ;
    }

    @FXML
    void bttonSeeTecnicos(MouseEvent event) {
       ;
    }

    @FXML
    void bttonSeeUser(MouseEvent event) {
        ;
    }

    @FXML
    void initialize() {
    }
}
