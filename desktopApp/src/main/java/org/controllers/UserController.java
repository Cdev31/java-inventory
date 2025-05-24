package org.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UserController {
    @FXML
    private Label label;

    @FXML
    private void onClick(){
        label.setText("Click");
    }
}
