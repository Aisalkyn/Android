package aisa.draftoflistview;

/**
 * Created by admin on 6/8/17.
 */

class Model {
    String name;
    String message;
    String date;


    public Model(String n, String m, String d) {
        this.name = n;
        this.message = m;
        this.date = d;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }
}