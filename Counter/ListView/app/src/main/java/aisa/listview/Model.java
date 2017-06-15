package aisa.listview;

/**
 * Created by admin on 6/6/17.
 */

public class Model {

    String name;
    String time;
    String date;

    public Model(String n, String t, String d){
        this.name = n;
        this.time = t;
        this.date = d;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
            return time;
    }
}
