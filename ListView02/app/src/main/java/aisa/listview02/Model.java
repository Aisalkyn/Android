package aisa.listview02;

/**
 * Created by admin on 6/7/17.
 */

class Model {
    String name;
    String message;
    String date;

    public Model (String n, String m, String d)
    {
        this.name = n;
        this.message = m;
        this.date = d;

    }
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }


}
