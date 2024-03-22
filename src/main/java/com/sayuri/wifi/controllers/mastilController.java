package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Mastil;
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

public class mastilController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textMastil;

    @FXML
    private TextField textCostoMastil;

    @FXML
    private TextField textMaterialMastil;

    @FXML
    private TextField textAlturaMastil;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttonReturn;

    @FXML
    void bttonAdd(MouseEvent event) {
        try {
            String mastil = textMastil.getText();
            int costo = Integer.parseInt(textCostoMastil.getText());
            String material = textMaterialMastil.getText();
            int altura = Integer.parseInt(textAlturaMastil.getText());

            Mastil mastil1 = new Mastil(mastil,costo,material,altura);
            HelloApplication.getAdmin().addProduct(mastil1);
            mostrarAlerta("Información", "Producto agregado", "Se ha agregado el producto exitosamente.", Alert.AlertType.INFORMATION);
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "Error al ingresar datos numéricos", "Ingrese datos numéricos válidos.", Alert.AlertType.ERROR);
        } catch (IllegalArgumentException e) {
            mostrarAlerta("Error", "Faltan datos en el formulario", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void mostrarAlerta(String titulo, String encabezado, String contenido, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(encabezado);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    @FXML
    void bttonReturn(MouseEvent event) {
    }

    @FXML
    void initialize() {
    }
}
