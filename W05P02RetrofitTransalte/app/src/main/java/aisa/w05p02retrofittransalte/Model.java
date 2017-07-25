package aisa.w05p02retrofittransalte;

import java.util.List;

/**
 * Created by admin on 7/4/17.
 */

public class Model {
    private int code;
    private String lang;
    private List<String> text;

    public int getCode() {
        return code;
    }

    public List<String> getText() {
        return text;
    }

    public String getLang() {
        return lang;
    }
}
