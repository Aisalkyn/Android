package io.futurestud.retrofit1.api.model;

/**
 * Created by admin on 7/6/17.
 */

public class Sys {
    private int type;
    private int id;
    private double message;
    private String country;
    private long sunrise;
    private long sunset;

    public double getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public long getSunrise() {
        return sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public String getCountry() {
        return country;
    }

}
