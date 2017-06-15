package aisa.project02gridview;

/**
 * Created by admin on 6/14/17.
 */

public class Model {
    String name;
    int image;
    String description;



    public Model(String n, int i, String d) {
        this.name = n;
        this.description = d;
        this.image = i;
    }

    public String getName() {
        return name;
    }
    public String getDescription(){
        return description;
    }
     public int getImage(){
         return image;
     }
}

