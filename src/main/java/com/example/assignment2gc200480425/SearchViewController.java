package com.example.assignment2gc200480425;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.ListView;

import java.io.IOException;


public class SearchViewController{

    @FXML
    private Button getInfoButton;

    @FXML
    private TextField searchTextField;

    @FXML
    private ImageView imageView;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Button getInfoButton1;

    @FXML
    private ListView<City> resultListView;

    @FXML
    private Label msgLabel;





    @FXML

    void searchCity(ActionEvent event) {
        ApiResponse apiResponse=ApiUtility.getWeatherDataFromAPIQuick(searchTextField.getText());
        resultListView.getItems().clear();
        if(apiResponse.getSys()!=null){
            resultListView.getItems().addAll(apiResponse.getSys());
            msgLabel.setText("");
        }
        else{
            msgLabel.setText("City not found");
        }


    }

    @FXML
    void getDetails(ActionEvent event) throws IOException {
        String id = String.valueOf(resultListView.getSelectionModel().getSelectedItem().getId());
       /* SceneChanger.ChangerScene(event, "WeatherDetails.fxml",id);*/
    }


}
