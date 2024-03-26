package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import com.sayuri.wifi.models.Usuario;
import com.sayuri.wifi.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class menuAdminControllers {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonSeeTecnicos;

    @FXML
    private Button bttonAddProducto;

    @FXML
    private Button bttonDelateProducto;

    @FXML
    private Button bttonImprimirComprobante;

    @FXML
    private Button bttonComprobante;

    @FXML
    private Button bttonSeeUserOrProduct;

    @FXML
    private Button bttonAddUsuario;

    @FXML
    private Button bttonDeleteUser;

    @FXML
    private Button bttonDelateReporte;

    @FXML
    private Button bttonSalir;

    @FXML
    void bttonAddProducto(MouseEvent event) {
        HelloApplication.newStage("agregarProductos", "Agregar Productos");
    }

    @FXML
    void bttonAddUsuario(MouseEvent event) {
        HelloApplication.newStage("agregarUsuarios","Agregar Usuarios");
    }

    @FXML
    void bttonComprobante(MouseEvent event) {
        HelloApplication.newStage("agregarComprobante-view", "Agregar Comprobante");
    }

    @FXML
    void bttonDelateProducto(MouseEvent event) {
        HelloApplication.newStage("eliminarProductos", "Eliminar Productos");
    }

    @FXML
    void bttonDelateReporte(MouseEvent event) {
        HelloApplication.newStage("eliminarComprobante", "Eliminar Comprobante");
    }

    @FXML
    void bttonDeleteUser(MouseEvent event) {
        HelloApplication.newStage("eliminarUsuario", "Eliminar Usuario");
    }

    @FXML
    void bttonImprimirComprobante(MouseEvent event) {
        HelloApplication.newStage("verComprobante", "Ver Comprobante");
    }

    @FXML
    void bttonSalir(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonSeeTecnicos(MouseEvent event) {
        HelloApplication.newStage("verEmpleados", "Ver Empleados");
    }

    @FXML
    void bttonSeeUserOrProduct(MouseEvent event) {
        HelloApplication.newStage("opcionUserOrProduct", "Opcion User Or Product");
    }

    @FXML
    void initialize() {
    }
}