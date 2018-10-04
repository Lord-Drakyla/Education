package manzilin.homework.h_22;

/**
 * Created by arty on 12.09.2018.
 */
public class PersonSimple {

    private String name;
    private int age;



    public PersonSimple(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonSimple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
