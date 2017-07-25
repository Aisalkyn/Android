package aisa.w06p01retrofitpost;

/**
 * Created by admin on 7/10/17.
 */

class User {

    private Integer id;
    private String name;
    private String email;
    private int age;
    private String topic;

    public User(String name, String email, int age, String topic) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.topic = topic;
    }

    public Integer getId() {
        return id;
    }
}
