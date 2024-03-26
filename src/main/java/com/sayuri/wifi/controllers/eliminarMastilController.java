package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Administrador;
import com.sayuri.wifi.models.LitebeamM5;
import com.sayuri.wifi.models.Mastil;
import com.sayuri.wifi.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class eliminarMastilController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Producto> tableView;

    @FXML
    private TableColumn<Producto, String> c1Table;

    @FXML
    private TableColumn<Producto, Integer> c2Table;

    @FXML
    private TableColumn<Producto, String> c3Table;

    @FXML
    private TableColumn<Producto, Integer> c4Table;

    @FXML
    private Button bttonEliminar;

    @FXML
    private Button bttonVer;

    @FXML
    private Button bttonCancel;

    @FXML
    private TextField textFieldEliminar;

    @FXML
    void bttonCancel(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonEliminar(MouseEvent event) {
        String nombre = textFieldEliminar.getText();
        Administrador admin = HelloApplication.getAdmin();
        admin.eliminarProducto(nombre);
    }

    @FXML
    void bttonVer(MouseEvent event) {
        Administrador admin = HelloApplication.getAdmin();
        tableView.getItems().clear();
        for (Producto producto : admin.getListProduct()) {
            if (producto instanceof Mastil) {
                tableView.getItems().add(producto);
            }
        }
    }

    @FXML
    void initialize() {
        c1Table.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        c2Table.setCellValueFactory(new PropertyValueFactory<>("Costo"));
        c3Table.setCellValueFactory(new PropertyValueFactory<>("Material"));
        c4Table.setCellValueFactory(new PropertyValueFactory<>("Altura"));
    }
}
