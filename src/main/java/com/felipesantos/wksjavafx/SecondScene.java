package com.felipesantos.wksjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondScene {

    @FXML
    Label nameLabel;

    public void registryName(String username){
        nameLabel.setText("HELLO!\n" + username);
    }

}
