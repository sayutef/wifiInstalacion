package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Administrador;
import com.sayuri.wifi.models.Persona;
import com.sayuri.wifi.models.Tecnico;
import com.sayuri.wifi.models.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class viewUsuarioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonVerUser;

    @FXML
    private TableView<Persona> tableView;

    @FXML
    private TableColumn<Persona, String> c1Table;

    @FXML
    private TableColumn<Persona, String> c2Table;

    @FXML
    private TableColumn<Persona, String> c3Table;

    @FXML
    void bttonReturn(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonVerUser(MouseEvent event) {
        Administrador admin = HelloApplication.getAdmin();
        tableView.getItems().clear();
        for (Persona usuario : admin.getListPersona()) {
            if (usuario instanceof Usuario) {
                tableView.getItems().add(usuario);
            }
        }
    }

    @FXML
    void initialize() {
        c1Table.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        c2Table.setCellValueFactory(new PropertyValueFactory<>("Apellido"));
        c3Table.setCellValueFactory(new PropertyValueFactory<>("Direccion"));
    }
}
