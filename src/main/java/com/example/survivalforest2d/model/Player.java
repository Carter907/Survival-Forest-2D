package com.example.survivalforest2d.model;

import com.example.survivalforest2d.controllers.PlayerController;
import com.example.survivalforest2d.view.PlayerView;
import javafx.animation.TranslateTransition;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Player {

    private final int mps = 1;
    private boolean isMoving;
    private int x;
    private int y;

    private final PlayerController controller;

    public Player() {
        x = 0;
        y = 0;

        this.controller = new PlayerController(new PlayerView());
    }
    public int getPlayerX() {
        return this.x;
    }
    public int getPlayerY() {
        return this.y;
    }

    public void setIsMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }
    public boolean isMoving() {
        return this.isMoving;
    }

    public PlayerController getController() {
        return this.controller;
    }
}
