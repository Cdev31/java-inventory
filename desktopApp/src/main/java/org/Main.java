package org;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
       
        FXMLLoader loader = new FXMLLoader( getClass().getResource("/views/_layout.fxml"));
       
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/css/index.css").toExternalForm());

        stage.setTitle("App primera");
        stage.setScene((scene));
        stage.show();

    }

    public static void main( String[] args ){
         launch(args);
    }
    
}
