package com.sayuri.wifi.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Admin;
import com.sayuri.wifi.models.SuperAdmin;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> comboxUsuario;

    @FXML
    private TextField textFieldUsuario;

    @FXML
    private PasswordField textFieldPwd;

    @FXML
    private Button bttonSalir;

    @FXML
    private Button bttonIniciar;

    @FXML
    void bttonIniciar(MouseEvent event) {
        String usuario = textFieldUsuario.getText();
        String contraseña = textFieldPwd.getText();

        if (comboxUsuario.getValue() != null) {
            switch (comboxUsuario.getValue()) {
                case "Admin":
                    Admin admin = new Admin();
                    if (usuario.equals(admin.getUser()) && contraseña.equals(admin.getContraseña())) {
                        HelloApplication.newStage("menuAdmin", "Menú Admin");
                    } else {
                        mostrarAlerta("Error", "No se pudo iniciar sesión", "Usuario o contraseña incorrecta", Alert.AlertType.ERROR);
                    }
                    break;
                case "SuperAdmin":
                    SuperAdmin superAdmin = new SuperAdmin();
                    if (usuario.equals(superAdmin.getUser()) && contraseña.equals(superAdmin.getContraseña())) {
                        HelloApplication.newStage("menuSuperAdmin", "Menú SuperAdmin");
                    } else {
                        mostrarAlerta("Error", "No se pudo iniciar sesión", "Usuario o contraseña incorrecta", Alert.AlertType.ERROR);
                    }
                    break;
                default:
                    break;
            }
        } else {
            mostrarAlerta("Error", "No se ha seleccionado ningún usuario", "Seleccione un usuario", Alert.AlertType.ERROR);
        }
    }

    @FXML
    void bttonSalir() {

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
        comboxUsuario.getItems().addAll("Admin", "SuperAdmin");
    }
}
