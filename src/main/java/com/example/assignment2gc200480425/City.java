package com.example.assignment2gc200480425;

public class City {
    private int sunrise;

    public int getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public int getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private int sunset;

    private String country;

    private int id;

    private int type;


    public City(int sunrise, int sunset, String country, int id, int type) {
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.country = country;
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {

        return String.format("Sunrise: %s",
                getSunrise());

    }
}
