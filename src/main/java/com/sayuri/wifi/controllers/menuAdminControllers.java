package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

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
    private Button bttonImprimir;

    @FXML
    private Button bttonComprobante;

    @FXML
    private Button bttonSeeUser;

    @FXML
    private Button bttonSeeOrdenes;

    @FXML
    private Button bttonGenerarReporte;

    @FXML
    private Button bttonDelateReporte;

    @FXML
    private Button bttonSalir;
    @FXML private AnchorPane panel;

    @FXML
    void bttonComprobante(MouseEvent event) {
        HelloApplication.newStage("agregarComprobante-view","Menú Comprobante");
    }

    @FXML
    void bttonDelateProducto(MouseEvent event) {
        HelloApplication.newStage("eliminarProducto","Eliminar Producto");
    }

    @FXML
    void bttonDelateReporte(MouseEvent event) {

    }
    public void bttonAdd(MouseEvent mouseEvent) {
    }

    @FXML
    void bttonGenerarReporte(MouseEvent event) {

    }

    @FXML
    void bttonImprimir(MouseEvent event) {

    }

    @FXML
    void bttonSalir(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonSeeOrdenes(MouseEvent event) {

    }

    @FXML
    void bttonSeeTecnicos(MouseEvent event) {
        HelloApplication.newStage("verEmpleados","Menú Ver Empleados.");
    }

    @FXML
    void bttonSeeUser(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert bttonSeeTecnicos != null : "fx:id=\"bttonSeeTecnicos\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonAddProducto != null : "fx:id=\"bttonAddProducto\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonDelateProducto != null : "fx:id=\"bttonDelateProducto\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonImprimir != null : "fx:id=\"bttonImprimir\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonComprobante != null : "fx:id=\"bttonComprobante\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonSeeUser != null : "fx:id=\"bttonSeeUser\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonSeeOrdenes != null : "fx:id=\"bttonSeeOrdenes\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonGenerarReporte != null : "fx:id=\"bttonGenerarReporte\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonDelateReporte != null : "fx:id=\"bttonDelateReporte\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bttonSalir != null : "fx:id=\"bttonSalir\" was not injected: check your FXML file 'menuAdmin.fxml'.";

    }


}
