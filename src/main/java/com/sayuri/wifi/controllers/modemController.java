package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Mastil;
import com.sayuri.wifi.models.Modem;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class modemController {

    @FXML
    private TextField textModem;

    @FXML
    private TextField textCosto;

    @FXML
    private TextField textVelocidad;

    @FXML
    private TextField textTypeModem;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttonReturn;

    @FXML
    void bttonAdd(MouseEvent event) {
        try {
            String nombre = textModem.getText();
            int costo = Integer.parseInt(textCosto.getText());
            int velocidad = Integer.parseInt(textVelocidad.getText());
            String tipoModem = textTypeModem.getText();

            Modem modem = new Modem(nombre, costo, velocidad, tipoModem);
            HelloApplication.getAdmin().addProduct(modem);
            mostrarAlerta("Información", "Producto agregado", "Se ha agregado el producto exitosamente.", Alert.AlertType.INFORMATION);
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "Error al ingresar datos numéricos", "Ingrese datos numéricos válidos.", Alert.AlertType.ERROR);
        } catch (IllegalArgumentException e) {
            mostrarAlerta("Error", "Faltan datos en el formulario", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @FXML
    void bttonReturn(MouseEvent event) {
        HelloApplication.getStageView().close();
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
    }
}