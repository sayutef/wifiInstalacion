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

        switch (comboxUsuario.getValue()) {
            case "Admin":
                Admin admin = new Admin();
                if (usuario.equals(admin.getUser()) && contraseña.equals(admin.getContraseña())) {
                    HelloApplication.newStage("menuAdmin", "Menú Admin");
                }
                break;
            case "SuperAdmin":
                SuperAdmin superAdmin = new SuperAdmin();
                if (usuario.equals(superAdmin.getUser()) && contraseña.equals(superAdmin.getContraseña())) {
                    HelloApplication.newStage("menuSuperAdmin", "Menú Admin");
                }
                break;
            default:
                break;
        }

    }

    @FXML
    void bttonSalir(MouseEvent event) {

    }

    @FXML
    void initialize() {
        comboxUsuario.getItems().addAll("Admin", "SuperAdmin");
    }
}
