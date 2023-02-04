package com.example.survivalforest2d.controllers;

import com.example.survivalforest2d.model.Player;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.PixelWriter;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GameController extends Controller {
    @FXML
    public AnchorPane root;
    @FXML
    private Canvas gameScreen;

    private Player player;

    private PixelWriter writer;


    @Override
    public void initialize(URL url, ResourceBundle bundle) {

        player = new Player();

        root.setOnMouseClicked(this::onPaneClicked);


        root.getChildren().add(player.getController().getView());


    }


    public void onPaneClicked(MouseEvent event) {
        player.getController().move(event.getX(), event.getY());

    }

}
