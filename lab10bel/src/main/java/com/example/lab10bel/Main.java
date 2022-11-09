package com.example.lab10bel;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("First example JavaFX");
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(label);
        Scene scene = new Scene(box, 400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}