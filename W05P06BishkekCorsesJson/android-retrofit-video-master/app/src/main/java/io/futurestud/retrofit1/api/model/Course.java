package io.futurestud.retrofit1.api.model;

/**
 * Created by admin on 7/7/17.
 */

public class Course {
    private String name;
    private String description;
    private Branches[] branches;
    private Contacts[] contacts;
    private Services[] services;
    private Categories[] categories;
    private Images[] images;




    public Images[] getImages() {
        return images;
    }


    public Branches[] getBranches() {
        return branches;
    }

    public Categories[] getCategories() {
        return categories;
    }

    public Contacts[] getContacts() {
        return contacts;
    }

    public Services[] getServices() {
        return services;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
