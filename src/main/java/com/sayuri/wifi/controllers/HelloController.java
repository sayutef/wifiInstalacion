package com.sayuri.wifi.controllers;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Admin;
import com.sayuri.wifi.models.SuperAdmin;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private ComboBox<String> comboxUsuario;

    @FXML
    private TextField textFieldUsuario;

    @FXML
    private PasswordField textFieldPwd;

    @FXML
    void bttonIniciar(MouseEvent event) {
        if (comboxUsuario.getValue() != null) {
            String usuario = textFieldUsuario.getText();
            String contraseña = textFieldPwd.getText();

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
    void initialize() {
        comboxUsuario.getItems().addAll("Admin", "SuperAdmin");
    }

    public void bttonSalir(MouseEvent mouseEvent) {
    }
}
