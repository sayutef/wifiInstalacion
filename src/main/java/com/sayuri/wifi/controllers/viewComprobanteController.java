package com.sayuri.wifi.controllers;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Administrador;
import com.sayuri.wifi.models.Comprobante;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class viewComprobanteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonVerUser;

    @FXML
    private TableView<Comprobante> tableView;

    @FXML
    private TableColumn<Comprobante, String> c1Table;

    @FXML
    private TableColumn<Comprobante, String> c2Table;

    @FXML
    private TableColumn<Comprobante, String> c3Table;

    @FXML
    private TableColumn<Comprobante, String> c4Table1;

    @FXML
    private TableColumn<Comprobante,String> c5Table1;

    @FXML
    void bttonReturn(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonVerUser(MouseEvent event) {
        Administrador comprobante = HelloApplication.getAdmin();
        tableView.getItems().clear();
        tableView.getItems().addAll(comprobante.getListComprobante());
    }

    @FXML
    void initialize() {
        c1Table.setCellValueFactory(new PropertyValueFactory<>("NombreUsuario"));
        c2Table.setCellValueFactory(new  PropertyValueFactory<>("NombrePaquete"));
        c3Table.setCellValueFactory(new PropertyValueFactory<>("TotalPago"));
        c4Table1.setCellValueFactory(new PropertyValueFactory<>("Fecha"));
        c5Table1.setCellValueFactory(new PropertyValueFactory<>("NoTicket"));
    }
}
