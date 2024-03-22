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
        HelloApplication.newStage("agregarProductos","Agregar Producto");
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
     HelloApplication.newStage("eliminarPaquetes","Eliminar Usuarios");
    }

    @FXML
    void bttonDelateProductos(MouseEvent event) {
        HelloApplication.newStage("eliminarProductos","Eliminar Productos");
    }

    @FXML
    void bttonDelateTec(MouseEvent event) {
       HelloApplication.newStage("eliminarTecnicos","Eliminar Tecnicos");
    }

    @FXML
    void bttonDelateUser(MouseEvent event) {
        HelloApplication.newStage("eliminarUsuario","Eliminar Usuarios");
    }

    @FXML
    void bttonSalir(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonSeePaquete(MouseEvent event) {
       HelloApplication.newStage("verPaquetesWifi","Ver Paquetes");
    }

    @FXML
    void bttonSeeProduct(MouseEvent event) {
        HelloApplication.newStage("verProductos","Ver Productos");
    }

    @FXML
    void bttonSeeTecnicos(MouseEvent event) {
        HelloApplication.newStage("verEmpleados","Ver Empleados");
    }

    @FXML
    void bttonSeeUser(MouseEvent event) {
        HelloApplication.newStage("verUsuario","Ver Usuarios");
    }

    @FXML
    void initialize() {
    }
}
