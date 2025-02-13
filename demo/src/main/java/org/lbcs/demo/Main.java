package org.lbcs.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("CLICK ME FOR NO REASON");
        StackPane root = new StackPane(button);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Fridge Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
