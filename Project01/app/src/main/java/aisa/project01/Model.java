package aisa.project01;

/**
 * Created by admin on 6/9/17.
 */

public class Model {
    String text;
    String text2;
    String text3;

    public Model (String t, String t1, String t3)
    {
        this.text = t;
        this.text2 = t1;
        this.text3 = t3;

    }
    public String getText() {
        return text;
    }

    public String getText2() {
        return text3;
    }

    public String getText3() {
        return text2;
    }
}
