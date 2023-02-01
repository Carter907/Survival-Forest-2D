package com.example.survivalforest2d.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class TitleScreen extends Controller {

    @FXML
    private Label titleLabel;

    @FXML
    protected void onPlayButtonPressed() {
        titleLabel.setText("Welcome to Survival Forest 2D");
    }

    @Override
    public void initialize(URL url, ResourceBundle bundle) {

    }
}