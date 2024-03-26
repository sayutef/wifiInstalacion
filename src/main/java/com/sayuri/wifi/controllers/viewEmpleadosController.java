package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Administrador;
import com.sayuri.wifi.models.Persona;
import com.sayuri.wifi.models.Tecnico;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class viewEmpleadosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonSee;

    @FXML
    private TableView<Persona> tableView;

    @FXML
    private TableColumn<Persona, String> c1table;

    @FXML
    private TableColumn<Persona, String> c2table;

    @FXML
    private TableColumn<Persona, String> c3table;

    @FXML
    void bttonReturn(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonSee(MouseEvent event) {
        Administrador admin = HelloApplication.getAdmin();
        tableView.getItems().clear();
        for (Persona usuario : admin.getListPersona()) {
            if (usuario instanceof Tecnico) {
                tableView.getItems().add(usuario);
            }
        }
    }

    @FXML
    void initialize() {
        c1table.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        c2table.setCellValueFactory(new PropertyValueFactory<>("Apellido"));
        c3table.setCellValueFactory(new PropertyValueFactory<>("Telefono"));
    }
}
