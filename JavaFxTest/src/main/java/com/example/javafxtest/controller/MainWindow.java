package com.example.javafxtest.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.javafxtest.MainApplication;
import com.example.javafxtest.model.dao.AttendantDAOImp;
import com.example.javafxtest.model.entities.Attendant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainWindow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnAttendant;

    @FXML
    private Button BtnManager;

    @FXML
    private Button BtnRegisterAction;

    @FXML
    private Button BtnTec;

    @FXML
    void BtnAttendantAction(ActionEvent event) {
        MainApplication.changeScreen("attendant");
    }

    @FXML
    void BtnManagerAction(ActionEvent event) {
        MainApplication.changeScreen("manager");
    }

    @FXML
    void BtnRegister(ActionEvent event) {
        MainApplication.changeScreen("register");
    }

    @FXML
    void BtnTecAction(ActionEvent event) {
        MainApplication.changeScreen("tec");

    }

    @FXML
    void initialize() throws IOException {
        assert BtnAttendant != null : "fx:id=\"BtnAttendant\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert BtnManager != null : "fx:id=\"BtnManager\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert BtnRegisterAction != null : "fx:id=\"BtnRegisterAction\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert BtnTec != null : "fx:id=\"BtnTec\" was not injected: check your FXML file 'MainWindow.fxml'.";

    }

}
