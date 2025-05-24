package org;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

public class LayoutController {
    @FXML 
    private StackPane mainContent;

    @FXML
    public void initialize(){
        loadView("home/index.fxml");
    }
    
    public void loadView( String fxmlFile ){
        try {
            Node view = FXMLLoader.load( getClass().getResource("/views/" + fxmlFile));
            mainContent.getChildren().setAll(view);
        } catch (Exception e) {
            System.err.println("Error al cargar la vista: " + fxmlFile);
            e.printStackTrace();
        }
    }
}
