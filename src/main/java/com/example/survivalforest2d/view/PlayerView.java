package com.example.survivalforest2d.view;

import com.example.survivalforest2d.GameStart;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PlayerView extends ImageView {
    {this.setImage(new Image(GameStart.class.getResource("assets/player1.png").toExternalForm()));}
    public PlayerView() {

    }
}
