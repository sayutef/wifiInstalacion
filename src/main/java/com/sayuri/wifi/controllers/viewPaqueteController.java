package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Administrador;
import com.sayuri.wifi.models.Paquete;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class viewPaqueteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonVeer;
    @FXML
    private TableView<Paquete> tableView;

    @FXML
    private TableColumn<Paquete, String> c1table;

    @FXML
    private TableColumn<Paquete, Integer> c2table;

    @FXML
    private TableColumn<Paquete, String> c3table;

    @FXML
    void bttonReturn(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonVeer(MouseEvent event) {
        Administrador admin = HelloApplication.getAdmin();
        tableView.getItems().clear();
        tableView.getItems().addAll(admin.getListPaquetes());
    }

    @FXML
    void initialize() {
        c1table.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        c2table.setCellValueFactory(new PropertyValueFactory<>("Costo"));
        c3table.setCellValueFactory(new PropertyValueFactory<>("Descripcion"));

    }
}
