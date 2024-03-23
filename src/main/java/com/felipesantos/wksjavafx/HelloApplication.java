package com.felipesantos.wksjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("components.fxml"));
        Scene scene = new Scene(root, Color.GRAY);

        String css = this.getClass().getResource("application.css").toExternalForm();

        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }
}