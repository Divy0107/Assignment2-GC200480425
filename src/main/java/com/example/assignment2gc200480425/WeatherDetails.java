package com.example.assignment2gc200480425;

import java.util.ArrayList;

public class WeatherDetails {
    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
    public class Clouds{
        public int all;
    }

    public class Coord{
        public double lon;
        public double lat;
    }



    public class Root{
        public Coord coord;
        public ArrayList<Weather> weather;
        public String base;
        public int visibility;
        public Wind wind;
        public Clouds clouds;
        public int dt;
        public Sys sys;
        public int timezone;
        public int id;
        public String name;
        public int cod;
    }

    public class Sys{
        public int type;
        public int id;
        public String country;
        public int sunrise;
        public int sunset;
    }

    public class Weather{
        public int id;
        public String main;
        public String description;
        public String icon;
    }

    public class Wind{
        public double speed;
        public int deg;
        public double gust;
    }


}
