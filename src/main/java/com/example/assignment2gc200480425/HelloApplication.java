package com.example.assignment2gc200480425;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        var weather=ApiUtility.getWeatherDetails("718");
        System.out.println(weather);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SearchView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("City!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

    }
}