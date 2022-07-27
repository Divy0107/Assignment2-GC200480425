package com.example.assignment2gc200480425;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class SceneChanger {

           public static void changeScenes(ActionEvent event, String fxmlFile, String  id) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFile));
            Scene scene = new Scene(fxmlLoader.load());

            //get the controller from the destination
            WeatherDetailsController controller = fxmlLoader.getController();
            controller.Weather(id);

            //get the stage object from the action event triggered when the button was pushed
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }




