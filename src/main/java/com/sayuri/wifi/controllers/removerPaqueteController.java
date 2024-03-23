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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class removerPaqueteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textDetelName;

    @FXML
    private Button bttonDetel;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonVer;

    @FXML
    private TableView<String> tableView;

    @FXML
    private TableColumn<Paquete, Integer> c1Table;

    @FXML
    private TableColumn<Paquete, String> c2Table;

    @FXML
    private TableColumn<Paquete, String> c3Table;


    @FXML
    void bttonDetel(MouseEvent event) {
        String nombre = textDetelName.getText();
        Administrador admin = HelloApplication.getAdmin();
        admin.eliminarPaquete(nombre);
    }

    @FXML
    void bttonReturn(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonVer(MouseEvent event) {
        Administrador admin = HelloApplication.getAdmin();
        tableView.getItems().addAll(admin.toString());
    }

    @FXML
    void initialize() {
        c1Table.setCellValueFactory(new PropertyValueFactory<>("Costo"));
        c2Table.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        c3Table.setCellValueFactory(new PropertyValueFactory<>("Descripcion"));
    }
}