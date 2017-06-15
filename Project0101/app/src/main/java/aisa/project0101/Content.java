package aisa.project0101;

/**
 * Created by admin on 6/12/17.
 */

public class Content {
    String date;
    String text;
    String text2;
    String text3;

    public Content(String d, String t, String t1, String t3)
    {
        this.date = d;
        this.text = t;
        this.text2 = t1;
        this.text3 = t3;

    }

    public String getText() {
        return text;
    }
    public String getText1() {return date; }

    public String getText2() {
        return text3;
    }

    public String getText3() {
        return text2;
    }
}
