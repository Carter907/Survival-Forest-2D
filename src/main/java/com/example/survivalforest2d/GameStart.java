package com.example.survivalforest2d;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameStart extends Application {

    final int SCREEN_WIDTH = 400, SCREEN_HEIGHT = 350;
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(GameStart.class.getResource("title-screen-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), SCREEN_WIDTH, SCREEN_HEIGHT);



        scene.getStylesheets().add(GameStart.class.getResource("Application.css").toExternalForm());

        stage.setTitle("SurvivalForest2D!");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}