package com.example.assignment2gc200480425;

import java.io.FileReader;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URI;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class ApiUtility {

    //Main method
    public static ApiResponse getWeatherDataFromJSONFile(String fileName){
        //create the gson object

        ApiResponse response=null;

        //Try with resources
        try(
                FileReader fileReader=new FileReader(fileName);
                JsonReader jsonReader=new JsonReader(fileReader)

        ) {
            //converting the json object to api response
            Gson gson=new Gson();
            response=gson.fromJson(jsonReader,ApiResponse.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
    public static ApiResponse getWeatherDataFromApi(String city){
        city=city.replace(" ","20%");
        String uri= "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=c9d2e5a99df9e621be70ac5d0d651afd&lang=eng&units=metric"+city;
        HttpClient client=HttpClient.newHttpClient();
        HttpRequest httpRequest= HttpRequest.newBuilder().uri(URI.create(uri)).build();

        //imp code cause this will creatre
        try {
            HttpResponse<Path> response =client.send(httpRequest,HttpResponse
                    .BodyHandlers
                    .ofFile(Paths.get("JavaApiFetched.json")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getWeatherDataFromJSONFile("javaApiFetched.json");
    }
    /*
     * This method will call the api and return the java objects without creating a json file on your hard drive
     * */
    public static ApiResponse getWeatherDataFromAPIQuick(String searchTerm){
        searchTerm=searchTerm.replace(" ","20%");
        String uri= "https://api.openweathermap.org/data/2.5/weather?q="+searchTerm+"&appid=c9d2e5a99df9e621be70ac5d0d651afd&lang=eng&units=metric"+searchTerm;
        HttpClient client=HttpClient.newHttpClient();
        HttpRequest httpRequest= HttpRequest.newBuilder().uri(URI.create(uri)).build();

        //imp code cause this will creatre
        try {
            HttpResponse<String> response=client.send(httpRequest,HttpResponse
                    .BodyHandlers
                    .ofString());
            Gson gson=new Gson();
            return gson.fromJson(response.body(),ApiResponse.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //this method fetches the city and returns it to weather details objects
    public static WeatherDetailsController getWeatherDetails(String id){
        String uri= "https://api.openweathermap.org/data/2.5/weather?q="+id+"&appid=c9d2e5a99df9e621be70ac5d0d651afd&lang=eng&units=metric"+id;
        HttpClient client=HttpClient.newHttpClient();
        HttpRequest httpRequest= HttpRequest.newBuilder().uri(URI.create(uri)).build();

        //imp code cause this will creatre
        try {
            HttpResponse<String> response=client.send(httpRequest,HttpResponse
                    .BodyHandlers
                    .ofString());
            Gson gson=new Gson();
            return gson.fromJson(response.body(),WeatherDetailsController.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
