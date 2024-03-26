package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Paquete;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class añadirPaqueteController  {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textNamePaquete;

    @FXML
    private TextField textCostoPaquete;

    @FXML
    private TextArea textAreaDescrp;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttonVolver;

    @FXML
    void bttonAdd(MouseEvent event) {


        try {
            String nombre = textNamePaquete.getText();
            String costoStr = textCostoPaquete.getText();
            String descripcion = textAreaDescrp.getText();

            if (nombre.isEmpty() || descripcion.isEmpty() || costoStr.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }

            int costo = Integer.parseInt(costoStr);

            Paquete paquete = new Paquete(costo, nombre, descripcion);

            HelloApplication.getAdmin().addPaquete(paquete);

            System.out.println("Nombre : [" + paquete.getNombre() + "]");
            System.out.println("Costo : [" + paquete.getCosto() + "]");
            System.out.println("Descripción : [" + paquete.getDescripcion() + "]");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos introducidos en el formulario...");
            alert.setHeaderText("Ha introducido correctamente los datos en el formulario. Se muestran a continuación.");
            alert.setContentText(paquete.toString());
            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error en el costo");
            alert.setHeaderText("El costo debe ser un número entero válido.");
            alert.showAndWait();
        } catch (IllegalArgumentException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Faltan datos...");
            alert.setHeaderText(e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    void bttonVolver(MouseEvent event) {

    }

    @FXML
    void initialize() {
    }
}
