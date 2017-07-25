package io.futurestud.retrofit1.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 7/6/17.
 */

public class WeatherForecast {
    private Coord coord;
    private Weather[] weather;
    private String base;
    private Main main;
    private  int visibility ;
    private Wind wind;
    private Clouds clouds;
    private long dt;
    private Sys sys;
    private long id;
    private String name;
    private int cod;

    public Coord getCoord() {
        return coord;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public int getCod() {
        return cod;
    }

    public long getId() {
        return id;
    }

    public int getVisibility() {
        return visibility;
    }

    public long getDt() {
        return dt;
    }

    public Main getMain() {
        return main;
    }

    public String getBase() {
        return base;
    }

    public String getName() {
        return name;
    }

    public Sys getSys() {
        return sys;
    }

    public Wind getWind() {
        return wind;
    }
}

