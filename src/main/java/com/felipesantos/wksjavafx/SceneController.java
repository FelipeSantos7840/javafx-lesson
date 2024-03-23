package com.felipesantos.wksjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Parent root;
    private Scene scene;
    private Stage stage;

    public void switchToHelloScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("application.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSelectionScene(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("selectionmenu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
