package com.example.project101;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    String hyperTextLink = "http://";

    @FXML
    TextField addressBar;

    String addressLink;

    @FXML
    WebView web;

    WebEngine engine;

    public void search(ActionEvent actionEvent){
        addressLink = addressBar.getText().toString();
        engine.load(hyperTextLink+addressLink);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        engine = web.getEngine();
        engine.load(hyperTextLink+"www.google.com");
    }
}