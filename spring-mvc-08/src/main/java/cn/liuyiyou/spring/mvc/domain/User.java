package cn.liuyiyou.spring.mvc.domain;

import java.util.Arrays;

/**
 * User: liuyiyou
 * Date: 6/22/15
 * Time: 12:12 AM
 */
public class User {

    private int  id;

    private String name;

    private int age;

    private String emial;

//    private String interests;

    private String[]     interests;

    private boolean  married;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", emial='" + emial + '\'' +
                ", interests=" + (interests == null ? null : Arrays.asList(interests)) +
                ", married=" + married +
                '}';
    }
}
