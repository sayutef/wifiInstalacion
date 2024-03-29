package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class añadirUsuarioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textNameUser;

    @FXML
    private TextField textApellidoUser;

    @FXML
    private TextField textDireccion;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttonVolver;

    @FXML
    void bttonAdd(MouseEvent event) {
        try {
            String nombreUser = textNameUser.getText();
            String apellidoUser = textApellidoUser.getText();
            String direccion  = textDireccion.getText();
            if (nombreUser.isEmpty() || apellidoUser.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }
            Usuario user = new Usuario(nombreUser, apellidoUser, direccion);
            HelloApplication.getAdmin().addPersona(user);

            System.out.println("Nombre : [" + user.getNombre() + "]");
            System.out.println("Apellido : [" + user.getApellido() + "]");
            System.out.println("Dirección : [" + user.getDireccion() + "]");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos introducidos en el formulario...");
            alert.setHeaderText("Ha introducido correctamente los " +
                    "datos en el formulario. Se muestran a continuación.");
            alert.setContentText(user.toString());

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
        assert textNameUser != null : "fx:id=\"textNameUser\" was not injected: check your FXML file 'agregarUsuarios.fxml'.";
        assert textApellidoUser != null : "fx:id=\"textApellidoUser\" was not injected: check your FXML file 'agregarUsuarios.fxml'.";
        assert textDireccion != null : "fx:id=\"textDireccion\" was not injected: check your FXML file 'agregarUsuarios.fxml'.";
        assert bttonAdd != null : "fx:id=\"bttonAdd\" was not injected: check your FXML file 'agregarUsuarios.fxml'.";
        assert bttonVolver != null : "fx:id=\"bttonVolver\" was not injected: check your FXML file 'agregarUsuarios.fxml'.";

    }
}
