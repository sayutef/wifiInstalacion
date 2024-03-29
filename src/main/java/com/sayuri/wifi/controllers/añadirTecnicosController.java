package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Tecnico;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class añadirTecnicosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textNameTecnico;

    @FXML
    private TextField textApellido;

    @FXML
    private TextField textTelefono;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttonReturn;

    @FXML
    void bttonAdd(MouseEvent event) {
        try {
            String nombreTecnico = textNameTecnico.getText();
            String apellidoTecnico = textApellido.getText();
            String numTelefonoTecnico = textTelefono.getText();
            if (nombreTecnico.isEmpty() || apellidoTecnico.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }
            Tecnico tecnico = new Tecnico(nombreTecnico, apellidoTecnico, numTelefonoTecnico);
            HelloApplication.getAdmin().addPersona(tecnico);

            System.out.println("Nombre : [" + tecnico.getNombre() + "]");
            System.out.println("Apellido : [" + tecnico.getApellido() + "]");
            System.out.println("Numero de telefono : [" + tecnico.getTelefono() + "]");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos introducidos en el formulario...");
            alert.setHeaderText("Ha introducido correctamente los " +
                    "datos en el formulario. Se muestran a continuación.");
            alert.setContentText(tecnico.toString());

            alert.showAndWait();
        }catch (IllegalArgumentException e){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Faltan datos...");
            alert.setHeaderText(e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    void bttonVolver(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        assert textNameTecnico != null : "fx:id=\"textNameTecnico\" was not injected: check your FXML file 'agregarTecnicos.fxml'.";
        assert textApellido != null : "fx:id=\"textApellido\" was not injected: check your FXML file 'agregarTecnicos.fxml'.";
        assert textTelefono != null : "fx:id=\"textTelefono\" was not injected: check your FXML file 'agregarTecnicos.fxml'.";
        assert bttonAdd != null : "fx:id=\"bttonAdd\" was not injected: check your FXML file 'agregarTecnicos.fxml'.";
        assert bttonReturn != null : "fx:id=\"bttonReturn\" was not injected: check your FXML file 'agregarTecnicos.fxml'.";

    }
}

