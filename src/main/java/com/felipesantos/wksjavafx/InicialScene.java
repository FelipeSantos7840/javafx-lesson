package com.felipesantos.wksjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class InicialScene {

    @FXML
    TextField text;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent e) throws IOException {


        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("secondscene.fxml"));
        root = fxmlLoader.load();

        String username = text.getText();

        //VINCULO ENTRE CONTROLADORES
        SecondScene secondScene = fxmlLoader.getController();
        secondScene.registryName(username);


        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
