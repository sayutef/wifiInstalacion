package com.sayuri.wifi.controllers;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import com.sayuri.wifi.models.Comprobante;
import com.sayuri.wifi.models.Paquete;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class añadirComprobanteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textNameUser;

    @FXML
    private TextField textNamePaquete;

    @FXML
    private TextField textTotalPagar;

    @FXML
    private Label Fecha;

    @FXML
    private Label NoTicket;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttonVolver;

    @FXML
    void bttonAdd(MouseEvent event) {
        try {
            Comprobante comprobante1 = new Comprobante();
            String nombre = textNameUser.getText();
            String paquete = textNamePaquete.getText();
            double total = Double.parseDouble(textTotalPagar.getText());
            LocalDateTime fechaHoraActual = LocalDateTime.now();
            int ticket = comprobante1.incrementarNoTicket();

            if (nombre.isEmpty() || paquete.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }
            Comprobante comprobante = new Comprobante(nombre, paquete, total, fechaHoraActual, ticket);
            HelloApplication.getAdmin().addComprobante(comprobante);
            Fecha.setText("Fecha: " + comprobante.getFecha().toString());
            NoTicket.setText("No. de Ticket: " + comprobante.getNoTicket());

            System.out.println("Nombre : [" + comprobante.getNombreUsuario() + "]");
            System.out.println("Paquete : [" + comprobante.getNombrePaquete() + "]");
            System.out.println("Total : [" + comprobante.getTotalPago() + "]");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos introducidos en el formulario...");
            alert.setHeaderText("Ha introducido correctamente los datos en el formulario. Se muestran a continuación.");
            alert.setContentText(comprobante.toString());
            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error en el costo");
            alert.setHeaderText("El costo debe ser un número válido.");
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
        HelloApplication.getStageView().close();

    }

    @FXML
    void initialize() {
    }
}
