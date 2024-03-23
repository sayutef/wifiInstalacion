package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

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
        HelloApplication.newStage("agregarProductos", "Agregar Producto");
    }

    @FXML
    void bttonAddUsuario(MouseEvent event) {
        HelloApplication.newStage("agregrarUsuario", "Agregar Usuario");
    }

    @FXML
    void bttonComprobante(MouseEvent event) {
        HelloApplication.newStage("agregarComprobante", "Agregar Comprobante");
    }

    @FXML
    void bttonDelateProducto(MouseEvent event) {
        HelloApplication.newStage("eliminarProductos", "Eliminar Productos");
    }

    @FXML
    void bttonDelateReporte(MouseEvent event) {

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

    }

    @FXML
    void bttonSeeTecnicos(MouseEvent event) {
        HelloApplication.newStage("verEmpleados", "Ver Empleados");
    }

    @FXML
    void bttonSeeUserOrProduct(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert bttonSeeTecnicos != null : "fx:id=\"bttonSeeTecnicos\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonAddProducto != null : "fx:id=\"bttonAddProducto\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonDelateProducto != null : "fx:id=\"bttonDelateProducto\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonImprimirComprobante != null : "fx:id=\"bttonImprimirComprobante\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonComprobante != null : "fx:id=\"bttonComprobante\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonSeeUserOrProduct != null : "fx:id=\"bttonSeeUserOrProduct\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonAddUsuario != null : "fx:id=\"bttonAddUsuario\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonDeleteUser != null : "fx:id=\"bttonDeleteUser\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonDelateReporte != null : "fx:id=\"bttonDelateReporte\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonSalir != null : "fx:id=\"bttonSalir\" was not injected: check your FXML file 'menuAdmin.fxml'.";

    }
}