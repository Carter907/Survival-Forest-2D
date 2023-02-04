package com.example.survivalforest2d.controllers;

import com.example.survivalforest2d.model.Player;
import com.example.survivalforest2d.view.PlayerView;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class PlayerController {

    private Thread playerThread;
    private PlayerView pView;
    private TranslateTransition moveAnimation;
    {

        moveAnimation = new TranslateTransition();
        moveAnimation.setDuration(Duration.millis(1000));
        moveAnimation.setCycleCount(1);

    }

    public PlayerController(PlayerView pView) {
        this.pView = pView;
        moveAnimation.setNode(pView);
    }
    public void move(double x, double y) {
        if (playerThread == null) {
            playerThread = new Thread(() -> {

                moveAnimation.setFromX(pView.getTranslateX());
                moveAnimation.setFromY(pView.getTranslateY());
                moveAnimation.setToX(x);
                moveAnimation.setToY(y);

                moveAnimation.play();

                moveAnimation.setOnFinished(e -> {
                    pView.setTranslateX(x);
                    pView.setTranslateY(y);

                    playerThread = null;

                });

            });
            playerThread.start();
        }
    }

    public PlayerView getView() {
        return pView;
    }
}
