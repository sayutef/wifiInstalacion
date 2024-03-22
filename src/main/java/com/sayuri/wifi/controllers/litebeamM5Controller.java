package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.LitebeamM5;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class litebeamM5Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textName;

    @FXML
    private TextField textCosto;

    @FXML
    private TextField textTipoConexion;

    @FXML
    private TextField textPotencia;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttonReturn;

    @FXML
    void bttonAdd(MouseEvent event) {
        try {
            String nombre = textName.getText();
            String costoText = textCosto.getText();
            String conexion = textTipoConexion.getText();
            String potencia = textPotencia.getText();

            if (nombre.isEmpty() || costoText.isEmpty() || conexion.isEmpty() || potencia.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }

            int costo;
            if (!costoText.trim().isEmpty()) {
                costo = Integer.parseInt(costoText);
            } else {
                throw new NumberFormatException("El campo costo no puede estar vacío.");
            }

            LitebeamM5 litebeamM5 = new LitebeamM5(nombre, costo, conexion, potencia);
            HelloApplication.getAdmin().addProduct(litebeamM5);
            mostrarAlerta("Información", "Producto agregado", "Se ha agregado el producto exitosamente.", Alert.AlertType.INFORMATION);
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "Error al ingresar datos numéricos", "Ingrese datos numéricos válidos.", Alert.AlertType.ERROR);
        } catch (IllegalArgumentException e) {
            mostrarAlerta("Error", "Faltan datos en el formulario", e.getMessage(), Alert.AlertType.ERROR);
        }
    }
    @FXML
    void bttonReturn(MouseEvent event) {
    }

    private void mostrarAlerta(String titulo, String encabezado, String contenido, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(encabezado);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    @FXML
    void initialize() {
        System.out.println("Controlador inicializado.");
    }
}
