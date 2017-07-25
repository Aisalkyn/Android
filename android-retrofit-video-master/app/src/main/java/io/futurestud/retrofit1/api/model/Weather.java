package io.futurestud.retrofit1.api.model;

/**
 * Created by admin on 7/6/17.
 */

 public class Weather {

    private int id;
    private String main;
    private String description;
    private String icon;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getMain() {
        return main;
    }

    public String getIcon() {
        return icon;
    }
}
