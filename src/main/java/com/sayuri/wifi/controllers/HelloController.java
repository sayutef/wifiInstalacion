package com.sayuri.wifi.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.wifi.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonAdmi;

    @FXML
    private Button bttonSuperAdmi;

    @FXML
    void bttonAdmi(MouseEvent event) {

    }

    @FXML
    void bttonSuperAdmi(MouseEvent event) {
        HelloApplication.newStage("menuSuperAdmin", "");
    }

    @FXML
    void initialize() {
        assert bttonAdmi != null : "fx:id=\"bttonAdmi\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert bttonSuperAdmi != null : "fx:id=\"bttonSuperAdmi\" was not injected: check your FXML file 'hello-view.fxml'.";
    }

    public void init(Stage stageRoot){}
}