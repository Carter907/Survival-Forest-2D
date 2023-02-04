package com.example.survivalforest2d.controllers;

import com.example.survivalforest2d.GameStart;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TitleScreen extends Controller {

    @FXML
    private Label titleLabel;

    @FXML
    protected void onPlayButtonPressed() {
        try {
            titleLabel.getScene().setRoot(FXMLLoader.load(GameStart.class.getResource("game-screen-view.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle bundle) {

    }
}