package com.sayuri.wifi.controllers;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Administrador;
import com.sayuri.wifi.models.Producto;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class viewProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonReturn;

    @FXML
    private Button bttonSeeProduct;

    @FXML
    private TableView<Producto> tableView;

    @FXML
    private TableColumn<Producto, String> c1Table;

    @FXML
    private TableColumn<Producto, Integer> c2Table;

    @FXML
    void bttonReturn(MouseEvent event) {
    }
    @FXML
    void bttonSeeProduct(MouseEvent event) {
        tableView.getItems().clear();
        Administrador admin = HelloApplication.getAdmin();
        ArrayList<String> tiposDeProductos = new ArrayList<>();
        for (Producto producto : admin.getListProduct()) {
            String tipo = admin.obtenerTipoProducto(producto);
            if (!tiposDeProductos.contains(tipo)) {
                tiposDeProductos.add(tipo);
            }
        }
        for (String tipo : tiposDeProductos) {
            int cantidad = admin.contarCantidadProductos(tipo);
            tableView.getItems().add(new Producto(tipo, cantidad));
        }
    }
    @FXML
    void initialize() {
        c1Table.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        c2Table.setCellValueFactory(new PropertyValueFactory<>("costo"));
    }
}
