package com.example.assignment2gc200480425;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class WeatherDetailsController {
    @FXML
    private Label city1;

    @FXML
    private Label id1;

    @FXML
    private Label sunset1;

    @FXML
    private Label Sunrise1;

    @FXML
    private Label main1;

    @FXML
    private Label description1;

    @FXML
    private Button btn1;

    @FXML
    private Label weather1;

   /* @FXML
    void btnaction(ActionEvent event) {

    }*/
    public void Weather(String id){
        WeatherDetailsController City = ApiUtility.getWeatherDetails(id);
    }
}
