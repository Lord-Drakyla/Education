package ru.manzilin.lesson;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class xmlCat {
    private String name;
    private String domestic;
    private int age;
    private String [] things;

    public xmlCat(String name, String domestic, int age, String[] things) {
        this.name = name;
        this.domestic = domestic;
        this.age = age;
        this.things = things;
    }

    public xmlCat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomestic() {
        return domestic;
    }

    public void setDomestic(String domestic) {
        this.domestic = domestic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getThings() {
        return things;
    }

    public void setThings(String[] things) {
        this.things = things;
    }
}
